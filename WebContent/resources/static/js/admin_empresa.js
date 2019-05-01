$(document).ready(function() {
	var usuario = document.getElementById("rut").value;
	loadData(usuario);
});

var arrayData = "";

function loadData(usuario){
	$.ajax({
		url: "/springapp/titulo/fabian/getEmpresas/"+usuario,
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
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //January is 0!
	var yyyy = today.getFullYear();

	if(dd<10) {
	    dd = '0'+dd
	} 

	if(mm<10) {
	    mm = '0'+mm
	} 

	today = yyyy + '-' + mm + '-' + dd;
	$.each(arrayData, function(k, v) {
		var fechaInicio = new Date(v.fecha_edit).getTime();
		var fechaFin    = new Date(today).getTime();

		
		var diff = fechaFin - fechaInicio;
    	$("#nombredisplay").html(v.nombre);
    	$("#rutdisplay").html(v.rut);
    	$("#fecha_nacimiento").html(v.fecha_nacimiento);
    	$("#pais").html(v.pais);
    	$("#estado_civil").html(v.estado_civil);
    	$("#direccion").html(v.direccion);
    	$("#telefono").html(v.telefono);
    	$("#correo").html(v.correo);
    	$("#fecha_edit").html(diff/(1000*60*60*24));
    });
	$('body').loading('stop');
}