<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>forward 테스트</h2>
    <div>
        <form name="form" method="post" action="langok.jsp">
        <div>
        <lavel>사용언어</lavel>
        <select name="nation">
        <option value="korea">한국어</option>
        <option value="english">영어</option>
        </select></div>
            <div>
                <label>이름</label>
                <input type="text" name="name" />
            </div>
            <div>
                <label>주소</label>
                <input type="text" name="addr" />
            </div>
            <div>
                <br><br>
                <input type="submit" value=" 전 송 " />
            </div>
    </div>
    
</body>
</html>