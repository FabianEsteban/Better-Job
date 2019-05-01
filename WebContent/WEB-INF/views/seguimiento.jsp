<%@ include file="/WEB-INF/views/postulante.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../resources/static/css/seguimiento.css" rel="stylesheet">
<link href="../resources/static/css/loading.css" rel="stylesheet">
<link href="../resources/static/css/jquery.dataTables.min.css" rel="stylesheet">
<script src="//cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.js"></script>
<title>Insert title here</title>
</head>
<body>
	<section id="main-content">
		<section class="wrapper">
			<div id="regForm">
				<h2>Ofertas</h2>
				<input style="display: none;" id="postulante" value="${id}">
				<table id="Table_seguimiento" class="table table-striped table-bordered" cellspacing="0" width="100%"></table>
			</div>
		</section>
	</section>
	<div id="custom-overlay">
   		<div class="loading-spinner">
     
   		</div>
   	</div>
	<script type="text/javascript">

		$('body').loading({
			  stoppable: false,
			  overlay: $("#custom-overlay")
		});
	

	
	var table = $('#Table_seguimiento').DataTable({
		scrollY: "200px",
		responsive: true,
		paging: true,
		sPaginationType: "full_numbers", 
		columns: [
			{ title: "Empresa" },
			{ title: "Giro" },
			{ title: "Dirección" },
			{ title: "Comuna" },
			{ title: "Correo" },
			{ title: "Contacto" },
			{ title: "Fecha" },
		],
		"filter": false
	});	

	</script>
</body>
</html>