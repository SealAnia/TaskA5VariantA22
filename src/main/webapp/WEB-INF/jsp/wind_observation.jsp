<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wind Observation</title>
</head>
<body>

	<h3>WIND OBSERVATION</h3>
	
	<table>
		<tr>
			<th>Date</th>
			<th>Time</th>
			<th>Maximum sustained wind</th>
			<th>north eastern first</th>
			<th>south eastern first</th>
			<th>south western first</th>
			<th>north western first</th>
			<th>north eastern second</th>
			<th>south eastern second</th>
			<th>south western second</th>
			<th>north western second</th>
			<th>north eastern third</th>
			<th>south eastern third</th>
			<th>south western third</th>
			<th>north western third</th>
		</tr>
		<c:forEach items = "${observations}" var = "observation">
		<tr>
			<td>${observation.date}</td>
			<td>${observation.time}</td>
			<td>${observation.maximumSustainedWind}</td>
			<td>${observation.northeastern}</td>
			<td>${observation.southeastern}</td>
			<td>${observation.southwestern}</td>
			<td>${observation.northwestern}</td>
			<td>${observation.northeasternSecond}</td>
			<td>${observation.southeasternSecond}</td>
			<td>${observation.southwesternSecond}</td>
			<td>${observation.northwesternSecond}</td>
			<td>${observation.northeasternThird}</td>
			<td>${observation.southeasternThird}</td>
			<td>${observation.southwesternThird}</td>
			<td>${observation.northwesternThird}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>