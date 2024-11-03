<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h3>Registration Page | Registration</h3>
<hr>
<form action="verifyReg" method="post">
<pre>
First Name    : <input type = "text" name = "firstName" />
Last  Name    : <input type = "text" name = "lastName" />
Email         : <input type = "email" name = "email" />
City          : <input type = "text" name = "city" />
Mobile        : <input type = "text" name = "mobile" />
<input type = "submit" value="Register">
</pre>
</form>
${msg}
</body>
</html>