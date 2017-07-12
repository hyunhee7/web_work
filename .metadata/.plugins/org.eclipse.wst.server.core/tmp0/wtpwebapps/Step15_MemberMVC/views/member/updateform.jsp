<%@page import="test.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String cPath=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/member/updateform.jsp</title>
<link rel="stylesheet" href="<%=cPath %>/resource/css/bootstrap.css" />
<script src="<%=cPath%>/resource/js/jquery-3.2.0.js"></script>
<script src="<%=cPath%>/resource/js/bootstrap.js"></script>
</head>
<body>
<%
	MemberDto dto=(MemberDto)request.getAttribute("dto");
%>
<h3>회원정보 수정 폼입니다.</h3>
<form action="update.do" method="post">
	<input type="hidden" name="num" value=""<%=dto.getNum() %>/>
	<label>번호</label>
	<input type="text" value="<%=dto.getNum() %>" disabled />
	<br />
	<label for="name">이름</label>
	<input type="text" name="name" id="name" value="<%=dto.getName()%>"/>
	<br />
	<label for="addr">주소</label>
	<input type="text" name="addr" id="addr" value="<%=dto.getAddr()%>"/>
	<br />
	<button type="submit">수정확인</button>
</form>
</body>
</html>