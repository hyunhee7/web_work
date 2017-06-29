<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name=(String)request.getAttribute("name");
%>
<div class="footer">
	<h3>footer입니다.</h3>
	<p>어쩌구<br />
	내이름은: <strong><%=name %></strong>
	</p>
	
</div>