<%@ include file="/WEB-INF/views/admin.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <script src="../resources/static/js/admin_seguimiento.js" type="text/javascript"></script> -->
<link href="../resources/static/css/admin_seguimiento.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<input type="text" id="rut" value="${rut}">
	
		<section id="main-content">
      		<section class="wrapper">
<!--       			<div class="col-md-12 col-md-offset-1 col-xs-12"> -->
					<div id="curriculum">
						<div id="cover">
							  <div id="stars">
							    <input type="radio" name="rating" class="rb" id="_3" onclick = "threestars()">
							    <i class="fa fa-star" aria-hidden="true"></i>
							
							    <input type="radio" name="rating" class="rb" id="_2" onclick = "twostars()">
							    <i class="fa fa-star" aria-hidden="true"></i>
							
							    <input type="radio" name="rating" class="rb" id="_1" onclick = "onestars()">
							    <i class="fa fa-star" aria-hidden="true"></i>
							
<!-- 							    <input type="radio" name="rating" class="rb" id="_4"> -->
<!-- 							    <i class="fa fa-star" aria-hidden="true"></i> -->
							
<!-- 							    <input type="radio" name="rating" class="rb" id="_5"> -->
<!-- 							    <i class="fa fa-star" aria-hidden="true"></i> -->
							  </div>
						</div>
						<h2>Antecedentes Personales</h2>
						<div class="col-md-6 com-xs-12">
							<label>
								<span>Nombre:</span>
								<span id="nombre"></span>
							</label>
							<br>
							<label>
								<span>Rut:</span>
								<span id="rut"></span>
							</label>
							<br>
							<label>
								<span>Fecha de Nacimiento:</span>
								<span id="fecha_nacimiento"></span>
							</label>
							<br>
							<label>
								<span>Pais:</span>
								<span id="pais"></span>
							</label>
							<br>
							<label>
								<span>Estado Civil:</span>
								<span id="estado_civil"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12">
							<label>
								<span>Dirección:</span>
								<span id="direccion"></span>
							</label>
							<br>
							<label>
								<span>Región:</span>
								<span id="region"></span>
							</label>
							<br>
							<label>
								<span>Comuna:</span>
								<span id="comuna"></span>
							</label>
							<br>
							<label>
								<span>Celular:</span>
								<span id="telefono"></span>
							</label>
							<br>
							<label>
								<span>Email:</span>
								<span id="email"></span>
							</label>
						</div>
						<div class="col-md-12 com-xs-12">
							<h2>Antecedentes Académicos</h2>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Educación Básica</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_basica"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarInstitucion_basica()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_basica"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Educación Media</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_media"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_media"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Estudios superiores - Pregrado</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_pregrado"></span>
							</label>
							<br>
							<label>
								<span>Carrera:</span>
								<span id="carrera_pregrado"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_pregrado"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_pregrado"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Estudios superiores - Postgrado</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_postgrado"></span>
							</label>
							<br>
							<label>
								<span>Programa:</span>
								<span id="programa_postgrado"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_postgrado"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_postgrado"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Cursos</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_curso"></span>
							</label>
							<br>
							<label>
								<span>Nombre curso:</span>
								<span id="nombre_curso"></span>
							</label>
							<br>
							<label>
								<span>N° de horas:</span>
								<span id="horas_curso"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_curso"></span>
							</label>
						</div>
						<div class="col-md-12 com-xs-12">
							<h2>Antecedentes Laborales</h2>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Experiencia</h3>
							<label>
								<span>Cargo:</span>
								<span id="cargo"></span>
							</label>
							<br>
							<label>
								<span>Institución:</span>
								<span id="institucion_laboral"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_laboral"></span>
							</label>
							<br>
							<label>
								<span>Descripción general del cargo:</span>
								<span id="descripcion_laboral"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Recomendaciones</h3>
							<label>
								<span>Nombre:</span>
								<span id="nombre_recomendacion"></span>
							</label>
							<br>
							<label>
								<span>Empresa:</span>
								<span id="empresa_recomendacion"></span>
							</label>
							<br>
							<label>
								<span>Teléfono:</span>
								<span id="telefono_recomendacion"></span>
							</label>
							<br>
							<label>
								<span>Email:</span>
								<span id="email_recomendacion"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12">
							<h3>Disponibilidad</h3>
							<label>
								<span>N° de días:</span>
								<span id="dias_disponibilidad"></span>
							</label>
						</div>
					</div>
<!-- 				</div> -->
			</section>
			<div style="float: right; margin-right:20px;"><button class="btn btn-md btn-primary btn-block btn-signin" type="submit" id="guardar" onclick="guardar()">Guardar</button></div>
		</section>

</body>
</html>