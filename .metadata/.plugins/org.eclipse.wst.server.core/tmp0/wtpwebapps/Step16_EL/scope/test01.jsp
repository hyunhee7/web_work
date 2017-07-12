<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//페이지 영역에 "myName" 이라는 키값으로 String type 저장하기
	pageContext.setAttribute("myName", "김구라");
	pageContext.setAttribute("yourName", "원숭이");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/scope/test01.jsp</title>
</head>
<body>
<%
	String myName=(String)pageContext.getAttribute("myName");
%>
<p>페이지 영역에 저장된 문자열 : <strong><%=myName %></strong></p>
<p>페이지 영역에 저장된 문자열 : <strong>${pageScope.yourName }</strong></p>
<p>페이지 영역에 저장된 문자열 : <strong>${yourName }</strong></p>
</body>
</html>