<%@page import="java.util.LinkedList"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
JSP表达式：<%="hello world" %>
<%--JSP全局声明 --%>

<%!
String str="hello world";
%>
<%--JSP局部声明 --%>
<%
 //String str="hello world";
out.println(str);
%>
<%

  ArrayList aList=new ArrayList();
 aList.add(1);aList.add(2);
 
 LinkedList linkedList=new LinkedList();
 linkedList.add(0, 1);
 
%>
</body>
</html>