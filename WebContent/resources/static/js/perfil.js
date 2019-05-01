$(document).ready(function() {
//      var unique_id = $.gritter.add({
//        // (string | mandatory) the heading of the notification
//        title: 'Welcome to Dashio!',
//        // (string | mandatory) the text inside the notification
//        text: 'Hover me to enable the Close Button. You can hide the left sidebar clicking on the button next to the logo.',
//        // (string | optional) the image to display on the left
//        image: 'resources/static/img/ui-sam.jpg',
//        // (bool | optional) if you want it to fade out on its own or just sit there
//        sticky: false,
//        // (int | optional) the time you want it to be alive for before fading out
//        time: 8000,
//        // (string | optional) the class name you want to apply to that specific message
//        class_name: 'my-sticky-class'
//      });
//
//      return false;

	var usuario = document.getElementById("rut").value;
	loadData(usuario);
});
var arrayData = "";
function loadData(usuario){
	$.ajax({
		url: "/springapp/titulo/fabian/getCurriculumxRut/"+usuario,
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
function editarNombre(){
	$.each(arrayData, function(k,v){
		var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
			+ '<div class="box-datos-generales" style="width: 100%">'
			+ '<div class="col-xs-12 col-md-12 col-lg-12">'
			+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
			+ '<input type="text" class="form-control" id="newNombre" value="'+v.nombre+'">'
			+ '</div>'
			+ '</div>'
			+ '</div>'
			+ '<div class="col-sm-12 col-md-12">'
			+ '<div class="btn btn-circle blue btn-outline" onclick="guardarNombre()">Registrar</div>'
			+ "&nbsp;&nbsp;&nbsp;"
			+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
			+ '</div>'
			+ '</div>';
		popUpPerfil("Nombre: ", pop, "700px");
	})
}
function guardarNombre(){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut: rut,
		nombre: $("#newNombre").val(),
	}
	
//	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateNombre/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
	
}
function editarFecha(){
	$.each(arrayData, function(k,v){
		nombre = v.nombre;
		rut = v.rut;
		nacimiento = v.fecha_nacimiento;
		pais = v.pais;
	})
	var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
		+ '<div class="box-datos-generales" style="width: 100%">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
		+ '<input type="date" class="form-control" id="newFecha" value="'+nacimiento+'">'
		+ '</div>'
		+ '</div>'
		+ '</div>'
		+ '<div class="col-sm-12 col-md-12">'
		+ '<div class="btn btn-circle blue btn-outline" onclick="guardarFecha()">Registrar</div>'
		+ "&nbsp;&nbsp;&nbsp;"
		+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
		+ '</div>'
		+ '</div>';
	popUpPerfil("Fecha de Nacimiento: ", pop, "700px");
}
function guardarFecha(){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut: rut,
		fecha_nacimiento: $("#newFecha").val(),
	}
	
//	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateFecha/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
}
function editarEstado(){
	$.each(arrayData, function(k,v){
		estado = v.estado_civil;
	})
	var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
		+ '<div class="box-datos-generales" style="width: 100%">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
		+ '<input type="text" class="form-control" id="newEstado" value="'+estado+'">'
		+ '</div>'
		+ '</div>'
		+ '</div>'
		+ '<div class="col-sm-12 col-md-12">'
		+ '<div class="btn btn-circle blue btn-outline" onclick="guardarEstado()">Registrar</div>'
		+ "&nbsp;&nbsp;&nbsp;"
		+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
		+ '</div>'
		+ '</div>';
	popUpPerfil("Estado Civil: ", pop, "700px");
}
function guardarEstado(){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut: rut,
		estado_civil: $("#newEstado").val(),
	}
	
//	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateEstado/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
}
function editarPais(){
	$.each(arrayData, function(k,v){
		pais = v.pais;
	})
	var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
		+ '<div class="box-datos-generales" style="width: 100%">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
//		+ '<input type="text" class="form-control" id="newPais" value="'+pais+'">'
		+ '<select id="newPais" class="form-control">'
		+ '<option value="'+pais+'" id="CL" selected>Chile</option>'
		+ '</div>'
		+ '</div>'
		+ '</div>'
		+ '<div class="col-sm-12 col-md-12">'
		+ '<div class="btn btn-circle blue btn-outline" onclick="guardarPais()">Registrar</div>'
//		+ "&nbsp;&nbsp;&nbsp;"
		+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
		+ '</div>'
		+ '</div>';
	popUpPerfil("Pais: ", pop, "500px");
}
function guardarPais(){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut: rut,
		pais: $("#newPais").val(),
	}
	
	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updatePais/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
}
function editarDireccion(){
	$.each(arrayData, function(k,v){
		direccion = v.direccion;
	})
	var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
		+ '<div class="box-datos-generales" style="width: 100%">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
		+ '<input type="text" class="form-control" id="newDireccion" value="'+direccion+'">'
		+ '</div>'
		+ '</div>'
		+ '</div>'
		+ '<div class="col-sm-12 col-md-12">'
		+ '<div class="btn btn-circle blue btn-outline" onclick="guardarDireccion()">Registrar</div>'
		+ "&nbsp;&nbsp;&nbsp;"
		+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
		+ '</div>'
		+ '</div>';
	popUpPerfil("Direccion: ", pop, "700px");
}
function guardarDireccion(){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut: rut,
		direccion: $("#newDireccion").val(),
	}
	
	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateDireccion/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
}
function editarTelefono(){
	$.each(arrayData, function(k,v){
		telefono = v.telefono;
	})
	var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
		+ '<div class="box-datos-generales" style="width: 100%">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
		+ '<input type="text" class="form-control" id="newTelefono" value="'+telefono+'">'
		+ '</div>'
		+ '</div>'
		+ '</div>'
		+ '<div class="col-sm-12 col-md-12">'
		+ '<div class="btn btn-circle blue btn-outline" onclick="guardarTelefono()">Registrar</div>'
		+ "&nbsp;&nbsp;&nbsp;"
		+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
		+ '</div>'
		+ '</div>';
	popUpPerfil("Telefono: ", pop, "700px");
}
function guardarTelefono(){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut: rut,
		telefono: $("#newTelefono").val(),
	}
	
	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateTelefono/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
}
function editarCorreo(){
	$.each(arrayData, function(k,v){
		correo = v.correo;
	})
	var pop = '<div class="col-xs-12 col-sm-12 col-md-12">'
		+ '<div class="box-datos-generales" style="width: 100%">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12">'
		+ '<div class="col-xs-12 col-md-12 col-lg-12 portlet light bordered">'
		+ '<input type="email" class="form-control" id="newCorreo" value="'+correo+'">'
		+ '</div>'
		+ '</div>'
		+ '</div>'
		+ '<div class="col-sm-12 col-md-12">'
		+ '<div class="btn btn-circle blue btn-outline" onclick="guardarCorreo()">Registrar</div>'
		+ "&nbsp;&nbsp;&nbsp;"
		+ '<div class="btn btn-circle red btn-outline" onclick="closeModal()">Cancelar</div>'
		+ '</div>'
		+ '</div>';
	popUpPerfil("Correo: ", pop, "700px");
}
function guardarCorreo(){
	$.each(arrayData, function(k,v){
		rut = v.rut;
	})
	var datos = {
		rut: rut,
		correo: $("#newCorreo").val(),
	}
	
	console.log(datos)
	
	$.ajax({
		url : "/springapp/titulo/fabian/updateCorreo/",
		type : "PUT",
		data : JSON.stringify(datos),
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},success: function(){
			alertaSuccess("Registro modificado");	
			location.reload();
		}
	})
}