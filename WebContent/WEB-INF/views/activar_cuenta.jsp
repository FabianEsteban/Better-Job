<%@ include file="/WEB-INF/views/activar.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="../resources/static/css/activar_cuenta.css" rel="stylesheet">
<link href="../resources/static/css/jquery.dataTables.min.css" rel="stylesheet">
<script src="//cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.js"></script>

<title>Insert title here</title>
</head>
<body>
	<section id="main-content">
		<section class="wrapper">
			<div id="product2" display="none" data-prodnumber="${sessionScope.usuario}" /></div>
			<div id="regForm">
				<form class="login-form" action="javascript: saveNewPass()">
					 <div class="row">
						<h4>CAMBIO DE CONTRASEÑA</h4>
						<div class="col-xs-3 col-sm-3 col-md-3">
							<h5>Contraseña actual:</h5>
							<input id="passActual" type="password" class="form-control input-md">
						</div>
					</div>
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<h5>Nueva Contraseña:</h5>
							<div style="width: 100%;">
								<input id="newPass" type="password" class="form-control input-md">
							</div>
						</div>
							
						<div class="col-xs-3 col-sm-3 col-md-3">
							<h5>Repetir nueva contraseña:</h5>
							<div style="width: 100%;">
								<input id="newPass2" type="password" class="form-control input-md">
							</div>
						</div>
						<div class="col-xs-offset-2 col-xs-2 col-sm-offset-2 col-sm-2 col-md-offset-2 col-md-2">
							<button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Guardar</button>
						</div>
					</div>

				</form>
			</div>
		</section>
	</section>
</body>
</html>