package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

	Connection cx = null;

	public Connection conectar() {
		try {
			Class.forName("org.sqlite.JDBC");
			cx=DriverManager.getConnection("jdbc:sqlite:sistema.db");
			System.out.print("Conecion Exitosa");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cx;
	}
}
