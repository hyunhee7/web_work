<%@page import="test.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/views/info.jsp</title>
</head>
<body>
	<h3>회원정보 페이지 입니다.</h3>
	<p>번호 : ${dto.num }</p>
	<p>이름 : ${dto.name }</p>
	<p>주소 : ${dto.addr }</p>
	
	
<%
	MemberDto dto= (MemberDto)request.getAttribute("dto");
%>
<p>번호:<%=dto.getNum() %></p>
<p>이름:<%=dto.getName() %></p>
<p>주소:<%=dto.getAddr() %></p>
</body>
</html>