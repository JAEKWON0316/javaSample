<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  jsp:plugin type="applet" cpde="PluginApplet.class" jreversion="1.5" 
    width="400" height="300" />-->
    <jsp:params>
        <jsp:param name="data" value="<jsp:plugin>테스트입니다." />
    </jsp:params>
    <jsp:fallback>
        애플릿 플러그인을 지원하지 않는 브라우저 입니다.
    </jsp:fallback>
</body>
</html>