/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

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
import modelo.Liga;

/**
 *
 * @author luigh
 */
@WebServlet(name = "LigaWS", urlPatterns = {"/liga/LigaWS"})
public class LigaWS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Liga obj;
        List<Liga> lista;
        LigaDAO ligadao = new LigaDAO();
        String filtro = request.getParameter("txtFiltro");
        String acao = request.getParameter("txtAcao");
        RequestDispatcher destino;
        String pagina;
        switch(String.valueOf(acao)){
            case "del":
                obj = ligadao.buscarPorChavePrimaria(Long.parseLong(request.getParameter("txtId")));
                ligadao.excluir(obj);
                lista = ligadao.listar();
                pagina = "list.jsp";
                request.setAttribute("lista", lista);
                break;
            case "add":
                pagina = "add.jsp";
                break;
            case "edit":
                obj = ligadao.buscarPorChavePrimaria(Long.parseLong(request.getParameter("txtId")));
                request.setAttribute("liga", obj);
                pagina = "edit.jsp";
                break;
            default:
                lista = null;
                if(filtro != null){
                    try {
                        lista = ligadao.listar(filtro);
                    } catch (Exception ex) {
                        Logger.getLogger(LigaWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    lista = ligadao.listar();
                }
                pagina = "list.jsp";
                request.setAttribute("lista", lista);
                break;
        }
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String pagina;
        Boolean deucerto;
        String nome = request.getParameter("txtNome");
        String id = request.getParameter("txtId");
        String imgurl = request.getParameter("txtUrl");
        String descricao = request.getParameter("txtDesc");
        LigaDAO ligadao = new LigaDAO();
        Liga obj;
        if(id==null){
            obj = new Liga();
        }
        else{
            obj = ligadao.buscarPorChavePrimaria(Long.parseLong(id));
        }
        obj.setNome(nome);
        obj.setUrl(imgurl);
        obj.setDescricao(descricao);
        if(id==null){
            deucerto = ligadao.incluir(obj);
            pagina = "add.jsp";
        }
        else{
            deucerto = ligadao.alterar(obj);
            List<Liga> ligas = ligadao.listar();
            request.setAttribute("lista", ligas);
            pagina = "list.jsp";
        }
        RequestDispatcher destino;
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }
}
