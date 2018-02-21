<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie myCookie=new Cookie("coffee","liuwei");
myCookie.setMaxAge(3600);
response.addCookie(myCookie);
////////////////////////////////////////
Cookie[] cookies=request.getCookies();
if(cookies!=null)
{
   for(int i=0;i<cookies.length;i++)
   {
	   Cookie c=cookies[i];
	   if(c.getName().equalsIgnoreCase("coffee")){
		  out.println(c.getValue()); 
		   
	   }
	   
   }
}
%>
</body>
</html>