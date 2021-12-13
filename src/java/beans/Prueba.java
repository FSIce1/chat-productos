/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import datos.cadito_;
import datos.conexion_mongo;
import java.util.List;

/**
 *
 * @author luisf
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        try {
          
            conexion_mongo cado = new conexion_mongo(); 
            
            cado.ConexionMongoDB();
            cado.agregarMensajes();
            List<Mensajes> mensajes = cado.listaMensajes();
            
            for (int i = 0; i < mensajes.size(); i++) {
                System.out.println("\n===Mensaje "+(i+1)+"===");
                System.out.println("User: "+mensajes.get(i).getUser());
                System.out.println("Mensaje: "+mensajes.get(i).getMessage());
            }

        } catch (Exception e) {
        }
        
    }
    
}
