<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help4Help</title>
</head>
<c:import url="WEB-INF/css/inputdoa.css"></c:import>
<body>

<div id = "div_input">
<form action="CadastrarDoacao" method="Post">
Data de hoje: <input type= "text" name="data"/>
Instituic�o:<select name="instituicao" >
			<option value="" selected>Selecione</option>
			<c:forEach var="s" items="${listaInstituicao}">
				<option value="${s.id}">${s.nome}</option>
			</c:forEach>
		</select><br>
Tipo de Doa��o:<select name="tipoDoacao" >
			<option value="Dinheiro" selected>Dinheiro</option>
						<option value="Alimento" selected>Alimento</option>
		</select><br>
Quantidade:<input type= "text" name="quantidade"/>
<input type="submit" value="Doar">
</form>
</div>
</body>
</html>