<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 修改默认缓冲区大小 -->
<%@ page buffer="20kb" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println("coffeeliu");
out.print("liuwei");
out.newLine();//输出换行
out.print("</br>");
out.flush();
//out.clearBuffer();
//out.clear();
out.println("获取缓冲区大小："+out.getBufferSize());
out.print("</br>");
out.println("当前缓冲区剩余字节数目："+out.getRemaining());
%>

</body>
</html>