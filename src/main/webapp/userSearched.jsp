<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.List" %>
<%@page import = "com.dede.first.User" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User searched</title>
</head>
<body>
	<%  
	Object k=request.getSession().getAttribute("username");
	if(!(k==null)){
		out.print("<p>Hi, "+request.getSession().getAttribute("username")+"</p><br><br>");
		out.print("<a href='logOut.do'>Log Out</a><br>");} 
	List<User> users = (List<User>) request.getAttribute("us");
	if(users.isEmpty()){
		out.print("No results");
	}else{
		for (User user : users) {
			out.print("<a href='"+user.getUsername()+".jsp'>"+user.getUsername()+"       "+"</a> <b>"+
														user.getNome()+" "+user.getCognome()+"</b>");
		}
	}
	%>
	<br><br><br><a href="index.jsp">Home</a>
</body>
</html>