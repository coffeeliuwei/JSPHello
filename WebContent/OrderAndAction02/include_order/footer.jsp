

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<body>
<%
 SimpleDateFormat format=new SimpleDateFormat("yy-MM-dd");
Date ctime=new Date();

%>
<label>coffeeliu:<%=format.format(ctime).toString() %></label>
</body>
