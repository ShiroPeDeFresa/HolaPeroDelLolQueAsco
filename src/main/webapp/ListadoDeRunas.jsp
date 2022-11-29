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
		<td>Id</td>
		<td>Tier</td>
		<td>Nombre</td>
		<td>Descripcion</td>
	</tr>
	<c:forEach var="rune" items="${requestScope.runes}">
		<tr>
			<td><c:out value="${rune.id}" /></td>
			<td><c:out value="${rune.tier}" /></td>
			<td><c:out value="${rune.name}" /></td>
			<td><c:out value="${rune.description}"/></td>
			<td><form action="/removeById" method="get">
                <input type="hidden" name="id" value="${rune.id}" />
                <input type="hidden" name="table" value="RUNES" />
                <input type="hidden" name="servlet" value="/listRunes" />
                <input type="submit" value="Remove" name="remove">
            </form></td> 
		</tr>
	</c:forEach>
</table>

</body>
</html>