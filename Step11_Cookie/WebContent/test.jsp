<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	//폼전송되는 문자열 읽어오기
	String msg=request.getParameter("msg");
	
	//쿠키 객체를 생성해서 new Cookie("key값", "value값")
	Cookie cookie=new Cookie("savedMsg",msg);
	//쿠키 유지 시간을 초단위로 지정한다.
	cookie.setMaxAge(60);
	//응답할 때 쿠키가 클라이언트에게 심어지도록 응답한다.
	response.addCookie(cookie);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test.jsp</title>
</head>
<body>
<h3>쿠키 테스트</h3>
<form action="test.jsp" method="post">
	<label for="msg">저장할 문자열 입력</label>
	<input type="text" name="msg" id="msg"/>
	<button type="submit">저장</button>
</form>
<a href="result.jsp">저장된 쿠키 읽어오기</a>
</body>
</html>