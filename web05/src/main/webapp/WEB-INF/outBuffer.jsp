<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(out.isAutoFlush()){
	out.println("현재 버퍼의 크기:" + out.getBufferSize() + "<br><br>");
	out.println("현재 버퍼의 크기를 확인해 보려고 합니다.<br><br>");
	out.println("현재 버퍼의 남아 있는 크기:" + out.getRemaining() + "<br><br>");
}
    out.println("flush를 수행, 현재까지의 버퍼 내용을 출력<br><hr><br>");
    out.flush();
    
    out.println("현재의 버퍼의 남아 있는 크기:" +out.getRemaining() +"<br><br>");
%>
</body>
</html>