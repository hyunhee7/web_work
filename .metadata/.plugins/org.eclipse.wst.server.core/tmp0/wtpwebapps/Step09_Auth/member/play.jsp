<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그인 여부를 읽어와 본다.
	String id=(String)session.getAttribute("id");
	//id가 null이 아니면 로그인된 것이다.
	
	//context 경로 읽어오기
	String cPath=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>play.jsp</title>
</head>
<body>
	<h3>로그인된 회원 전용 공간</h3>
	<% if(id==null){ %>
		<script>
			alert("로그인이 필요합니다.");
			location.href="../users/signin_form.jsp?url=<%=cPath%>/member/play.jsp";
		</script>
	<%}else{ %>
		<p><strong><%=id %></strong>님 로그인중...</p>
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsum vitae totam repellat nesciunt laboriosam atque ullam id cupiditate animi ad blanditiis sapiente quaerat excepturi quisquam consequatur sed itaque rerum perferendis.</p>	
	<%} %>

</body>
</html>