<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> select all details</h2>
<form action="Confirmation" method= "post">

<table border=" 1 ">

<tr>
<tr>
<th>currentCity<th>
<th>destinationCity<th>
<th>dateOfDestination<th>
<th>select flights<th>
<tr>


<c:forEach items = "${bus}" var = "bus">



</tr>
<td>${bus.currentCity}</td>
<td>${bus.destinationCity}</td>
<td>${bus.dateOfDestination}</td>
<td> <a href="Confirmation?flightId=${bus.id}">select<a></a><td> 
<tr>

</c:forEach>


</table>






</form>


</body>
</html>