<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/member2/play1.jsp</title>
</head>
<body>
<%
	String id=(String)session.getAttribute("id");
%>
<p><strong><%=id %></strong>님 로그인중...</p>
<p>회원전용 공간에서 놀아요 ~~</p>
</body>
</html>