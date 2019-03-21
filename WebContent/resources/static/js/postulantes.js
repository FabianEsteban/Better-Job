$(document).ready(function() {
	loadUniversidad();
	loadCarrera();
	loadData();
});

var arrayFormAplic;
var rut = "";


function loadFiltroUniversidad(){
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxUniversidad/"+cod_universidad,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayFormAplic = data;
			loadTabla();
	    }
	})
}

function loadFiltroCarrera(){
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxCarrera/"+cod_carrera,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayFormAplic = data;
			loadTabla();
	    }
	})
}

function loadUniversidad(){
	var filtroUniversidad = "<option value='0'>Seleccionar</option>";
	$.ajax({
		url: "/springapp/titulo/fabian/getUniversidades/",
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        $.each(data, function(k, v) {
	        	filtroUniversidad += '<option value="'+v.id_universidad+'">'+v.universidad+'</option>';
	        });
	        $('#filtroUniversidad').html(filtroUniversidad);
	        
	    }
	})
}
function loadCarrera(){
	var filtroCarrera = "<option value='0'>Seleccionar</option>";
	$.ajax({
		url: "/springapp/titulo/fabian/getCarreras/",
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        $.each(data, function(k, v) {
	        	filtroCarrera += '<option value="'+v.id_carrera+'">'+v.carrera+'</option>';
	        });
	        $('#filtroCarrera').html(filtroCarrera);      
	    }
	})
}
function loadTabla() {

	var tbl = "";
	
	table.clear().draw();
	
	$.each(arrayFormAplic,function(k, v) {

		var url = 'empresa_seguimiento';
		var seguimiento = '<form action="' + url + '" method="post">' +
				  '<input type="hidden" name="rut" value="' + v.rut + '" />' +
				  '<button type="submit"><span class="glyphicon glyphicon-link"></span></button>' +
				  '</form>';
		var nombre = v.nombre;
		var rut = v.rut;
		var disponibilidad = v.disponibilidad;
		var evaluacion = "<span class='stars'>v.evaluacion</span>";
		var universidad = "";
		var carrera = "";
		var seleccionar = "";
		var id;
		$.each(v.loginApp,function(k2, v2) {
			id = v2.id;
		})
		$.each(v.relacion,function(k2, v2) {
			var empresa = document.getElementById("empresa").value;
			console.log("ads: "+v2.postulante)
			console.log(id)
			if(v2.empresa == empresa && v2.postulante == id){
				seleccionar = '<div>Ya seleccionado</div>';
			}
			else{
				seleccionar = '<div><button onclick="javascript: enlazar('+id+')" type="submit"><span class="glyphicon glyphicon-check"></span></button></div>';
			}
		})
		
		
		$.each(v.universidades,function(k2, v2) {
			universidad = v2.universidad
		})
		$.each(v.carreras,function(k2, v2) {
			carrera = v2.carrera
			
		})
		$.fn.stars = function() {
		    return $(this).each(function() {
		        // Get the value
		        var val = v.evaluacion;
		        // Make sure that the value is in 0 - 5 range, multiply to get width
		        var size = Math.max(0, (Math.min(5, val))) * 16;
		        // Create stars holder
		        var $span = $('<span />').width(size);
		        // Replace the numerical value with stars
		        $(this).html($span);
		    });
		}

		$(function() {
		    $('span.stars').stars();
		});
		
		
		tbl = [nombre, rut, carrera, universidad, disponibilidad+" dias", seguimiento, evaluacion, seleccionar];
		var rowNode = table
	    .row.add( tbl )
	    .draw()
	    .node();
	})

}

function enlazar(id){
	var empresa = document.getElementById("empresa").value;
	var datos = {
			empresa: empresa,
			postulante: id,
	}

	$.ajax({
	url: "/springapp/titulo/fabian/saveEnlace/",
	type:	"PUT",
	data: JSON.stringify(datos),
	beforeSend: function(xhr){
		xhr.setRequestHeader("Accept", "application/json");
		xhr.setRequestHeader("Content-Type", "application/json");
	},
	success: function (data) {
        alertaSuccess("Postulante solicitado");
        location.href = 'postulantes';
    }
	})
}

function loadData(){
	$.ajax({
		url: "/springapp/titulo/fabian/getAllCurriculum/",
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayFormAplic = data;
//			console.log(data)
			loadTabla();
	    }
	})
}

function loadRut(){
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculum/"+rut,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayFormAplic = data;
//			console.log(data)
			loadTabla();
	    }
	})
}
