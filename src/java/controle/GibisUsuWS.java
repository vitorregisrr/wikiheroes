/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.GibiDAO;
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
import modelo.Gibi;
import modelo.Heroi;
import modelo.Liga;

/**
 *
 * @author luigh
 */
@WebServlet(name = "GibisUsuWS", urlPatterns = {"/principal/GibisUsuWS"})
public class GibisUsuWS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina;
        RequestDispatcher destino;
        String acao = request.getParameter("txtAcao");
        String filtro = request.getParameter("txtFiltro");
        String id = request.getParameter("txtId");
        Gibi obj;
        List<Gibi> gibis;
        GibiDAO gibidao = new GibiDAO();
        HeroiDAO heroidao = new HeroiDAO();
        List<Heroi> heroilist;
        heroilist = null;
        switch(String.valueOf(acao)){
            case "ver":
                obj = gibidao.buscarPorChavePrimaria(Long.parseLong(id));
                pagina = "gibi.jsp";
                request.setAttribute("gibi", obj);
                break;
            case "liga":
                LigaDAO ligadao = new LigaDAO();
                List<Liga> ligalist;
                ligalist = ligadao.listar();
                pagina = "listliga.jsp";
                request.setAttribute("lista", ligalist);
                break;
            case "gibi":
                gibis = gibidao.listar();
                pagina = "gibis.jsp";
                request.setAttribute("gibis", gibis);
                break;
            default:
                if(filtro != null){
                    {
                    try {
                        heroilist = heroidao.listar(filtro);
                    } catch (Exception ex) {
                        Logger.getLogger(GibisUsuWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                }
                else{
                    heroilist = heroidao.listar();
                }
                pagina = "listheroi.jsp";
                request.setAttribute("herois", heroilist);
                break;
        }
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
                
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
