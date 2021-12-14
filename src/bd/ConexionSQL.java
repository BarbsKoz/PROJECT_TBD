package bd;

import clases.Utilerias;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionSQL extends Utilerias {
    
    public ResultSet rs; // ATRIBUTO PARA RESULTADOS DE CONSULTAS
    public Statement st; // ATRIBUTO PARA HACER CONSULTAS
    public Connection con; // ATRIBUTO PARA CONEXIONES
    
    public ConexionSQL(){
        /*try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // DEFINIMOS LOS PARAMETROS DE LA CONEXION
            String database = "ITH_BD"; //Nombre de la base de datos a conectar
            String user = "sa"; //Usuario que utilizaremos para conectarnos
            String pass = "contramagica"; //Contraseña del usuario
            String connectionUrl = "jdbc:sqlserver://DESKTOP-67BK2GD\\\\SQLEXPRESS:1433;databaseName=" +
                    database + ";user=" + user + ";password=" + pass + ";"; //Url para realizar la conexion
            
            // RELIZA CONEXION
            this.con = DriverManager.getConnection(connectionUrl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos", "Error", 0);
        }*/
        
        this.con = null;
        String usuario = "quantic3_testerith"; // (variable) para el usuario del motor de la bd
        String contraseña = "Tester2806"; // para la contraseña de root
        String baseDatos = "quantic3_ithost"; //Nombre de la base de datos
        String direccion = "jdbc:mysql://108.179.194.58/" + baseDatos; //Direccion del motor de BD
        try {
            con = DriverManager.getConnection(direccion, usuario, contraseña);
            //Realizando la conexion
        } catch (Exception e) {
            //mensaje de problema de conexion
        }
    }
}
