<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ol>
<li><label>프로토콜 정보 : <%=request.getProtocol() %></label>

</li>
<li><label>클라이언트 IP : <%=request.getRemoteAddr() %></label>

</li>
<li><label>서버 이름 : <%=request.getServerName() %></label>

</li>
<li><label>요청 방식 : <%=request.getMethod() %></label>

</li>
<li><label>URL 정보 : <%=request.getRequestURL() %></label>

</li>
<li><label>애플리케이션 정보 : <%=request.getContextPath() %></label>

</li>
<li><label>서블릿 정보 : <%=request.getServletPath() %></label>

</li>

</ol>







</body>
</html>
