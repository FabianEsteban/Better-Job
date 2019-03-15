<%@ include file="/WEB-INF/views/postulante.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="../resources/static/css/intlTelInput.css">
<link href="../resources/static/css/curriculum.css" rel="stylesheet">
<title>Insert title here</title>
</head>
	<body>
		<section id="main-content">
      		<section class="wrapper">
<!--         		<h3><i class="fa fa-angle-right"></i> Curriculum</h3> -->
        		<!-- page start-->
<!--         		<div class="well"> -->
					<div id="product" display="none" data-prodnumber="${sessionScope.estado_curriculum}" /></div>
					<div id="product2" display="none" data-prodnumber="${sessionScope.usuario}" /></div>
<!-- 					<div class="col-md-12 col-md-offset-1 col-xs-12"> -->
					<div id="curriculum">
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
					
        			<form id="regForm" action="javascript: saveCurriculum()">
        			
        				<div class="tab"><h2>Antecedentes Personales</h2>
					    	<div class="col-md-6 col-xs-12">
					    		<div class="form-group" style="width: 100%;">
				            		<label>Nombre:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control obligatorio'" id="inputNombre" class="form-control obligatorio" required autofocus>
				                </div>
				                <div class="form-group" style="width: 100%;">
				                	<label>Rut:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control obligatorio'" id="inputRut" class="form-control obligatorio" onchange="checkRut(this)" required autofocus>
				                </div>
			            		<div class="form-group" style="width: 100%;">
				                	<label>Fecha de Nacimiento:</label>
				                	<input type="date" autocomplete="off" oninput="this.className='form-control'" id="inputNacimiento" class="form-control" required autofocus>
			                	</div>
			                	<div class="form-group" style="width: 100%;">
				                	<label>Pais:</label>
				                		<select id="inputPais" class="form-control" required autofocus>
										<option value="Chile" id="CL" selected>Chile</option> 								
									</select>
				                </div> 
				                <div class="form-group" style="width: 100%;">
				                	<label>Estado Civil:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputEstado_civil" class="form-control" required autofocus>
				                </div>
					    	</div>
					    	<div class="col-md-6 col-xs-12">
				                <div class="form-group" style="width: 100%;">
				                	<label>Dirección:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputDireccion" class="form-control" required autofocus>
				                </div> 
				                <div class="form-group" style="width: 100%;">
				                	<label>Region:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputRegion" class="form-control" required autofocus>
				                </div> 
				                <div class="form-group" style="width: 100%;">
				                	<label>Comuna:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputComuna" class="form-control" required autofocus>
				                </div>
				                <div class="form-group" style="width: 100%;">
				                	<label>Celular:</label><br>
				                	<input type="tel" autocomplete="off" oninput="this.className='form-control'" id="inputTelefono" class="form-control" required autofocus>
				                </div>  
				                <div class="form-group" style="width: 100%;">
				                	<label>Email:</label>
					                <input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputEmail" class="form-control" required autofocus>
					            </div>
	            			</div>
						</div>
						<div class="tab"><h2>Antecedentes Académicos</h2>
							<div class="col-md-6 col-xs-12">
								<h3>Educación Básica
								<button type="button" id="addRow" class="btn btn-xs">+</button>
								</h3>
								<div class="extraPersonTemplate">
   	 								<div class="controls controls-row">
										<div class="form-group" style="width: 100%;">
						                	<label>Nombre de la Institución:</label>
						                	<input name="institucion_basica" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputInstitucion_basica" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Años inicio/término:</label>
						                	<input name="anos_basica" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputAnos_basica" class="form-control" required autofocus>
							           	</div>
							    	</div>
							    </div>
					           	<div id="container"></div>
					       	</div>
					       	<div class="col-md-6 col-xs-12">
					           	<h3>Educación Media
					           		<button type="button" id="addRow2" class="btn btn-xs">+</button>
					           	</h3>
					           	<div class="extraPersonTemplate2">
   	 								<div class="controls controls-row">
										<div class="form-group" style="width: 100%;">
						                	<label>Nombre de la Institución:</label>
						                	<input name="institucion_media" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputInstitucion_media" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Años inicio/término:</label>
						                	<input name="anos_media" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputAnos_media" class="form-control" required autofocus>
							           	</div>
									</div>
								</div>
								<div id="container2"></div>
					      	</div>
					           	<br>
					       	<div class="col-md-6 col-xs-12">
					           	<h3>Estudios superiores - Pregrado
					           		<button type="button" id="addRow3" class="btn btn-xs">+</button>
					           	</h3>
								<div class="extraPersonTemplate3">
   	 								<div class="controls controls-row">
										<div class="form-group" style="width: 100%;">
						                	<label>Universidad:</label>
						                	<input name="universidad" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputUniversidad" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Carrera:</label>
						                	<input name="carrera" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputCarrera" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Años inicio/término:</label>
						                	<input name="ano_universidad" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputAnos_universidad" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Título:</label>
						                	<input name="titulo_universidad" type="text" autocomplete="off" oninput="this.className='form-control'" oninput="this.className='form-control'" id="inputTítulo" class="form-control" required autofocus>
							           	</div>
									</div>
								</div>
								<div id="container3"></div>
					       	</div>
					       	<div class="col-md-6 col-xs-12">
					           	<h3>Estudios superiores - Postgrados
					           		<button type="button" id="addRow4" class="btn btn-xs">+</button>
					           	</h3>
					           	<div class="extraPersonTemplate4">
   	 								<div class="controls controls-row">
										<div class="form-group" style="width: 100%;">
						                	<label>Universidad:</label>
						                	<input name="universidad_postgrado" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputUniversidad_postgrado" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Programa:</label>
						                	<input name="programa_postgrado" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputPostgrado" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Años inicio/término:</label>
						                	<input name="ano_postgrado" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputAnos_postgrado" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Título:</label>
						                	<input name="titulo_postgrado" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputTitulo_postgrado" class="form-control" required autofocus>
							           	</div>
									</div>
								</div>
								<div id="container4"></div>
							</div>
					           	<br>
					       	<div class="col-md-6 col-xs-12">
					           	<h3>Cursos
					           		<button type="button" id="addRow5" class="btn btn-xs">+</button>
					           	</h3>
					           	<div class="extraPersonTemplate5">
   	 								<div class="controls controls-row">
										<div class="form-group" style="width: 100%;">
						                	<label>Universidad:</label>
						                	<input name="universidad_curso" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputUniversidad_curso" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Nombre curso:</label>
						                	<input name="nombre_curso" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputNombre_curso" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>N° de hoars:</label>
						                	<input name="horas_curso" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputHoras_curso" class="form-control" required autofocus>
							           	</div>
							           	<div class="form-group" style="width: 100%;">
						                	<label>Años inicio/término:</label>
						                	<input name="ano_curso" type="text" autocomplete="off" oninput="this.className='form-control'" id="inputAnos_curso" class="form-control" required autofocus>
							           	</div>
									</div>
								</div>
								<div id="container5"></div>
							</div>
							<div class="col-md-6 col-md-offset-6 col-xs-12">
								<br>
							</div>
						</div>
						<div class="tab"><h2>Antecedentes Laborales</h2>
							<div class="col-md-6 col-xs-12">
								<h3>Experiencia</h3>
					           	<div class="form-group" style="width: 100%;">
				                	<label>Cargo:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputCargo_laboral" class="form-control" required autofocus>
					           	</div>
					           	<div class="form-group" style="width: 100%;">
				                	<label>Institución:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputInstitucion_laboral" class="form-control" required autofocus>
					           	</div>
					           	<div class="form-group" style="width: 100%;">
				                	<label>Años inicio/término:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputAnos_laboral" class="form-control" required autofocus>
					           	</div>
					           	<div class="form-group" style="width: 100%;">
				                	<label>Descripción general del cargo:</label>
				                	<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputDescripcion_laboral" class="form-control" required autofocus>
					           	</div>
					      	</div>
					      	<div class="col-md-6 col-xs-12">
					      		<h3>Recomendaciones</h3>
					      		<div class="form-group" style="width: 100%;">
			                		<label>Nombre:</label>
			                		<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputNombre_recomendacion" class="form-control" required autofocus>
				           		</div>
				           		<div class="form-group" style="width: 100%;">
			                		<label>Empresa:</label>
			                		<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputEmpresa_recomendacion" class="form-control" required autofocus>
				           		</div>
				           		<div class="form-group" style="width: 100%;">
			                		<label>Teléfono:</label>
			                		<input type="text" autocomplete="off" oninput="this.className='form-control'" id="inputTelefono_recomendacion" class="form-control" required autofocus>
				           		</div>
				           		<div class="form-group" style="width: 100%;">
			                		<label>Email:</label>
			                		<input type="email" autocomplete="off" oninput="this.className='form-control'" id="inputEmail_recomendacion" class="form-control" required autofocus>
				           		</div>
					      	</div>
					      	<div class="col-md-6 col-xs-12">
					           	<br>
						      	<h3>Disponibilidad</h3>
								<div class="form-group" style="width: 100%;">
				                	<label>N° de Días:</label>
				                	<input type="number" autocomplete="off" oninput="this.className='form-control'" id="inputDias_disponibilidad" class="form-control" required autofocus>
					           	</div>
					      	</div>
					      	<div class="col-md-6 col-md-offset-6 col-xs-12">
								<br>
							</div>
					     </div>
