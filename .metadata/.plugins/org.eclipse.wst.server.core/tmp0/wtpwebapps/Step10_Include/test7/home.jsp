<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="myResource.jsp"></jsp:include>
<title>home.jsp</title>
</head>
<body>
<jsp:include page="navbar.jsp">
	<jsp:param value="home" name="active"/>
</jsp:include>
<div class="container">
	<h3>Home 페이지 입니다.</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
	Dolores placeat officia quos deleniti consequatur pariatur quasi 
	rem optio modi tenetur quod voluptatum iure tempore perspiciatis 
	dignissimos accusamus soluta laboriosam sit!</p>
</div>
</body>
</html>