<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/users/signup_form.jsp</title>
</head>
<body>
<h3>회원 가입 페이지 입니다.</h3>
<form action="signup.do" method="post">
	<label for="id">아이디</label>
	<input type="text" name="id" id="id" /> <br />
	<label for="pwd">비밀번호</label>
	<input type="text" name="pwd"  id="pwd"/><br />
	<label for="email" >이메일</label>
	<input type="text" name="email"  id="email"/><br />
	<button type="subject">가입</button>
</form>
</body>
</html>