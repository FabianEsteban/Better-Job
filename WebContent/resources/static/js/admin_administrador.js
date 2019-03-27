$(document).ready(function() {
	loadData();
});


var arrayFormAplic;
var privilegio = 0;
var rut = "";
var estadoTemporal;

function loadData(){
	if(privilegio == 0){
		$.ajax({
			url: "/springapp/titulo/fabian/getDatos/",
			type:	"GET",
			dataType: 'json',
			async: false,
			success: function (data) { 
				arrayFormAplic = data;
//				console.log(data)
				loadTabla();
		    }
		})
	}
	else{
		$.ajax({
			url: "/springapp/titulo/fabian/getDatosxPrivilegio/"+privilegio,
			type:	"GET",
			dataType: 'json',
			async: false,
			success: function (data) { 
				arrayFormAplic = data;
//				console.log(data)
				loadTabla();
		    }
		})
	}
	
}
function loadRut(){
	$.ajax({
		url: "/springapp/titulo/fabian/getDatosxRut/"+rut,
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
function loadTabla() {
	
	var tbl = "";
	table.clear().draw();
	$.each(arrayFormAplic,function(k, v) {
		if(v.estado == 0){
			estado = "<div><select id='estado"+v.id+"' class='form-control input-md' disabled>" +
			"<option selected value = 0>Activo</option>" +
			"<option value = 1>Bloqueado</option>" +
			"</select></div>";
		}
		else{
			estado = "<div><select id='estado"+v.id+"' class='form-control input-md' disabled>" +
			"<option value = 0>Activo</option>" +
			"<option selected value = 1>Bloqueado</option>" +
			"</select></div>";
		}
		var editar = "<div id='editar"+v.id+"' class='dropdown dropleft' style='float: left;'>" +
						"<button class='btn btn-circle yellow btn-outline btn-sm dropdown-toggle' title='Modificar' onclick='javascript: Editar("+v.id+")' type='button'data-toggle='dropdown'>" +
							"<span class='fa fa-pencil-square-o fa-lg'></span>" +
						"</button>" +
					"</div>" +
					"<div id='guardar"+v.id+"' class='dropdown dropleft' style='float: left; display:none;'>" +
						"<button class='btn btn-circle yellow btn-outline btn-sm dropdown-toggle' title='Modificar' onclick='javascript: Guardar("+v.id+")' type='button'data-toggle='dropdown'>" +
							"<span class='fa fa-cloud'></span>" +
							"</button>" +
							"</div>" +
					"<div id='cancelar"+v.id+"' class='dropdown dropleft' style='float: right; display:none;'>" +
						"<button class='btn btn-circle red btn-outline btn-sm dropdown-toggle' title='Modificar' onclick='javascript: Cancelar("+v.id+")' type='button'data-toggle='dropdown'>" +
							"<i class='fa fa-times' aria-hidden='true'></i>" +
						"</button>" +
					"</div>";
		
		
		tbl = [v.usuario, v.correo, v.perfilText, estado, editar];
		var rowNode = table
	    .row.add( tbl )
	    .draw()
	    .node();
		
		
	})

}
function Editar(id){
	$.each(arrayFormAplic,function(k, v) {
		if(v.id == id){
			estadoTemporal = v.estado;
		}
	})
	
	$("#editar"+id).hide();
	$("#guardar"+id).show();
	$("#cancelar"+id).show();
	$("#estado"+id).prop('disabled', false);
}
function Guardar(id){
	
	var datos = {
			id: id,
			estado: $("#estado"+id).val(),
		}
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateEstadoLogin/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			$("#editar"+id).show();
			$("#guardar"+id).hide();
			$("#cancelar"+id).hide();
			$("#estado"+id).prop('disabled', true);
			loadData();
		}
	})	
	
}
function Cancelar(id){
	document.getElementById("estado"+id).value = estadoTemporal;
	$("#editar"+id).show();
	$("#guardar"+id).hide();
	$("#cancelar"+id).hide();
	$("#estado"+id).prop('disabled', true);
}
function addUsuario(){
	$("#addUsuario").hide();
	
	var rut = "<input id='addRut' type='text' class='form-control input-md'>";
	var correo = "<input id='addCorreo' type='text' class='form-control input-md'>";
	var privilegio = "<select id='addPrivilegio' class='form-control input-md' style='float: right;'>" +
//						"<option value = 'empresa'>Empresa</option>" +
						"<option value = 'administrador'>Administrador</option>" +
						"<option value = 'postulante'>Postulante</option>" +
					"</select>";
	var guardar = "<div id='addGuardar' class='dropdown dropleft' style='float: left;'>" +
					"<button class='btn btn-circle yellow btn-outline btn-sm dropdown-toggle' title='Modificar' onclick='javascript: newGuardar(this)' type='button'data-toggle='dropdown'>" +
						"<span class='fa fa-cloud'></span>" +
					"</button>" +
				"</div>" +
				"<div id='addCancelar' class='dropdown dropleft' style='float: right;'>" +
					"<button class='btn btn-circle red btn-outline btn-sm dropdown-toggle' title='Modificar' onclick='javascript: newCancelar(this)' type='button'data-toggle='dropdown'>" +
						"<i class='fa fa-times' aria-hidden='true'></i>" +
					"</button>" +
				"</div>";

	var estado = "<div>" +
					"<select id='addEstado' class='form-control input-md' disabled>" +
						"<option selected value = 0>Activo</option>" +
//						"<option value = 1>Bloqueado</option>" +
					"</select>" +
				"</div>";
	var rowNode = table
    .row.add( [rut, correo, privilegio, estado, guardar] )
    .draw()
    .node();
}
function newCancelar(x){
	$("#addUsuario").show();
	table.row( $(x).parents('tr') ).remove().draw();
}
function newGuardar(){
	var datos = {
			usuario: $("#addRut").val(),
			correo: $("#addCorreo").val(),
			pass: $("#addRut").val(),
			perfilText: $("#addPrivilegio").val(), 
			estado: $("#addEstado").val(),
			estado_curriculum: "0"
		}
//	console.log(datos)
	$.ajax({
		url : "/springapp/titulo/fabian/saveCuentaxAdmin/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro ingresado");
			$("#addUsuario").show();
			loadData();
		}
	})	
}