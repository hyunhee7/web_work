<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resource/css/custom.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resource/css/bootstrap.css">
<script src="${pageContext.request.contextPath }/resource/js/jquery-3.2.0.js"></script>

<style>
	body{
		background: #eeeeee url('${pageContext.request.contextPath }/resource/images/signin.png') no-repeat center top;  
		background-attachment: fixed; 
		overflow: hidden;
		text-align: center; 	
	}
	.wrapper {
		position:absolute;
		width:100%;
		height:100%;
	} 
	.logo{
		top:0;
		position: relative; 
		margin:20px 0 0 20px;
		float:left;
		width:100px;
		height:auto;
	}	
	.container { 
		clear:both;
		position: relative; 
		height: 480px; 
		top: 15%; 
		text-align: center; 
	}
	.loginTitle{
		font-size: 61px;
		font-style: italic;
		color: #ffffff;
		text-align:center;
	}
	.inputUI{
	   letter-spacing: 1px;
	   width: 80%;
	   height: 50px;
	   color: rgba(255, 255, 255, 0.38);
	   border: 0;
	   border-bottom: 2px solid #ffffff;
	   background: none;
	   padding-left: 4px;	
	}
	.inputMargin{
		margin:20px 0 30px 0;
	}
	.submitBtnUI{
		margin-top:30px;
		width:80%;
	}
	.dontHave{
		margin-top:20px;
		width:70%;
	}
</style>
</head>
<body>
	<div class="wrapper">
		<img src="${pageContext.request.contextPath }/resource/images/logo.png" class="logo"/>
		<div class="container col-md-offset-4 col-md-4 col-xs-6 col-xs-offset-3">
			<div class="loginTitle">Sign in</div>
			<div class="loginform">
				<form action=""  method="post">
					<input type="text" class="inputUI inputMargin" id="id" name="id" placeholder="Username"/>
					<input type="text" class="inputUI" id="pwd" name="pwd" placeholder="Passward"/>
					<br /><br />
					<a href=""><img src="${pageContext.request.contextPath }/resource/images/login.png" alt="" class="submitBtnUI"/></a>
				</form>
			</div>
			<div class="signupForm">
				<img src="${pageContext.request.contextPath }/resource/images/dontHave.png" class="dontHave"/>
			</div>
		</div>
	</div>
</body>
</html>