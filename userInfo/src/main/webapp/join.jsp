<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/userInfo/join" method="post">
	<h2>회원가입</h2>
	ID*<input type="text" name="id"/>
	<br>
	PW*<input type="text" name="pw"/>
	<br>
	이름*<input type="text" name="name"/>
	<br>
	이메일<input type="text" name="email"/>
	<br>
	생년월일<input type="text" name="birth"/>
	<br>
	핸드폰<input type="text" name="phone"/>
	<br>
	<button type="submit">회원가입</button>

</form>
	
</body>
</html>