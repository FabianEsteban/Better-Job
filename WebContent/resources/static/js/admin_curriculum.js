$(document).ready(function() {
	loadUniversidad();
	loadCarrera();
	loadData();
});
//var codigo = "";
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
	var contUniversidades = 0;
	var contCarreras = 0;
	var cont = 0;
	table.clear().draw();

	
	$.each(arrayFormAplic,function(k, v) {
		cont++;
		var url = 'admin_seguimiento';
		var seguimiento = '<form action="' + url + '" method="post">' +
				  '<input type="hidden" name="rut" value="' + v.rut + '" />' +
				  '<button type="submit"><span class="glyphicon glyphicon-link"></span></button>' +
				  '</form>';
		var nombre = v.nombre;
		var rut = v.rut;
		var disponibilidad = v.disponibilidad;

		var universidad = "";
		var universidad2 = "";
		var carrera = "";
		contUniversidades = 1;
		$.each(v.universidades,function(k2, v2) {		
			if(cont == contUniversidades){
				universidad = v2.universidad;
			}
			contUniversidades++;
		})
		contCarreras = 1;
		$.each(v.carreras,function(k2, v2) {
			if(cont == contCarreras){
				carrera = v2.carrera;
			}
			contCarreras++;
		})
		




		if(carrera != null){
			idCarrera = carrera.replace(/\s/g, '');
		}
		else{
			idCarrera = carrera;
		}
		var evaluacion = "<span class='stars' id='star"+v.rut+idCarrera+"'></span>";

		
		tbl = [nombre, rut, carrera, universidad, disponibilidad+" dias", seguimiento, evaluacion];
		var rowNode = table
	    .row.add( tbl )
	    .draw()
	    .node();
		
		
		// Make sure that the value is in 0 - 5 range, multiply to get width
        var size = Math.max(0, (Math.min(5, v.evaluacion))) * 16;

        // Create stars holder
        var $span = $('<span />').width(size);

        // Replace the numerical value with stars
        $('#star'+rut+idCarrera).html($span);
		

	})
	$('body').loading('stop');
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
			document.getElementById('filtroCarrera').value = 0;
			document.getElementById('filtroRut').value = '';
			document.getElementById('filtroUniversidad').value = 0;
			loadTabla();
	    }
	})
}

function loadRut(){
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRut/"+rut,
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

