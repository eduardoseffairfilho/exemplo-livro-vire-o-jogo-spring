<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page isELIgnored="false" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ola mundo com Spring Framework</title>
	</head>
	<body>
		<h1>Oi mundo!</h1>
		<%-- O mesmo atributo 'data' que definimos no model --%>
		<p>Hora �: ${data}</p>
	</body>
</html>