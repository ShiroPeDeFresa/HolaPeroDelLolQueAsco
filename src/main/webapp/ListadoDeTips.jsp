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
		<td>Champion</td>
		<td>Tip</td>
	</tr>
	<c:forEach var="tipv" items="${requestScope.tips}">
		<tr>
			<td><c:out value="${tipv.id}" /></td>
			<td><c:out value="${tipv.champion}" /></td>
			<td><c:out value="${tipv.tip}" /></td>
			<td><form action="/removeById" method="get">
                <input type="hidden" name="id" value="${tipv.id}" />
                <input type="hidden" name="table" value="CHAMPION_TIPS" />
                <input type="hidden" name="servlet" value="/listTips" />
                <input type="submit" value="Remove" name="remove">
            </form></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>