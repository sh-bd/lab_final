package DBDemo1;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class jdbc1 {

	public static void main(String[]args) throws ClassNotFoundException, SQLException{
		String url= "jdbc:mysql://127.0.0.1/database1";
		String username= "root";
		String password="";
		String query= "Select * from info where id=1"; 
		Class.forName("com.mysql.jdbc.Driver");
		try {
		Connection connection= (Connection) DriverManager.getConnection(url, username, password);
	
		java.sql.Statement statement= connection.createStatement();
		statement.executeQuery(query);
		System.out.println("Successful");
		}
		catch(SQLException e) {
			System.out.println("Unsuccessful");
		}
		
		
	}

}
