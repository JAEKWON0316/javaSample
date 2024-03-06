package net.lesson02.sec02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8"); //응답을 text/html타입의 utf-8 인코딩으로 보내겠다.
		PrintWriter out = res.getWriter(); //PrintWriter 클래스를 out으로 객체화해서 웹을 사용
		req.setCharacterEncoding("utf-8");
		
		//파라미터 타입은 모두 문자열로 들어오므로 추출을 위해서는 각자 타입에 맞도록 타입 변환을 해야함.
		int snum = Integer.parseInt(req.getParameter("number"));
		String sname = req.getParameter("name");
		//double sgrade = Double.parseDouble(req.getParameter("grade")) - 1.0;
		//float sgrade = Float.parseFloat(req.getParameter("grade")) - 1.0F; //여기서는 float로 타입변환을 하면 무조건 1.0F 를 서줘야 정확하게 -1.0이 된다.
		float sgrade = Float.parseFloat(req.getParameter("grade"));
		
		out.println("<html>");
		out.println("<head><title>학생정보</title></head>");
		out.println("<body>");
		
		out.println(sname + "학생의 번호는 " + (snum + 1) + "번이고 학점은 " + (sgrade - 1.0F)  + "입니다");
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
