package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelos.Modelo_Producto1;
import beans.Producto1;
import java.util.List;

public final class Lista_005fProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      java.lang.String ALERTA = null;
      synchronized (request) {
        ALERTA = (java.lang.String) _jspx_page_context.getAttribute("ALERTA", PageContext.REQUEST_SCOPE);
        if (ALERTA == null){
          ALERTA = new java.lang.String();
          _jspx_page_context.setAttribute("ALERTA", ALERTA, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
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
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/sweetalert2.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen, print\" href=\"css/datagrid/datatables/datatables.bundle.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen, print\" href=\"css/fa-solid.css\">\r\n");
      out.write("\r\n");
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
      out.write("                                <a class=\"nav-item nav-link\" href=\"Controlador_Producto?opcion=L\">Productos</a>\r\n");
      out.write("                                <a class=\"nav-item nav-link active\" href=\"Controlador_Producto?opcion=A\">Lista de Producto</a>\r\n");
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
      out.write("            \r\n");
      out.write("            <div style=\"width: 90%; height: auto; display: flex; flex-direction: column; margin: 0 auto; margin-top: 80px\" >\r\n");
      out.write("                <ol class=\"breadcrumb page-breadcrumb\">\r\n");
      out.write("                    <li class=\"breadcrumb-item\"><a href=\"javascript:void(0);\">CompuMundo</a></li>\r\n");
      out.write("                    <li class=\"breadcrumb-item\">Productos</li>\r\n");
      out.write("                    <li class=\"breadcrumb-item active\">Lista de Productos</li>\r\n");
      out.write("                </ol>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-6\">\r\n");
      out.write("                        <div class=\"subheader\">\r\n");
      out.write("                            <h1 class=\"subheader-title\">\r\n");
      out.write("                                <i class='subheader-icon fal fa-table'></i> Lista de: <span class='fw-300'>Productos</span>\r\n");
      out.write("                                <small>\r\n");
      out.write("                                    Listado de todos los productos de la tienda\r\n");
      out.write("                                </small>\r\n");
      out.write("                            </h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-6 text-right\">\r\n");
      out.write("                        <button type=\"button\" style=\"width: 150px\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#default-example-modal\" onclick=\"Mostrar('','','','','I')\" >Agregar</button>\r\n");
      out.write("                        <br><br> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                <!-- Modal Producto -->\r\n");
      out.write("                <div class=\"modal fade\" id=\"default-example-modal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <h4 id=\"tituloModal\" class=\"modal-title\">\r\n");
      out.write("                                    Agregar Producto\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                    <span aria-hidden=\"true\"><i class=\"fal fa-times\"></i></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                                <form id=\"formulario\" class=\"form\" method=\"post\" enctype=\"multipart/form-data\" autocomplete=\"off\" action=\"Controlador_Producto?opcion=I\">\r\n");
      out.write("                                    <!-- enctype=\"multipart/form-data\" -->\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"txtNombre\">Nombre</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"txtNombre\" name=\"txtNombre\" placeholder=\"Computadora RXY\" required=\"required\" maxlength=\"80\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"txtPrecio\">Precio</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"txtPrecio\" name=\"txtPrecio\" pattern=\"[0-9]+(\\.[0-9]{1,2})?%?\" placeholder=\"400.50\" required=\"required\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"txtDescripcion\">Descripción</label>\r\n");
      out.write("                                        <textarea id=\"txtDescripcion\" name=\"txtDescripcion\" cols=\"30\" rows=\"3\" required=\"required\" placeholder=\"La mejor computadora...\" class=\"form-control\"></textarea>\r\n");
      out.write("                                        <!-- <input type=\"text\" id=\"txtDescripcion\" name=\"txtDescripcion\"  required=\"required\" placeholder=\"La mejor computadora...\" class=\"form-control\"> -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">                            \r\n");
      out.write("                                        <input type=\"file\" required id=\"txtFoto\" name=\"txtFoto\" placeholder=\"sad\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    <input type=\"hidden\" id=\"txtId\" name=\"txtId\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("                                    <!--<input type=\"hidden\" id=\"opcion\" name=\"opcion\" value=\"I\">-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"modal-footer\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("                                        <button id=\"btnGuardar\" type=\"submit\" class=\"btn btn-primary\">Guardar</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Modal Editar Producto -->\r\n");
      out.write("                <div class=\"modal fade\" id=\"default-example-modal-editar\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <h4 id=\"tituloModalEditar\" class=\"modal-title\">\r\n");
      out.write("                                    Editar Producto\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                    <span aria-hidden=\"true\"><i class=\"fal fa-times\"></i></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                                <form id=\"formulario-editar\" class=\"form\" method=\"post\" autocomplete=\"off\" action=\"Controlador_Producto?opcion=D\">\r\n");
      out.write("                                    <!-- enctype=\"multipart/form-data\" -->\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"txtNombre\">Nombre</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"txtNombreM\" name=\"txtNombreM\" placeholder=\"Computadora RXY\" required=\"required\" maxlength=\"80\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"txtPrecio\">Precio</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"txtPrecioM\" name=\"txtPrecioM\" pattern=\"[0-9]+(\\.[0-9]{1,2})?%?\" placeholder=\"400.50\" required=\"required\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"txtDescripcion\">Descripción</label>\r\n");
      out.write("                                        <textarea id=\"txtDescripcionM\" name=\"txtDescripcionM\" cols=\"30\" rows=\"3\" required=\"required\" placeholder=\"La mejor computadora...\" class=\"form-control\"></textarea>\r\n");
      out.write("                                        <!-- <input type=\"text\" id=\"txtDescripcion\" name=\"txtDescripcion\"  required=\"required\" placeholder=\"La mejor computadora...\" class=\"form-control\"> -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <!--\r\n");
      out.write("                                    <div class=\"form-group\">                            \r\n");
      out.write("                                        <input type=\"file\" required id=\"txtFoto\" name=\"txtFoto\" placeholder=\"sad\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    -->\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    <input type=\"hidden\" id=\"txtIdM\" name=\"txtIdM\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("                                    <!--<input type=\"hidden\" id=\"opcion\" name=\"opcion\" value=\"I\">-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"modal-footer\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("                                        <button id=\"btnGuardarM\" type=\"submit\" class=\"btn btn-primary\">Guardar</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("                <!-- Inicia TABLA -->\r\n");
      out.write("                <table id=\"dt-basic-example\" class=\"table table-bordered table-hover table-striped w-100\">\r\n");
      out.write("\r\n");
      out.write("                    <thead class=\"bg-primary-600\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Id</th>\r\n");
      out.write("                            <th>Fecha</th>\r\n");
      out.write("                            <th>Imagen</th>\r\n");
      out.write("                            <th>Nombre</th>\r\n");
      out.write("                            <th>Precio</th>\r\n");
      out.write("                            <th>Descripción</th>\r\n");
      out.write("                            <th class=\"disabled-sorting\">Modificar</th>\r\n");
      out.write("                            <th class=\"disabled-sorting\">Eliminar</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            List<Producto1> listaProductos = Modelo_Producto1.lista();

                            for (Producto1 u : listaProductos) {

                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print( u.getId() );
      out.write("</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <img src=\"productos/");
      out.print(u.getImagen());
      out.write("\" width=\"50\" height=\"50\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>");
      out.print( u.getDate());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( u.getName() );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( u.getPrice() );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( u.getDescription());
      out.write("</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"image\" src=\"img/editar.png\" data-toggle=\"modal\" data-target=\"#default-example-modal-editar\" onclick=\"Mostrar(");
      out.print( u.getId() );
      out.write(',');
      out.write('\'');
      out.print( u.getName() );
      out.write("', '");
      out.print( u.getPrice() );
      out.write("', '");
      out.print( u.getDescription());
      out.write("', 'D')\">\r\n");
      out.write("                            </td> <!-- \"Mostrar(");
      out.print( u.getId() );
      out.write(',');
      out.write('\'');
      out.print( u.getName() );
      out.write('\'');
      out.write(',');
      out.print( u.getPrice() );
      out.write(',');
      out.write('\'');
      out.print( u.getDescription() );
      out.write("','M')\" -->\r\n");
      out.write("                            <td>\r\n");
      out.write("\r\n");
      out.write("                                <form action=\"Controlador_Producto\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"hidden\" name=\"txtId\" value=\"");
      out.print(u.getId());
      out.write("\"> \r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"hidden\" name=\"opcion\" value=\"E\">\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"image\" src=\"img/eliminar.png\" onclick=\"return confirm('¿Desea Eliminar?')\">\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                    <tfoot>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Id</th>\r\n");
      out.write("                            <th>Fecha</th>\r\n");
      out.write("                            <th>Nombre</th>\r\n");
      out.write("                            <th>Precio</th>\r\n");
      out.write("                            <th>Descripción</th>\r\n");
      out.write("                            <th class=\"disabled-sorting\">Modificar</th>\r\n");
      out.write("                            <th class=\"disabled-sorting\">Eliminar</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tfoot>\r\n");
      out.write("                </table>\r\n");
      out.write("                <!-- Termina TABLA -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/sweetalert2.min.js\"></script>\r\n");
      out.write("        <script src=\"js/carrito.js\"></script>\r\n");
      out.write("        <script src=\"js/pedido.js\"></script>\r\n");
      out.write("       \r\n");
      out.write("        <script src=\"js/vendors.bundle.js\"></script>\r\n");
      out.write("        <script src=\"js/app.bundle.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/datagrid/datatables/datatables.bundle.js\"></script>\r\n");
      out.write("        <script src=\"js/datagrid/datatables/datatables.export.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("         <script type=\"text/javascript\">\r\n");
      out.write("            var Mostrar = function(id, name, price, description, estado){\r\n");
      out.write("                \r\n");
      out.write("                if(estado==\"I\"){\r\n");
      out.write("                    document.getElementById(\"txtId\").value = id;\r\n");
      out.write("                    document.getElementById(\"txtNombre\").value = name;\r\n");
      out.write("                    document.getElementById(\"txtPrecio\").value = price;\r\n");
      out.write("                    document.getElementById(\"txtDescripcion\").value = description;\r\n");
      out.write("                    \r\n");
      out.write("                    document.getElementById(\"tituloModal\").innerHTML = \"Nuevo Producto\";\r\n");
      out.write("                    document.getElementById(\"btnGuardar\").innerHTML = \"Guardar\";\r\n");
      out.write("                    \r\n");
      out.write("                    document.getElementById(\"opcion\").value = estado;\r\n");
      out.write("                    \r\n");
      out.write("                } else {\r\n");
      out.write("                    \r\n");
      out.write("                    document.getElementById(\"txtIdM\").value = id;\r\n");
      out.write("                    document.getElementById(\"txtNombreM\").value = name;\r\n");
      out.write("                    document.getElementById(\"txtPrecioM\").value = price;\r\n");
      out.write("                    document.getElementById(\"txtDescripcionM\").value = description;\r\n");
      out.write("\r\n");
      out.write("                    document.getElementById(\"tituloModal\").innerHTML = \"Modificar Producto\";\r\n");
      out.write("                    document.getElementById(\"btnGuardar\").innerHTML = \"Modificar\";\r\n");
      out.write("                \r\n");
      out.write("                    document.getElementById(\"opcion\").value = estado;\r\n");
      out.write("                }\r\n");
      out.write("            \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            // CUANDO CIERRAS EL MODAL\r\n");
      out.write("            $(\"#default-example-modal\").on(\"hidden.bs.modal\", function(){\r\n");
      out.write("                $(\"#campo-alertas\").fadeOut();\r\n");
      out.write("                limpiarDatos();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // LIMPIO FORMULARIO\r\n");
      out.write("            var limpiarDatos = function(){\r\n");
      out.write("                document.getElementById(\"formulario\").reset();\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            // CUANDO CIERRAS EL MODAL\r\n");
      out.write("            $(\"#default-example-modal-editar\").on(\"hidden.bs.modal\", function(){\r\n");
      out.write("                $(\"#campo-alertas\").fadeOut();\r\n");
      out.write("                limpiarDatosEditar();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // LIMPIO FORMULARIO\r\n");
      out.write("            var limpiarDatosEditar = function(){\r\n");
      out.write("                document.getElementById(\"formulario-editar\").reset();\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        ");

            if(ALERTA!=null){
                if(ALERTA.equals("INGRESADO")){
                    
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        Swal.fire(\r\n");
      out.write("                            'Operación Realizada!',\r\n");
      out.write("                             'Ingresado correctamente!',\r\n");
      out.write("                             'success'\r\n");
      out.write("                         )\r\n");
      out.write("                    </script>\r\n");
      out.write("                    ");

                } else if(ALERTA.equals("NO_INGRESADO")){
                    
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                         Swal.fire(\r\n");
      out.write("                            'Operación no Realizada!',\r\n");
      out.write("                             'No pudo ser ingresado!',\r\n");
      out.write("                             'info'\r\n");
      out.write("                         )\r\n");
      out.write("                    </script>\r\n");
      out.write("                    ");

                } else if(ALERTA.equals("MODIFICADO")){
                    
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        Swal.fire(\r\n");
      out.write("                            'Operación Realizada!',\r\n");
      out.write("                             'Modificado correctamente!',\r\n");
      out.write("                             'success'\r\n");
      out.write("                         )\r\n");
      out.write("                    </script>\r\n");
      out.write("                    ");

                } else if(ALERTA.equals("NO_MODIFICADO")){
                    
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        Swal.fire(\r\n");
      out.write("                            'Operación no Realizada!',\r\n");
      out.write("                             'No pudo ser modificado!',\r\n");
      out.write("                             'info'\r\n");
      out.write("                         )\r\n");
      out.write("                    </script>\r\n");
      out.write("                    ");

                } else if(ALERTA.equals("ELIMINADO")){
                    
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        Swal.fire(\r\n");
      out.write("                            'Operación Realizada!',\r\n");
      out.write("                             'Eliminado correctamente!',\r\n");
      out.write("                             'success'\r\n");
      out.write("                         )\r\n");
      out.write("                    </script>\r\n");
      out.write("                    ");

                } else if(ALERTA.equals("NO_ELIMINADO")){
                    
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        Swal.fire(\r\n");
      out.write("                            'Operación no Realizada!',\r\n");
      out.write("                             'No pudo ser eliminado!',\r\n");
      out.write("                             'info'\r\n");
      out.write("                         )\r\n");
      out.write("                    </script>\r\n");
      out.write("                    ");

                } else if(ALERTA.equals("ERROR")){
                    
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        Swal.fire(\r\n");
      out.write("                            'Operación no Realizada!',\r\n");
      out.write("                             'Ocurrió un problema interno!',\r\n");
      out.write("                             'error'\r\n");
      out.write("                         )\r\n");
      out.write("                    </script>\r\n");
      out.write("                    ");

                } 

            }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- LIBERÍA PARA REPORTES-->\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function()\r\n");
      out.write("            {\r\n");
      out.write("\r\n");
      out.write("                // initialize datatable\r\n");
      out.write("                $('#dt-basic-example').dataTable(\r\n");
      out.write("                {\r\n");
      out.write("                    responsive: true,\r\n");
      out.write("                    lengthChange: false,\r\n");
      out.write("                    dom:\r\n");
      out.write("                        /*\t--- Layout Structure \r\n");
      out.write("                        \t--- Options\r\n");
      out.write("                        \tl\t-\tlength changing input control\r\n");
      out.write("                        \tf\t-\tfiltering input\r\n");
      out.write("                        \tt\t-\tThe table!\r\n");
      out.write("                        \ti\t-\tTable information summary\r\n");
      out.write("                        \tp\t-\tpagination control\r\n");
      out.write("                        \tr\t-\tprocessing display element\r\n");
      out.write("                        \tB\t-\tbuttons\r\n");
      out.write("                        \tR\t-\tColReorder\r\n");
      out.write("                        \tS\t-\tSelect\r\n");
      out.write("\r\n");
      out.write("                        \t--- Markup\r\n");
      out.write("                        \t< and >\t\t\t\t- div element\r\n");
      out.write("                        \t<\"class\" and >\t\t- div with a class\r\n");
      out.write("                        \t<\"#id\" and >\t\t- div with an ID\r\n");
      out.write("                        \t<\"#id.class\" and >\t- div with an ID and a class\r\n");
      out.write("\r\n");
      out.write("                        \t--- Further reading\r\n");
      out.write("                        \thttps://datatables.net/reference/option/dom\r\n");
      out.write("                        \t--------------------------------------\r\n");
      out.write("                         */\r\n");
      out.write("                        \"<'row mb-3'<'col-sm-12 col-md-6 d-flex align-items-center justify-content-start'f><'col-sm-12 col-md-6 d-flex align-items-center justify-content-end'lB>>\" +\r\n");
      out.write("                        \"<'row'<'col-sm-12'tr>>\" +\r\n");
      out.write("                        \"<'row'<'col-sm-12 col-md-5'i><'col-sm-12 col-md-7'p>>\",\r\n");
      out.write("                    buttons: [\r\n");
      out.write("                        /*{\r\n");
      out.write("                        \textend:    'colvis',\r\n");
      out.write("                        \ttext:      'Column Visibility',\r\n");
      out.write("                        \ttitleAttr: 'Col visibility',\r\n");
      out.write("                        \tclassName: 'mr-sm-3'\r\n");
      out.write("                        },*/\r\n");
      out.write("                        {\r\n");
      out.write("                            extend: 'pdfHtml5',\r\n");
      out.write("                            text: 'PDF',\r\n");
      out.write("                            titleAttr: 'Generar PDF',\r\n");
      out.write("                            className: 'btn-outline-danger btn-sm mr-1'\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            extend: 'excelHtml5',\r\n");
      out.write("                            text: 'Excel',\r\n");
      out.write("                            titleAttr: 'Generar Excel',\r\n");
      out.write("                            className: 'btn-outline-success btn-sm mr-1'\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            extend: 'csvHtml5',\r\n");
      out.write("                            text: 'CSV',\r\n");
      out.write("                            titleAttr: 'Generate CSV',\r\n");
      out.write("                            className: 'btn-outline-primary btn-sm mr-1'\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            extend: 'copyHtml5',\r\n");
      out.write("                            text: 'Copy',\r\n");
      out.write("                            titleAttr: 'Filas copiadas',\r\n");
      out.write("                            className: 'btn-outline-primary btn-sm mr-1'\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            extend: 'print',\r\n");
      out.write("                            text: 'Print',\r\n");
      out.write("                            titleAttr: 'Imprime tabla',\r\n");
      out.write("                            className: 'btn-outline-primary btn-sm'\r\n");
      out.write("                        }\r\n");
      out.write("                    ]\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    \r\n");
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
