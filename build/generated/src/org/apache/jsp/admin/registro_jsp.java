package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/cabecalho.jsp");
    _jspx_dependants.add("/admin/../principal/rodape.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale = 1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"shortcout icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"shortcout icon\" href=\"images/favicon.png\">\n");
      out.write("    <title>Wiki Heroes</title>\n");
      out.write("\n");
      out.write("    <!-- Seo -->\n");
      out.write("\n");
      out.write("    <!-- MAIN SEO -->\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\n");
      out.write("    <META NAME=\"Googlebot\" CONTENT=\"index,follow\">\n");
      out.write("    <META NAME=\"robots\" CONTENT=\"index,follow\">\n");
      out.write("    <META NAME=\"Identifier-URL\" CONTENT=\"http://www.evolveme.\">\n");
      out.write("    <META NAME=\"url\" CONTENT=\"http://www.\">\n");
      out.write("    <META NAME=\"Language\" CONTENT=\"PT-BR\">\n");
      out.write("    <META NAME=\"content-language\" CONTENT=\"pt-br\">\n");
      out.write("    <META NAME=\"distribution\" CONTENT=\"Global\">\n");
      out.write("    <META NAME=\"coverage\" CONTENT=\"Worldwide\">\n");
      out.write("    <META NAME=\"Author\" CONTENT=\"Vitor Régis de Ramos - Front-End Developer\">\n");
      out.write("    <META NAME=\"Generator\" CONTENT=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("\n");
      out.write("    <!-- SOCIAL METAS -->\n");
      out.write("    <meta property=\"og:title\" content=\"European Travel Destinations\">\n");
      out.write("    <meta property=\"og:description\" content=\"Offering tour packages for individuals or groups.\">\n");
      out.write("    <meta property=\"og:image\" content=\"http://euro-travel-example.com/thumbnail.jpg\">\n");
      out.write("    <meta property=\"og:url\" content=\"http://euro-travel-example.com/index.htm\">\n");
      out.write("    <meta property=\"og:type\" content=\"website\" />\n");
      out.write("    <meta name=\"twitter:card\" content=\"summary_large_image\">\n");
      out.write("    <meta property=\"og:site_name\" content=\"European Travel, Inc.\">\n");
      out.write("    <meta name=\"twitter:image:alt\" content=\"Alt text for image\">\n");
      out.write("    <meta property=\"fb:app_id\" content=\"your_app_id\" />\n");
      out.write("    <meta name=\"twitter:site\" content=\"@website-username\">\n");
      out.write("\n");
      out.write("    <script type=\"application/x-javascript\">\n");
      out.write("        addEventListener(\"load\", function () {\n");
      out.write("            setTimeout(hideURLbar, 0);\n");
      out.write("        }, false);\n");
      out.write("\n");
      out.write("        function hideURLbar() {\n");
      out.write("            window.scrollTo(0, 1);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <!-- CSS FILES -->\n");
      out.write("    <script src=\"../vendor/jquery/jquery-3.3.1.min.js\" defer></script>\n");
      out.write("    <script src=\"../vendor/bootstrap/bootstrap.min.js\" defer></script>\n");
      out.write("    <script src=\"../vendor/isotope-layout/dist/isotope.pkgd.min.js\" defer></script>\n");
      out.write("    <script src=\"../vendor/lazyload/lazyload.js\" defer></script>\n");
      out.write("    <script src=\"../vendor/lightbox2/dist/js/lightbox.min.js\" defer></script>\n");
      out.write("    <script src=\"../vendor/owl.carousel/owl.carousel.min.js\" defer></script>\n");
      out.write("    <script src=\"../vendor/wowjs/dist/wow.min.js\" defer></script>\n");
      out.write("    <script src=\"../js/main.min.js\" defer></script>\n");
      out.write("    <script src=\"../js/webp.js\" defer></script>\n");
      out.write("    <script src=\"../js/jquery.mask.min.js\" defer></script>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/animate.css/animate.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/jquery/jquery-ui.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/lightbox2/dist/css/lightbox.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../vendor/owl.carousel/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/main.min.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:200, 300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body class=\"scrollbar-inner wow fadeIn\">\n");
      out.write("    <header id=\"main-header\">\n");
      out.write("        <nav id=\"main-nav\" class=\"navbar navbar-expand-lg fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a href=\"../admin/ClienteWS\"><div class=\"navbar-brand wow fadeInLeft\"><span class=\"logo\">WikiHeroes</span></div></a>\n");
      out.write("                <button class=\"navbar-toggler wow bounceInDown\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("                    data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\"\n");
      out.write("                    aria-label=\"Toggle navigation\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item wowNonMobile fadeInDown\" data-wow-delay=\"0.6s\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"../admin/ClienteWS\">Clientes</a>\n");
      out.write("                            <a class=\"nav-link active\" href=\"../admin/GibiWS\">Gibis</a>\n");
      out.write("                            <a class=\"nav-link active\" href=\"../heroi/HeroiWS\">Heróis</a>\n");
      out.write("                            <a class=\"nav-link\" href=\"../liga/LigaWS\">Ligas</a>\n");
      out.write("                            <a class=\"nav-link\" href=\"../principal/LogarWS?txtAcao=logout\" style=\"color: red;\">Sair</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("<main>\n");
      out.write("        <section id=\"login\" style=\"padding-top: 200px; min-height: 80vh\">\n");
      out.write("            <h3 class=\"inner-title mb-3\">Novo Moderador</h3>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"offset-md-4\"></div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <form action=\"AdministradorWS\" method=\"POST\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input class=\"form-control\" name=\"txtNome\" type=\"text\" placeholder=\"Usuário\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input class=\"form-control\" name=\"txtEmail\" type=\"email\" placeholder=\"Email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input class=\"form-control\" name=\"txtSenha\" type=\"password\" placeholder=\"Senha\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn-main--outline w-100\">Registrar</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"offset-md-4\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("            <div class=\"row  wow fadeInUp\">\n");
      out.write("                <div class=\"footer__developed\">\n");
      out.write("                    <p>© 2019 Copyright WikiHeroes</p>\n");
      out.write("                    <p>coded with &lt;3 by <b>Vitor e Luighão</b> </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
