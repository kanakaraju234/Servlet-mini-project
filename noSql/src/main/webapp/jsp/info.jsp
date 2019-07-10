<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name =(String)request.getAttribute("fname");
String email =(String)request.getAttribute("email");
String pword =(String)request.getAttribute("password");
%>

<h1>Ur Name:<%=name %>  </h1>
<h2>Email ID: <%=email %> </h2>
<h3>password: <%=pword %> </h3>

<a href="/id">Click here !</a><a href="/">Back</a>
</body>
</html>