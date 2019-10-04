<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<f:form action="processuser" method="post" modelAttribute="userBean">

	Name : <f:input path="username"/> <br>
	Qly : 
			<f:checkbox path="qly" value="B.Tech"/> B.Tech
			<f:checkbox path="qly" value="M.Tech"/> M.Tech
			<f:checkbox path="qly" value="B.Sc"/>B.Sc
			
	<br>
		Gender:
			<f:radiobutton path="gender" value="Male"/> Male
			<f:radiobutton path="gender" value="Female"/> Female
			
	<br>
		Country:
			<f:select path="country">
				<f:option value="IND">INDIA</f:option>
				<f:option value="CND">CANADA</f:option>
				<f:option value="USA">UnitedStates</f:option>
			</f:select>

	<input type="submit" value="getData" />
</f:form>

</body>
</html>