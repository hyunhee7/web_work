<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="myResource.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>contact.jsp</title>
<jsp:include page="myResource.jsp"></jsp:include>
</head>
<body>
<jsp:include page="navbar.jsp">
	<jsp:param value="contact" name="active"/>
</jsp:include>	
<div class="container">
	<h3>contact 페이지 입니다.</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
	Dignissimos commodi eveniet atque ea cumque quo natus aliquam 
	odit reiciendis sequi totam pariatur aliquid culpa voluptate dicta ducimus modi. 
	Consequuntur expedita!</p>
</div>
</body>
</html>