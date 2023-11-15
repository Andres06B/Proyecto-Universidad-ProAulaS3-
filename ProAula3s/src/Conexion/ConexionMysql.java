// Este paquete contiene clases e interfaces relacionadas
//con la conexión a una base de datos MySQL
package Conexion;

// Se importan las librerías necesarias para trabajar con una base de datos MySQL
import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.DriverManager;

public class ConexionMysql {

    // variable para almacenar la conexion establecida a base de datos
    ConnectionImpl con;

    public ConnectionImpl conectar() {
        try {
            //cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión con la base de datos
            con = (ConnectionImpl) DriverManager.getConnection("jdbc:mysql:"
                    + "//localhost:3306/ProyectoDeAulaDs3",
                    "root", "admin");
            //Se imprime un mensaje de carga exitosa
            System.out.println("LA CONEXION A LA BASE "
                    + "DE DATOS A SIDO EXITOSA");
        } catch (Exception e) {
            // En caso de error, imprimir un mensaje de error y la excepción
            System.out.println("ERROR AL CONECATR A LA BASE DE DATOS" + e);
        }
        // Retornar la conexión establecida
        return con;
    }
}
