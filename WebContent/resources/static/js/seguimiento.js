$(document).ready(function() {
	var postulante = document.getElementById("postulante").value;
	loadData(postulante);
});

var arrayFormAplic;
var arrayEmpresas;


function loadData(postulante){
	$.ajax({
		url: "/springapp/titulo/fabian/getRelacion/"+postulante,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayFormAplic = data;
			loadTabla();
	    }
	})
}

function loadTabla(){
	
	var tbl = "";
	var empresa = "";
	
	table.clear().draw();

	$.each(arrayFormAplic,function(k, v) {
		
		var d = new Date(v.fecha);
		var yy = d.getFullYear();
		var dd = d.getDate();
		var mm = d.getMonth()+1

		$.ajax({
			url: "/springapp/titulo/fabian/getEmpresas/"+v.empresa,
			type:	"GET",
			dataType: 'json',
			async: false,
			success: function (data) { 
				arrayEmpresas = data
				$.each(arrayEmpresas,function(k2, v2) {
					tbl = [v2.razsoc, v2.giro, v2.direccion, v2.comuna, v2.correo, '+56-'+v2.contacto, dd+'/'+mm+'/'+yy];
					var rowNode = table
				    .row.add( tbl )
				    .draw()
				    .node();
				});
		    }
		})

	});
	
	$('body').loading('stop');
}