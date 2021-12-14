/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

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
    
}
