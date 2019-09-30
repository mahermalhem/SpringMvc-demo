<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student regesteration form</title>
	</head>
	<body>
	
	<form:form action="processStudentForm" modelAttribute="student">
		<form:input path="firstName" />
		<br><br>
		<form:input path="lastName"/>
		<br><br>
		Country : 
		<%-- 
		<form:select path="country">
		 when u ever submit it will submit the setCountry (country) 
			<form:option value="Brazil" lable="BRA" />
			<form:option value="Freance" lable="fr" />
			<form:option value="Germany" lable="Germany" />
			<form:option value="India" lable="India" />
			<form:option value="Jordan" lable="JO" />
		</form:select
		  --%>
		  
		 <form:select path="country" >
	 		<form:options items="${student.countryOptions }" />
	 		<%--here it will call student.getCountryOptions --%>
	 	 </form:select>
		<br><br>
		Choose Your Fav Lnag: 
		<br>
			Java <form:radiobutton path="favLang" value="Java"/>
			C++ <form:radiobutton path="favLang" value="C++"/>
			C# <form:radiobutton path="favLang" value="C3"/>
			PYTHON <form:radiobutton path="favLang" value="PYTHON"/>
			
		<br><br>
		
			Select Your Operation Systems 
			Linux <form:checkbox path="os" value="Linux os"/>
			Windows <form:checkbox path="os" value="windos os"/>
			MAC <form:checkbox path="os" value="mac os"/>
		<input type="submit" value="done">
	</form:form>
	//when u load the form spring calls get methods
	<br>
	//when u submit spring call set method
	</body>
	
		
	
	
</html>