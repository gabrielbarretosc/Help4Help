<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de usuários</title>
</head>
<body>
<table>
<tr>
<th> Nome </th>
<th> Telefone </th>
<th> CPF </th>
<th> Endereço </th>
</tr>
<c:forEach var="c" items="${listaUsuario}">
<tr>
<td>${c.nome}</td>
<td>${c.telefone}</td>
<td>${c.cpf}</td>
<td>${c.endereco}</td>
</tr>
</c:forEach>
</table>>

</body>
</html>