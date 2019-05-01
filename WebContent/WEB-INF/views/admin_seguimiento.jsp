<%@ include file="/WEB-INF/views/admin.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <script src="../resources/static/js/admin_seguimiento.js" type="text/javascript"></script> -->
<link href="../resources/static/css/admin_seguimiento.css" rel="stylesheet">
<link href="../resources/static/css/loading.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<input type="text" id="rut" value="${rut}">
	
		<section id="main-content">
      		<section class="wrapper">
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
								<span id="nombreAP"></span>
							</label>
							<br>
							<label>
								<span>Rut:</span>
								<span id="rutAP"></span>
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
						<div class="col-md-6 com-xs-12" style="display:none;" id="basica2">
							<h3>Educación Básica 2</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_basica2"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarInstitucion_basica2()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_basica2"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="basica3">
							<h3>Educación Básica 3</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_basica3"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarInstitucion_basica3()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_basica3"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="basica4">
							<h3>Educación Básica 4</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_basica4"></span>&nbsp&nbsp&nbsp<button onclick="javascript: editarInstitucion_basica4()" class="btn btn-info btn-xs edit"><span class="glyphicon glyphicon-edit"></span></button>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_basica4"></span>
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
						<div class="col-md-6 com-xs-12" style="display:none;" id="media2">
							<h3>Educación Media 2</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_media2"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_media2"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="media3">
							<h3>Educación Media 3</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_media3"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_media3"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="media4">
							<h3>Educación Media 4</h3>
							<label>
								<span>Institución:</span>
								<span id="institucion_media4"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_media4"></span>
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
						<div class="col-md-6 com-xs-12" style="display:none;" id="universitaria2">
							<h3>Estudios superiores - Pregrado 2</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_pregrado2"></span>
							</label>
							<br>
							<label>
								<span>Carrera:</span>
								<span id="carrera_pregrado2"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_pregrado2"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_pregrado2"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="universitaria3">
							<h3>Estudios superiores - Pregrado 3</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_pregrado3"></span>
							</label>
							<br>
							<label>
								<span>Carrera:</span>
								<span id="carrera_pregrado3"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_pregrado3"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_pregrado3"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="universitaria4">
							<h3>Estudios superiores - Pregrado 4</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_pregrado4"></span>
							</label>
							<br>
							<label>
								<span>Carrera:</span>
								<span id="carrera_pregrado4"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_pregrado4"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_pregrado4"></span>
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
						<div class="col-md-6 com-xs-12" style="display:none;" id="postgrado2">
							<h3>Estudios superiores - Postgrado 2</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_postgrado2"></span>
							</label>
							<br>
							<label>
								<span>Programa:</span>
								<span id="programa_postgrado2"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_postgrado2"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_postgrado2"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="postgrado3">
							<h3>Estudios superiores - Postgrado 3</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_postgrado3"></span>
							</label>
							<br>
							<label>
								<span>Programa:</span>
								<span id="programa_postgrado3"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_postgrado3"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_postgrado3"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none;" id="postgrado4">
							<h3>Estudios superiores - Postgrado 4</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_postgrado4"></span>
							</label>
							<br>
							<label>
								<span>Programa:</span>
								<span id="programa_postgrado4"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_postgrado4"></span>
							</label>
							<br>
							<label>
								<span>Título:</span>
								<span id="titulo_postgrado4"></span>
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
						<div class="col-md-6 com-xs-12" style="display: none;" id="cursos2">
							<h3>Cursos 2</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_curso2"></span>
							</label>
							<br>
							<label>
								<span>Nombre curso:</span>
								<span id="nombre_curso2"></span>
							</label>
							<br>
							<label>
								<span>N° de horas:</span>
								<span id="horas_curso2"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_curso2"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display: none;" id="cursos3">
							<h3>Cursos 3</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_curso3"></span>
							</label>
							<br>
							<label>
								<span>Nombre curso:</span>
								<span id="nombre_curso3"></span>
							</label>
							<br>
							<label>
								<span>N° de horas:</span>
								<span id="horas_curso3"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_curso3"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display: none;" id="cursos4">
							<h3>Cursos 4</h3>
							<label>
								<span>Universidad:</span>
								<span id="institucion_curso4"></span>
							</label>
							<br>
							<label>
								<span>Nombre curso:</span>
								<span id="nombre_curso4"></span>
							</label>
							<br>
							<label>
								<span>N° de horas:</span>
								<span id="horas_curso4"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_curso4"></span>
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
						<div class="col-md-6 com-xs-12" style="display:none" id="antecedentes2">
							<h3>Experiencia 2</h3>
							<label>
								<span>Cargo:</span>
								<span id="cargo2"></span>
							</label>
							<br>
							<label>
								<span>Institución:</span>
								<span id="institucion_laboral2"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_laboral2"></span>
							</label>
							<br>
							<label>
								<span>Descripción general del cargo:</span>
								<span id="descripcion_laboral2"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none" id="antecedentes3">
							<h3>Experiencia 3</h3>
							<label>
								<span>Cargo:</span>
								<span id="cargo3"></span>
							</label>
							<br>
							<label>
								<span>Institución:</span>
								<span id="institucion_laboral3"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_laboral3"></span>
							</label>
							<br>
							<label>
								<span>Descripción general del cargo:</span>
								<span id="descripcion_laboral3"></span>
							</label>
						</div>
						<div class="col-md-6 com-xs-12" style="display:none" id="antecedentes4">
							<h3>Experiencia 4</h3>
							<label>
								<span>Cargo:</span>
								<span id="cargo4"></span>
							</label>
							<br>
							<label>
								<span>Institución:</span>
								<span id="institucion_laboral4"></span>
							</label>
							<br>
							<label>
								<span>Años inicio/término:</span>
								<span id="anos_laboral4"></span>
							</label>
							<br>
							<label>
								<span>Descripción general del cargo:</span>
								<span id="descripcion_laboral4"></span>
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
			</section>
			<div style="float: right; margin-right:20px;"><button class="btn btn-md btn-primary btn-block btn-signin" type="submit" id="guardar" onclick="guardar()">Guardar</button></div>
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