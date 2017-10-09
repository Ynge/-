<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>错误页</title>     
  </head>
 <body>
 <div>
 	<%
 	List<String> errorList =(List<String>)request.getAttribute("errorList");
 	%>
 	<h2 style="color:red;text-align:center">出现错误</h2>
 	<%
 	for(String error : errorList){
 		%>
 	<p style="color:red;text-align:center"><%=error %></p>
 	<%
 	}
 	%>
 	<p style="text-align:center"><a href="register/register.jsp">重新注册</a></p>
 </div>
 </body>
 
</html>