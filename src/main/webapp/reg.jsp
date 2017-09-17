<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h1>New user registration</h1>
	<form method="post" action="action.do">
    	Username: <input type="text" maxlength="10" name="username"/><br>
    	Nome:	 <input type="text" maxlength="30" name="nome"/><br>
    	Cognome: <input type="text" maxlength="30" name="cognome"/><br>
    	E-mail: <input type="text" maxlength="50" name="email"/><br>
    	Password: <input type="text" maxlength="30" name="pwd"/><br>
    	<input type="submit" value="Invio"/>
    </form>
</body>
</html>