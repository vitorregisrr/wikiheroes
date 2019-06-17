/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ClienteDAO;
import dao.GibiDAO;
import dao.HeroiDAO;
import dao.LigaDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import modelo.Gibi;
import modelo.Heroi;
import modelo.Liga;

/**
 *
 * @author luigh
 */
@WebServlet(name = "GibiWS", urlPatterns = {"/admin/GibiWS"})
public class GibiWS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher destino;
        String pagina = null;
        String id = request.getParameter("txtId");
        String filtro = request.getParameter("txtFiltro");
        String idcliente = request.getParameter("txtCliente");
        Cliente cliente;
        ClienteDAO clidao = new ClienteDAO();
        String acao = request.getParameter("txtAcao");
        Liga liga;
        List<Liga> ligas;
        LigaDAO ligadao = new LigaDAO();
        Heroi heroi;
        List<Heroi> herois;
        HeroiDAO heroidao = new HeroiDAO();
        Gibi gibi;
         List<Gibi> gibis;
        GibiDAO gibidao = new GibiDAO();
        switch (String.valueOf(acao)) {
            case "add":
                herois = heroidao.listar();
                ligas = ligadao.listar();
                pagina = "novogibi.jsp";
                request.setAttribute("herois", herois);
                request.setAttribute("ligas", ligas);
                break;
            case "ver":
                gibi = gibidao.buscarPorChavePrimaria(Long.parseLong(id));
                pagina = "gibi.jsp";
                request.setAttribute("gibi", gibi);
                break;
            case "alugar":
                cliente = clidao.buscarPorChavePrimaria(Long.parseLong(idcliente));
                gibi = gibidao.buscarPorChavePrimaria(Long.parseLong(id));
                gibi.setOcupado(cliente);
                gibidao.alterar(gibi);
                cliente.setGibi(gibi);
                clidao.alterar(cliente);
                pagina = "gibi.jsp";
                request.setAttribute("gibi", gibi);
                break;
            case "listaluga":
                gibis = null;
                {
                    try {
                        gibis = gibidao.listarAlugaveis();
                    } catch (Exception ex) {
                        Logger.getLogger(GibiWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                pagina = "alugar.jsp";
                request.setAttribute("gibis", gibis);
                request.setAttribute("c", idcliente);
                break;
            case "edit":
                gibi = gibidao.buscarPorChavePrimaria(Long.parseLong(id));
                pagina = "editgibi.jsp";
                herois = heroidao.listar();
                ligas = ligadao.listar();
                request.setAttribute("gibi", gibi);
                request.setAttribute("ligas", ligas);
                request.setAttribute("herois", herois);
                break;
            case "desalugar":
                gibi = gibidao.buscarPorChavePrimaria(Long.parseLong(id));
                cliente = gibi.getOcupado();
                if(!Objects.equals(gibi.getOcupado().getGibi().getId(), gibi.getId())){
                    pagina = "gibi.jsp";
                    request.setAttribute("gibi", gibi);
                }
                else{
                    gibi.setOcupado(null);
                    cliente.setGibi(null);
                    gibidao.alterar(gibi);
                    clidao.alterar(cliente);
                    pagina = "gibi.jsp";
                    request.setAttribute("gibi", gibi);
                }
                break;
            default:
                gibis = null;
                if(filtro != null){
                    try {
                        gibis = gibidao.listar(filtro);
                    } catch (Exception ex) {
                        Logger.getLogger(GibiWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    gibis = gibidao.listar();
                }
                pagina = "gibis.jsp";
                request.setAttribute("gibis", gibis);
                break;
        }
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina;
        RequestDispatcher destino;
        String id = request.getParameter("txtId");
        String nome = request.getParameter("txtNome");
        String nserie = request.getParameter("txtSerie");
        String ligaid = request.getParameter("txtLiga");
        String url = request.getParameter("txtUrl");
        String[] heroisid = request.getParameterValues("heroies");
        Heroi heroi;
        HeroiDAO heroidao = new HeroiDAO();
        Liga liga;
        LigaDAO ligadao = new LigaDAO();
        Gibi gibi;
        GibiDAO gibidao = new GibiDAO();
        List<Gibi> gibis;
        List<Heroi> herois = new ArrayList<>();
        for (int i = 0; i < heroisid.length; i++) {
            heroi = heroidao.buscarPorChavePrimaria(Long.parseLong(heroisid[i]));
            herois.add(heroi);
        }
        liga = ligadao.buscarPorChavePrimaria(Long.parseLong(ligaid));
        if(id == null){
            gibi = new Gibi();
        }
        else{
            gibi = gibidao.buscarPorChavePrimaria(Long.parseLong(id));
        }
        gibi.setHerois(herois);
        gibi.setLiga(liga);
        gibi.setNome(nome);
        gibi.setUrl(url);
        gibi.setNumeroserie(nserie);
        if(id == null){
            gibidao.incluir(gibi);
        }
        else{
            gibidao.alterar(gibi);
        }
        pagina = "gibis.jsp";
        gibis = gibidao.listar();
        request.setAttribute("gibis", gibis);
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

}
