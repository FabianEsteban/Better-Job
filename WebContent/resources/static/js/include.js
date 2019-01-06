$(document).ready(function(){
	var arrayData = "";
	var product2 = document.getElementById("product2"), usuario;
	usuario = product2.getAttribute("data-prodnumber");

	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculum/"+usuario,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        arrayData = data;
	    }
	})
	$.each(arrayData, function(k, v) {
		$("#nombreUsuario").html(v.nombre);
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