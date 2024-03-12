<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
 form{
  width:600px;
  margin:50px auto;
 }
</style>
</head>
<body>
<%String depart = "소프트웨어";  %>
<form name="myform" method="post" action="paramForm.jsp?depart=<%=depart %>">
    <ul class="list-group">
       
         <li class="list-group-item"><label>학번(정수)</label>
         <input type="text" name="num" class="form-control"/>
         </li>
         <li class="list-group-item"><label>이름(문자)</label>
         <input type="text" name="user" class="form-control"/>
         </li>
         <li class="list-group-item"><label>평점(실수)</label>
         <input type="text" name="score" class="form-control"/>
         </li>
         <li class="text-center list-group-item">
         <button type="submit" class="btn btn-primary" >저장</button>
         </li>
        
    </ul>
</form>

</body>
</html>