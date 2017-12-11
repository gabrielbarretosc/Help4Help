<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de usuários</title>
</head>
<body>
<c:import url="topo.jsp"></c:import>
<c:import url="background.jsp"></c:import>
<c:import url="WEB-INF/css/tables.css"></c:import>
<table id="customers">
<tr>
<th> Nome </th>
<th> Telefone </th>
<th> CPF </th>
<th> Endereço </th>
</tr>
<c:forEach var="c" items="${listaUsuario}">
<tr>
<td><a href = "/help4help/usuarios?q=editar&id=${e.id}">${c.nome}</a></td>
<td>${c.telefone}</td>
<td>${c.cpf}</td>
<td>${c.endereco}</td>
</tr>
</c:forEach>
</table>>

</body>
</html>