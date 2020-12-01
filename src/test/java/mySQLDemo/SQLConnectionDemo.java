package mySQLDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Kritika@123");
		PreparedStatement stmt = con.prepareStatement("select * from logindata");
		ResultSet result = stmt.executeQuery();
		if(result.next()) {
			String url = result.getString(1);
			String user = result.getString(2);
			String pwd = result.getString(3);
			
			System.out.println(url+" "+user+" "+pwd);
		}
	}

}
