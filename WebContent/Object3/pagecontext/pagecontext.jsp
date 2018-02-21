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
  JspWriter jspWriter=pageContext.getOut();
jspWriter.println("coffeeliu");
//HttpSession sHttpSession=pageContext.getSession();
//HttpServletRequest request2=(HttpServletRequest)pageContext.getRequest();

pageContext.setAttribute("coffee", "liuwei",pageContext.SESSION_SCOPE);

String value=session.getAttribute("coffee").toString();
out.println(value);
out.println("<br>");
%>
</body>
</html>