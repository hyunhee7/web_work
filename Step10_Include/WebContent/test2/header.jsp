<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//request 영역에 담긴 문자열을 읽어온다.
	String name=(String)request.getAttribute("name");
%>
<div class="header">
	<h3>header.jsp입니다.</h3>
	<p>어쩌구.. 저쩌구..</p>
	내 이름은 : <strong><%=name %></strong> <br />
</div>