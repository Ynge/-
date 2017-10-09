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
	<link type="text/css" rel="stylesheet" href="../css/add_news.css">
	<script type="text/javascript" src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript" src="../js/add_p.js"></script>
	<title>发布新闻</title>     
  </head>
 <body>
 <center>
 <form name="f2" action="../AddNewsServlet" method="post">
	 <table align="center">
	 <caption>新闻发布</caption>
	 <tbody>
	 <tr><td class="text">新闻标题</td><td><textarea required="required" rows="1" cols="70" name="title"></textarea><td></tr>
	 <tr><td class="text">新闻正文</td><td><textarea  id="content_text" required="required" rows="10" cols="70" name="content"></textarea></td></tr>
	 <tr><td colspan="2"><input type="submit" value="提交"><input type="reset" value="重置"> <button id="btn_add_p" type="button">添加段落</button> <a href="../main.jsp"><button type="button">返回</button></a></td></tr>
	 </tbody>
	 </table>
 </form>
 <p>温馨提示：点击“添加段落”将新段落放在&#60;p&#62;和&#60;/p&#62;中间，支持html语法</p>
 </center>
 </body>
 
</html>