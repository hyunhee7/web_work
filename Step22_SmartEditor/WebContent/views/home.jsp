<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/home.jsp</title>
</head>
<body>
<h3>공지사항</h3>
<ul>
	<c:forEach var="tmp" items="${info }">
		<li>${tmp }</li>
	</c:forEach>
</ul>
<ul>
	<li><a href="cafe/insertform.do">새글쓰기</a></li>
</ul>
</body>
</html>











