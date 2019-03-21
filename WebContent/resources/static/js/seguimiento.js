$(document).ready(function() {
	var postulante = document.getElementById("postulante").value;
	loadData(postulante);
});

var arrayFormAplic;



function loadData(postulante){
	$.ajax({
		url: "/springapp/titulo/fabian/getRelacion/"+postulante,
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

function loadTabla(){
	
	var tbl = "";
	var empresa = "";
	
	table.clear().draw();
	
	$.each(arrayFormAplic,function(k, v) {
		
		empresa = v.empresa;
		
		tbl = [empresa, 'Enfermero', 'Barros Luco', '20-03-2019'];
		var rowNode = table
	    .row.add( tbl )
	    .draw()
	    .node();
		
	});
	
	
}