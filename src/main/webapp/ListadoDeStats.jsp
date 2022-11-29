<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cosas locas</title>
</head>
<body>
<table>
	<tr>
		<td>Champion</td>
		<td>Name</td>
		<td>Value</td>
		<td>Modifier Per Level</td>
	</tr>
	<c:forEach var="stat" items="${requestScope.stats}">
		<tr>
			<td><c:out value="${stat.champion}" /></td>
			<td><c:out value="${stat.name}" /></td>
			<td><c:out value="${stat.value}" /></td>
			<td><c:out value="${stat.modifierPerLevel }"/></td>
			<td><form action="/removeStat" method="get">
                <input type="hidden" name="champion" value="${stat.champion}" />
                <input type="hidden" name="name" value="${stat.name}" />
                <input type="hidden" name="value" value="${stat.value}" />
                <input type="hidden" name="mpl" value="${stat.modifierPerLevel}" />
                <input type="hidden" name="table" value="CHAMPION_STATS" />
                <input type="hidden" name="servlet" value="/listStats" />
                <input type="submit" value="Remove" name="remove">
            </form></td> 
		</tr>
	</c:forEach>
</table>

</body>
</html>