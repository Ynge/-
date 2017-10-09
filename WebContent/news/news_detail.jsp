<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,com.vo.News,com.vo.User"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" rel="stylesheet" href="css/news_detail.css">
	<title>新闻详情</title>     
  </head>
 <body>
 <%
    List<Object> list= (List<Object>)request.getAttribute("list");
 	News news = (News)list.get(0);
 	User author = (User)list.get(1);
 %>
 <h1><%=news.getTitle() %></h1>
 <h3>作者：<%=news.getUsername() %>&nbsp;&nbsp;&nbsp;<%=news.getPubtime() %></h3>
 <p><%=news.getContent() %></p>
 </body>
 
</html>