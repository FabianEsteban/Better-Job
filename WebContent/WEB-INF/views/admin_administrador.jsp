<%@ include file="/WEB-INF/views/admin.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="../resources/static/css/admin_administrador.css" rel="stylesheet">
<link href="../resources/static/css/jquery.dataTables.min.css" rel="stylesheet">
<script src="//cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.js"></script>


<title>Insert title here</title>
</head>
<body>
	<section id="main-content">
		<section class="wrapper">
			<div id="regForm">
			
				<div class="col-xs-12 col-sm-12 portlet light bordered" style="width: 100%; padding-bottom: 40px;">
					<h4>Filtros</h4>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<h5>Privilegio:</h5>
						<div style="width: 100%;">
							<select id="filtroPrivilegios" class="form-control input-md" style="float: right;">
								<option value = 0>Todos</option>
								<option value = "empresa">Empresa</option>
								<option value = "administrador">Administrador</option>
								<option value = "postulante">Postulante</option>
							</select>
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<h5>RUT:</h5>
						<div style="width: 100%;">
							<input id="filtroRut" type="text" class="form-control input-md" style="float: right;">
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<div style="width: 100%;">
							<button id="addUsuario" style="margin-top: 40px;" onclick='javascript: addUsuario()'><span class="fa fa-plus"></span></button>
						</div>
					</div>
					
				</div>
				

				<table id="Table_cuentas" class="table-responsive table table-striped table-bordered" cellspacing="0" width="100%"></table>

			</div>
		</section>
	</section>
	<script type="text/javascript">
	var table = $('#Table_cuentas').DataTable({
//		data: tbl,
		scrollY: "200px",
		responsive: false,
		paging: true,
		sPaginationType: "full_numbers", 
		columns: [
			{ title: "Usuario" },
			{ title: "Correo" },
			{ title: "Privilegio" },
			{ title: "Estado" },
			{ title: "Editar" },
		],
		"filter": false
	});
	
	$("#filtroPrivilegios").change(function(){
		$("#filtroRut").val("");
		privilegio = $("#filtroPrivilegios").val();
		loadData();
	});
	$("#filtroRut").on( "keyup", function () {
		document.getElementById('filtroPrivilegios').value = 0;
		if(this.value === ""){
			privilegio = 0;
			loadData();
		}
	    rut = this.value;
	    loadRut();
	} );
	</script>
</body>
</html>