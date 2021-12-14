package server;
import beans.Mensajes;
import java.io.IOException;
import java.util.HashMap;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import modelos.Modelo_Mensaje;
@ServerEndpoint("/echo")// La anotación hace que esta clase Java se declare como un punto final de WebSocket
public class EchoServer {
    private boolean first = true;
    private String name;// Apodo del usuario
    // la clave de conexión es el ID de la sesión, el valor es este objeto
    private static final HashMap<String,Object> connect = new HashMap<String,Object>();
    // La clave userMap es el ID de la sesión, el valor es el nombre de usuario
    private static final HashMap<String,String> userMap = new HashMap<String,String>();
    private Session session;
    
    public static Modelo_Mensaje mod;

    @OnOpen
    public void start(Session session){
        this.session = session; // Obtén Seession y guárdalo en SashMap
        connect.put(session.getId(),this);
    }
 
    @OnMessage
    public void echo( String incomingMessage,Session session){
        EchoServer client = null ;
        // Primero juzga si el valor se pasa por primera vez, el primer valor es el apodo, pasado por OnOpen en el lado web
        if(first){
            this.name = incomingMessage;
            String message ="*Sistema* Bienvenido: "+name;
            // El apodo y la ID de sesión se almacenan en HashMap en una correspondencia uno a uno
            userMap.put(session.getId(), name);
            // Transmite el mensaje a todos los usuarios
            for (String key : connect.keySet()) {  
                try {  
                    client = (EchoServer) connect.get(key);  
                    synchronized (client) {
                        // Envía un mensaje de texto a la web correspondiente
                        client.session.getBasicRemote().sendText(message);  
                    }  
                } catch (IOException e) {   
                    connect.remove(client);  
                    try {  
                        client.session.close();  
                    } catch (IOException e1) {  
                    }  
                }  
            }  
            // Después de ingresar el apodo, no es la primera vez para la posterior transferencia interactiva de valores
            first = false;
        }else{
            /**
                           * El valor de InputMessage tiene el formato xxx @ xxxxx, xxx es el apodo del usuario que se enviará, y todo significa que se envía a todos
                           * InputMessage.split ("@", 2); Use @ como separador para dividir la cadena en dos partes: xxx y xxxxx
             */
            String [] list = incomingMessage.split("@",2);
            if(list[0].equalsIgnoreCase("all")){ // todos transmiten a todas las personas
                sendAll(name,list[1],session);
            }else{
                boolean you = false;// Marcar si se encuentra el usuario remitente
                for(String key : userMap.keySet()){
                    if(list[0].equalsIgnoreCase(userMap.get(key))){
                        client = (EchoServer) connect.get(key);  
                        synchronized (client) {  
                            try {
                                // Enviar información al usuario especificado
                                //client.session.getBasicRemote().sendText(userMap.get(session.getId())+"Para ti:"+list[1]);
                                
                                //mod = new Modelo_Mensaje();
                                //mod.insertar(new Mensajes(list[0],list[1],userMap.get(session.getId())));
                                
                                client.session.getBasicRemote().sendText(userMap.get(session.getId())+": "+list[1]);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }  
                        } 
                        you = true;// Encuentra el usuario especificado marcado como verdadero
                        break;
                    }
 
                }
                // Si es cierto, mostrará que dice xxxxx a xxx en su propia página; de lo contrario, muestre el sistema: no existe tal usuario
                if(you){
                    try {
                        //session.getBasicRemote().sendText("Derecho propio"+ list[0]+"Decir:"+list[1]);
                        //this.name = incomingMessage;
                        
                        mod = new Modelo_Mensaje();
                        // list[0] -> Recibe el mensaje
                        // list[1] -> Mensaje
                        // userMap.get(se...) -> Envía el mensaje
                        mod.insertar(new Mensajes(list[0],list[1],userMap.get(session.getId())));

                        session.getBasicRemote().sendText(userMap.get(session.getId())+": "+list[1]); // Envía mensaje
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        session.getBasicRemote().sendText("*Sistema* no existe tal usuario");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
 
            }
 
        }
    }
 
    @OnClose
    public void close(Session session){
        // Cuando un usuario cierra la sesión, transmite a otros usuarios
        String message ="*Sistema* "+userMap.get(session.getId()) +" salió del chat grupal";
        userMap.remove(session.getId());
        connect.remove(session.getId());
        for (String key : connect.keySet()) {  
            EchoServer client = null ;  
            try {  
                client = (EchoServer) connect.get(key);  
                synchronized (client) {  
                    client.session.getBasicRemote().sendText(message);  
                }  
            } catch (IOException e) {   
                connect.remove(client);  
                try {  
                    client.session.close();  
                } catch (IOException e1) {  
                }  
            }  
        }  
    }
 
    // Difundir toda la información a TODOS
    public static void sendAll(String user,String mess,Session session){  
        String who = null;
        for (String key : connect.keySet()) {  
            EchoServer client = null ;  
            try {  
                client = (EchoServer) connect.get(key);  
                if(key.equalsIgnoreCase(session.getId())){
                    who = "A todos: ";
                }else{
                    who = userMap.get(session.getId())+" a todos: ";
                }
                synchronized (client) {
                    System.out.println(session);
                    mod = new Modelo_Mensaje();
                    mod.insertar(new Mensajes("all",mess,user)); 
                    
                    client.session.getBasicRemote().sendText(who+mess);  
                }  
            } catch (IOException e) {   
                connect.remove(client);  
                try {  
                    client.session.close();  
                } catch (IOException e1) {  
                }  
            }  
        }  
    }  
 
    public String getName(){
        return this.name;
    }
}