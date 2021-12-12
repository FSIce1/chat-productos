/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion_mongo {
    
    public class ConexionMongoDB extends javax.swing.JFrame {
        DB db;
        DBCollection tabla;

        public ConexionMongoDB() {
            try{
                Mongo mongo = new Mongo("localhost",27017);
                db=mongo.getDB("bd_sales_products");
                tabla=db.getCollection("messages");
            } catch (Exception ex) {
                Logger.getLogger(ConexionMongoDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
}
