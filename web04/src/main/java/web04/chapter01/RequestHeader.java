package web04.chapter01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reqheader")
public class RequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        
   
        Enumeration<String> myHeader = request.getHeaderNames();
        
        while(myHeader.hasMoreElements()) {
        	String hname = myHeader.nextElement();
        	String hvalue = request.getHeader(hname);
        	out.println(hname + " : " + hvalue + "<br>");
        }
        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
