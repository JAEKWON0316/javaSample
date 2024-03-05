package net.jackone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReUser
 */
@WebServlet("/user")
public class ReUser extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//브라우저에게 html이 utf-8형식이라고 전달
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//서블릿에서 만드는 html파일의 인코딩이 utf-8이다
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		
		out.println("<html>");
		out.println("<meta charset='utf-8'>");
		out.println("<head><title>크론테스트</title></head>");
		out.println("<body>");
		out.println("<h1>환영합니다</h1>");
		out.println("<p>이름 : "+username+ "</p>");
		out.println("<p>이메일 : " + email + "</p>");
		out.println("</p></body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
