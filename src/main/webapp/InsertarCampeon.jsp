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
<form action="/insertChamp" method="post">
		<span>Id</span> <input type="text" id="id" name="id"/>
		<span>Name</span><input type="text" id="name" name="name" /> 
		<span>Title</span><input type="text" id="title" name="title" />
		<span>Lore</span><input type="text" id="lore" name="lore"/>
		<span>Tags</span><input type="text" id="tags" name="tags"/>
		<input type="submit" value="enviar" />
	</form>

</body>
</html>