package web04.chapter01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/requrl")
public class RequestURL extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        
        out.print("요청 URI : " + request.getRequestURI() +"<br>");
        out.print("요청 URL : " + request.getRequestURL() +"<br>");
        out.print("쿼리스트링 : " + request.getQueryString() +"<br>");
        out.print("Context 경로 : " + request.getContextPath() +"<br>");
        out.print("서블릿 경로 : " + request.getServletPath() +"<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
