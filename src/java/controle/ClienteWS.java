/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ClienteDAO;
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
import modelo.Cliente;

/**
 *
 * @author luigh
 */
@WebServlet(name = "ClienteWS", urlPatterns = {"/admin/ClienteWS"})
public class ClienteWS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String pagina;
            RequestDispatcher destino;
            String id = request.getParameter("txtId");
            String filtro = request.getParameter("txtFiltro");
            String acao = request.getParameter("txtAcao");
            List<Cliente> clientes;
            Cliente obj;
            ClienteDAO dao = new ClienteDAO();
            switch(String.valueOf(acao)){
                case "edit":
                    obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
                    pagina = "editcliente.jsp";
                    request.setAttribute("cliente", obj);
                    break;
                case "del":
                    obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
                    if(obj.getGibi() != null){
                        request.setAttribute("erro", "Gibi não devolvido!");
                    }
                    else{
                        dao.excluir(obj);
                    }
                    pagina = "clientes.jsp";
                    clientes = dao.listar();
                    request.setAttribute("clientes", clientes);
                    break;
                case "ver":
                    obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
                    pagina = "cliente.jsp";
                    request.setAttribute("c", obj);
                    break;
                default:
                    clientes = null;
                    if(filtro != null){
                        try {
                            clientes = dao.listar(filtro);
                        } catch (Exception ex) {
                            Logger.getLogger(ClienteWS.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        clientes = dao.listar();
                    }
                    pagina = "clientes.jsp";
                    request.setAttribute("clientes", clientes);
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
            ClienteDAO dao = new ClienteDAO();
            Cliente obj;
            List<Cliente> clientes;
            String id = request.getParameter("txtId");
            String nome = request.getParameter("txtNome");
            String cpf = request.getParameter("txtCpf");
            String endereco = request.getParameter("txtEndereco");
            String telefone = request.getParameter("txtTelefone");
            if(id == null){
                obj = new Cliente();
            }
            else{
                obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
            }
            obj.setNome(nome);
            obj.setEndereco(endereco);
            obj.setTelefone(telefone);
            obj.setCpf(cpf);
            if(id == null){
                dao.incluir(obj);
            }
            else{
                dao.alterar(obj);
            }
            pagina = "clientes.jsp";
            clientes = dao.listar();
            request.setAttribute("clientes", clientes);
            destino = request.getRequestDispatcher(pagina);
            destino.forward(request, response);
    }

}
