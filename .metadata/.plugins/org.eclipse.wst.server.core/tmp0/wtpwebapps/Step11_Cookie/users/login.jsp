<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//폼 전송 파라미터를 읽어온다.
	String id = request.getParameter("id");
	String pwd=request.getParameter("pwd");
	//아이디 저장 checkbox를 체크했으면 null 이 아니다.
	String isSave=request.getParameter("isSave");
	
	if(isSave != null){ // null 이 아니면 쿠키를 응답해서 id가 저장되도록
		//쿠키 객체를 생성
		Cookie cookie=new Cookie("savedId", id);
		//최대 유지시간 초단위로 설정
		cookie.setMaxAge(60);
		//쿠키 응답 하기
		response.addCookie(cookie);
	}
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
</head>
<body>
	<h3><%=id %> 님 로그인 되었습니다.</h3>
	<a href="../index.jsp">확인</a>
</body>
</html>