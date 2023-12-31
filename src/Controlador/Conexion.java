
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


    
public class Conexion {
    private String url="jdbc:mysql://localhost/gestionarg1";
    private String usuario="root";
    private String password="";

    private Connection conexion;

    public Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos. -------- aca"+ex.getMessage());
        }
        
    }
  
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;

        Class.forName("org.mariadb.jdbc.Driver");

    }
    
    public Connection getConexion() {
        if(conexion == null){
            try {
                conexion = DriverManager
                        .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                                + "&user=" + usuario + "&password=" + password);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion a base de datos"+ex.getMessage());
            }
        }
        return conexion;
    }
    
}
