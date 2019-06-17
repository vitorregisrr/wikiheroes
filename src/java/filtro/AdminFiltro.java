/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtro;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Administrador;

/**
 *
 * @author luigh
 */
@WebFilter(filterName = "AdminFiltro", urlPatterns = {"/liga/*", "/heroi/*", "/admin/*"})
public class AdminFiltro implements Filter {
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
                HttpSession session = ((HttpServletRequest) request).getSession();
                Administrador a = (Administrador) session.getAttribute("a");

               // String path = ((HttpServletRequest) request).getRequestURI();

                if (a != null) {
                    chain.doFilter(request, response);
                } else {
                    session.setAttribute("erro", "Você não está logado, por favor faça login!");
                    ((HttpServletResponse)response).sendRedirect("../principal/login.jsp");
                }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
