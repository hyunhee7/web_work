<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/alert.jsp</title>
<!-- bootstrap & jquery loading -->
<%@include file = "/myResource.jsp" %>
</head>
<body>
	<p>${msg }</p>
	<a href="${pageContext.request.contextPath }${url }">확인</a>
</body>
</html>