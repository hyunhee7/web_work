<%@page import="test.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test04.jsp</title>
</head>
<body>
<%
	List<MemberDto> list = new ArrayList<>();
	MemberDto mem1 = new MemberDto(1, "김구라", "노량진");
	MemberDto mem2 = new MemberDto(2, "해골", "행신동");
	MemberDto mem3 = new MemberDto(3, "원숭이", "상도동");
	list.add(mem1);
	list.add(mem2);
	list.add(mem3);
%>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
		</tr>
	</thead>
	<tbody>
			<!-- for(MemberDto tmp: list){ -->
			<% for(int i=0;i<list.size();i++){ %>
				<tr>		
					<td><%=list.get(i).getNum() %></td>
					<td><%=list.get(i).getName() %></td>
					<td><%=list.get(i).getAddr() %></td>
				</tr>			
			<%} %>
	</tbody>
</table>
</body>
</html>