<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
body{
color: #000;
font-size: 20px;
margin: 20px auto;
}

</style>
<script type="text/javascript">
function check(form) {
	if (document.forms.LoginForm.userName.value=="") {
		alert("请输入用户名！");
		document.forms.LoginForm.userName.focus();
		return false;
	}
	if (document.forms.LoginForm.password.value=="") {
		alert("请输入密码！");
		document.forms.LoginForm.password.focus();
		return false;
	}
}
</script>


<body>
<form action="<%=request.getContextPath()%>/CheckServlet" method="post"name="LoginForm">
 <table border="1" cellpadding="5" cellspacing="0" bordercolor="blue" align="center">
 <tr>
 <td colspan="2" align="center" >用户登录
 </td>
 </tr>
 <tr>
<td> 用户名：</td><td><input type="text" name="userName"></td> 
 </tr> <tr>
<td> 密码：</td><td><input type="password" name="password"></td> 
 </tr>
 <tr>
   <td colspan="2" align="center">
     <input type="submit" name="submit" onclick="return check(this);">
   <input type="reset" name="reset">
   </td>
 
 </tr>
 </table>
 
 
</form>

</body>
</html>