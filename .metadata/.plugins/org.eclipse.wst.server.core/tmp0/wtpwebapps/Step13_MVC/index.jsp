<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
</head>
<body>
<h3>인덱스 페이지</h3>
<ul>
	<li><a href="fortune.jsp">오늘의 운세</a></li>
	<li><a href="mycon?command=fortune">오늘의 운세(MVC)</a></li>
	<li><a href="mycon?command=info">회원정보 보기</a></li>
</ul>
<%
	//세션 영역에 id 라는 키값으로 저장된 문자열을 읽어온다.
	String id=(String)session.getAttribute("id");
	if(id==null){%>
		<form action="mycon?command=signin" method="post">
			<label for="id">아이디</label>
			<input type="text" name="id" id="id"/>
			<button type="submit">로그인</button>
		</form>
	<%} else {%>
		<p><strong><%=id %></strong> 님 로그인중 ...</p>
		<a href="mycon?command=signout">로그아웃</a>
	<%} %>

</body>
</html>