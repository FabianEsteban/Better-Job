$(document).ready(function() {
	
	var dateObj = new Date();
	var month = dateObj.getUTCMonth()+1; //months from 1-12
	var day = dateObj.getUTCDate();
	var year = dateObj.getUTCFullYear();
	
	var mlist = [ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ];
	month_name =  mlist[month-1];

	var arrayMesesEmpresa = "";
	var arrayMesesPostulante = "";
	var arrayTotalUsuarios = "";
	
	var eneroEmpresa = "";
	var febreroEmpresa = "";
	var marzoEmpresa = "";
	var abrilEmpresa = "";
	var mayoEmpresa = "";
	var junioEmpresa = "";
	var julioEmpresa = "";
	var agostoEmpresa = "";
	var septiembreEmpresa = "";
	var octubreEmpresa = "";
	var noviembreEmpresa = "";
	var diciembreEmpresa = "";
	
	var eneroPostulante = "";
	var febreroPostulante = "";
	var marzoPostulante = "";
	var abrilPostulante = "";
	var mayoPostulante = "";
	var junioPostulante = "";
	var julioPostulante = "";
	var agostoPostulante = "";
	var septiembrePostulante = "";
	var octubrePostulante = "";
	var noviembrePostulante = "";
	var diciembrePostulante = "";
	
//	newdate = month_name + ' ' + year;
	newdate = 'A\u00f1o ' + year;
	
	$("#mesano").html(newdate);
	
	$.ajax({
		url: "/springapp/titulo/fabian/getDatosMesEmpresa/"+year,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayMesesEmpresa = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getDatosMesPostulante/"+year,
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayMesesPostulante = data;
	    }
	})
	$.ajax({
		url: "/springapp/titulo/fabian/getDatos/",
		type:	"GET",
		dataType: 'json',
		async: false,
		success: function (data) { 
			arrayTotalUsuarios = data;
	    }
	})
	
	$.each(arrayMesesEmpresa, function(k, v) {
		eneroEmpresa = v.enero;
		febreroEmpresa = v.febrero;
		marzoEmpresa = v.marzo;
		abrilEmpresa = v.abril;
		mayoEmpresa = v.mayo;
		junioEmpresa = v.junio;
		julioEmpresa = v.julio;
		agostoEmpresa = v.agosto;
		septiembreEmpresa = v.septiembre;
		octubreEmpresa = v.octubre;
		noviembreEmpresa = v.noviembre;
		diciembreEmpresa = v.diciembre;
    });
	$.each(arrayMesesPostulante, function(k, v) {
		eneroPostulante = v.enero;
		febreroPostulante = v.febrero;
		marzoPostulante = v.marzo;
		abrilPostulante = v.abril;
		mayoPostulante = v.mayo;
		junioPostulante = v.junio;
		julioPostulante = v.julio;
		agostoPostulante = v.agosto;
		septiembrePostulante = v.septiembre;
		octubrePostulante = v.octubre;
		noviembrePostulante = v.noviembre;
		diciembrePostulante = v.diciembre;
    });
	var empresas = 0;
	var postulantes = 0;

	$.each(arrayTotalUsuarios, function(k, v) {
		if(v.perfilText == "empresa"){
			empresas +=1;
		}
		if(v.perfilText == "postulante"){
			postulantes +=1;
		}
    });
	
	$("#postulantes").html(postulantes);
	$("#empresas").html(empresas);
	
	var grafico = document.getElementById("main-chart").getContext("2d");
//	var cardChart1datos = document.getElementById("card-chart1").getContext("2d");
//
//	var speedData = {
//	  labels: ["0s", "10s", "20s", "30s", "40s", "50s", "60s"],
//	  datasets: [{
//	    label: "Car Speed (mph)",
//	    data: [0, 59, 75, 20, 20, 55, 40],
//	  }]
//	};
//
//	var chartOptions = {
//	  legend: {
//	    display: true,
//	    position: 'top',
//	    labels: {
//	      boxWidth: 80,
//	      fontColor: 'black'
//	    }
//	  }
//	};
//
//	var lineChart = new Chart(speedCanvas, {
//	  type: 'line',
//	  data: speedData,
//	  options: chartOptions
//	});
	

	/* eslint-disable object-shorthand */

	/* global Chart, CustomTooltips, getStyle, hexToRgba */

	/**
	 * --------------------------------------------------------------------------
	 * CoreUI Free Boostrap Admin Template (v2.1.12): main.js
	 * Licensed under MIT (https://coreui.io/license)
	 * --------------------------------------------------------------------------
	 */

	/* eslint-disable no-magic-numbers */
	// Disable the on-canvas tooltip
	Chart.defaults.global.pointHitDetectionRadius = 1;
	Chart.defaults.global.tooltips.enabled = false;
	Chart.defaults.global.tooltips.mode = 'index';
	Chart.defaults.global.tooltips.position = 'nearest';
//	Chart.defaults.global.tooltips.custom = CustomTooltips; // eslint-disable-next-line no-unused-vars

//	var cardChart1 = new Chart(cardChart1datos, {
//	  type: 'line',
//	  data: {
//	    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'white',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      data: [65, 59, 84, 84, 51, 55, 40]
//	    }]
//	  },
//	  options: {
//	    maintainAspectRatio: false,
//	    legend: {
//	      display: false
//	    },
//	    scales: {
//	      xAxes: [{
//	        gridLines: {
//	          color: 'transparent',
//	          zeroLineColor: 'transparent'
//	        },
//	        ticks: {
//	          fontSize: 2,
//	          fontColor: 'transparent'
//	        }
//	      }],
//	      yAxes: [{
//	        display: false,
//	        ticks: {
//	          display: false,
//	          min: 35,
//	          max: 89
//	        }
//	      }]
//	    },
//	    elements: {
//	      line: {
//	        borderWidth: 1
//	      },
//	      point: {
//	        radius: 4,
//	        hitRadius: 10,
//	        hoverRadius: 4
//	      }
//	    }
//	  }
//	}); // eslint-disable-next-line no-unused-vars
//
//	var cardChart2 = new Chart($('#card-chart2'), {
//	  type: 'line',
//	  data: {
//	    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'white',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      data: [1, 18, 9, 17, 34, 22, 11]
//	    }]
//	  },
//	  options: {
//	    maintainAspectRatio: false,
//	    legend: {
//	      display: false
//	    },
//	    scales: {
//	      xAxes: [{
//	        gridLines: {
//	          color: 'transparent',
//	          zeroLineColor: 'transparent'
//	        },
//	        ticks: {
//	          fontSize: 2,
//	          fontColor: 'transparent'
//	        }
//	      }],
//	      yAxes: [{
//	        display: false,
//	        ticks: {
//	          display: false,
//	          min: -4,
//	          max: 39
//	        }
//	      }]
//	    },
//	    elements: {
//	      line: {
//	        tension: 0.00001,
//	        borderWidth: 1
//	      },
//	      point: {
//	        radius: 4,
//	        hitRadius: 10,
//	        hoverRadius: 4
//	      }
//	    }
//	  }
//	}); // eslint-disable-next-line no-unused-vars
//
//	var cardChart3 = new Chart($('#card-chart3'), {
//	  type: 'line',
//	  data: {
//	    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'rgba(255,255,255,.2)',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      data: [78, 81, 80, 45, 34, 12, 40]
//	    }]
//	  },
//	  options: {
//	    maintainAspectRatio: false,
//	    legend: {
//	      display: false
//	    },
//	    scales: {
//	      xAxes: [{
//	        display: false
//	      }],
//	      yAxes: [{
//	        display: false
//	      }]
//	    },
//	    elements: {
//	      line: {
//	        borderWidth: 2
//	      },
//	      point: {
//	        radius: 0,
//	        hitRadius: 10,
//	        hoverRadius: 4
//	      }
//	    }
//	  }
//	}); // eslint-disable-next-line no-unused-vars
//
//	var cardChart4 = new Chart($('#card-chart4'), {
//	  type: 'bar',
//	  data: {
//	    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December', 'January', 'February', 'March', 'April'],
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'rgba(255,255,255,.2)',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      data: [78, 81, 80, 45, 34, 12, 40, 85, 65, 23, 12, 98, 34, 84, 67, 82]
//	    }]
//	  },
//	  options: {
//	    maintainAspectRatio: false,
//	    legend: {
//	      display: false
//	    },
//	    scales: {
//	      xAxes: [{
//	        display: false,
//	        barPercentage: 0.6
//	      }],
//	      yAxes: [{
//	        display: false
//	      }]
//	    }
//	  }
//	}); // eslint-disable-next-line no-unused-vars

	var mainChart = new Chart(grafico, {
	  type: 'line',
	  data: {
	    labels: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ],
	    datasets: [{
	      label: 'My First dataset',
	      backgroundColor: 'transparent',
	      borderColor: '#20a8d8',
	      pointHoverBackgroundColor: '#fff',
	      borderWidth: 3,
	      data: [eneroEmpresa, febreroEmpresa, marzoEmpresa, abrilEmpresa, mayoEmpresa, junioEmpresa, julioEmpresa, agostoEmpresa, septiembreEmpresa, octubreEmpresa, noviembreEmpresa, diciembreEmpresa]
	    }, 
	    {
	      label: 'My Second dataset',
	      backgroundColor: 'transparent',
	      borderColor: 'green',
	      pointHoverBackgroundColor: '#fff',
	      borderWidth: 3,
	      data: [eneroPostulante, febreroPostulante, marzoPostulante, abrilPostulante, mayoPostulante, junioPostulante, julioPostulante, agostoPostulante, septiembrePostulante, octubrePostulante, noviembrePostulante, diciembrePostulante]
	    }, 
//	    {
//	      label: 'My Third dataset',
//	      backgroundColor: 'transparent',
//	      borderColor: 'blue',
//	      pointHoverBackgroundColor: '#fff',
//	      borderWidth: 1,
//	      borderDash: [8, 5],
//	      data: [65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65]
//	    }
	    ]
	  },
	  options: {
	    maintainAspectRatio: false,
	    legend: {
	      display: false
	    },
	    scales: {
	      xAxes: [{
	        gridLines: {
	          drawOnChartArea: false
	        }
	      }],
	      yAxes: [{
	        ticks: {
	          beginAtZero: true,
	          maxTicksLimit: 5,
	          stepSize: Math.ceil(20 / 5),
	          max: 20
	        }
	      }]
	    },
	    elements: {
	      point: {
	        radius: 0,
	        hitRadius: 10,
	        hoverRadius: 4,
	        hoverBorderWidth: 3
	      }
	    }
	  }
	});
