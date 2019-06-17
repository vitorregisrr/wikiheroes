/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.HeroiDAO;
import dao.LigaDAO;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Heroi;
import modelo.Liga;

/**
 *
 * @author luigh
 */
@WebServlet(name = "HeroiWS", urlPatterns = {"/heroi/HeroiWS"})
public class HeroiWS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Liga> ligas;
        List<Heroi> herois = null;
        LigaDAO ligadao = new LigaDAO();
        HeroiDAO heroidao = new HeroiDAO();
        ligas = ligadao.listar();
        String acao = request.getParameter("txtAcao");
        String filtro = request.getParameter("txtFiltro");
        RequestDispatcher destino;
        String pagina = "list.jsp";
        Heroi obj;
        switch (String.valueOf(acao)) {
            case "add":
                request.setAttribute("ligas", ligas);
                pagina = "add.jsp";
                break;

            case "edit":
                obj = heroidao.buscarPorChavePrimaria(Long.parseLong(request.getParameter("txtId")));
                request.setAttribute("heroi", obj);
                request.setAttribute("ligas", ligas);
                pagina = "edit.jsp";
                break;

            case "del":
                obj = heroidao.buscarPorChavePrimaria(Long.parseLong(request.getParameter("txtId")));
                heroidao.excluir(obj);
                herois = heroidao.listar();
                pagina = "list.jsp";
                request.setAttribute("herois", herois);
                break;
            default:
                if (filtro == null) {
                    herois = heroidao.listar();
                } else {
                    try {
                        herois = heroidao.listar(filtro);
                    } catch (Exception ex) {
                        Logger.getLogger(HeroiWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                pagina = "list.jsp";

                request.setAttribute("herois", herois);
                break;
        }
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Boolean deucerto;
        String nome = request.getParameter("txtNome");
        String id = request.getParameter("txtId");
        String imgurl = request.getParameter("txtUrl");
        String poder = request.getParameter("txtPoder");
        String fraqueza = request.getParameter("txtFraqueza");
        Long liga = Long.parseLong(request.getParameter("txtLiga"));
        Liga ligaescolhida = new Liga();
        LigaDAO ligadao = new LigaDAO();
        HeroiDAO heroidao = new HeroiDAO();
        Heroi obj;
        String pagina;
        if (id == null) {
            obj = new Heroi();
        } else {
            obj = heroidao.buscarPorChavePrimaria(Long.parseLong(id));
        }
        ligaescolhida = ligadao.buscarPorChavePrimaria(liga);
        obj.setNome(nome);
        obj.setUrl(imgurl);
        obj.setPoder(poder);
        obj.setFraqueza(fraqueza);
        obj.setLiga(ligaescolhida);
        if (id == null) {
            deucerto = heroidao.incluir(obj);
            pagina = "add.jsp";
        } else {
            deucerto = heroidao.alterar(obj);
            List<Heroi> herois = heroidao.listar();
            request.setAttribute("herois", herois); 
            pagina = "list.jsp";
        }
    
        RequestDispatcher destino;
        List<Liga> ligas;
        ligas = ligadao.listar();
        request.setAttribute("ligas", ligas);
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }
}
