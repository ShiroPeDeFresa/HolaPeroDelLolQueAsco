<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/insertTip" method="post">
	<span>Id</span> <input type="text" id="id" name="id"/>
	<span>Champion</span>	 
		<select name="champion" id="champion">
			  	<c:forEach var="champion" items="${requestScope.champions}">
					<option value="${champion.id}">${champion.name}</option>
				</c:forEach> 
		</select> 
	<span>Tip</span><input type="text" id="tip" name="tip" />
	<input type="submit" value="enviar" />
</form>

</body>
</html>