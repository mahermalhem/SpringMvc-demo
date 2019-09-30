<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer confirmation</title>
</head>
<body>

	the customer is confirmed : ${customer.firstName}
	 ${customer.lastName }
	 <br>
	 free passes : ${customer.freePasses }
	
	<br>
	postal code : ${customer.postalCode }
	<br>
	Course code : ${customer.courseCode }


</body>
</html>