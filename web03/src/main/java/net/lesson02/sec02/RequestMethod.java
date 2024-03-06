package net.lesson02.sec02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestMethod
 */
@WebServlet("/rm")
public class RequestMethod extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		out.print("요청한 프로토콜의 이름을 반환 " + request.getScheme() + "<br>");
		out.print("요청에 사용된 프로토콜의 이름과 버전 " + request.getProtocol() + "<br>");
		out.print("요청한 클라이언트의 IP 주소 " + request.getRemoteAddr() + "<br>");
		out.print("요청을 받은 서버의 IP주소 " + request.getLocalAddr() + "<br>");
		out.print("요청을 받은 서버의 이름 " + request.getServerName() + "<br>");
		out.print("요청을 받은 서버의 포트번호 " + request.getServerPort() + "<br>");
		out.print("요청 방식 " + request.getMethod() + "<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
