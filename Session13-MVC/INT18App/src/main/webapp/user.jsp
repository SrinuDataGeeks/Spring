<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<f:form action="processuser" method="post" modelAttribute="userBean">


	<s:message  code="user.label"/> : <f:input path="username"/> <br> <br>
	
	<s:message var="userLabel" code="user.submit.label"/>
	
	<input type="submit" value="${userLabel}" />
</f:form>

</body>

<a href="./userPage?lang=te">&#3108;&#3142;&#3122;&#3137;&#3095;&#3137;</a> <br><br>
<a href="./userPage?lang=hi">&#2361;&#2367;&#2344;&#2381;&#2342;&#2368;</a> <br><br>
<a href="./userPage?lang=en">English</a> <br><br>

</html>