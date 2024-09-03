package userInfo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userDetail")
public class userDetail extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		userDAO ud = new userDAO();
		user [] u = ud.selectUser(id);
		System.out.println(u[0].getUserPW());

		String userPW = u[0].getUserPW();
		String userName = u[0].getUserName();
		String userEmail = u[0].getUserEmail();
		String phoneNumber = u[0].getPhoneNumber();
		String birthDay = u[0].getBirthDay();
		
		user userDetail = new user(userName, id, userPW, userEmail, birthDay, phoneNumber);
		
		req.setAttribute("userDetail", userDetail);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/userDetail.jsp");
	    dispatcher.forward(req, resp);
	}

}
