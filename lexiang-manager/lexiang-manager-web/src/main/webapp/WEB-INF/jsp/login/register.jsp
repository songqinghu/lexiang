<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>乐享-用户注册</title>
</head>
<body>
	
	
	<form  alt="" action="http://localhost:8080/main/user/adduser" method="post"  enctype="application/x-www-form-urlencoded">
		用户名:  <input id="userId" type="text"  alt="" maxlength="20" name="username" ><br>
		密码:    <input id="passwordId" type="password"  alt="" maxlength="20" name="password" ><br>
		密码确认:<input id="repasswordId" type="password"  alt="" maxlength="20" name="repassword" ><br>
		邮箱:    <input id="emailId" type="text"  alt="" maxlength="30" name="email" ><br>
		验证码:  <input id="checkcodeId" type="text"  alt="" maxlength="20" name="checkCode" ><img alt="验证码" height="45px"  width="100px" src="http://localhost:8080/main/imageServlet"><br>
		<input type="submit" value="注册"><br>
	</form>

</body>
</html>