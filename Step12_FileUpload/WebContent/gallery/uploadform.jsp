<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/gallery/uploadform.jsp</title>
</head>
<body>
	<h3>이미지 업로드 폼입니다.</h3>
	<form action="upload.jsp" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<th><label for="name">이름</label></th>
				<td><input type="text" name="name" id="name"/></td>
			</tr>
			<tr>
				<th><label for="pic">사진</label></th>
				<td><input type="file" name="pic" id="pic"/></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">저장</button></td>
			</tr>
		</table>
	</form>
</body>
</html>