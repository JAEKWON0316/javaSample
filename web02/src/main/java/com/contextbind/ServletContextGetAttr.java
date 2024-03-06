package com.contextbind;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scg")
public class ServletContextGetAttr extends HttpServlet { //getAttribute로 setAttribute한 값을 반환하는 클래스
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8"); //받는 값(response)은 utf-8로 받겠다.
		PrintWriter out = response.getWriter(); //vscode에서 document.write랑 비슷한 개념.
		
		//context에 담긴 값을 가져옴
		ServletContext context = this.getServletContext();
		
		List person = (ArrayList) context.getAttribute("person");
		
		String list1 = (String) person.get(0);
		String list2 = (String) person.get(1);
		String list3 = (String) person.get(2);
		String list4 = (String) person.get(3);
		
		String addr = (String) context.getAttribute("addr");
		
		String lists = list1 + ", " + list2 + ", " + list3 + ", " + list4 + "살던 곳: " + addr ;
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>third</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>임진왜란 참가자 명단 : </h2>");
		out.println(lists);
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
