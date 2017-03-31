import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.yourcodelab.db.ConnectDB;

public class TestConnection {
		
	public static void main(String[] args) {
		ConnectDB db = new ConnectDB();
		Connection connect = null;
		
		try {
			connect = db.getConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found");
		} catch (IOException e) {
			System.out.println("File not Found");
		} catch (SQLException e) {
			System.out.println("Error on Connecting");
		}finally{
			if(connect != null)
				try {
					connect.close();
				} catch (SQLException e) {
					System.out.println("Error on Closing Connection");
				}
		}
	}
}
