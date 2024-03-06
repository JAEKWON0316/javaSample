package net.lesson02.sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check
 */
@WebServlet(
		urlPatterns = { "/check" }, 
		initParams = { 
				@WebInitParam(name = "adid", value = "admin"), 
				@WebInitParam(name = "adpass", value = "123456")
		})
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8"); //응답을 text/html타입의 utf-8 인코딩으로 보내겠다.
		PrintWriter out = response.getWriter(); //PrintWriter 클래스를 out으로 객체화해서 웹을 사용
		request.setCharacterEncoding("utf-8"); //요청을 utf-8타입으로 받겠다. (클라이언트에서 UTF-8로 보내겠다. 한글이 아닐시에 깨지기 때문에)
		String username = request.getParameter("userid"); 
		String userpass = request.getParameter("userpass");
		
		String adminId = getInitParameter("adid"); //context 즉, 여기에 이미 써져있는 값들을 받는것
		String adminPass = getInitParameter("adpass");
		
		Boolean ok = false;
		if(username.equals(adminId) && userpass.equals(adminPass)) {
			ok =true;
		}
		
		String htmlHead = "<html>\n<meta charset = 'utf-8'>\n<head><title>로그인</title></head>\n";
		htmlHead += "<body><h1>로그인 결과</h1>\n";
		if(ok) {
			htmlHead += "<p>환영합니다. " + username + "님</p>\n";
			htmlHead += "<p>로그인 되었습니다.</p>";
		}
		else {
			htmlHead += "<p style='color:red'>너 누구냐?</p>\n";
		}
		    htmlHead += "</body></html>";
		    
		    out.println(htmlHead);
          		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
