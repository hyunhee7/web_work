<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test07.jsp</title>
</head>
<body>
<%
		boolean a = true;
		String b= "gura";
%>
<script>
		var isLogin=true;
		var userId="gura";
		
		var isLogin2=<%=a%>;
		var userId2="<%=b%>";
</script>
<p> javascript 실행환경에서 isLogin 과 isLogin2, userId 와 userId2 변수를 조사해 보세요.</p>

</body>
</html>