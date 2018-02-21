<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userName=request.getParameter("userName");
String skills="";
String[] skillArr=request.getParameterValues("skills");
if(skillArr!=null&& skillArr.length>0){
	for(String skill:skillArr){
		skills=skills+skill+" ";
	}
	
}
//set,getAttribute Components share information
request.setAttribute("US", userName);
request.setAttribute("SKS", skills);
%>
<jsp:forward page="welcome.jsp"></jsp:forward>