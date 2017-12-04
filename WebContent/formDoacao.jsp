<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help4Help</title>
</head>
<c:import url="WEB-INF/css/inputdoa.css"></c:import>
<body>

<div id = "div_input">
<form action="doacoes" method="post">
Instituicão:<select name="instituicao" >
			<option value="" selected>Selecione</option>
			<c:forEach var="instituicao" items="${listaInstituicao}">
			<option value="${instituicoes.id}">${isntituicoes.nome}</option>
			</c:forEach>
			</select>
			<br>
Tipo de Doação:<select name="tipoDoacao" >
			<option value="Dinheiro" selected>Dinheiro</option>
			<option value="Alimento" selected>Alimento</option>
		</select><br>
Quantidade:<input type= "text" name="quantidade"/>
<input type="submit" value="Doar">
</form>
</div>
</body>
<script>
   function alert () {
      alert( "Cadastrado com sucesso!" );
  }
</script>
<button onclick="alert()"></button>


</html>