<!-- 						<div style="overflow:auto;"> -->
<!-- 						<div class="col-md-6 col-md-offset-5 col-xs-12"> -->
							<div class="col-md-6 col-md-offset-6 col-xs-12">
								<br>
							</div>
						    <div style="float:right;">
						      <button type="button" id="prevBtn" onclick="nextPrev(-1)">Anterior</button>
						      <button type="button" id="nextBtn" onclick="nextPrev(1)">Siguiente</button>
						    </div>
<!-- 						  </div> -->
				            
		            	<!-- Circles which indicates the steps of the form: -->
		            	<div class="hidden-xs hidden-sm">
			            	<div style="float:left; position: relative; left: 46%;">
								<div style="text-align:center;">
								  <span class="step"></span>
								  <span class="step"></span>
								  <span class="step"></span>
								</div>
							</div>
						</div>
<!-- 						</div> -->
<!-- 		                <div class="form-actions" style="width: 50%;"> -->
<!-- 		                	<button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Registrar</button> -->
<!-- 		                </div> -->
					
					</form><!-- /form -->
					
<!-- 					</div> -->
<!--         		</div> -->
				<!-- page end-->
			</section>
      	<!-- /wrapper -->
    	</section>
    	<script src="../resources/static/js/intlTelInput.min.js"></script>
    	<script src="../resources/static/js/utils.js"></script>
    	
		<script>
		
		
		var currentTab = 0; // Current tab is set to be the first tab (0)
		showTab(currentTab); // Display the crurrent tab

		function showTab(n) {
			  // This function will display the specified tab of the form...
			  var x = document.getElementsByClassName("tab");
			  x[n].style.display = "block";
			  //... and fix the Previous/Next buttons:
			  if (n == 0) {
			    document.getElementById("prevBtn").style.display = "none";
			  } else {
			    document.getElementById("prevBtn").style.display = "inline";
			  }
			  if (n == (x.length - 1)) {
			    document.getElementById("nextBtn").innerHTML = "Finalizar";
			  } else {
			    document.getElementById("nextBtn").innerHTML = "Siguiente";
			  }
			  //... and run a function that will display the correct step indicator:
			  fixStepIndicator(n)
			}

			function nextPrev(n) {
			  // This function will figure out which tab to display
			  var x = document.getElementsByClassName("tab");
			  // Exit the function if any field in the current tab is invalid:
			  if (n == 1 && !validateForm()) return false;
			  // Hide the current tab:
			  x[currentTab].style.display = "none";
			  // Increase or decrease the current tab by 1:
			  currentTab = currentTab + n;
			  // if you have reached the end of the form...
			  if (currentTab >= x.length) {
			    // ... the form gets submitted:
			    document.getElementById("regForm").submit();
			    return false;
			  }
			  // Otherwise, display the correct tab:
			  showTab(currentTab);
			}

			function validateForm() {
			  // This function deals with validation of the form fields
			  var x, y, i, valid = true;
			  x = document.getElementsByClassName("tab");
			  y = x[currentTab].getElementsByTagName("input");
			  // A loop that checks every input field in the current tab:
			  for (i = 0; i < y.length; i++) {
			    // If a field is empty...
			    if (y[i].value == "" && y[i].classList.contains("obligatorio")) {
			      // add an "invalid" class to the field:
			      y[i].className += " invalid";
			      // and set the current valid status to false
			      valid = false;
			    }
			  }
			  // If the valid status is true, mark the step as finished and valid:
			  if (valid) {
			    document.getElementsByClassName("step")[currentTab].className += " finish";
			  }
			  return valid; // return the valid status
			}

			function fixStepIndicator(n) {
			  // This function removes the "active" class of all steps...
			  var i, x = document.getElementsByClassName("step");
			  for (i = 0; i < x.length; i++) {
			    x[i].className = x[i].className.replace(" active", "");
			  }
			  //... and adds the "active" class on the current step:
			  x[n].className += " active";
			}
			
			
		</script>
</html>