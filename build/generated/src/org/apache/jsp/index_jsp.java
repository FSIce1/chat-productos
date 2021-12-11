package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelos.Modelo_Producto1;
import beans.Producto1;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\"\r\n");
      out.write("            content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"img/icono.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/sweetalert2.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen, print\" href=\"css/app.bundle.css\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- base css -->\r\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen, print\" href=\"css/vendors.bundle.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen, print\" href=\"css/app.bundle.css\">\r\n");
      out.write("\r\n");
      out.write("        <title>Lista de Productos</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-stretch justify-content-between\">\r\n");
      out.write("                    <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">CompuMundo</a>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("                            <div class=\"navbar-nav\">\r\n");
      out.write("                                <a class=\"nav-item nav-link\" href=\"#\">Inicio <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                                <a class=\"nav-item nav-link active\" href=\"Controlador_Producto?opcion=L\">Productos</a>\r\n");
      out.write("                                <a class=\"nav-item nav-link\" href=\"Controlador_Producto?opcion=A\">Lista de Producto</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--\r\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\"\r\n");
      out.write("                            aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                                <li class=\"nav-item dropdown\">\r\n");
      out.write("                                    <img src=\"img/cart.jpeg\" class=\"nav-link dropdown-toggle img-fluid\" height=\"70px\"\r\n");
      out.write("                                        width=\"70px\" href=\"#\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("                                        aria-expanded=\"false\"></img>\r\n");
      out.write("                                    <div id=\"carrito\" class=\"dropdown-menu\" aria-labelledby=\"navbarCollapse\">\r\n");
      out.write("                                        <table id=\"lista-carrito\" class=\"table\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Imagen</th>\r\n");
      out.write("                                                    <th>Nombre</th>\r\n");
      out.write("                                                    <th>Precio</th>\r\n");
      out.write("                                                    <th></th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody></tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("\r\n");
      out.write("                                        <a href=\"#\" id=\"vaciar-carrito\" class=\"btn btn-primary btn-block\">Vaciar Carrito</a>\r\n");
      out.write("                                        <a href=\"#\" id=\"procesar-pedido\" class=\"btn btn-danger btn-block\">Procesar\r\n");
      out.write("                                            Compra</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        -->\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <main>\r\n");
      out.write("            <div class=\"pricing-header px-3 py-3 pt-md-5 pb-md-4 my-4 mx-auto text-center\">\r\n");
      out.write("                <h1 class=\"display-4 mt-4\">Lista de Productos</h1>\r\n");
      out.write("                <p class=\"lead\"></p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\" id=\"lista-productos\" style=\"display: flex; flex-wrap: wrap; justify-content: center;\">\r\n");
      out.write("                ");

                    List<Producto1> listaProductos = Modelo_Producto1.lista();

                    for (Producto1 u : listaProductos) {
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"card\" style=\"width: 18rem; margin: 10px\" >\r\n");
      out.write("                    <img class=\"card-img-top\" src=\"productos/");
      out.print(u.getImagen());
      out.write("\" width=\"100\" height=\"230\" alt=\"");
      out.print(u.getImagen());
      out.write("\">\r\n");
      out.write("                    <div class=\"card-body\" style=\"display: flex; flex-direction: column\">\r\n");
      out.write("                      <h5 class=\"card-title text-center\">");
      out.print(u.getName());
      out.write("</h5>\r\n");
      out.write("                      <p class=\"card-text\">");
      out.print(u.getDescription());
      out.write("</p>\r\n");
      out.write("                      <a href=\"#\" class=\"btn btn-info\">Oferta</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            \r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/sweetalert2.min.js\"></script>\r\n");
      out.write("        <script src=\"js/carrito.js\"></script>\r\n");
      out.write("        <script src=\"js/pedido.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/vendors.bundle.js\"></script>\r\n");
      out.write("        <script src=\"js/app.bundle.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
