package Com.sk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	JDBCUtility jl = new JDBCUtility();
	public int insertStudent(int id, int lid, String Name,String City) throws Exception {
		  PreparedStatement p =  JDBCUtility.getConnection().prepareStatement("insert into Student(student_id,library_id,name,city)  values(?,?,?,?)");
		  p.setInt(1, id);
		  p.setInt(2, lid);
		  p.setString(3, Name);
		  p.setString(4, City);
		  int no = p.executeUpdate();
		  
		  return no;
	}
	
	public ResultSet showStudent() throws SQLException, Exception {
		Statement smt = JDBCUtility.getConnection().createStatement();
		ResultSet query = smt.executeQuery("Select * from Student");
		return query;
	}

}
