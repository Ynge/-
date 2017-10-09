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
	<link type="text/css" rel="stylesheet" href="../css/common.css">
	<link type="text/css" rel="stylesheet" href="../css/reg.css">
	<script type="text/javascript" src="../js/reg.js"></script>
	<title>注册账号</title>     
  </head>
 <body>
 <center>
	 <div id="reg">
	 <form  name="f1" action="../RegisterServlet" method="post" onsubmit="return f1_submit_check()">
		 <table cellspacing="5" align="center">
			 <caption class="bg1">新用户注册</caption>
			 <tbody>  
			 <tr>
			 	<td class="name">用户名</td>
			 	<td colspan="3"><input type="text" name="username" required="required"></td>
			 </tr>
			 <tr>
			 	<td class="name">密码</td>
			 	<td class="value"><input required="required" name="password1" type="password"></td>
			 	<td class="name">确认密码</td>
			 	<td class="value"><input required="required" name="password2" type="password"></td>
			 </tr>
			 <tr>
			 	<td class="name">性别</td>
			 	<td class="value"><input type="radio" name="sex" value="0">男<input type="radio" name="sex" value="1">女</td>
			 	<td class="name">职业</td>
			 	<td class="value">
			 		<select name="profession">
			 		<option value="0">学生</option>
			 		<option value="1">老师</option>
			 		<option value="2">工人</option>
			 		</select>
			 	</td>
			 </tr>
			 <tr>
			 	<td class="name">个人爱好</td>
			 	<td>
			 		<input type="checkbox" name="favourite" value="computer">电脑网络
			 		<input type="checkbox" name="favourite" value="movie">影视娱乐
			 		<input type="checkbox" name="favourite" value="card">棋牌娱乐
			 	</td>
			 </tr>
			 <tr>
			 	<td class="name">个人说明</td>
			 	<td colspan="3"><textarea name="note" rows="3" cols="50">文本</textarea></td>
			 </tr>
			 <tr align="center" style="background-color: #71db71;">
			 	<td colspan="4"><input type="submit" value="提交"><input type="reset" value="重置"></td>
			 </tr>
			 </tbody>
		 </table>
	 </form>
	 </div>
 </center>
 
 </body>
 
</html>