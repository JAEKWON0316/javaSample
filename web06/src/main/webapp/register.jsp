<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="info" class="web06.contact.ContactInfo" scope="page" />
<jsp:setProperty name="info" property="*" />
<%
    /*
    info.setName(request.getParameter("name"));
    info.setEmail(request.getParameter("email"));
    */
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h3>ContactInfo 테스트</h3>
    <p>이름 : <%=info.getName() %></p>
    <p>이메일 : <jsp:getProperty name="info" property="email" /> </p>
    
</body>
</html>