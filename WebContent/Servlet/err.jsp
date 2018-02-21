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
#message{
text-align: center;
}
</style>
<body>
<div>登录失败<br>
错误提示：<% Object object=request.getAttribute("msg");
   if(object!=null){
	   
	   out.println(object.toString());
	   
   }else{
	   out.println("无");
	   
   }


%>
<br id="message">
user:<%=request.getParameter("userName") %><br>
psw:<%=request.getParameter("password") %><br>
<a href="<%=request.getContextPath()%>/Servlet/CompleteLogin.jsp">返回登录页面</a></div>

</body>
</html>