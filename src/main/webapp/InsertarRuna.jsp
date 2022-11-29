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
<form action="/insertRune" method="post">
		<span>Id</span> <input type="text" id="id" name="id"/>
		<span>Tier</span>
			<select name="tier" id="tier">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
					  
			</select>
		<span>Nombre</span><input type="text" id="name" name="name" />
		<span>Descripcion</span><input type="text" id="descripction" name="description"/>
		<input type="submit" value="enviar" />
	</form>

</body>
</html>