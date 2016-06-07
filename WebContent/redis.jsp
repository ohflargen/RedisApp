<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="edu.mayo.test.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Redis String Example</title>
</head>
<body>

<body>
Simple application.<br>
I'm running at <strong><%
out.print(request.getLocalAddr());
%>:<%
out.print(request.getServerPort());
%></strong>
<br>

<jsp:useBean id="date" class="java.util.Date" /> 
<p>The date/time is <%= date %></p>

Redis test results...
<% 	
	EnvironmentVariableTest evt = new EnvironmentVariableTest(); 
	RedisString rs = new RedisString(); 
	out.print(evt.getEV());
	out.print(rs.testString(evt.getEV()));
%> 

</body>
</html>