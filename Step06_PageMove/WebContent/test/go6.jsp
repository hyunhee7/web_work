<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("/test/go6.jsp 요청 처리중");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/test/go6.jsp</title>
<script>	
	alert("result6.jsp 페이지로 이동합니다.")
	//자바스크립트를 로딩시켜서 클라이언트를 리다이렉트 이동시킨다.
	location.href = "result6.jsp";
</script>
</head>
<body>
</body>
</html>