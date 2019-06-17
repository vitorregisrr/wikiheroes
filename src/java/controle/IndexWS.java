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
@WebServlet(name = "IndexWS", urlPatterns = {"/principal/IndexWS"})
public class IndexWS extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Liga> ligas;
        List<Heroi> herois;
        LigaDAO ligadao = new LigaDAO();
        HeroiDAO heroidao = new HeroiDAO();
        ligas = ligadao.listar();
        herois = heroidao.listar();
        RequestDispatcher destino;
        String pagina = "index.jsp";
        request.setAttribute("ligas", ligas);
        request.setAttribute("herois", herois);
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
