<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
PrintWriter out2 = response.getWriter();
   out2.println("<h1>구구단 중 7단을 출력해 봅시다.</h1>");
   out2.println("출력을 시작합니다.<br>");
   out.println("<ul>");
   for(int i = 1; i<=9; i++){
	   out.println("<li> 7x" + i + "=" + 7*i + "</li>");
   }
   out.println("</ul>");
   out2.println("출력을 마칩니다.<br>");
%>

</body>
</html>