/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import beans.Mensajes;
import beans.Producto1;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion_mongo {
    
    DB db;
    DBCollection tabla;    

    //MongoDatabase database;
    
    public int ConexionMongoDB() {

            try{
                // Creamos un Mongo CLient
                MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
                
                //database = mongo.getDatabase("bd_sales_products"); 
        
                db=mongo.getDB("bd_sales_products");
                tabla=db.getCollection("messages");
                
                return 1;
            } catch (Exception ex) {
                System.out.println(ex);
                return 0;
            }
    }
    
    public int agregarMensajes(){
        try {
            BasicDBObject document = new BasicDBObject();
            
            document.put("user", "'juan'");
            document.put("message", "'hola, una consulta'");
            
            tabla.insert(document);
            
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public List listaMensajes(){
    
        try {

            List<Mensajes> mensajes = new ArrayList<>();

            BasicDBObject query = new BasicDBObject();
            BasicDBObject field = new BasicDBObject();
            
            DBCursor cursor = db.getCollection("messages").find(query,field);
        
            while (cursor.hasNext()) {
                Mensajes mensaje = new Mensajes();
                
                BasicDBObject obj = (BasicDBObject) cursor.next();
                mensaje.setUser(obj.getString("user"));
                mensaje.setMessage(obj.getString("message"));
                
                mensajes.add(mensaje);
            }
        
            return mensajes;

        } catch (Exception e) {
            return null;
        }
        
    }
    
}
