<%@ include file="/WEB-INF/views/admin.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="../resources/static/css/mantenedor_universidades.css" rel="stylesheet">
<link href="../resources/static/css/jquery.dataTables.min.css" rel="stylesheet">
<script src="//cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.js"></script>

<!-- 	Loading -->
<!-- <script src="../resources/static/js/jquery.loading.js"></script> -->
<link href="../resources/static/css/loading.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>
	<section id="main-content">
		<section class="wrapper">
			<div id="regForm">
			
				<div class="col-xs-12 col-sm-12 portlet light bordered" style="width: 100%; padding-bottom: 40px;">
					<h4>Universidades</h4>
					<div class="col-xs-3 col-sm-3 col-md-3">
						<div style="width: 100%;">
							<button id="addUsuario" style="margin-top: 40px;" onclick='javascript: addUsuario()'><span class="fa fa-plus"></span></button>
						</div>
					</div>
				</div>
				

				<table id="Table_universidad" class="table-responsive table table-striped table-bordered" cellspacing="0" width="100%"></table>

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
	
	var table = $('#Table_universidad').DataTable({
		scrollY: "300px",
		responsive: false,
		paging: true,
		sPaginationType: "full_numbers", 
		columns: [
			{ title: "Universidad" },
			{ title: "Editar" },
		],
		"filter": false
	});
	
	</script>
</body>
</html>