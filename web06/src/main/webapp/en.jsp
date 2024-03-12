<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Thank you form visiting my site.</p>
    <ol>
        <li>Language : <%=request.getParameter("nation") %></li>
        <li>Name : <%=request.getParameter("name") %></li>
        <li>Address : <%=request.getParameter("addr") %></li>
    </ol>
</body>
</html>