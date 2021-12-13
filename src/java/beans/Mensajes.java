
package beans;

public class Mensajes {
    
    private String user;
    private String message;
    private String user_remitente;

    public Mensajes() {
    }

    public Mensajes(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public Mensajes(String user, String message, String user_remitente) {
        this.user = user;
        this.message = message;
        this.user_remitente = user_remitente;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser_remitente() {
        return user_remitente;
    }

    public void setUser_remitente(String user_remitente) {
        this.user_remitente = user_remitente;
    }
    
}
