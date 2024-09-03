package DB;
import java.sql.*;

public class DBconnect {
	
	public Connection conn=null; //db연결
	public PreparedStatement ps = null; //쿼리실행
	public ResultSet rs = null; //쿼리결과
	
	public DBconnect() {

		String jdbcUrl = "jdbc:mysql://localhost:3306/mytest";
		String dbId = "root";
		String dbPass = "1111";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl,dbId ,dbPass );

		} catch(SQLException | ClassNotFoundException err) { err.printStackTrace();}
	}
	
	public DBconnect(String sql) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/mytest";
		String dbId = "root";
		String dbPass = "1111";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
			ps = conn.prepareStatement(sql);

		} catch(SQLException | ClassNotFoundException err) { err.printStackTrace();}
	}

}
