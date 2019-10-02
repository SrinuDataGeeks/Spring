<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<f:form action="processUser" method="POST" modelAttribute="userBean" >

UserName : <f:input path="username" />

	<input type="submit" value="getName">
	<strong>	<font color="red">${usernameReq}</font> </strong>

</f:form>


</body>
</html>