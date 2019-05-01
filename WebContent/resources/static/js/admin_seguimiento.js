$(document).ready(function(){	
	loadData();
});

var arrayData = "";
var rating = 0;
var rut;

function guardar(){
	if (rating == 0){
		alertaWarning("Recuerda calificar el curriculum.");
	}
	else{
		var datos = {
				rut: rut,
				evaluacion: rating
		}
		
		$.ajax({
			url: "/springapp/titulo/fabian/updateEvaluacion/",
			type:	"PUT",
			data: JSON.stringify(datos),
			beforeSend: function(xhr){
				xhr.setRequestHeader("Accept", "application/json");
				xhr.setRequestHeader("Content-Type", "application/json");
			},
			success: function (data) {
				alertaSuccess("Curriculum actualizado exitosamente");
				location.href = 'admin_curriculum';
		    }
		})
	}
	
	
}
function onestars(){
	rating = 1
}
function twostars(){
	rating = 2
}
function threestars(){
	rating = 3
}
var arrayData = "";
var dataBasica = "";
var dataMedia = "";
var dataUniversitaria = "";
var dataPostgrado = "";
var dataCursos = "";
var dataAntecedentes = "";
function loadData(){
	rut = document.getElementById("rut").value;
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRut/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        arrayData = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRutBasica/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        dataBasica = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRutMedia/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        dataMedia = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRutUniversitaria/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        dataUniversitaria = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRutPostgrado/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        dataPostgrado = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRutCursos/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        dataCursos = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRutAntecedentes/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        dataAntecedentes = data;
	    }
	})
	Mostrar();
}
function Mostrar(){
	$.each(arrayData, function(k, v) {
    	$("#nombreAP").html(v.nombre);
    	$("#rutAP").html(v.rut);
    	$("#fecha_nacimiento").html(v.fecha_nacimiento);
    	$("#pais").html(v.pais);
    	$("#estado_civil").html(v.estado_civil);
    	$("#direccion").html(v.direccion);
    	$("#region").html(v.region);
    	$("#comuna").html(v.comuna);
    	$("#telefono").html(v.telefono);
    	$("#email").html(v.correo);
    	$("#nombre_recomendacion").html(v.nombre_recomendacion);
    	$("#empresa_recomendacion").html(v.empresa_recomendacion);
    	$("#telefono_recomendacion").html(v.telefono_recomendacion);
    	$("#email_recomendacion").html(v.mail_recomendacion);
    	$("#dias_disponibilidad").html(v.disponibilidad);
	});
//	console.log(dataBasica)
	var contBasica = 0;
	var contMedia = 0;
	var contUniversitaria = 0;
	var contPostgrado = 0;
	var contCursos = 0;
	var contAntecedentes = 0;
	$.each(dataBasica, function(k, v) {		
		contBasica++;
		if(contBasica == 1){
			$("#institucion_basica").html(v.nombre_edu);
			$("#anos_basica").html(v.fecha_ini + "-" + v.fecha_final);
		}
		if(contBasica == 2){
			var x = document.getElementById("basica2");
	        x.style.display = "block";
			$("#institucion_basica2").html(v.nombre_edu);
			$("#anos_basica2").html(v.fecha_ini + "-" + v.fecha_final);
		}
		if(contBasica == 3){
			var x = document.getElementById("basica3");
	        x.style.display = "block";
			$("#institucion_basica3").html(v.nombre_edu);
			$("#anos_basica3").html(v.fecha_ini + "-" + v.fecha_final);
		}
		if(contBasica == 4){
			var x = document.getElementById("basica4");
	        x.style.display = "block";
			$("#institucion_basica4").html(v.nombre_edu);
			$("#anos_basica4").html(v.fecha_ini + "-" + v.fecha_final);
		}
	});
	$.each(dataMedia, function(k, v) {
		contMedia++;
		if(contMedia == 1){
			$("#institucion_media").html(v.nombre_edu);
			$("#anos_media").html(v.fecha_ini + "-" + v.fecha_final);
		}
		if(contMedia == 2){
			var x = document.getElementById("media2");
	        x.style.display = "block";
			$("#institucion_media2").html(v.nombre_edu);
			$("#anos_media2").html(v.fecha_ini + "-" + v.fecha_final);
		}
		if(contMedia == 3){
			var x = document.getElementById("media3");
	        x.style.display = "block";
			$("#institucion_media3").html(v.nombre_edu);
			$("#anos_media3").html(v.fecha_ini + "-" + v.fecha_final);
		}
		if(contMedia == 4){
			var x = document.getElementById("media4");
	        x.style.display = "block";
			$("#institucion_media4").html(v.nombre_edu);
			$("#anos_media4").html(v.fecha_ini + "-" + v.fecha_final);
		}
	});
	$.each(dataUniversitaria, function(k, v) {
		contUniversitaria++;
		if(contUniversitaria == 1){
			$("#institucion_pregrado").html(v.nombre_edu);
			$("#carrera_pregrado").html(v.carrera_edu);
			$("#anos_pregrado").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_pregrado").html(v.carrera_edu);
		}
		if(contUniversitaria == 2){
			var x = document.getElementById("universitaria2");
	        x.style.display = "block";
			$("#institucion_pregrado2").html(v.nombre_edu);
			$("#carrera_pregrado2").html(v.carrera_edu);
			$("#anos_pregrado2").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_pregrado2").html(v.carrera_edu);
		}
		if(contUniversitaria == 3){
			var x = document.getElementById("universitaria3");
	        x.style.display = "block";
			$("#institucion_pregrado3").html(v.nombre_edu);
			$("#carrera_pregrado3").html(v.carrera_edu);
			$("#anos_pregrado3").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_pregrado3").html(v.carrera_edu);
		}
		if(contUniversitaria == 4){
			var x = document.getElementById("universitaria4");
	        x.style.display = "block";
			$("#institucion_pregrado4").html(v.nombre_edu);
			$("#carrera_pregrado4").html(v.carrera_edu);
			$("#anos_pregrado4").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_pregrado4").html(v.carrera_edu);
		}
	});
	$.each(dataPostgrado, function(k, v) {
		contPostgrado++;
		if(contPostgrado == 1){
			$("#institucion_postgrado").html(v.nombre_edu);
			$("#programa_postgrado").html(v.carrera_edu);
			$("#anos_postgrado").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_postgrado").html(v.carrera_edu);
		}
		if(contPostgrado == 2){
			var x = document.getElementById("postgrado2");
	        x.style.display = "block";
	        $("#institucion_postgrado2").html(v.nombre_edu);
			$("#programa_postgrado2").html(v.carrera_edu);
			$("#anos_postgrado2").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_postgrado2").html(v.carrera_edu);
		}
		if(contPostgrado == 3){
			var x = document.getElementById("postgrado3");
	        x.style.display = "block";
	        $("#institucion_postgrado3").html(v.nombre_edu);
			$("#programa_postgrado3").html(v.carrera_edu);
			$("#anos_postgrado3").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_postgrado3").html(v.carrera_edu);
		}
		if(contPostgrado == 4){
			var x = document.getElementById("postgrado4");
	        x.style.display = "block";
	        $("#institucion_postgrado4").html(v.nombre_edu);
			$("#programa_postgrado4").html(v.carrera_edu);
			$("#anos_postgrado4").html(v.fecha_ini + "-" + v.fecha_final);
			$("#titulo_postgrado4").html(v.carrera_edu);
		}
	});
	$.each(dataCursos, function(k, v) {
		contCursos++;
		if(contCursos == 1){
			$("#institucion_curso").html(v.nombre_edu);
			$("#nombre_curso").html(v.carrera_edu);
			$("#horas_curso").html(v.horas_edu);
			$("#anos_curso").html(v.carrera_edu);
		}
		if(contCursos == 2){
			var x = document.getElementById("cursos2");
	        x.style.display = "block";
			$("#institucion_curso2").html(v.nombre_edu);
			$("#nombre_curso2").html(v.carrera_edu);
			$("#horas_curso2").html(v.horas_edu);
			$("#anos_curso2").html(v.carrera_edu);
		}
		if(contCursos == 3){
			var x = document.getElementById("cursos3");
	        x.style.display = "block";
			$("#institucion_curso3").html(v.nombre_edu);
			$("#nombre_curso3").html(v.carrera_edu);
			$("#horas_curso3").html(v.horas_edu);
			$("#anos_curso3").html(v.carrera_edu);
		}
		if(contCursos == 4){
			var x = document.getElementById("cursos4");
	        x.style.display = "block";
			$("#institucion_curso4").html(v.nombre_edu);
			$("#nombre_curso4").html(v.carrera_edu);
			$("#horas_curso4").html(v.horas_edu);
			$("#anos_curso4").html(v.carrera_edu);
		}
	});
	$.each(dataAntecedentes, function(k, v) {
		contAntecedentes++;
		if(contAntecedentes == 1){
			$("#cargo").html(v.cargo);
			$("#institucion_laboral").html(v.institucion);
			$("#anos_laboral").html(v.anos);
			$("#descripcion_laboral").html(v.descripcion);
		}
		if(contAntecedentes == 2){
			var x = document.getElementById("antecedentes2");
	        x.style.display = "block";
			$("#cargo2").html(v.cargo);
			$("#institucion_laboral2").html(v.institucion);
			$("#anos_laboral2").html(v.anos);
			$("#descripcion_laboral2").html(v.descripcion);
		}
		if(contAntecedentes == 3){
			var x = document.getElementById("antecedentes3");
	        x.style.display = "block";
			$("#cargo3").html(v.cargo);
			$("#institucion_laboral3").html(v.institucion);
			$("#anos_laboral3").html(v.anos);
			$("#descripcion_laboral3").html(v.descripcion);
		}
		if(contAntecedentes == 4){
			var x = document.getElementById("antecedentes4");
	        x.style.display = "block";
			$("#cargo4").html(v.cargo);
			$("#institucion_laboral4").html(v.institucion);
			$("#anos_laboral4").html(v.anos);
			$("#descripcion_laboral4").html(v.descripcion);
		}
	});

	$('body').loading('stop');
    
}
function editarInstitucion_basica(){
	$.each(arrayData, function(k,v){
		$.each(v.educacion, function(k2,v2){
			if(v2.nivel_edu == 1){
				var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
					+ '<div class="box-datos-generales" style="width: 100%">'
					+ '<div class="col-xs-12 col-md-12 col-lg-12">'
					+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
					+ '<input type="text" class="form-control" id="newNombre_edu" value="'+v2.nombre_edu+'">'
					+ '</div>'
					+ '</div>'
					+ '</div>'
					+ '<div class="col-sm-12 col-md-12">'
					+ '<div class="btn btn-circle blue btn-outline" onclick="guardarInstitucion_basica('+v2.ID_edu+')">Registrar</div>'
					+ "&nbsp;&nbsp;&nbsp;"
					+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
					+ '</div>'
					+ '</div>';
				popUpPerfil("Institución: ", pop, "700px");
			}
		})
	})
}