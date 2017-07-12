<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>    
<% 
	request.setAttribute("count", 3955633); 
	request.setAttribute("price", 39800);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/jstl/test05.jsp</title>
</head>
<body>
<h3>숫자 format 테스트</h3>
<p>카운트 : <strong><fmt:formatNumber value="${count }" type="number"/></strong></p>
<p>가격 : <fmt:formatNumber value="${price }" type="currency" currencySymbol="$"/></p>
<p><fmt:formatNumber value="1234.5678" pattern=".00"/></p>
</body>
</html>