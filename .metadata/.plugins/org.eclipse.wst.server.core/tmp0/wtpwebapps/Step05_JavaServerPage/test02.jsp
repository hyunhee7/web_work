<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test02.jsp</title>
</head>
<body>
<%
	List<String> names=new ArrayList<>();
	names.add("김구라");
	names.add("해골");
	names.add("원숭이");
	names.add("주뎅이");
	names.add("덩어리");
%>
<h3>친구 목록입니다.</h3>
<ul>
	<% for (int i=0;i<names.size();i++) {%>
	<li><%=names.get(i) %></li>
	<% } %>
</ul>
<ul>
	<% for(String tmp:names) { %>
		<li><%=tmp %></li>
	<%} %>
</ul>
</body>
</html>