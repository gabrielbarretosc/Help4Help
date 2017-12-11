<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EFETUAR DOAÇÃO</title>
</head>
<c:import url="WEB-INF/css/inputdoa.css"></c:import>
<body>
	<c:import url="topo.jsp"></c:import>
	<c:import url="background.jsp"></c:import>
	
	<div id="div_input" class="w3-display-middle">
		<form action="CadastrarDoacao" method="Post">
			<input id="doador" type="hidden" name="usuario" value="12">
			Data de hoje: <input type="text" name="data"><br>
			Instituicão:<select name="instituicao">
				<option value="" selected>Selecione</option>
				<c:forEach var="s" items="${listaInstituicao}">
					<option value="${s.id}">${s.nome}</option>
				</c:forEach>
			</select><br> Tipo de Doação:<select name="tipoDoacao">
				<option value="Dinheiro" selected>Dinheiro</option>
				<option value="Alimento" selected>Alimento</option>
			</select><br> Quantidade:<input type="text" name="quantidade" /> <input
				type="submit" value="Doar">
		</form>
	</div>
	<c:import url="rodape.jsp"></c:import>
	<c:import url="WEB-INF/css/footer.css"></c:import>
</body>
<script language=javascript type="text/javascript">
	var data = new Date();
	var dia = data.getDate(); // 1-31
	var mes = data.getMonth(); // 0-11 (zero=janeiro)
	var ano4 = data.getFullYear(); // 4 dígitos
	var str_data = dia + '/' + (mes + 1) + '/' + ano4;
	document.write('Data de hoje: (Só copiar a data!) ' + str_data);
</script>
</html>