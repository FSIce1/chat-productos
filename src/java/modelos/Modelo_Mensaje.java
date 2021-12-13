
package modelos;

import beans.Mensajes;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import datos.conexion_mongo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Modelo_Mensaje {

    public Modelo_Mensaje() {
    }
    
    public int insertar(Mensajes mensaje) {
        
        conexion_mongo cado = new conexion_mongo(); 
        
        cado.ConexionMongoDB();
            
        try {
            BasicDBObject document = new BasicDBObject();
            
            
            MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
                
            DB db=mongo.getDB("bd_sales_products");
            DBCollection tabla=db.getCollection("messages");
            
            document.put("user", mensaje.getUser());
            document.put("message", mensaje.getMessage());
            document.put("user_remitente", mensaje.getUser_remitente());
            
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
            
            MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
                
            DB db=mongo.getDB("bd_sales_products");
                    
            DBCursor cursor = db.getCollection("messages").find(query,field);
        
            while (cursor.hasNext()) {
                Mensajes mensaje = new Mensajes();
                
                BasicDBObject obj = (BasicDBObject) cursor.next();
                mensaje.setUser(obj.getString("user"));
                mensaje.setMessage(obj.getString("message"));
                mensaje.setUser_remitente(obj.getString("user_remitente"));
                
                mensajes.add(mensaje);
            }
        
            return mensajes;

        } catch (Exception e) {
            return null;
        }
        
    }
    
}
