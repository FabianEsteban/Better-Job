$(document).ready(function() {
	loadData();
});

function loadData(){
	$.ajax({
		url: "/springapp/titulo/fabian/getCarreras/",
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayFormAplic = data;
			loadTabla();
	    }
	})
}

function loadTabla() {
	
	var tbl = "";
	table.clear().draw();
	$.each(arrayFormAplic,function(k, v) {

		var editar = "<div id='editar"+v.id_carrera+"' class='dropdown dropleft' style='float: left;'>" +
						"<button class='btn btn-circle yellow btn-outline btn-sm dropdown-toggle' title='Modificar' onclick='javascript: Editar("+v.id_carrera+")' type='button'data-toggle='dropdown'>" +
							"<span class='fa fa-pencil-square-o fa-lg'></span>" +
						"</button>" +
					"</div>"+
					"<div id='eliminar"+v.id_carrera+"'class='dropdown dropleft' style='float: right;'>" +
						"<button class='btn btn-circle yellow btn-outline btn-sm dropdown-toggle' title='Eliminar' onclick='javascript: Eliminar("+v.id_carrera+")' type='button'data-toggle='dropdown'>" +
							"<span class='fa fa-trash fa-lg'></span>" +
						"</button>" +
					"</div>"
		
		tbl = [v.carrera, editar];
		var rowNode = table
		.row.add( tbl )
		.draw()
		.node();
		

	})
	$('body').loading('stop');
}
function Editar(id){
	
	$.each(arrayFormAplic, function(k,v){
		if(id == v.id_carrera){
			var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
				+ '<div class="box-datos-generales" style="width: 100%">'
				+ '<div class="col-xs-12 col-md-12 col-lg-12">'
				+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
				+ '<input type="text" class="form-control" id="newNombre'+id+'" value="'+v.carrera+'">'
				+ '</div>'
				+ '</div>'
				+ '</div>'
				+ '<div class="col-sm-12 col-md-12">'
				+ '<div class="btn btn-circle blue btn-outline" onclick="Guardar('+id+')">Guardar</div>'
				+ "&nbsp;&nbsp;&nbsp;"
				+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
				+ '</div>'
				+ '</div>';
			popUpPerfil("Nombre: ", pop, "700px");
		}
		
	})

}
function Guardar(id){
	
	var datos = {
			id_carrera: id,
			carrera: $("#newNombre"+id).val(),
		}

	$.ajax({
		url : "/springapp/titulo/fabian/updateCarrera/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			loadData();
		}
	})	
	
}
function addUsuario(){
	var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
		+ '<div class="box-datos-generales" style="width: 100%">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
		+ '<input type="text" class="form-control" id="newCarrera">'
		+ '</div>'
		+ '</div>'
		+ '</div>'
		+ '<div class="col-sm-12 col-md-12">'
		+ '<div class="btn btn-circle blue btn-outline" onclick="newGuardar()">Guardar</div>'
		+ "&nbsp;&nbsp;&nbsp;"
		+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
		+ '</div>'
		+ '</div>';
	popUpPerfil("Nombre: ", pop, "700px");
}

function newGuardar(){
	var datos = {
			carrera: $("#newCarrera").val()
		}

	$.ajax({
		url : "/springapp/titulo/fabian/addCarrera/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro ingresado");
			loadData();
		}
	})	
}
function Eliminar(id){
	var datos = {
			id_carrera: id,
		}

	$.ajax({
		url : "/springapp/titulo/fabian/deleteCarrera/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			loadData();
		}
	})
}
