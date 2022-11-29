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
		<td>Nombre</td>
		<td>Titulo</td>
		<td>Lore</td>
		<td>Tags</td>
	</tr>
	<c:forEach var="ab" items="${requestScope.abilities}">
		<tr>
			<td><c:out value="${ab.id}" /></td>
			<td><c:out value="${ab.champion}"/></td>
			<td><c:out value="${ab.name}" /></td>
			<td><c:out value="${ab.description}"/></td>
			<td><c:out value="${ab.effect }"/></td>
			<td><c:out value="${ab.cost }"/></td>
			<td><c:out value="${ab.range }"/></td>
			<td><form action="/removeById" method="get">
                <input type="hidden" name="id" value="${ab.id}" />
                <input type="hidden" name="table" value="CHAMPION_ABILITIES" />
                <input type="hidden" name="servlet" value="/listAbilities" />
                <input type="submit" value="Remove" name="remove">
            </form></td> 	
		</tr>
	</c:forEach>
</table>

</body>
</html>