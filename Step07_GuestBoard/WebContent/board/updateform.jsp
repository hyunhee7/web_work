<%@page import="test.board.dto.BoardDto"%>
<%@page import="test.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//수정할 글번호를 읽어온다.
	int num=Integer.parseInt(request.getParameter("num"));
	//수정할 글의 자세한 정보를 얻어온다.
	BoardDto dto=BoardDao.getInstance().getData(num);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/board/updateform.jsp</title>
</head>
<body>
	<form action="update.jsp" method="post">
		<input type="hidden" name="num" value="<%=dto.getNum() %>" />
		<label for="num">글번호</label>
		<input type="text" id="num" value="<%=dto.getNum()%>" disabled="disabled"/><br />
		<label for="writer">작성자</label>
		<input type="text" name="writer"  id="writer"  value="<%=dto.getWriter()%>"/><br />
		<label for="title">제목</label>
		<input type="text" name="title" id="title" value="<%=dto.getTitle()%>"/><br />
		<label for="content">내용</label>
		<textarea name="content" id="content" cols="30" rows="10">
			<%=dto.getContent() %>
		</textarea>
		<button type="submit">수정확인</button>
		<button type="reset">취소</button>
	</form>
</body>
</html>