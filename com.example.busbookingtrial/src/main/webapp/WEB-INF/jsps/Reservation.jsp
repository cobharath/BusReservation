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

<form action="ReservationDetails" method = "post">
<h2>Reservation Details Fill up</h2>



Bus_id :${list.id}<br>
Bus D   :${list.currentCity} <br>
Bus D  :${list.destinationCity}<br>
Bus D:${list.dateOfDestination}<br>

<h2>passenger details</h2>

firstname <input type = "text" name = firstname>
lastname <input type = "text" name = lastname>
email <input type = "text" name = email>
mobile <input type = "text" name = mobile>
<input type = "hidden" name = busId value = "${list.id}"  >



<input type = "submit" value = save>

</form>


</body>
</html>