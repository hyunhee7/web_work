<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setAttribute("jumsu", 60); %>
	<h3>다중 if 문을 taglib로 구성해 보기</h3>
	<c:choose>
		<c:when test="${jumsu ge 90 }">
			<p>점수는 <strong>${jumsu }</strong>점이고 성적은 A</p>
		</c:when>
		<c:when test="${jumsu ge 80 }">
			<p>점수는 <strong>${jumsu }</strong>점이고 성적은 B</p>
		</c:when>
		<c:when test="${jumsu ge 70 }">
			<p>점수는 <strong>${jumsu }</strong>점이고 성적은 C</p>
		</c:when>
		<c:when test="${jumsu ge 60 }">
			<p>점수는 <strong>${jumsu }</strong>점이고 성적은 D</p>
		</c:when>
		<c:otherwise>
			<p>점수는 <strong>${jumsu }</strong>점이고 성적은 F</p>
		</c:otherwise>
	</c:choose>
	
	<%
	String id=(String)session.getAttribute("id");
	%>
	<h3>if else 문 형태를 c:choose 를 이용해서 구성하기</h3>
	<c:choose>
		<c:when test="${ not empty id }">
			<p><strong>${id }</strong>님 로그인중..</p>
			<a href="logout.jsp">로그아웃</a>
		</c:when>
		<c:otherwise>
			<form action="signin.jsp" method="post">
				<input type="text" name="id" />
				<button type="submit">로그인</button>
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>