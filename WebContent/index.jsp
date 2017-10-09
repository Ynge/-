<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" rel="stylesheet" href="css/index.css">
	<link type="text/css" rel="stylesheet" href="css/common.css">
	<title>登录页</title>     
  </head>
 <body>
 <center>
 <p id="welcome">欢迎来到Yngee新闻网</p>
 <div id="login">
 <p id="title">用户登录</p>
 <form name="login" action="LoginServlet" method="post">
	<input type="text" name="username" placeholder="username">
	<input type="password" name="password" placeholder="password">
  	<input type="submit" name="submit" value="登录">
 	<a href="register/register.jsp"><button type="button" name="button">注册</button></a>
 </form>
 </div>
 <%
 	if(request.getAttribute("loginFalse")!=null && "true".equals(request.getAttribute("loginFalse"))){
 %>
 <p style="color:red;">登陆失败，请检查密码或注册!</p>
 <%
 	}
 %>
 </center>
 </body>
 
</html>