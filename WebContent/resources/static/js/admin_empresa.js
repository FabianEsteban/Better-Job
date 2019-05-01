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
    	$("#razsoc").html(v.razsoc);
    	$("#rutDisplay").html(v.rut);
    	$("#giro").html(v.giro);
    	$("#pais").html(v.pais);
    	$("#comuna").html(v.comuna);
    	$("#direccion").html(v.direccion);
    	$("#telefono").html(v.contacto);
    	$("#correo").html(v.correo);
    	$("#fecha_edit").html(diff/(1000*60*60*24));
    });
	$('body').loading('stop');
}