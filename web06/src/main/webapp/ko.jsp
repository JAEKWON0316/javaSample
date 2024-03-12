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
<p>저희 사이트를 방문해 주셔서 대단히 감사드립니다.</p>
    <ol>
        <li>사용언어 : <%=request.getParameter("nation") %></li>
        <li>이름 : <%=request.getParameter("name") %></li>
        <li>주소 : <%=request.getParameter("addr") %></li>
    </ol>
</body>
</html>