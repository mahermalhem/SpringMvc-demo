<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"  %>

<html>
	<head>
		<title>Student Confirmation</title>
		</head>
	<body>
	
	<br><br>
	
	the Student is confirmed <br>
	: ${student.firstName} ${student.lastName} 
	<br><br>
	the Student Country is : ${student.country }
	<br><br>
	<h3>Favorite Language is: ${student.favLang } </h3>
	<br>
	<h3>Your operating Systems are </h3>
	<ul>
		<c:forEach var="temp" items="${student.os }">
		<li>${temp }</li>
		</c:forEach>
	</ul>
	
	</body>
	
</html> 