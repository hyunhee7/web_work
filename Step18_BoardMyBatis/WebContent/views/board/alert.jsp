<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/alert.jsp</title>
</head>
<body>
<% String id=(String)session.getAttribute("id");%>
<p>${msg }</p>
	<c:choose>
		<c:when test="${ not empty id }">
			<a href="${pageContext.request.contextPath }/board/list.do">확인</a>
		</c:when>
		<c:otherwise>
			<a href="${pageContext.request.contextPath }/home.do">로그인 창으로</a>
		</c:otherwise>
	</c:choose>

</body>
</html>