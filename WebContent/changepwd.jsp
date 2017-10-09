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
	<script type="text/javascript" src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript" src="js/change_password.js"></script> 
	<title>修改密码</title>     
  </head>
 <body>
 <center>
 <form name="f" action="ChangePasswordServlet" method="post">
 	<table style="margin-top:200px;background-color:#99ff66;">
 	<caption style="background-color:#ff8080;font-size:20px;">修改密码</caption>
 	<tr><td>原密码</td><td><input required="required" name="oldpwd" type="password"></td></tr>
 	<tr><td>新密码</td><td><input required="required" name="newpwd" type="password"></td></tr>
 	<tr><td>确认新密码</td><td><input required="required" name="renewpwd" type="password"></td></tr>
 	<tr><td align="center" colspan="2">
 		<input style="width:40%" value="确认修改" onclick="return on_submit()" type="submit">
 		<button type="button" style="width:40%" onclick="javascript:history.back(-1)">返回</button>
 	</td></tr>
 	</table>
 </form>
 <p style="color:red"></p>
 </center>
 </body>
 
</html>