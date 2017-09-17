<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data receiver</title>
</head>
<body>
	<h2><b>New user created!</b></h2><br>
	<p>
		<% String n=request.getParameter("nome");  
		   String c=request.getParameter("cognome");
		   String u=request.getParameter("username"); 
		   String e=request.getParameter("email");
		   String p=request.getParameter("pwd");
		   out.print("\n\nHey "+n+" "+c+"! Your account is been created! ");%><br><br>
		<% out.print("DATA SUMMARY: ");%><br>
		<% out.print("Username: "+u);%><br>
		<% out.print("Email: "+e);%>
		<% out.print("Password: "+p);%>
	</p>
</body>
</html>