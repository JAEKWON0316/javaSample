package net.jackone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/admin")
public class Admin extends HttpServlet {
    //정보를 보내는 방법은 doget 과 dopost 두 개가 있다.
	//서버와 통신하는 방법은 request 와 response 두 개가 있다.
	public Admin() { //기본 생성자 없어도됨.
	super();
	}
	//doget 주소창으로 보내는거
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		                 //HttpServletRequest는 사용자의 요청에의해 응답하는 메소드들
		                 //HttpServletResponse는 서버에서 사용자에게 응답해주는 메소드
		       //브라우저에게 html이 utf-8형식이라고 전달
				//res.setContentType("text/html;charset=UTF-8");
				//PrintWriter out = res.getWriter();  //out을 변수로 설정 
				//서블릿에서 만드는 html파일의 인코딩이 utf-8이다
				res.setCharacterEncoding("utf-8"); //request로 받은 값을 utf-8로 인코딩
				//req.setCharacterEncoding("utf-8");
				
				String id = req.getParameter("userid"); //getParameter를 이용해 request로 받음
				String password = req.getParameter("userpass");
				System.out.println(id + "," + password);
			    boolean flag = false;
			    if(id.equals("admin") && password.equals("123456")) {
			    	flag = true;
			    }
			    res.setContentType("text/html;charset=utf-8");
			    PrintWriter out = res.getWriter();
		        out.println("<html><head><meta charset='utf-8'><title>로그인</title>");
			    out.println("</head><body>");
			    if(flag) {
			    	out.println("<h1>" + id + "님, 로그인 되었습니다.</h1>");
			    }
			    else {
			    	out.println("<h1>너, 누구냐?</h1>");
			    }
			    out.println("</body></html>");
			    /*
				out.println("<html>");
				out.println("<meta charset='utf-8'>");
				out.println("<head><title>로그인테스트</title></head>");
				out.println("<body>");
				if(id.equals("admin") && password.equals("123456")){  
			        out.println("<h1>환영합니다</h1>");
			        out.println("<p>" +id+ "님 로그인 되었습니다.</p>");
					
				}
				else {
			        out.println("<p>아이디 또는 비밀번호가 틀렸습니다.</p>");
				}
				out.println("</p></body>");
				out.println("</html>");
				*/
								
	}

	//dopost 안보이게 바디로 보내는거
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res); //dopost에서 비밀번호 패스워드를 받아서 doget으로 받는다. 그래서 보이지가 않음
	}

}
