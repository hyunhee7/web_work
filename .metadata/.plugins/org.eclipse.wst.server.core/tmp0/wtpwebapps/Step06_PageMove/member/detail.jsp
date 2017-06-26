<%@page import="test.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/member/detail.jsp</title>
</head>
<body>
	<%
		// request 에 담긴 회원정보 얻어오기
		MemberDto dto=(MemberDto)request.getAttribute("dto");
		//DB에 들어가지 않아도 request에 들어있는 것(object형태)을 casting해서 이용 가능
	%>
	<h3>/member/detail 요청을 처리하는 서블릿으로 부터 응답을 위임받은 jsp페이지 입니다.</h3>
	<p>번호 : <strong><%=dto.getNum() %></strong></p>
	<p>이름 : <strong><%=dto.getName() %></strong></p>
	<p>주소 : <strong><%=dto.getAddr() %></strong></p>
</body>
</html>