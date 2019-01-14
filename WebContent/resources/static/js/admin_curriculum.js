//var dataTable = $('#Table_curriculums').DataTable({
//	"sPaginationType": "full_numbers" ,
//	"filter": false
//});

$(document).ready(function() {
//	$.fn.dataTable.ext.errMode = 'none';
//	$('#loading').hide();
	loadData();
//	loadTabla($("#filtro").val());
});
//var codigo = "";
var arrayFormAplic;
//var datos;
//var insertabla;
//var tablaFormaA = $("#Div_Table_FormaAplicacion").html();

//$("#filtro").change(function(){
//	codigo = $("#filtro").val();
//	cambioCampo2($("#filtro2")[0]);
//});
//
//$("#filtro2").change(function(){
//	insertabla = $("#filtro2").val();
//	loadInfo($("#filtro").val(), $("#filtro2").val());
//});
//
function loadTabla() {
//	dataTable.clear().draw();
	tbl = new Array();
	
	$.each(arrayFormAplic,function(k, v) {
		var seguimiento = "<button onclick='javascript: seguimiento("+v.ID+")'><span class='glyphicon glyphicon-link'></span></button>"
		$.each(v.educacion,function(k2, v2) {
			datos = new Array(v.nombre, v.rut, v2.carrera_edu, v2.nombre_edu, v.disponibilidad+" dias", seguimiento);
			tbl.push(datos);
		})
	})
		
	$('#Table_curriculums').DataTable({
		data: tbl,
		scrollY: "200px",
		responsive: true,
		paging: true,
		sPaginationType: "full_numbers", 
		columns: [
			{ title: "Nombre" },
			{ title: "Rut" },
			{ title: "Carrera" },
			{ title: "Universidad" },
			{ title: "Disponibilidad" },
			{ title: "Seguimiento" },
		],
		"filter": false
	});
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
function seguimiento(ID){
	console.log(ID)
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
