<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>game.jsp</title>
<jsp:include page="myResource.jsp"></jsp:include>
</head>
<body>
<jsp:include page="navbar.jsp">
	<jsp:param value="game" name="active"/>
</jsp:include>
<div class="container">
	<h3>game 페이지 입니다.</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
	 Aut soluta in ut odio consequuntur corrupti harum labore 
	 nisi illo ipsum natus eum magnam sint temporibus 
	 eos blanditiis dolores dicta mollitia.</p>
</div>
</body>
</html>