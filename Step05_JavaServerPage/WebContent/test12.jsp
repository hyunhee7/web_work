<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한글 인코딩 설정
	request.setCharacterEncoding("utf-8");
	//클라이언트가 폼 전송하는 문자열을 읽어와서 콘솔창에 종류별로 출력하기
	String email=request.getParameter("email");
	String pwd=request.getParameter("pwd");
	String job = request.getParameter("job");
	String gender=request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	
	System.out.println(gender);
	System.out.println("email : "+email);
	System.out.println("pwd: "+pwd);
	System.out.println("job: "+job);
	System.out.println("hobby: ");
	for(String tmp:hobby){
		System.out.print(tmp+"/");
	}


%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test12.jsp</title>
</head>
<body>

</body>
</html>