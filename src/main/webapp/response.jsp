<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>
</head>
<body>
<center>
     <h1>Displaying data from an Array</h1>
     <b>Name of Book</b>
     <c:forEach var="booksName" items="${books}">${booksName}</c:forEach>
</center>
</body>
</html>