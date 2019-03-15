$(document).ready(function(){
	var product2 = document.getElementById("product2"), usuario;
	usuario = product2.getAttribute("data-prodnumber");
	loadData(usuario);
});
var arrayData = "";
var actual = "";
var xusuario = "";
function loadData(usuario){
	xusuario = usuario
	$.ajax({
		url: "/springapp/titulo/fabian/getPass/"+usuario,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
	        arrayData = data;
	    }
	})
}
function saveNewPass(){	
	$.each(arrayData, function(k, v) {
		actual = v.pass;
	})
	if(actual!=$("#passActual").val()){
		alertaWarning("Password actual incorrecta.");
	}
	else{
		if($("#newPass").val()!=$("#newPass2").val()){
    		alertaWarning("Las contraseñas no coinciden.");
    	}
		else{
			
			var datos = {
					usuario: xusuario,
					pass: $("#newPass").val(),
				}
			
			$.ajax({
				url : "/springapp/titulo/fabian/updatePass/",
				type : "PUT",
				data : JSON.stringify(datos),
				beforeSend : function(xhr) {
					xhr.setRequestHeader("Accept", "application/json");
					xhr.setRequestHeader("Content-Type", "application/json");
				},success: function(){
					alertaSuccess("Registro modificado");	
					location.href = 'exit';
				}
			})
		}
	}
}