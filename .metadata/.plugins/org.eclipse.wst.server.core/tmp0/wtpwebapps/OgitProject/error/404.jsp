<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String cPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error/404.jsp</title>
<style>
	html{
		width: 100%;
		height: 100%;
		background-image: url("<%=cPath %>/error/e404.jpg");
		background-repeat: no-repeat;
		background-position: center;
		background-size: cover;  
	}
	#anchor{
		color: #333;
		text-decoration: none;
	}
	#anchor:hover{
		color: #5a5;
		font-weight: bold;
		text-decoration: underline;
	}
</style>
</head>
<body>
<a id="anchor" href="${pageContext.request.contextPath }">인덱스로 가기</a>
</body>
</html>











