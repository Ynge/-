<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.vo.User" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" rel="stylesheet" href="css/main.css">
	<title>首页</title>     
  </head>
 <body>
 <%
 User user = (User)session.getAttribute("user");
 %>
 <%if(user != null){ %>
 <h1>欢迎<%=user.getUsername()%></h1>
 <iframe id="menu" frameborder="0" name="menu" width="120px" height="200px" src="menu.jsp">
 </iframe>
 <iframe id="content" frameborder="0" name="content" width="70%" height="80%"scrolling="auto" src="news/view_news.jsp" >
 </iframe>
  <%}else{ %>
  <p>连接超时，<a href="index.jsp">重新登陆</a></p>
  <%} %>
 </body>

  
 
</html>