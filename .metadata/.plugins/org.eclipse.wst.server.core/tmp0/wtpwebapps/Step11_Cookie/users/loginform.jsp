<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키에 저장된 아이디를 담을 변수
	String savedId="";

	//request 객체에 담겨서 전달된 쿠키 목록을 읽어온다.
	Cookie[] cookies=request.getCookies();
	
	if(cookies != null && cookies.length > 0){
		for(Cookie tmp:cookies){
			if(tmp.getName().equals("savedId")){
				//쿠키 value를 읽어와서 변수에 담는다.
				savedId=tmp.getValue();
			}
		}
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/users/loginform.jsp</title>
</head>
<body>
	<h3>로그인 폼입니다.</h3>
	<form action="login.jsp" method="post">
		<table>
			<tr>
				<th><label for="id">아이디</label></th>
				<td><input type="text" name="id" id="id" value="<%=savedId %>" /></td>
			</tr>
			<tr>
				<th><label for="pwd">비밀번호</label></th>
				<td><input type="password" name="pwd" id="pwd" /></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<label>
						<input type="checkbox" name="isSave" value="yes" />
						아이디 저장
					</label>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">로그인</button></td>
			</tr>
		</table>
	</form>
</body>
</html>