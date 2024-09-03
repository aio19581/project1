
package userInfo;

public class user {
	
	private String userID;
	private String userPW;
	private String userName;
	private String userEmail;
	private String birthDay;
	private String phoneNumber;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	user( String userName, String userID, String userPW, String userEmail, String birthDay, String phoneNumber){
		this.userName = userName;
		this.userID = userID;
		this.userPW = userPW;
		this.userEmail = userEmail;
		this.birthDay = birthDay;
		this.phoneNumber = phoneNumber;
	}
	
}
