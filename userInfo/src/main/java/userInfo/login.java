package userInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		userDAO ud = new userDAO();
		user [] u = ud.selectUser(id);
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		if(u[0] == null) {
			out.println("<meta http-equiv='refresh' content='2;url=/userInfo/login.jsp'>");
			out.println("</head>");
			out.println("<body>");
			out.print("아이디 없음");
		}
		else if (pw.equals(u[0].getUserPW())) {
			out.println("<meta http-equiv='refresh' content='2;url=/userInfo/main.jsp'>");
			out.println("</head>");
			out.println("<body>");
			out.println("로그인성공");
		}
		else {
			
			out.println("<meta http-equiv='refresh' content='2;url=/userInfo/login.jsp'>");
			out.println("</head>");
			out.println("<body>");
			out.println("비밀번호 오류");
			
		}
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

}
