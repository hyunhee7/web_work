<%@page import="java.util.List"%>
<%@page import="test.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list.jsp</title>

</head>
<body>
<%
	List<MemberDto> list=(List<MemberDto>)request.getAttribute("list");
%>
<h3>list페이지 입니다.</h3>
	<table>
		<% for(int i=0; i<3; i++){ %>
		<tr>
			<td><%=list.get(i).getNum() %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getAddr() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>