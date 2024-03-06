package com.secondweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description="두 번째 서블릿", urlPatterns={"/sservlet", "/ssv"}) //어노테이션 매핑값 description = 설명, urlPatterns= 매핑할 도메인 주소

public class SecondServlet extends HttpServlet{
	
       //메소드
	   public void init() throws ServletException { //throws는 예외가 나면 ServletException으로 던져라! 라는 뜻
		   System.out.println("init메소드 실행됨");
	   }
	   
	   protected void deGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		   System.out.println("doGet메소드가 실행되었습니다.");
	   }
	   

		              
	   
}
