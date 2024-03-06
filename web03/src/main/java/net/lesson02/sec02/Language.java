package net.lesson02.sec02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/language")
public class Language extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("utf-8");
	     
	    //Enumeration e = req.getParameterNames();
		
	    Enumeration<String> e = req.getParameterNames();
	     
	     out.println("<html>");
		 out.println("<head><title>회원정보</title></head>");
		 out.println("<body>");
		 out.println("내가 사용 가능한 언어는?");
		 
		 while(e.hasMoreElements()) {
				String name = (String) e.nextElement(); //열거타입 enum을 String타입으로 강제타입변환
				String values = req.getParameter(name); //이미 열거타입으로 받은 name을 넣어줬으니 그 열거타입 name에 관한 value들을 하나씩 뽑아올 수 있다.
				out.println(name + " : " + values); //단, 이거는 name이 똑같은거는 중복돼서 나오지가 않는다!
				
				/*String[] values = req.getParameterValues(name); //name에 대한 모든 value값을 다 뽑아옴 이거는 name이 똑같은것도 모두 나온다!!
				if(values != null) {
					for(int i = 0; i < values.length; i++) {
						out.print("<div><label>" + name + " : </label>" + values[i] + "</div>");
						
					}
				}*/
		 }
		  
		 
		 out.println("</body>");
		 out.println("</html>");
		 out.close();
	     
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}

}
