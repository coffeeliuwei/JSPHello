<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="do_register.jsp" method="post">
用户名：<input type="text" name="userName"><br>
技能：
<input type="checkbox" name="skills" value="java">java
<input type="checkbox" name="skills" value="liu">liu
<input type="checkbox" name="skills" value="wei">wei
<input type="checkbox" name="skills" value="coffee">coffee
<br>
<input type="submit" value="提交">
<input type="reset" value="重置">
</form>
</body>
</html>