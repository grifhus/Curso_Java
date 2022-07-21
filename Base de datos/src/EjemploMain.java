import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EjemploMain {
    public static void main(String[] args) {
        Connection conexion;
        String jdbc = "jdbc:mysql://localhost:3306/ejemplo";
        try {
            conexion = DriverManager.getConnection(jdbc,"root","0987654321");
            //Logica base de datos
            System.out.println("Estoy dentro");
        } catch (SQLException sql) {
            // Tratar esta excepcion
            sql.printStackTrace();
        }
    }
}

