package web04.chapter01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/res")
public class ResFormServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); //request는 받는값이니까 response보다 먼저 있어야함. utf-8로 보내겠다
		response.setContentType("text/html;charset=utf-8"); //utf-8로 보낸 요청을 utf-8로 응답함
		PrintWriter out = response.getWriter();
		
		int number = Integer.parseInt(request.getParameter("num"));
		String user = request.getParameter("user");
		
		out.println("학번 : " + number + "<br>");
		out.println("이름 : " + user + "<br>");
		//response.sendRedirect("nservlet"); //이거는 써준 url로 바로 넘어가는것
		//response.addHeader("Refresh", "3;url=nservlet"); //이건 3초 뒤에 url=nservlet으로 페이지를 넘김
		String script = "<script> alert(\"이동합니다.!!\");location.href='nservlet'; </script>"; //sendRedirect와 똑같다.
		out.print(script);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
