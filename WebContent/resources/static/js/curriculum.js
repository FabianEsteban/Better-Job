$(document).ready(function(){
	var product = document.getElementById("product"), estado_curriculum;
	var product2 = document.getElementById("product2"), usuario;
	usuario = product2.getAttribute("data-prodnumber");
    estado_curriculum = product.getAttribute("data-prodnumber");
    var x = document.getElementById("regForm");
    var y = document.getElementById("curriculum");
    if (estado_curriculum == 1) {
        x.style.display = "none";
    }
    else{
    	y.style.display = "none";
    }
    loadData(usuario);
	$("#inputTelefono").intlTelInput({
	     allowDropdown: false,
	     autoHideDialCode: true,
	    // autoPlaceholder: "off",
//	     dropdownContainer: "body",
	    // excludeCountries: ["us"],
	     formatOnDisplay: true,
//	     geoIpLookup: function(callback) {
	    //   $.get("http://ipinfo.io", function() {}, "jsonp").always(function(resp) {
	    //     var countryCode = (resp && resp.country) ? resp.country : "";
	    //     callback(countryCode);
	    //   });
	    // },
//	     hiddenInput: "full_number",
//	     initialCountry: "cl",
	    // localizedCountries: { 'de': 'Deutschland' },
//	     nationalMode: true,
	     onlyCountries: ['cl'],
	     placeholderNumberType: "MOBILE",
//	     preferredCountries: ['cl'],
	     separateDialCode: true,
	  });
	
	
	$('<div/>', {
        'class' : 'extraPerson', html: GetHtml()
    }).appendTo('#container');
    $('#addRow').click(function () {
          $('<div/>', {
              'class' : 'extraPerson', html: GetHtml()
    }).hide().appendTo('#container').slideDown('slow');
        
    });
    
    
    $('<div/>', {
        'class' : 'extraPerson2', html: GetHtml2()
    }).appendTo('#container2');
    $('#addRow2').click(function () {
          $('<div/>', {
              'class' : 'extraPerson2', html: GetHtml2()
    }).hide().appendTo('#container2').slideDown('slow');
        
    });
    
    
    $('<div/>', {
        'class' : 'extraPerson3', html: GetHtml3()
    }).appendTo('#container3');
    $('#addRow3').click(function () {
          $('<div/>', {
              'class' : 'extraPerson3', html: GetHtml3()
    }).hide().appendTo('#container3').slideDown('slow');
        
    });
    
    $('<div/>', {
        'class' : 'extraPerson4', html: GetHtml4()
    }).appendTo('#container4');
    $('#addRow4').click(function () {
          $('<div/>', {
              'class' : 'extraPerson4', html: GetHtml4()
    }).hide().appendTo('#container4').slideDown('slow');
        
    });
    
    $('<div/>', {
        'class' : 'extraPerson5', html: GetHtml5()
    }).appendTo('#container5');
    $('#addRow5').click(function () {
          $('<div/>', {
              'class' : 'extraPerson5', html: GetHtml5()
    }).hide().appendTo('#container5').slideDown('slow');
        
    });
	
});
var arrayData = "";
function loadData(usuario){
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculum/"+usuario,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        arrayData = data;
	        Mostrar();
	    }
	})
}
function Mostrar(){
	$.each(arrayData, function(k, v) {
		console.log(v)
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
function GetHtml(){
    var len = $('.extraPerson').length;
    var $html = $('.extraPersonTemplate').clone();
    $html.find('[name=institucion_basica]')[0].name="institucion_basica" + len;
    $html.find('[name=anos_basica]')[0].name="anos_basica" + len;
    return $html.html();    
}
function GetHtml2(){
    var len = $('.extraPerson2').length;
    var $html = $('.extraPersonTemplate2').clone();
    $html.find('[name=institucion_media]')[0].name="institucion_media" + len;
    $html.find('[name=anos_media]')[0].name="anos_media" + len;
    return $html.html();    
}
function GetHtml3(){
    var len = $('.extraPerson3').length;
    var $html = $('.extraPersonTemplate3').clone();
    $html.find('[name=universidad]')[0].name="universidad" + len;
    $html.find('[name=carrera]')[0].name="carrera" + len;
    $html.find('[name=ano_universidad]')[0].name="ano_universidad" + len;
    $html.find('[name=titulo_universidad]')[0].name="titulo_universidad" + len;
    return $html.html();    
}
function GetHtml4(){
    var len = $('.extraPerson4').length;
    var $html = $('.extraPersonTemplate4').clone();
    $html.find('[name=universidad_postgrado]')[0].name="universidad_postgrado" + len;
    $html.find('[name=programa_postgrado]')[0].name="programa_postgrado" + len;
    $html.find('[name=ano_postgrado]')[0].name="ano_postgrado" + len;
    $html.find('[name=titulo_postgrado]')[0].name="titulo_postgrado" + len;
    return $html.html();    
}
function GetHtml5(){
    var len = $('.extraPerson5').length;
    var $html = $('.extraPersonTemplate5').clone();
    $html.find('[name=universidad_curso]')[0].name="universidad_curso" + len;
    $html.find('[name=nombre_curso]')[0].name="nombre_curso" + len;
    $html.find('[name=horas_curso]')[0].name="horas_curso" + len;
    $html.find('[name=ano_curso]')[0].name="ano_curso" + len;
    return $html.html();    
}
function saveCurriculum(){
	var datos_curriculum = {
			nombre: $("#inputNombre").val(),
			rut: $("#inputRut").val(),
			fecha_nacimiento: $("#inputNacimiento").val(),
			pais: $("#inputPais").val(),
			estado_civil: $("#inputEstado_civil").val(),
			direccion : $("#inputDireccion").val(),
			region : $("#inputRegion").val(),
			comuna : $("#inputComuna").val(),
			telefono : $("#inputTelefono").val(),
			correo : $("#inputEmail").val(),
			disponibilidad : $("#inputDias_disponibilidad").val(),
			nombre_recomendacion : $("#inputNombre_recomendacion").val(),
			empresa_recomendacion : $("#inputEmpresa_recomendacion").val(),
			telefono_recomendacion : $("#inputTelefono_recomendacion").val(),
			mail_recomendacion : $("#inputEmail_recomendacion").val(),

			
			institucion_basica: $("input[name=institucion_basica0]").val(),
			ano_basica: $("input[name=anos_basica0]").val(),
			institucion_basica1: $("input[name=institucion_basica1]").val(),
			ano_basica1: $("input[name=anos_basica1]").val(),
			institucion_basica2: $("input[name=institucion_basica2]").val(),
			ano_basica2: $("input[name=anos_basica2]").val(),
			
			institucion_media: $("input[name=institucion_media0]").val(),
			ano_media: $("input[name=anos_media0]").val(),
			institucion_media1: $("input[name=institucion_media1]").val(),
			ano_media1: $("input[name=anos_media1]").val(),
			institucion_media2: $("input[name=institucion_media2]").val(),
			ano_media2: $("input[name=anos_media2]").val(),
			
					
			universidad: $("input[name=universidad0]").val(),
			carrera: $("input[name=carrera0]").val(),
			ano_universidad: $("input[name=ano_universidad0]").val(),
			titulo_universidad: $("input[name=titulo_universidad0]").val(),
			universidad1: $("input[name=universidad1]").val(),
			carrera1: $("input[name=carrera1]").val(),
			ano_universidad1: $("input[name=ano_universidad1]").val(),
			titulo_universidad1: $("input[name=titulo_universidad1]").val(),
			
			universidad_postgrado: $("input[name=universidad_postgrado0]").val(),
			programa_postgrado: $("input[name=programa_postgrado0]").val(),
			ano_postgrado: $("input[name=ano_postgrado0]").val(),
			titulo_postgrado: $("input[name=titulo_postgrado0]").val(),
			universidad_postgrado1: $("input[name=universidad_postgrado1]").val(),
			programa_postgrado1: $("input[name=programa_postgrado1]").val(),
			ano_postgrado1: $("input[name=ano_postgrado1]").val(),
			titulo_postgrado1: $("input[name=titulo_postgrado1]").val(),
			
			universidad_curso: $("input[name=universidad_curso0]").val(),
			nombre_curso: $("input[name=nombre_curso0]").val(),
			horas_curso: $("input[name=horas_curso0]").val(),
			ano_curso: $("input[name=ano_curso0]").val(),
			universidad_curso1: $("input[name=universidad_curso1]").val(),
			nombre_curso1: $("input[name=nombre_curso1]").val(),
			horas_curso1: $("input[name=horas_curso1]").val(),
			ano_curso1: $("input[name=ano_curso1]").val(),
			

			cargo: $("#inputCargo_laboral").val(),
			institucion: $("#inputInstitucion_laboral").val(),
			anos: $("#inputAnos_laboral").val(),
			descripcion: $("#inputDescripcion_laboral").val(),
	}
	

	
	console.log(datos_curriculum)


	$.ajax({
		url: "/springapp/titulo/fabian/saveCurriculum/",
		type:	"PUT",
		data: JSON.stringify(datos_curriculum),
		beforeSend: function(xhr){
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},
		success: function (data) {
			alertaSuccess("Curriculum actualizado exitosamente");
			location.reload();
	    }
	})
}

function checkRut(rut) {
    // Despejar Puntos
    var valor = rut.value.replace('.','');
    // Despejar Guión
    valor = valor.replace('-','');
    
    // Aislar Cuerpo y Dígito Verificador
    cuerpo = valor.slice(0,-1);
    dv = valor.slice(-1).toUpperCase();
    
    // Formatear RUN
    rut.value = cuerpo + '-'+ dv
    
    // Si no cumple con el mínimo ej. (n.nnn.nnn)
    if(cuerpo.length < 7) { rut.setCustomValidity("RUT Incompleto"); return false;}
    
    // Calcular Dígito Verificador
    suma = 0;
    multiplo = 2;
    
    // Para cada dígito del Cuerpo
    for(i=1;i<=cuerpo.length;i++) {
    
        // Obtener su Producto con el Múltiplo Correspondiente
        index = multiplo * valor.charAt(cuerpo.length - i);
        
        // Sumar al Contador General
        suma = suma + index;
        
        // Consolidar Múltiplo dentro del rango [2,7]
        if(multiplo < 7) { multiplo = multiplo + 1; } else { multiplo = 2; }
  
    }
    
    // Calcular Dígito Verificador en base al Módulo 11
    dvEsperado = 11 - (suma % 11);
    
    // Casos Especiales (0 y K)
    dv = (dv == 'K')?10:dv;
    dv = (dv == 0)?11:dv;
    
    // Validar que el Cuerpo coincide con su Dígito Verificador
    if(dvEsperado != dv) { rut.setCustomValidity("RUT Invalido"); return false; }
    
    // Si todo sale bien, eliminar errores (decretar que es válido)
    rut.setCustomValidity('');
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
function guardarInstitucion_basica(ID_edu){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut_usuario: rut,
		ID_edu: ID_edu,
		nombre_edu: $("#newNombre_edu").val(),
	}
	
	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateNombre_edu/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
	
}