package userInfo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class update extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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
		ud.updateUser(u);
		
		resp.sendRedirect("/userInfo/list");
	}

}
