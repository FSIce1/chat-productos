package modelos;

import beans.Producto1;
import datos.cadito_;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Modelo_Producto1 {

    public int insertar(Producto1 producto) {
        
        String sql;
        
        cadito_ cado = new cadito_(); 
        
        sql = "INSERT INTO products (name,price,description,date) VALUES (?,?,?,?)";
        
        try {
            
            Object[] parametros = new Object[4];
            
            parametros[0]= producto.getName();
            parametros[1]= producto.getPrice();
            parametros[2]= producto.getDescription();
            parametros[3]= new java.sql.Date(producto.getDate().getTime());

            return cado.ejecutar1(sql,parametros);
            
        } catch (SQLException ex) {
            return 0;
        }
         
    }
    
    public int modificar(Producto1 producto) {
        
        String sql;
        
        cadito_ cado = new cadito_(); 
        
        sql = "UPDATE products set name=?,price=? ,description=? WHERE id=?";
        
            try {
            
            Object[] parametros = new Object[4];
            
            parametros[0]=producto.getName();
            parametros[1]=producto.getPrice();
            parametros[2]=producto.getDescription();
            parametros[3]=producto.getId();
            
            return cado.ejecutar1(sql,parametros);
            
        } catch (SQLException ex) {
            return 0;
        }
    }

    public int eliminar(int codigo){
        
        String sql="delete from products where id="+codigo+"";

        cadito_ cado= new cadito_();

        try {
            return cado.ejecutarEliminar(sql);
        } catch (SQLException e) {
            return 0;
        }
    }

    public static List<Producto1> lista() throws SQLException{
        
        String sql="";
        
        sql="select * from products";

        cadito_ cado= new cadito_();
        
        Statement st = null;
        ResultSet re = null;
        
        List<Producto1> productos = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                Producto1 producto = new Producto1();

                producto.setId(re.getInt("id"));
                producto.setName(re.getString("name"));
                producto.setPrice(re.getDouble("price"));
                producto.setDescription(re.getString("description"));
                producto.setDate(re.getDate("date"));

                productos.add(producto);
            }
              
            return productos;
            
        } catch (SQLException e) {
            return null;
        } finally {

            if (re != null) {
                re.close();
            }

            if (st != null) {
                st.close();
            }

            cado.closeCnx(c);
        }
        
    }
    
}

