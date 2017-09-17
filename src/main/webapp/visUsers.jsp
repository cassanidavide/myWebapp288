<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.List" %>
<%@page import = "com.dede.first.User" %>
<!DOCTYPE html>
<html>
<head><title>All users</title></head>
<body>
<h1>All users</h1>
<%  
	Object k=request.getSession().getAttribute("username");
	if(!(k==null)){
		out.print("<p>Hi, "+request.getSession().getAttribute("username")+"</p><br><br>");
		out.print("<a href='logOut.do'>Log Out</a>");} 
	List<User> users = (List<User>) request.getAttribute("users");
	for (User user : users) {
		out.print("<b>Nome</b>: " + user.getNome());%><br><%
		out.print("<b>Cognome</b>: " + user.getCognome());%><br><br><br><%
	}
%>
<br><a href="index.html">Home</a>
</body>
</html>