$(document).ready(function() {
	loadUniversidad();
	loadCarrera();
	loadData();
});
//var codigo = "";
var arrayFormAplic;
var rut = "";

//var datos;
//var insertabla;
//var tablaFormaA = $("#Div_Table_FormaAplicacion").html();


//$("#filtro2").change(function(){
//	insertabla = $("#filtro2").val();
//	loadInfo($("#filtro").val(), $("#filtro2").val());
//});
//

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
//		var seguimiento = "<button onclick='javascript: seguimiento("+v.ID+")'><span class='glyphicon glyphicon-link'></span></button>"
		var url = 'admin_seguimiento';
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
		
		
		tbl = [nombre, rut, carrera, universidad, disponibilidad+" dias", seguimiento, evaluacion];
		var rowNode = table
	    .row.add( tbl )
	    .draw()
	    .node();
	})
	
	
		
//	
//	var tbl = "";
//	$.each(data,function(k, v) {
////		var editar = "<div class='dropdown dropleft' style='float: left;'><button class='btn btn-circle yellow btn-outline btn-sm dropdown-toggle' title='Modificar' onclick='javascript: addFormAP("+v.codigo+")' type='button' data-toggle='dropdown'><span class='fa fa-pencil-square-o fa-lg'></span></button>";
////		var eliminar = "<div class='dropdown dropleft' style='float: left;'><button id='CambioEstado' class='btn btn-circle red btn-outline btn-sm dropdown-toggle' title='Eliminar' onclick='javascript: CambioEstado("+v.codigo+")' type='button' data-toggle='dropdown'><span class='fa fa-trash fa-2x'></span></button>";
//		var tbl = [v.nombre];
//		var rowNode = dataTable
//	    .row.add( tbl )
//	    .draw()
//	    .node();
//	})

}


//function loadInfo(especie, tabla) {
//	if (tabla != ""){
//		$.getJSON("/simpleWeb/json/AGRO/getMantenedorEspecie/"+especie+"/"+tabla+"/", function(data) {
//			arrayFormAplic = data;
//			loadTabla(data);
//		});
//		$("#loading").hide();
//	}
//}
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
//function seguimiento(ID){
//
////	$('#ID').html(ID); 
//	window.location.href = '<path to admin_seguimiento.jsp>' + '#' + ID;
////	window.location.assign("http://localhost:8080/springapp/titulo/admin_seguimiento")
//
//}
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
//function cambioCampo(campo) {
//	codigo = campo.value;
////	LimpiarTabla();
//	loadCampo2();
//}
//function loadCampo2(){
//	var filtro2 = "<option value=''>Seleccionar</option>";
//	$.ajax({
//		url: "/simpleWeb/json/AGRO/getTabla/formacion",
//		type:	"GET",
//		dataType: 'json',
//		async: false,
//		success: function (data) { 
//	        $.each(data, function(k, v) {
//	        	filtro2 += '<option value="'+v.tabla+'">'+v.tabla+'</option>';
//	        });
//	        $('#filtro2').html(filtro2);
//	        
//	    }
//	})
//}
//
//function cambioCampo2(tabla) {
//	insertabla = tabla.value;
//	loadInfo($("#filtro").val(), $("#filtro2").val());
//}
//function cargarRegistro(descripcion) {
////	LimpiarTabla();
//	var descripc = {
//		descripcion : descripcion,
//		especie : codigo,
//		tabla : insertabla
//	}
//	$.ajax({
//		url : "/simpleWeb/json/AGRO/ADDMANTENEDORESP/",
//		async: false,
//		type : "PUT",
//		data : JSON.stringify(descripc),
//		beforeSend : function(xhr) {
//			xhr.setRequestHeader("Accept", "application/json");
//			xhr.setRequestHeader("Content-Type", "application/json");
//		},success: function() {
//			closeModal();
//			alerta("Registrado Correctamente" + " " + $('#descripcionFormaAp').val());
//			loadInfo($("#filtro").val(), $("#filtro2").val());
//		}
//	})
//}
