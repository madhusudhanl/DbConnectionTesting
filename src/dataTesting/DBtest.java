package dataTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtest {

	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		//WebDriver driver = new ChromeDriver();
		
		String host = "localhost";
		String port = "3306";
		
		
		Connection con = DriverManager.getConnection("jbdc:mysql://"+host+":"+port+"/addroitt", "root", "admin");
		Statement sen = con.createStatement();
		ResultSet rs = sen.executeQuery("SELECT * FROM addroitt.city");
		
		while(rs.next()) {
			
			System.out.println(rs.getString("city"));
			
			
		}
		
	}

}
