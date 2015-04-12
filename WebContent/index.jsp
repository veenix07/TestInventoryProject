<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome to Login Page</title>
	<link rel="stylesheet" type="text/css" href="resources/style.css">
</head>
<body>
	<s:form action="check_login" method="post">
		<s:actionerror/>
		<s:textfield name="user.username" label="Username" labelposition="left" labelSeparator=":"/>
		<s:password name="user.password" label="Password" labelposition="left" labelSeparator=":"/>
		<s:submit /><s:reset/>
	</s:form>
</body>
</html>