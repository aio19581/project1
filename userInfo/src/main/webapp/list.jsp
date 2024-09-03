<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h2>회원목록</h2>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>PW</th>
            <th>삭제</th>
        </tr>

        <!-- JSTL을 사용하여 userArray 배열을 순회 -->
        <c:forEach var="user" items="${userArray}">
            <tr>
                <td><a href="./userDetail?id=${user.userID}">${user.userID}</a></td>
                <td>${user.userPW}</td>
                <td><a href="./delete?id=${user.userID}">X</a>
            </tr>
        </c:forEach>

    </table>
</body>
</html>