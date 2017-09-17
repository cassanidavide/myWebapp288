<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.List" %>
<%@page import = "com.dede.first.User" %>
<!DOCTYPE>
<html>
<head><title>Homepage</title></head>
<body>
	<%	Object k=request.getSession().getAttribute("username");
		if(!(k==null)){
			out.print("<p>Hi, "+request.getSession().getAttribute("username")+"</p><br><br>");
			out.print("<a href='logOut.do'>Log Out</a>");} %>
	<h1>Welcome to the homepage</h1>
	<% if(k==null)
			out.print("<a href='logIn.html'>I already have my account.</a><br>");%>
    Are you not registered yet? Then <a href="reg.jsp">create your new account.</a><br>
    <a href="getAllUsers.do">View all users!</a><br>
    <form method="get" action="getSingleUser.do">
    	Cerca per username...<br><input type="text" name="usernameSearched"/>
    	<input type="submit" value="Cerca"/>
    </form>
</body>
</html>
