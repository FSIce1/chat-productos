/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import datos.cadito_;
import datos.conexion_mongo;

/**
 *
 * @author luisf
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        try {
            
            
        cadito_ cado = new cadito_(); 
        
            System.out.println("Conexión: "+cado.ConexionMongoDB());
            
        } catch (Exception e) {
        }
        
        
        
        
    }
    
}
