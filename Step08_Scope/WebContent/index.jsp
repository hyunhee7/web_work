<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h3>Scope 영역 테스트</h3>
	<ul>
		<li><a href="requestScope/showdata?num=1">request scope 테스트</a></li>
		<li><a href="sessionScope/loginform.jsp">session scope 테스트</a></li>
		<li><a href="sessionScope/login_result.jsp">session scope 테스트2</a></li>
		<li><a href="applicationScope/count.jsp">application scope 테스트</a></li>
	</ul>
</body>
</html>