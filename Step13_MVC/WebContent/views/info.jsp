<%@page import="test.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDto dto=(MemberDto)request.getAttribute("dto");
	int num=(int)dto.getNum();
	String name=(String)dto.getName();
	String addr=(String)dto.getAddr();
%>

<p>번호 : <%=num %></p>
<p>이름 : <%=name %></p>
<p>주소 : <%=addr %></p>
</body>
</html>