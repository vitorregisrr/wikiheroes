/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AdministradorDAO;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Administrador;
import util.Criptografia;

/**
 *
 * @author luigh
 */
@WebServlet(name = "LogarWS", urlPatterns = {"/principal/LogarWS"})
public class LogarWS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("txtAcao");
        RequestDispatcher destino;
        switch(String.valueOf(acao)){
            case "logout":
                request.getSession().invalidate();
                response.sendRedirect("../principal/GibisUsuWS");
                break;
            default:
                destino = request.getRequestDispatcher("login.jsp");
                destino.forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("txtEmail");
        String senha = null;
        Administrador a;
        AdministradorDAO dao = new AdministradorDAO();
        
        try {
            senha = Criptografia.convertPasswordToMD5(request.getParameter("txtSenha"));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LogarWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        a = dao.logar(email, senha);
        
        if(a != null){
            request.getSession().setAttribute("a", a);
            request.getSession().setAttribute("erro", "");
            response.sendRedirect("../admin/ClienteWS");
        }
        else{
            request.getSession().setAttribute("erro", "Login ou senha incorreto!");
            response.sendRedirect("login.jsp");
        }
    }

}
