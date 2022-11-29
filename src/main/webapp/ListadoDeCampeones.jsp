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
	
	<c:forEach var="champ" items="${requestScope.champs}">	
		<tr> 			
  			<td><c:out value="${champ.name}"/></td>
  			
  			<td><c:out value="${champ.title}"/></td>
  			
  			<td><c:out value="${champ.lore}"/></td>
  			
  			<td><c:out value="${champ.tags}"/></td>
			<td><form action="/removeById" method="get">
                <input type="hidden" name="id" value="${champ.id}" />
                <input type="hidden" name="table" value="CHAMPIONS" />
                <input type="hidden" name="servlet" value="/listChampions" />
                <input type="submit" value="Remove" name="remove">
            </form></td> 	
		</tr>
	</c:forEach>

</table>

</body>
</html>