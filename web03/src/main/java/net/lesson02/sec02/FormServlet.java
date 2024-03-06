package net.lesson02.sec02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("utf-8");
		Enumeration e = req.getParameterNames(); //Enum타입 e 라는 객체생성 req(요청한)getParameterNames(모든 name 을 담는)
		
		out.println("<html>");
		out.println("<head><title>회원정보</title></head>");
		out.println("<body>");
		
		
		while(e.hasMoreElements()) { //hasMoreElements 를 쓰면 밑에 하나씩 하나씩 nextElement에 담긴다.
			String name = (String) e.nextElement(); 
			String[] values = req.getParameterValues(name); //name에 대한 모든 value값을 다 뽑아옴
			if(values != null) {
				for(int i = 0; i < values.length; i++) {
					out.print("<div><label>" + name + " : </label>" + values[i] + "</div>");
					
				}
			}
		}
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
