<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help4Help</title>
</head>
<c:import url="WEB-INF/css/input.css"></c:import>
<body>

<div id = "div_input">
<form action="Cadastrar" method="Post">
Login: <input type= "text" name="login" required>
Senha: <input type= "password" name="senha" required><br>
Email: <input id = "email" type= "text" name="email" required/><br>
Nome: <input type= "text" name="nome" required/>
Telefone: <input type= "text" name="telefone" required/><br>
CPF: <input type= "text" name="cpf" required/>
Endereco: <input type= "text" name="endereco" required/><br>

<input type="submit" value="Cadastrar">
</form>
</div>
</body>
</html>