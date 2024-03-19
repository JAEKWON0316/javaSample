<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>   
    <jsp:useBean id="time" class="java.util.Date" scope="page" /> <!-- JSP액션 -->
    <jsp:useBean id="hello" class="web06.hello.HelloBean" scope="page" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%=hello.getName() %>
    <p>현재 시간 : <%=time.toLocaleString()%>
</body>
</html>