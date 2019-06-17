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
@WebServlet(name = "AdministradorWS", urlPatterns = {"/admin/AdministradorWS"})
public class AdministradorWS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String pagina;
            RequestDispatcher destino;
            AdministradorDAO dao = new AdministradorDAO();
            Administrador obj;
            String id = request.getParameter("txtId");
            String nome = request.getParameter("txtNome");
            String email = request.getParameter("txtEmail");
            String senha = request.getParameter("txtSenha");
                try {
                    senha = Criptografia.convertPasswordToMD5(senha);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(AdministradorWS.class.getName()).log(Level.SEVERE, null, ex);
                }
            if(id == null){
                obj = new Administrador();
            }
            else{
                obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
            }
            obj.setEmail(email);
            obj.setNome(nome);
            if(senha != null){
                obj.setSenha(senha);
            }
            if(id == null){
                dao.incluir(obj);
                pagina = "ClienteWS";
            }
            else{
                dao.alterar(obj);
                pagina = "ClienteWS";
            }
            destino = request.getRequestDispatcher(pagina);
            destino.forward(request, response);
    }
}
