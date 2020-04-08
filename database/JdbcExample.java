package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcExample {

	public static void main(String[] args) throws SQLException {
//		String query = " select * from department";
		String query = "select * from employee";
		ResultSet rs = DatabaseAccess.retrieve(query);
		while(rs.next()) {
			String dnum = rs.getString("ssn");
			String dname = rs.getString("fname");
			String mgrssn = rs.getString("lname");
			System.out.println(dnum + " " + dname + " " + mgrssn);
			
//			DatabaseAccess.closeConnection(con);
		}
		
		
	}

}
