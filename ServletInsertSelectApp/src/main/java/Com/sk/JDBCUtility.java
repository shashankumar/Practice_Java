package Com.sk;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtility {
	
	public static Connection getConnection() throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1234");
	return conn;
}
	
	public Connection getPreparedConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1234");
		return conn;
		
		
	}
	
	
}
