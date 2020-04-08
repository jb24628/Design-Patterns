package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Mehdi
 *
 */
public class DatabaseAccess {

//	static final String DRIVE_NAME = "com.mysql.jdbc.Driver";

//	static final String CONNECTION_URL = "jdbc:mysql://localhost/company";
	static final String CONNECTION_URL = "jdbc:mysql://localhost/company?useSSL=false&serverTimezone=UTC";

	static final String DB_CONNECTION_USERNAME = "jireh";

	static final String DB_CONNECTION_PASSWORD = "password";

	public static Connection connect() {
		Connection con = null;
		try {
//			Class.forName(DRIVE_NAME);
			con = DriverManager.getConnection(CONNECTION_URL, DB_CONNECTION_USERNAME, DB_CONNECTION_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully connected.");
		return con;
	} // end of connect

	public static ResultSet retrieve (String query) {
		Connection con = connect();
		ResultSet rset = null;
		try {
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			return rset;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rset;
	}// end of retrieve


	public static ResultSet retrieve (Connection con, String query) {
		ResultSet rset = null;
		try {
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			return rset;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rset;
	}// end of retrieve

	public static void closeConnection(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of closeConnection

	public static int insert(String sql) {
		Connection c = connect();
		int r = 0;
		try {
			Statement s = c.createStatement();
			r = s.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection(c);
		}
		return r;
	}

}
