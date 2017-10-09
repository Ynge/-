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
	<title>发布成功</title>     
  </head>
 <body>
  <center>
 <div class="container">
 <p>发布成功</p>
 <hr>
 <p class="content">尊敬的用户，您已经成功发布一条新闻！</p>
 <a href="main.jsp"><span>返回主页</span></a>
 </div>
 </center>
 
 </body>
 
</html>