$(document).ready(function(){
	loadCuentas();
	
});

function postulante() {
	var x = document.getElementById("inicio");
	x.style.display = "none";
	var y = document.getElementById("postulante");
	y.style.display = "block";
}

function empresa() {
	var x = document.getElementById("inicio");
	x.style.display = "none";
	var y = document.getElementById("empresa");
	y.style.display = "block";
}

function volver() {
	var x = document.getElementById("inicio");
	x.style.display = "block";
	var y = document.getElementById("empresa");
	y.style.display = "none";
	var z = document.getElementById("postulante");
	z.style.display = "none";
}

var cuentas;
var repite = false;
//$("#inputTelefono").intlTelInput({
//     allowDropdown: false,
//     autoHideDialCode: true,
//    // autoPlaceholder: "off",
////     dropdownContainer: "body",
//    // excludeCountries: ["us"],
//     formatOnDisplay: true,
////     geoIpLookup: function(callback) {
//    //   $.get("http://ipinfo.io", function() {}, "jsonp").always(function(resp) {
//    //     var countryCode = (resp && resp.country) ? resp.country : "";
//    //     callback(countryCode);
//    //   });
//    // },
////     hiddenInput: "full_number",
////     initialCountry: "cl",
//    // localizedCountries: { 'de': 'Deutschland' },
////     nationalMode: true,
//     onlyCountries: ['cl'],
//     placeholderNumberType: "MOBILE",
////     preferredCountries: ['cl'],
//     separateDialCode: true,
//  });

function loadCuentas(){
	$.ajax({
		url: "/springapp/titulo/fabian/getDatos/",
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        cuentas = data;
	    }
	})
}
function savePostulante(){
	var email = $("#inputEmail").val();

    expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if ( !expr.test(email) ){
        alertaWarning('El email "' + email + '" es incorrecto.');
    }
    else{
    	if($("#inputPassword").val()!=$("#inputPassword2").val()){
    		alertaWarning("La password no coincide.");
    	}
    	else{
    		if($("#inputEmail").val()!=$("#inputEmail2").val()){
        		alertaWarning("Los correos no coinciden.");
        	}
    		else{
    			$.each(cuentas, function(k, v){
    	    			if(v.usuario == $("#inputRut").val()){
    	    				repite = true;
    	    			}
    	    		})
    	    		if(repite==true){
    	    			alertaWarning("Cuenta ya existente");
    	    			repite = false;
    	    		}
    	    		else{
    	    			
    	    			var datos = {
    	    					usuario: $("#inputRut").val(),
    	        				correo: $("#inputEmail").val(),
    	        				pass: $("#inputPassword").val(),
    	        				perfilText: "postulante",
//    	        				telefono: "+56" + $("#inputTelefono").val()
    	        		}
    	        		$.ajax({
    	        		url: "/springapp/titulo/fabian/saveCuenta/",
    	        		type:	"PUT",
    	        		data: JSON.stringify(datos),
    	        		beforeSend: function(xhr){
    	        			xhr.setRequestHeader("Accept", "application/json");
    	        			xhr.setRequestHeader("Content-Type", "application/json");
    	        		},
    	        		success: function (data) {
    	        	        alertaSuccess("Registro completado correctamente");
    	        	        location.href = 'inicio';
//    	        	        window.location = "http://localhost:8080/springapp/titulo/inicio";
    	        	    }
    	        		})
    	    	}
    		}
    	}
    }	
}

function saveEmpresa(){
	
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