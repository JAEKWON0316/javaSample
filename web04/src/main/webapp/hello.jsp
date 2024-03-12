<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%!
        int row = 2;
        int col = 2;
   %>
   <%
        
        //out.println("이 줄은 자바 프로그램에서");
        //out.println(" 만들어 내는 내용입니다.");
        
        for(int i = 0; i <= row; i++){
        	for(int j = 0; j <= col; j++){
   %>
      <p>(
        <% 
            out.println(i + ", " + j);
        %>
        )
      </p>
   <%    	
        }
     }
        
      out.println(row);
   %>
   
   <hr />
   <%= row + col %>
   
   <p>이 줄은 html 에서 만들어 내는 내용입니다.</p>
</body>
</html>