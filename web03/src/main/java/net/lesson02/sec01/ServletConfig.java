package net.lesson02.sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		name = "ServletConfig", 
		description = "기본파라미터 지정", 
		urlPatterns = { "/scg" }, 
		initParams = { 
				@WebInitParam(name = "username", value = "홍길동", description = "유저가 갖는 이름"), 
				@WebInitParam(name = "useroffice", value = "도둑주식회사", description = "홍길동회사")
		})

public class ServletConfig extends HttpServlet {
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//initparam 기본 정보 추출
		//String info = getInitParameter("ServletConfig");
		String name = getInitParameter("username");
		String company = getInitParameter("useroffice");
		//out.println(info);
		out.print(name + " : " + company);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
