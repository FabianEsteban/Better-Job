<%@ include file="/WEB-INF/views/empresa.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="../resources/static/css/admin_curriculum.css" rel="stylesheet">
<link href="../resources/static/css/jquery.dataTables.min.css" rel="stylesheet">
<script src="//cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.js"></script>

<title>Insert title here</title>
</head>
<body>
	<section id="main-content">
		<section class="wrapper">
			<div id="regForm">
				<input type="text" id="empresa" value="${rut}" style="display: none;">
				<div class="col-xs-12 col-sm-12 portlet light bordered" style="width: 100%; padding-bottom: 40px;">
					<h4>Filtros</h4>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<h5>RUT:</h5>
						<div style="width: 100%;">
							<input id="filtroRut" type="text" class="form-control input-md" style="float: right;">
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<h5>Universidad:</h5>
						<div style="width: 100%;">
							<select id="filtroUniversidad" class="form-control input-md" style="float: right;">
							</select>
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<h5>Carrera:</h5>
						<div style="width: 100%;">
							<select id="filtroCarrera" class="form-control input-md" style="float: right;">
							</select>
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<button class="btn btn-md btn-primary btn-block btn-signin" style="margin-top: 35px;" onclick="loadData()">Todos</button>
					</div>
				</div>


				<table id="Table_curriculums" class="table table-striped table-bordered" cellspacing="0" width="100%"></table>

				
				
			</div>
		</section>
	</section>
	<script type="text/javascript">
	
	
	var table = $('#Table_curriculums').DataTable({
// 		data: tbl,
		scrollY: "200px",
		responsive: true,
		paging: true,
		sPaginationType: "full_numbers", 
		columns: [
			{ title: "Nombre" },
			{ title: "Rut" },
			{ title: "Carrera" },
			{ title: "Universidad" },
			{ title: "Disponibilidad" },
			{ title: "Currículum" },
			{ title: "Evaluación" },
			{ title: "Seleccionar" }
		],
		"filter": false
	});
	
	$("#filtroRut").on( "keyup", function () {
		document.getElementById('filtroUniversidad').value = 0;
		document.getElementById('filtroCarrera').value = 0;
		if(this.value === ""){
// 			privilegio = 0;
			loadData();
		}
	    rut = this.value;
	    loadRut();
	} );
	
	$("#filtroUniversidad").change(function(){
		cod_universidad = $("#filtroUniversidad").val();
		document.getElementById('filtroCarrera').value = 0;
		document.getElementById('filtroRut').value = '';
		loadFiltroUniversidad();
	});
	
	$("#filtroCarrera").change(function(){
		cod_carrera = $("#filtroCarrera").val();
		document.getElementById('filtroUniversidad').value = 0;
		document.getElementById('filtroRut').value = '';
		loadFiltroCarrera();
	});

	
	</script>
</body>
</html>