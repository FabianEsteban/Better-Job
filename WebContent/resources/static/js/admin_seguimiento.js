$(document).ready(function(){	
	loadData();
});

var arrayData = "";


function loadData(){
	var rut = document.getElementById("rut").value;
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculum/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        arrayData = data;
	    }
	})
	Mostrar();
}
function Mostrar(){
	$.each(arrayData, function(k, v) {
//		console.log(v)
    	$("#nombre").html(v.nombre);
    	$("#rut").html(v.rut);
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
    	$.each(v.educacion, function(k2, v2) {
    		if(v2.nivel_edu == 1){
    		$("#institucion_basica").html(v2.nombre_edu);
    		$("#anos_basica").html(v2.fecha_ini + "-" + v2.fecha_final);
    		}
    		if(v2.nivel_edu == 2){
    			$("#institucion_media").html(v2.nombre_edu);
        		$("#anos_media").html(v2.fecha_ini + "-" + v2.fecha_final);
    		}
    		if(v2.nivel_edu == 3){
    			$("#institucion_pregrado").html(v2.nombre_edu);
        		$("#carrera_pregrado").html(v2.carrera_edu);
        		$("#anos_pregrado").html(v2.fecha_ini + "-" + v2.fecha_final);
        		$("#titulo_pregrado").html(v2.carrera_edu);
    		}
    		if(v2.nivel_edu == 4){
    			$("#institucion_postgrado").html(v2.nombre_edu);
        		$("#programa_postgrado").html(v2.carrera_edu);
        		$("#anos_postgrado").html(v2.fecha_ini + "-" + v2.fecha_final);
        		$("#titulo_postgrado").html(v2.carrera_edu);
    		}
    		if(v2.nivel_edu == 5){
    			$("#institucion_curso").html(v2.nombre_edu);
        		$("#nombre_curso").html(v2.carrera_edu);
        		$("#horas_curso").html(v2.horas_edu);
        		$("#anos_curso").html(v2.carrera_edu);
    		}
    	});
    });
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