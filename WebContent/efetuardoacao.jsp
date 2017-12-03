<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Help4Help</title>

</head>
<c:import url="topo.jsp"></c:import>
<c:import url="background.jsp"></c:import>
<body>
<div class="w3-display-middle container">
<jsp:include page = "formDoacao.jsp" />
</div>
</body>

<c:import url="rodape.jsp"></c:import>
<c:import url="WEB-INF/css/footer.css"></c:import>
</html>