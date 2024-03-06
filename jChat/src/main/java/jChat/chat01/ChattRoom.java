package jChat.chat01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chattroom")
public class ChattRoom extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("utf-8");
		
		String header = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"ko\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Chatting</title>\r\n"
				+ "    <link href=\"https://fonts.googleapis.com/css2?family=Sunflower:wght@300;500;700&display=swap\" rel=\"stylesheet\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/remixicon/4.2.0/remixicon.css\" integrity=\"sha512-OQDNdI5rpnZ0BRhhJc+btbbtnxaj+LdQFeh0V9/igiEPDiWE2fG+ZsXl0JEH+bjXKPJ3zcXqNyP4/F/NegVdZg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1 class=\"text-center mt-5\">My Java Chat</h1>\r\n"
				+ "    <div class=\"chatbox\">\r\n"
				+ "        <div class=\"viewbox\">";
		//String iFrame = "<iframe src=\"talk?username=" + username + "\" class=\"iframe\"></iframe>";
		String footer = "</div>\r\n"
				+ "        <div class=\"chatinsert\">\r\n"
				+ "            <input type=\"text\" name=\"c\" id=\"talk\" class=\"form-control\">\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "\r\n"
				+ "    <Script src=\"js/jquery.min.js\"></Script>\r\n"
				+ "    <script src=\"js/popper.min.js\"></script>\r\n"
				+ "    <script src=\"js/bootstrap.min.js\"></script>\r\n"
				+ "    <script src=\"js/script.js\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		out.println(header);
		out.println("아이프레임이 들어갈 자리");
		out.println(footer);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
