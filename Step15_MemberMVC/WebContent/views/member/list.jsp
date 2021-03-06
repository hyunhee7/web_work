<%@page import="java.util.List"%>
<%@page import="test.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
   List<MemberDto> list=(List)request.getAttribute("list");
    String cPath=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/views/member/list.jsp</title>
<link rel="stylesheet" href="<%=cPath %>/resource/css/bootstrap.css" />
<script src="<%=cPath%>/resource/js/jquery-3.2.0.js"></script>
<script src="<%=cPath%>/resource/js/bootstrap.js"></script>
</head>
<body>
<a href="insertform.do">회원추가하기</a>
<div class="container">
<table class="table table-inverse">
      <thead>
         <tr>
            <th>번호</th>
            <th>이름</th>
            <th>주소</th>
            <th>수정</th>
            <th>삭제</th>
         </tr>
      </thead>
      <tbody>
      <%for(MemberDto tmp:list){%>
         <tr>
            <td><%=tmp.getNum()%></td>
            <td><%=tmp.getName()%></td>
            <td><%=tmp.getAddr()%></td>
            <td><a href="updateform.do?num=<%=tmp.getNum()%>">수정</a></td>
            <td><a href="delete.do?num=<%=tmp.getNum()%>">삭제</a></td>
         </tr>
      <%} %>
      </tbody>
</table>
</div>
</body>
</html>