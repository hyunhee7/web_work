<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/test6/main.jsp</title>
</head>
<body>
<%
	//전달하는 파라미터 value 에 한글이 있으면 인코딩을 해준다.
	request.setCharacterEncoding("utf-8");
%>
<jsp:include page="header.jsp">
	<jsp:param value="1" name="num"/>
	<jsp:param value="kimgura" name="name"/>
	<jsp:param value="노량진" name="addr"/>
</jsp:include>
<h3>여기는 main.jsp 페이지 입니다.</h3>	
</body>
</html>