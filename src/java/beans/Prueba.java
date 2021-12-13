/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import datos.cadito_;
import datos.conexion_mongo;
import java.util.List;
import modelos.Modelo_Mensaje;

/**
 *
 * @author luisf
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        try {
          
            Modelo_Mensaje modelo = new Modelo_Mensaje();
            
            /*
            Mensajes mensaje = new Mensajes("juancho", "Mensaje de prueba","pedro");
            
            if(modelo.insertar(mensaje)==1)
                System.out.println("Ingresado");
            else 
                System.out.println("No ingresado");
            */
            
            
            //cado.ConexionMongoDB();
            //cado.agregarMensajes();
            
            List<Mensajes> mensajes = modelo.listaMensajes();
            
            
            for (int i = 0; i < mensajes.size(); i++) {
                System.out.println("\n===Mensaje "+(i+1)+"===");
                System.out.println("User: "+mensajes.get(i).getUser());
                System.out.println("Mensaje: "+mensajes.get(i).getMessage());
                System.out.println("User Remitente: "+mensajes.get(i).getUser_remitente());
            }
            
        } catch (Exception e) {
        }
        
    }
    
}
