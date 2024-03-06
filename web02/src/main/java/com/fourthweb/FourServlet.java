package com.fourthweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FourServlet
 */
@WebServlet("/fourServlet")
public class FourServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//서블릿 콘텍스트 정보를 가져옴
		/*
		 * getServletContext() 메소드를 이용해 ServletContext의 객체를 얻어옴.
		 * getInitParameter() 메소드를 사용해 값을 반환 받음.
		 */
		ServletContext context = this.getServletContext(); //ServletContext 타입으로 객체 생성 getServletContext()메소드를 통해
		String uname = context.getInitParameter("uname");
		String uoffice = context.getInitParameter("uoffice");
		
		out.print(uname + " : " + uoffice);
		out.println("<br><br>");
		//이름 전체를 추출하는 방법
		Enumeration<String> paramNames = context.getInitParameterNames();
		
		while(paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			String value = context.getInitParameter(name);
			out.print(name + " : " + value + "<br>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
