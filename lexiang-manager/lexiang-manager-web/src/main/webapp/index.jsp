<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<form action="http://localhost:8080/mian/user/login"  method="post"  enctype="application/x-www-form-urlencoded">
	
		用户名:<input type="text" name="username"><br>
		密码: <input type="password" name="password"><br>
		<input type="submit"  value="登录"><br> 
	</form>
	<h4>还没注册?<a href="http://localhost:8080/main/base/login/register">注册</a></h4>
</body>
</html>