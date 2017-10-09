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
	<link rel="stylesheet" type="text/css" href="css/success.css">
	<title>注册成功</title>     
  </head>
 <body>
 <center>
 <div class="container">
 <p>恭喜您完成注册</p>
 <hr>
 <p class="content">尊敬的用户，您已经成功注册Yngee新闻网，请点击登录！</p>
 <a href="index.jsp"><span>立即登录</span></a>
 </div>
 </center>
 
 </body>
 
</html>