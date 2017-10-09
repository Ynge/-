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
	<link rel="stylesheet" type="text/css" href="../css/view_news.css">
	<script type="text/javascript" src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript" src="../js/view_news.js"></script> 
	<title>新闻列表页</title>     
  </head>
 <body>
 <center>
 
 <span id="title">全部新闻</span><span id="query"><input type="text" placeholder="查询姓名或标题"><button id="submit">查询</button></span>
 <table id="mainTable">
 </table>
 <p id="footer">共<span id="sumdata"></span>条数据 &nbsp; 第<span id="nowpage"></span>页/共<span id="sumpage"></span>页
 <button id="btn_firstpage" >首页</button> <button id="btn_previouspage">上一页</button>
 <button id="btn_nextpage">下一页</button> <button id="btn_lastpage">尾页</button>
 </p>
 </center>
 </body>
 
</html>