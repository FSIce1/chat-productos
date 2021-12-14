
package controladores;

import beans.Producto1;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Modelo_Producto1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet(name = "Controlador_Producto", urlPatterns = {"/Controlador_Producto"})
public class Controlador_Producto1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            
            Modelo_Producto1 mod;
            HttpSession session = request.getSession();
            
            switch(request.getParameter("opcion").charAt(0)){
                
            // MANDAR A MI LISTA
            case 'A':
            
                response.sendRedirect("Lista_Productos.jsp");
                
                break;
                
            // MANDAR A LA LISTA DE ACTIVIDADES    
            case 'L': 
                
                //request.setAttribute("ID", request.getParameter("txtId"));
                
                response.sendRedirect("index.jsp");
                //request.getRequestDispatcher("index.jsp").forward(request, response);

                break;
                
            // INSERTAR
            case 'I': 
                System.out.println("ENTRAAAAAAAA===============");
                mod= new Modelo_Producto1();

                Producto1 producto;
                
                ArrayList<String> lista = new ArrayList<>();
                
                try {
                
                    producto= new Producto1();
                    
                    FileItemFactory file = new DiskFileItemFactory();
                    ServletFileUpload fileUpload = new ServletFileUpload(file);
                    List items = fileUpload.parseRequest(request); //Captura todos los elementos del formulario
                    for (int i = 0; i < items.size(); i++) {
                        FileItem fileItem = (FileItem) items.get(i);
                        if(!fileItem.isFormField()){
                            //File file=new File("C:\\Users\\USUARIO\\Downloads\\CarritoCompras\\web\\productos\\"+fileItem.getName());
                            //File f=new File("C:\\productos\\"+fileItem.getName());
                            
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                            
                            String nombreFoto = fileItem.getName();
                            String codigoAleatorio = dtf.format(LocalDateTime.now());
                            String junto = codigoAleatorio + nombreFoto;
                            
                            File f = new File("C:\\Users\\Javier\\Documents\\NetBeansProjects\\chat-productos\\web\\productos\\"+fileItem.getName());
                            //File f=new File("D:\\productos\\"+fileItem.getName());

                            fileItem.write(f);
                            
                            //producto.setImagen(f.getAbsolutePath());
                            //producto.setImagen(junto);
                            producto.setImagen(nombreFoto);
                            
                            
                        } else {
                            lista.add(fileItem.getString());                            
                        }
                        
                        //producto.setName(name);
                    }
                    
                    //System.out.println("FOTO: "+request.getParameter("txtFoto"));
                    
                    /*
                    producto.setName(request.getParameter("txtNombre"));
                    producto.setPrice(Double.parseDouble(request.getParameter("txtPrecio")));
                    producto.setDescription(request.getParameter("txtDescripcion"));
                    */
                    
                    producto.setName(lista.get(0));
                    producto.setPrice(Double.parseDouble(lista.get(1)));
                    producto.setCantidad(Integer.parseInt(lista.get(2)) );
                    producto.setDescription(lista.get(3));
                    
                    Date d = new Date();
                    producto.setDate(d);
                    
                    if(mod.insertar(producto)==1)
                        request.setAttribute("ALERTA", "INGRESADO");
                    else 
                        request.setAttribute("ALERTA", "NO_INGRESADO");

                    esperarXsegundos(2);
                
                    request.getRequestDispatcher("Lista_Productos.jsp").forward(request, response);

                } catch (Exception e) {
                }
                
                break;
            
            //MODIFICAR     
            case 'D':
  
                mod= new Modelo_Producto1();

                try {
                
                    producto= new Producto1();

                    producto.setId(Integer.parseInt(request.getParameter("txtIdM")));
                    producto.setName(request.getParameter("txtNombreM"));
                    producto.setPrice(Double.parseDouble(request.getParameter("txtPrecioM")));
                    producto.setDescription(request.getParameter("txtDescripcionM"));
                    producto.setCantidad(Integer.parseInt(request.getParameter("txtCantidadM")));

                    if(mod.modificar(producto)==1)
                        request.setAttribute("ALERTA", "MODIFICADO");
                    else 
                        request.setAttribute("ALERTA", "NO_MODIFICADO");

                    request.getRequestDispatcher("Lista_Productos.jsp").forward(request, response);

                } catch (IOException | NumberFormatException e) {
                }
                
                break;    

            // ELIMINAR
            case 'E':
            
                try {
                
                    mod= new Modelo_Producto1();

                    if(mod.eliminar(Integer.parseInt(request.getParameter("txtId")))==1)
                        request.setAttribute("ALERTA", "ELIMINADO");
                    else 
                        request.setAttribute("ALERTA", "NO_ELIMINADO");
                    

                    request.setAttribute("ID", request.getParameter("txtIdEvento"));

                    request.getRequestDispatcher("Lista_Productos.jsp").forward(request, response);

                } catch (IOException | NumberFormatException e) {
                }
                
                break;

                default: 
                out.print("Opción No Disponible");
                break;
            
            }
            
        }
        
    }
    
    private void esperarXsegundos(int segundos) {
        try {
                Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
