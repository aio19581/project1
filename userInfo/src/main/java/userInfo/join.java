package userInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import userInfo.userDAO;
import userInfo.user;
import DB.DBconnect;

@WebServlet("/join")
public class join extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//한글 인코딩
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String userID = req.getParameter("id");
		String userPW = req.getParameter("pw");
		String userName = req.getParameter("name");
		String userEmail = req.getParameter("email");
		String birthDay = req.getParameter("birth");
		String phoneNumber = req.getParameter("phone");
		
		user u = new user(userName, userID, userPW, userEmail, birthDay, phoneNumber);
		userDAO ud = new userDAO();
		ud.createUser(u);
		
		resp.sendRedirect("/userInfo/main.jsp");
	}
	
}
