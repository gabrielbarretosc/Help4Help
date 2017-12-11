<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Help4Help</title>
</head>

<c:import url="topo.jsp"></c:import>
<c:import url="background.jsp"></c:import>

<body>
<div class="w3-display-middle">
<h1>EDITAR PERFIL</h1><br>		
<form action="usuarios" method="post">
			<input type="hidden" name="id" value="${usuarios.id}"> 
			Nome:<input type="text" name="nome" value="${usuarios.nome}" /><br>
			Login:<input type="text" name="login" value="${usuarios.login}" /><br> 		 
			Senha:<input type="text" name="senha" value="${usuarios.senha}" /><br> 
			<input type="submit" value="Salvar" />  
	</form>
</div>


</body>
</html>