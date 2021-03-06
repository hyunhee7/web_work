<%@page import="test.board.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="test.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>board/list.jsp</title>
</head>
<body>
	<a href="insertform.jsp">새 책 추가하기</a>
	<h3>책 목록 입니다.</h3>
	<%
		BoardDao dao=BoardDao.getInstance();
		List<BoardDto> list=dao.getList();
	%>
	<table>
		<thead>
			<tr>
				<th>책번호</th>
				<th>제목</th>
				<th>작가</th>
				<th>출판사</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<%  for(BoardDto tmp:list){%>
			<tr>
				<th><%=tmp.getNum() %></th>
				<th><%=tmp.getTitle() %></th>
				<th><%=tmp.getAuthor() %></th>
				<th><%=tmp.getPublisher() %></th>
				<th><%=tmp.getRegdate() %></th>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>