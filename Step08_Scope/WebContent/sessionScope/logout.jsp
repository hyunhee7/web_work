<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//session 영역에서 특정 키값으로 저장된 값 삭제하기
	//session.removeAttribute("id");
	
	//session 영역 초기화 (위 아래 둘중 하나 하면됨)
	session.invalidate();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sessionSocpe/logout.jsp</title>
</head>
<body>
	<p>로그아웃 되었습니다.</p>
	<a href="loginform.jsp">로그인폼</a>
	<a href="login_result.jsp">로그인 결과 페이지로 가기</a>
</body>
</html>