<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
        request.setCharacterEncoding("utf-8");
        String lang = request.getParameter("nation");
        String toWhere = "en.jsp";
        String nation = "English";
        
        if("korea".equals(lang)){
        	toWhere = "ko.jsp";
        	nation= "한국어";
        			
        }else
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="<%=toWhere %>">
    <jsp:param name="nation" value="<%=nation %>" /> 
</jsp:forward>

</body>
</html>