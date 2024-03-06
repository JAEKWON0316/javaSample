package com.thirdweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ThirdServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8"); //받는 값(response)은 utf-8로 받겠다.
		PrintWriter out = response.getWriter(); //vscode에서 document.write랑 비슷한 개념.
		out.println("<html>");
		out.println("<head>");
		out.println("<title>third</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2> 세 번째 서블릿 입니다.</h2>");
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
