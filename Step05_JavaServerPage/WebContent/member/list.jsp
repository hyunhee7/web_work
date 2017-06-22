<%@page import="test.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="test.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		//MemberDao 객체의 참조값 얻어오기
		MemberDao dao=MemberDao.getInstance();
		//회원목록 얻어오기
		List<MemberDto> list=dao.getList();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>member/list.jsp</title>
</head>
<body>
	<a href="insertform.html">회원 추가하기</a>
	<h3>회원 목록 페이지 입니다.</h3>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>주소</th>
			</tr>
		</thead>
		<tbody>
			<% for(MemberDto tmp:list){ %>
				<tr>
					<td><%=tmp.getNum() %></td>
					<td><%=tmp.getName() %></td>
					<td><%=tmp.getAddr() %></td>
				</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>