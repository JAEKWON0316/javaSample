<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
 request.setCharacterEncoding("utf-8");
 //파라미터 추출
 String depart = request.getParameter("depart");
 int num = Integer.parseInt(request.getParameter("num"));
 String user = request.getParameter("user");
 double score = Double.parseDouble(request.getParameter("score"));
 //출력
 /*
 out.println("학과 :" + depart + "<br>");
 out.println("학년 :" + num + "<br>");
 out.println("이름 :" + user + "<br>");
 out.println("학점 :" + score + "<br>");
 */
 String dpart = URLEncoder.encode(depart, "utf-8");
 response.sendRedirect("paramForm2.jsp?depart="+dpart);
%>

<ol>
 <li><label>학과 : </label><%=depart %></li>
 <li><label>학년 : </label><%=num %></li>
 <li><label>이름 : </label><%=user %></li>
 <li><label>학점 : </label><%=score %></li>
</ol>


</body>
</html>