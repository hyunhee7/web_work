<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/updateform.jsp</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/board/update.do" method="post">
	<input type="hidden" name="num" value="${dto.num }" />
	<label for="num">글번호</label>
	<input type="text" id="num" value="${dto.num }" 
			disabled="disabled"/><br/>
	<label for="writer">작성자</label>
	<input type="text" name="writer" id="writer" 
		value="${dto.writer }"/><br/>
	<label for="title">제목</label>
	<input type="text" name="title" id="title" 
		value="${dto.title }"/>
	<label for="content">내용</label><br/>
	<textarea name="content" id="content" cols="50" rows="10">${dto.content }</textarea><br/>
	<button type="submit">수정확인</button>
	<button type="reset">취소</button>
</form>
</body>
</html>