//	var brandBoxChartLabels = ['January', 'February', 'March', 'April', 'May', 'June', 'July'];
//	var brandBoxChartOptions = {
//	  responsive: true,
//	  maintainAspectRatio: false,
//	  legend: {
//	    display: false
//	  },
//	  scales: {
//	    xAxes: [{
//	      display: false
//	    }],
//	    yAxes: [{
//	      display: false
//	    }]
//	  },
//	  elements: {
//	    point: {
//	      radius: 0,
//	      hitRadius: 10,
//	      hoverRadius: 4,
//	      hoverBorderWidth: 3
//	    }
//	  } // eslint-disable-next-line no-unused-vars
//
//	};
//	var brandBoxChart1 = new Chart($('#social-box-chart-1'), {
//	  type: 'line',
//	  data: {
//	    labels: brandBoxChartLabels,
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'rgba(255,255,255,.1)',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      pointHoverBackgroundColor: '#fff',
//	      borderWidth: 2,
//	      data: [65, 59, 84, 84, 51, 55, 40]
//	    }]
//	  },
//	  options: brandBoxChartOptions
//	}); // eslint-disable-next-line no-unused-vars
//
//	var brandBoxChart2 = new Chart($('#social-box-chart-2'), {
//	  type: 'line',
//	  data: {
//	    labels: brandBoxChartLabels,
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'rgba(255,255,255,.1)',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      pointHoverBackgroundColor: '#fff',
//	      borderWidth: 2,
//	      data: [1, 13, 9, 17, 34, 41, 38]
//	    }]
//	  },
//	  options: brandBoxChartOptions
//	}); // eslint-disable-next-line no-unused-vars
//
//	var brandBoxChart3 = new Chart($('#social-box-chart-3'), {
//	  type: 'line',
//	  data: {
//	    labels: brandBoxChartLabels,
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'rgba(255,255,255,.1)',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      pointHoverBackgroundColor: '#fff',
//	      borderWidth: 2,
//	      data: [78, 81, 80, 45, 34, 12, 40]
//	    }]
//	  },
//	  options: brandBoxChartOptions
//	}); // eslint-disable-next-line no-unused-vars
//
//	var brandBoxChart4 = new Chart($('#social-box-chart-4'), {
//	  type: 'line',
//	  data: {
//	    labels: brandBoxChartLabels,
//	    datasets: [{
//	      label: 'My First dataset',
//	      backgroundColor: 'rgba(255,255,255,.1)',
//	      borderColor: 'rgba(255,255,255,.55)',
//	      pointHoverBackgroundColor: '#fff',
//	      borderWidth: 2,
//	      data: [35, 23, 56, 22, 97, 23, 64]
//	    }]
//	  },
//	  options: brandBoxChartOptions
//	});
//	//# sourceMappingURL=main.js.map
//	
//	
//	
//	
//	
//	var random = function random() {
//		  return Math.round(Math.random() * 100);
//		}; // eslint-disable-next-line no-unused-vars
//
//
//		var lineChart = new Chart($('#canvas-1'), {
//		  type: 'line',
//		  data: {
//		    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
//		    datasets: [{
//		      label: 'My First dataset',
//		      backgroundColor: 'rgba(220, 220, 220, 0.2)',
//		      borderColor: 'rgba(220, 220, 220, 1)',
//		      pointBackgroundColor: 'rgba(220, 220, 220, 1)',
//		      pointBorderColor: '#fff',
//		      data: [random(), random(), random(), random(), random(), random(), random()]
//		    }, {
//		      label: 'My Second dataset',
//		      backgroundColor: 'rgba(151, 187, 205, 0.2)',
//		      borderColor: 'rgba(151, 187, 205, 1)',
//		      pointBackgroundColor: 'rgba(151, 187, 205, 1)',
//		      pointBorderColor: '#fff',
//		      data: [random(), random(), random(), random(), random(), random(), random()]
//		    }]
//		  },
//		  options: {
//		    responsive: true
//		  }
//		}); // eslint-disable-next-line no-unused-vars
//
//		var barChart = new Chart($('#canvas-2'), {
//		  type: 'bar',
//		  data: {
//		    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
//		    datasets: [{
//		      backgroundColor: 'rgba(220, 220, 220, 0.5)',
//		      borderColor: 'rgba(220, 220, 220, 0.8)',
//		      highlightFill: 'rgba(220, 220, 220, 0.75)',
//		      highlightStroke: 'rgba(220, 220, 220, 1)',
//		      data: [random(), random(), random(), random(), random(), random(), random()]
//		    }, {
//		      backgroundColor: 'rgba(151, 187, 205, 0.5)',
//		      borderColor: 'rgba(151, 187, 205, 0.8)',
//		      highlightFill: 'rgba(151, 187, 205, 0.75)',
//		      highlightStroke: 'rgba(151, 187, 205, 1)',
//		      data: [random(), random(), random(), random(), random(), random(), random()]
//		    }]
//		  },
//		  options: {
//		    responsive: true
//		  }
//		}); // eslint-disable-next-line no-unused-vars
//
//		var doughnutChart = new Chart($('#canvas-3'), {
//		  type: 'doughnut',
//		  data: {
//		    labels: ['Red', 'Green', 'Yellow'],
//		    datasets: [{
//		      data: [300, 50, 100],
//		      backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56'],
//		      hoverBackgroundColor: ['#FF6384', '#36A2EB', '#FFCE56']
//		    }]
//		  },
//		  options: {
//		    responsive: true
//		  }
//		}); // eslint-disable-next-line no-unused-vars
//
//		var radarChart = new Chart($('#canvas-4'), {
//		  type: 'radar',
//		  data: {
//		    labels: ['Eating', 'Drinking', 'Sleeping', 'Designing', 'Coding', 'Cycling', 'Running'],
//		    datasets: [{
//		      label: 'My First dataset',
//		      backgroundColor: 'rgba(220, 220, 220, 0.2)',
//		      borderColor: 'rgba(220, 220, 220, 1)',
//		      pointBackgroundColor: 'rgba(220, 220, 220, 1)',
//		      pointBorderColor: '#fff',
//		      pointHighlightFill: '#fff',
//		      pointHighlightStroke: 'rgba(220, 220, 220, 1)',
//		      data: [65, 59, 90, 81, 56, 55, 40]
//		    }, {
//		      label: 'My Second dataset',
//		      backgroundColor: 'rgba(151, 187, 205, 0.2)',
//		      borderColor: 'rgba(151, 187, 205, 1)',
//		      pointBackgroundColor: 'rgba(151, 187, 205, 1)',
//		      pointBorderColor: '#fff',
//		      pointHighlightFill: '#fff',
//		      pointHighlightStroke: 'rgba(151, 187, 205, 1)',
//		      data: [28, 48, 40, 19, 96, 27, 100]
//		    }]
//		  },
//		  options: {
//		    responsive: true
//		  }
//		}); // eslint-disable-next-line no-unused-vars
//
//		var pieChart = new Chart($('#canvas-5'), {
//		  type: 'pie',
//		  data: {
//		    labels: ['Red', 'Green', 'Yellow'],
//		    datasets: [{
//		      data: [300, 50, 100],
//		      backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56'],
//		      hoverBackgroundColor: ['#FF6384', '#36A2EB', '#FFCE56']
//		    }]
//		  },
//		  options: {
//		    responsive: true
//		  }
//		}); // eslint-disable-next-line no-unused-vars
//
//		var polarAreaChart = new Chart($('#canvas-6'), {
//		  type: 'polarArea',
//		  data: {
//		    labels: ['Red', 'Green', 'Yellow', 'Grey', 'Blue'],
//		    datasets: [{
//		      data: [11, 16, 7, 3, 14],
//		      backgroundColor: ['#FF6384', '#4BC0C0', '#FFCE56', '#E7E9ED', '#36A2EB']
//		    }]
//		  },
//		  options: {
//		    responsive: true
//		  }
//		});
	
	
	$('body').loading('stop');
	
	
	
});

function actualizar(){
	location.reload();
}

