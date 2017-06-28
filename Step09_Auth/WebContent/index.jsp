<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//session에 id라는 키값으로 저장된 값이 있는지 읽어와본다.
	String id=(String)session.getAttribute("id");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
</head>
<body>
<h3>인덱스 페이지입니다.</h3>
<ul>
<%if(id!=null) {%>
	<p><strong><%=id %></strong>회원님 로그인중...</p>
	<a href="users/signout.jsp">로그아웃</a>
<%}else{ %>
	<li><a href="users/signup_form.jsp">회원가입</a></li>
	<li><a href="users/signin_form.jsp">로그인</a></li>
<%} %>

</ul>
</body>
</html>