<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("/test/go4.jsp 요청 처리중");

	//상대경로 리다이렉트 이동응답.
	response.sendRedirect("result4.jsp");
%>
