package sistema.empleadosDAL;
import java.sql.*;

public class conexion {
    String strConexionDB = "";
    // Variable que me permite conectar la BASE DE DATOS
    
    Connection conn = null;
    
    //try catch
    public  conexion(){
        try {
        Class.forName("org.sqlite.JDBC");
        conn= DriverManager.getConnection(strConexionDB);
        System.out.println("Conexion Establecida");
            
        } catch (Exception e) {
            System.out.println("Error de la conexión "+ e);
        }

    }
}
