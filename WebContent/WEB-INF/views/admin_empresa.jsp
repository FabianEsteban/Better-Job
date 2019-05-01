<%@ include file="/WEB-INF/views/empresa.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../resources/static/css/admin_empresa.css" rel="stylesheet">
<link href="../resources/static/css/loading.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<section id="main-content">
      		<section class="wrapper">
<!--         		<h3><i class="fa fa-angle-right"></i> Perfil</h3> -->
				<input style="display:none;" value = "${rut}" id = "rut">
        		<!-- page start-->
        		<div class="col-md-10 col-md-offset-2 col-xs-12">
        			<label id ="fechaEdit">
        				<span>Última actualización de curriculum:</span>
        				<span id="fecha_edit"></span>
        				<span> días</span>
       				</label>
        			<div id="carnet">
	        			<div class="col-md-6 com-xs-12">
	        				<label>
								<span>Nombre:</span>
								<span id="nombre"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarNombre()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Rut:</span>
								<span id="rut"></span>
							</label>
							<br>
							<label>
								<span>Fecha de Nacimiento:</span>
								<span id="fecha_nacimiento"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarFecha()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Pais:</span>
								<span id="pais"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarPais()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
	        			</div>
        				<div class="col-md-6 com-xs-12">
        					<label>
								<span>Estado Civil:</span>
								<span id="estado_civil"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarEstado()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Dirección:</span>
								<span id="direccion"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarDireccion()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Teléfono:</span>
								<span id="telefono"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarTelefono()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Correo:</span>
								<span id="correo"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarCorreo()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
        				</div>
        			</div>
       			</div>
        		<!-- page end-->
			</section>
      	<!-- /wrapper -->
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
		
		</script>
</body>
</html>