package sistema.empleadosDAL;
import java.sql.*;

public class conexion {
    String strConexionDB = "jdbc:sqlite:C:/Users/andre/OneDrive/Desktop/ProyectoJDBC/sistema.db";
    // Variable que me permite conectar la BASE DE DATOS
    
    Connection conn = null;
    
    //try catch
    public  conexion(){
        try {
        Class.forName("org.sqlite.JDBC");
        conn= DriverManager.getConnection(strConexionDB);
        System.out.println("Conexión Establecida");
            
        } catch (Exception e) {
            System.out.println("Error de la conexión "+ e);
        }

    }
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        
        try {
             PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
             ResultSet respuesta = pstm.executeQuery();
             return respuesta;   
        } catch (Exception e) {
            System.out.println(e);
            return null;
        } 
    }
}
