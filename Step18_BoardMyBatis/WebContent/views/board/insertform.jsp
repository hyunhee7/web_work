<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/board/insertform.jsp</title>
</head>
<body>
	<h3>새글 작성 폼입니다.</h3>
	<form action="insert.do" method="post">
		<label for="writer">작성자</label>
		<input type="text" name="writer" id="writer"/><br />
		<label for="title">제목</label>
		<input type="text" name="title" id="title" /><br />
		<label for="content">내용</label>
		<textarea name="content" id="content" cols="30" rows="10"></textarea>
		<br />
		<button type="submit">저장</button>
	</form>
</body>
</html>