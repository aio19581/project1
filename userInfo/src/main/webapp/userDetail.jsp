<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/userInfo/update" method="post">
	<h2>회원정보수정</h2>
	ID*<input type="text" name="id" readonly="readonly" value="${userDetail.userID }"/>
	<br>
	PW*<input type="text" name="pw" value="${userDetail.userPW }"/>
	<br>
	이름*<input type="text" name="name" value="${userDetail.userName}"/>
	<br>
	이메일<input type="text" name="email" value="${userDetail.userEmail}"/>
	<br>
	생년월일<input type="text" name="birth" value="${userDetail.birthDay }"/>
	<br>
	핸드폰<input type="text" name="phone" value="${userDetail.phoneNumber }"/>
	<br>
	<button type="submit">수정</button>

</form>
	
</body>
</html>