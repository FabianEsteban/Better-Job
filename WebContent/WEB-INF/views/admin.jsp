<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<!--     <meta name="description" content="Responsive sidebar template with sliding effect and dropdown menu based on bootstrap 3"> -->
    <title>Better Job</title>
	
 	<link href="../resources/static/css/include.css" rel="stylesheet">
 	
 	<link href="../resources/static/img/favicon.png" rel="icon">
	<link href="../resources/static/img/apple-touch-icon.png" rel="apple-touch-icon">
	
	<!-- Bootstrap core CSS -->
	<link href="../resources/static/css/bootstrap.min.css" rel="stylesheet">
	<!--external css-->
	<link href="../resources/static/css/font-awesome.css" rel="stylesheet" />
	<link rel="stylesheet" type="text/css" href="../resources/static/css/zabuto_calendar.css">
	<link rel="stylesheet" type="text/css" href="../resources/static/css/jquery.gritter.css" />
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.28.10/sweetalert2.min.css" />
	
	<!-- Custom styles for this template -->
	<link href="../resources/static/css/style.css" rel="stylesheet">
	<link href="../resources/static/css/style-responsive.css" rel="stylesheet">
	<script src="../resources/static/js/Chart.js"></script>

	
	
	
	

</head>

<body>
	<header class="header black-bg">
      <div class="sidebar-toggle-box">
        <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
      </div>
      <!--logo start-->
      <a href="index" class="logo"><b><span>Be</span>tter Job</b></a>
      <!--logo end-->
      <div class="nav notify-row" id="top_menu">
        <!--  notification start -->
        <ul class="nav top-menu">
<%--         <input style="display:none;" value = "${rut}" id = "rut"> --%>
          <!-- settings start -->

          <!-- notification dropdown end -->
        </ul>
        <!--  notification end -->
      </div>
      <div class="top-menu">
        <ul class="nav pull-right top-menu">
          <li><a class="logout" href="exit">Cerrar Sesión</a></li>
        </ul>
      </div>
    </header>
    <aside>
      <div id="sidebar" class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">
          <p class="centered"><a href="perfil"><img src="../resources/static/img/ui-sam.jpg" class="img-circle" width="80"></a></p>
          <h5 class="centered" id="nombre">${rut}</h5>
          <li>
            <a class="${active_administrador}" href="admin_administrador">
              <i class="fa fa-user"></i>
              <span>Administrar Cuentas</span>
              </a>
          </li>
          <li>
            <a class="${active_curriculum}" href="admin_curriculum">
              <i class="fa fa-book"></i>
              <span>Administrar Curriculums</span>
              </a>
          </li>
<!--           <li> -->
<%--            <a class="${active_seguimiento}" href="admin_seguimiento"> --%>
<!--               <i class="fa fa-dashboard"></i> -->
<!--               <span>Seguimiento de Usuarios</span> -->
<!--               </a> -->
<!--           </li> -->
<!--           <li class="sub-menu"> -->
<!--             <a href="javascript:;"> -->
<!--               <i class="fa fa-tasks"></i> -->
<!--               <span>Red</span> -->
<!--               </a> -->
<!--             <ul class="sub"> -->
<!--               <li><a href="#">Form Components</a></li> -->
<!--               <li><a href="#">Advanced Components</a></li> -->
<!--               <li><a href="#">Form Validation</a></li> -->
<!--             </ul> -->
<!--           </li> -->
          
        </ul>
        <!-- sidebar menu end-->
      </div>
    </aside>
    <!-- page-wrapper -->

 	<script src="../resources/static/js/jquery.min.js"></script>
 	<script src="../resources/static/js/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.28.10/sweetalert2.min.js"></script>	
    <script src="../resources/static/js/include.js" type="text/javascript"></script>
    <script src="../resources/static/js/${javaScriptPage}.js" type="text/javascript"></script>
    
    
    <script src="../resources/static/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript" src="../resources/static/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="../resources/static/js/jquery.scrollTo.min.js"></script>
	<script src="../resources/static/js/jquery.nicescroll.js" type="text/javascript"></script>
	<script src="../resources/static/js/jquery.sparkline.js"></script>
	<!--common script for all pages-->
	<script src="../resources/static/js/common-scripts.js"></script>
	<script type="text/javascript" src="../resources/static/js/jquery.gritter.js"></script>
	<script type="text/javascript" src="../resources/static/js/gritter-conf.js"></script>
	<!--script for this page-->
	<script src="../resources/static/js/sparkline-chart.js"></script>
	<script src="../resources/static/js/zabuto_calendar.js"></script>
    
</body>

</html>