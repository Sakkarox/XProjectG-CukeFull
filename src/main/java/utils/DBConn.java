package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {

	
	
	
	public static void savePurchaseReceipt(String refID, String date) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/DemoDB", "root", "Sakarya54@");
		
		Statement sta = con.createStatement();
		
		sta.execute("use brite");
		sta.execute("insert into purchaseReceipt values(\"" + refID + "\", \"" + date + "\");");
		
		
	}
	
	
}
