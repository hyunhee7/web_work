<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/home.jsp</title>
</head>
<body>
<h3>미니홈피</h3>
<a href="${pageContext.request.contextPath }/board/list.do">방명록 리스트 보기</a>
</body>
</html>