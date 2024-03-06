package com.firstweb;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/firstservlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public FirstServlet() {
        super(); // HttpServlet에서 상속
        
    }

	public void init(ServletConfig config) throws ServletException { //서블릿의 시작
		System.out.println("init 메소드 실행");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	public void destroy() {
		System.out.println("destroy 메소드 실행");
	}


}
