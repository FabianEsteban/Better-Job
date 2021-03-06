$(document).ready(function(){
	
	var arrayData = "";
	var arrayLast_login = "";

	var rut = document.getElementById("rut").value;

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
		url: "/springapp/titulo/fabian/getDatosxRut/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) {
	        arrayLast_login = data;
	    }
	})
	$.each(arrayData, function(k, v) {
		$("#nombre").html(v.nombre);
	});

	$.each(arrayLast_login, function(k, v) {
		$("#lastLogin").html('\u00DAltimo ingreso: '+v.last_login);
	});
});

function alertaWarning(html){
	swal({
		title: "Alerta",
		text: html,
		icon: "warning",
		position: "top",
		className: "animatedbounceIn",
		width: "500px",
		showCloseButton: false,
		button: true,
		focusConfirm: true,
		allowOutsideClick: false,
		closeOnEsc: false
	})
}
function alertaSuccess(html){
		swal({
			title: "Alerta",
			text: html,
			icon: "success",
			position: "top",
			className: "animatedbounceIn",
			width: "500px",
			showCloseButton: false,
			button: false,
			focusConfirm: true,
			allowOutsideClick: false,
			closeOnEsc: false
		})
}
function popUpPerfil(titulo, html, width){
	swal({
		title: titulo,
		html: html,
		width: width,
		showCloseButton: false,
		focusConfirm: true,
		allowOutsideClick: false,
		showCancelButton: false,
		showConfirmButton: false,
	})
}
function closeModal(){
	swal.close();
}