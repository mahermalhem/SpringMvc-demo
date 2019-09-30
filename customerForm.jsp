<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		.error{color:red}
	</style>
<meta charset="ISO-8859-1">

<title> Customer Registration form </title>
</head>
<body>
	
<h2><i>Fill out the form (*) means required </i> </h2> 
	<form:form action="processForm" modelAttribute="customer"> 
	
		First Name : <form:input path="firstName" />
		
		<br> <br>
		
		Last Name : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		
		<br> <br>
		
		put a number : <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error" />
		<br> <br>
		
		postal Code : <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error" />
		
		<br><br>
		
		Course Code : <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error" />
				
		<br><br>
		<input type="submit"  />
	
	</form:form>

</body>
</html>