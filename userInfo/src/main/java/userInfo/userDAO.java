package userInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import DB.DBconnect;
import userInfo.user;

public class userDAO {

	//생성
	void createUser(user u) {
		String sql = "insert into userinfo (userName, userID, userPW, userEmail, birthDay, phoneNumber)"
				+ "values(?,?,?,?,?,?)";
		
		DBconnect db = new DBconnect(sql);
		
		try {
			db.ps.setString(1, u.getUserName());
			db.ps.setString(2, u.getUserID());
			db.ps.setString(3, u.getUserPW());
			db.ps.setString(4, u.getUserEmail());
			db.ps.setString(5, u.getBirthDay());
			db.ps.setString(6, u.getPhoneNumber());
			
			int result = db.ps.executeUpdate();
			if(result>0) {
				System.out.println("success");
			}
		} catch (SQLException e) {e.printStackTrace();}
	};
	
	//조회
	user [] selectUser(String id) {
		String sql;
		if(id.isEmpty()) {
			sql = "select userName, userID, userPW, userEmail, birthDay, phoneNumber from userinfo";
		} else {
			sql = "select userName, userID, userPW, userEmail, birthDay, phoneNumber from userinfo "
					+ "where userID='"+id+"'";
		}
		
		DBconnect db = new DBconnect(sql);
		int rowCount = selectUserAll();
		
		user [] userArray = new user[rowCount];
		int i=0;
		try{
			db.rs = db.ps.executeQuery();
			
			while(db.rs.next()) {
				String userName = db.rs.getString("userName");
				String userID = db.rs.getString("userID");
				String userPW = db.rs.getString("userPW");
				String userEmail = db.rs.getString("userEmail");
				String birthDay = db.rs.getString("birthDay");
				String phoneNumber = db.rs.getString("phoneNumber");
				
				userArray[i] = new user(userName, userID, userPW, userEmail, birthDay, phoneNumber);
				i++;
			}
		} catch (SQLException e) {e.printStackTrace();}
		return userArray;
	}
	
	//모든 인원
	int selectUserAll() {
		String sql = "select userName from userinfo";
		DBconnect db = new DBconnect(sql);
		int rowCount = 0;
		try { 
			ResultSet rs2 = db.ps.executeQuery();
			while(rs2.next()) {
				rowCount++;
			}
		} catch (SQLException e) {e.printStackTrace();}
		return rowCount;
	}
	
	//수정
	void updateUser(user u) {
		String sql = "UPDATE userinfo SET userName =?, userPW=?, userEmail=?, birthDay=?, phoneNumber=? WHERE userID = ?";
		
		DBconnect db = new DBconnect(sql);
		
		try {
			db.ps.setString(1, u.getUserName());
			db.ps.setString(2, u.getUserPW());
			db.ps.setString(3, u.getUserEmail());
			db.ps.setString(4, u.getBirthDay());
			db.ps.setString(5, u.getPhoneNumber());
			db.ps.setString(6, u.getUserID());
			
			int result = db.ps.executeUpdate();
			if(result>0) {
				System.out.println("success");
			}
		} catch (SQLException e) {e.printStackTrace();}
		
	}
	
	//삭제
	void deleteUser(String id) {
		String sql = "delete from userinfo where userid ='"+id+"'";
		
		DBconnect db = new DBconnect(sql);
		
		try {
			int result = db.ps.executeUpdate();
			if(result>0) {
				System.out.println("success");
			}
		} catch (SQLException e) {e.printStackTrace();}
	
	}
}
