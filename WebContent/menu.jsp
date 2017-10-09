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
	<link type="text/css" rel="stylesheet" href="css/menu.css">
	<title>菜单</title>     
  </head>
 <body>
 <%
 	User user = (User)session.getAttribute("user");
 	String type = user.getType();
 %>
 	<table>
 		<tr>
	 		<td>
	 		<a href="news/view_news.jsp" target="content">查看新闻</a>
	 		</td>
 		</tr>
 		<tr>
	 		<td>
	 		<a href="news/add_news.jsp" target="_parent">发布新闻</a>
	 		</td>
 		</tr>
 		<tr>
	 		<td>
	 		<a href="changepwd.jsp" target="_parent">修改密码</a>
	 		</td>
 		</tr>

 <%
 //如果当前用户为管理员，则具有管理员权限
 if("1".equals(type)){ 
 %>
 		<tr>
	 		<td>
	 		<a>用户管理</a>
	 		</td>
 		</tr>
 <%} %>
 		<tr>
	 		<td>
	 		<a href="index.jsp" target="_parent">退出登录</a>
	 		</td>
 		</tr>
 	</table>
 </body>
 
</html>