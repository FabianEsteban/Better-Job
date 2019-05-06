<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
      <a href="perfil" class="logo"><b><span>Be</span>tter Job</b></a>
      <!--logo end-->
      <div class="nav notify-row" id="top_menu">
        <!--  notification start -->
        <ul class="nav top-menu">
<%--         <div id="product2" display="none" data-prodnumber="${sessionScope.usuario}" /></div> --%>
          <!-- settings start -->
<!--           <li class="dropdown"> -->
<!--             <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#"> -->
<!--               <i class="fa fa-tasks"></i> -->
<!--               <span class="badge bg-theme">4</span> -->
<!--               </a> -->
<!--             <ul class="dropdown-menu extended tasks-bar"> -->
<!--               <div class="notify-arrow notify-arrow-green"></div> -->
<!--               <li> -->
<!--                 <p class="green">You have 4 pending tasks</p> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <div class="task-info"> -->
<!--                     <div class="desc">Dashio Admin Panel</div> -->
<!--                     <div class="percent">40%</div> -->
<!--                   </div> -->
<!--                   <div class="progress progress-striped"> -->
<!--                     <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%"> -->
<!--                       <span class="sr-only">40% Complete (success)</span> -->
<!--                     </div> -->
<!--                   </div> -->
<!--                 </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <div class="task-info"> -->
<!--                     <div class="desc">Database Update</div> -->
<!--                     <div class="percent">60%</div> -->
<!--                   </div> -->
<!--                   <div class="progress progress-striped"> -->
<!--                     <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%"> -->
<!--                       <span class="sr-only">60% Complete (warning)</span> -->
<!--                     </div> -->
<!--                   </div> -->
<!--                 </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <div class="task-info"> -->
<!--                     <div class="desc">Product Development</div> -->
<!--                     <div class="percent">80%</div> -->
<!--                   </div> -->
<!--                   <div class="progress progress-striped"> -->
<!--                     <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%"> -->
<!--                       <span class="sr-only">80% Complete</span> -->
<!--                     </div> -->
<!--                   </div> -->
<!--                 </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <div class="task-info"> -->
<!--                     <div class="desc">Payments Sent</div> -->
<!--                     <div class="percent">70%</div> -->
<!--                   </div> -->
<!--                   <div class="progress progress-striped"> -->
<!--                     <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%"> -->
<!--                       <span class="sr-only">70% Complete (Important)</span> -->
<!--                     </div> -->
<!--                   </div> -->
<!--                 </a> -->
<!--               </li> -->
<!--               <li class="external"> -->
<!--                 <a href="#">See All Tasks</a> -->
<!--               </li> -->
<!--             </ul> -->
<!--           </li> -->
          <!-- settings end -->
          <!-- inbox dropdown start-->
<!--           <li id="header_inbox_bar" class="dropdown"> -->
<!--             <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#"> -->
<!--               <i class="fa fa-envelope-o"></i> -->
<!--               <span class="badge bg-theme">5</span> -->
<!--               </a> -->
<!--             <ul class="dropdown-menu extended inbox"> -->
<!--               <div class="notify-arrow notify-arrow-green"></div> -->
<!--               <li> -->
<!--                 <p class="green">You have 5 new messages</p> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="photo"><img alt="avatar" src="../resources/static/img/ui-zac.jpg"></span> -->
<!--                   <span class="subject"> -->
<!--                   <span class="from">Zac Snider</span> -->
<!--                   <span class="time">Just now</span> -->
<!--                   </span> -->
<!--                   <span class="message"> -->
<!--                   Hi mate, how is everything? -->
<!--                   </span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="photo"><img alt="avatar" src="../resources/static/img/ui-divya.jpg"></span> -->
<!--                   <span class="subject"> -->
<!--                   <span class="from">Divya Manian</span> -->
<!--                   <span class="time">40 mins.</span> -->
<!--                   </span> -->
<!--                   <span class="message"> -->
<!--                   Hi, I need your help with this. -->
<!--                   </span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="photo"><img alt="avatar" src="../resources/static/img/ui-danro.jpg"></span> -->
<!--                   <span class="subject"> -->
<!--                   <span class="from">Dan Rogers</span> -->
<!--                   <span class="time">2 hrs.</span> -->
<!--                   </span> -->
<!--                   <span class="message"> -->
<!--                   Love your new Dashboard. -->
<!--                   </span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="photo"><img alt="avatar" src="../resources/static/img/ui-sherman.jpg"></span> -->
<!--                   <span class="subject"> -->
<!--                   <span class="from">Dj Sherman</span> -->
<!--                   <span class="time">4 hrs.</span> -->
<!--                   </span> -->
<!--                   <span class="message"> -->
<!--                   Please, answer asap. -->
<!--                   </span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#">See all messages</a> -->
<!--               </li> -->
<!--             </ul> -->
<!--           </li> -->
          <!-- inbox dropdown end -->
          <!-- notification dropdown start-->
<!--           <li id="header_notification_bar" class="dropdown"> -->
<!--             <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#"> -->
<!--               <i class="fa fa-bell-o"></i> -->
<!--               <span class="badge bg-warning">7</span> -->
<!--               </a> -->
<!--             <ul class="dropdown-menu extended notification"> -->
<!--               <div class="notify-arrow notify-arrow-yellow"></div> -->
<!--               <li> -->
<!--                 <p class="yellow">You have 7 new notifications</p> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="label label-danger"><i class="fa fa-bolt"></i></span> -->
<!--                   Server Overloaded. -->
<!--                   <span class="small italic">4 mins.</span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="label label-warning"><i class="fa fa-bell"></i></span> -->
<!--                   Memory #2 Not Responding. -->
<!--                   <span class="small italic">30 mins.</span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="label label-danger"><i class="fa fa-bolt"></i></span> -->
<!--                   Disk Space Reached 85%. -->
<!--                   <span class="small italic">2 hrs.</span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#"> -->
<!--                   <span class="label label-success"><i class="fa fa-plus"></i></span> -->
<!--                   New User Registered. -->
<!--                   <span class="small italic">3 hrs.</span> -->
<!--                   </a> -->
<!--               </li> -->
<!--               <li> -->
<!--                 <a href="index.html#">See all notifications</a> -->
<!--               </li> -->
<!--             </ul> -->
<!--           </li> -->
          <!-- notification dropdown end -->
        </ul>
        <!--  notification end -->
      </div>
      <div class="top-menu">
        <ul class="nav pull-right top-menu">
          <li id="lastLogin" style="margin-top:21px; margin-right: 15px;"></li>
          <li><a class="logout" href="exit">Cerrar Sesión</a></li>
        </ul>
      </div>
    </header>
    <aside>
      <div id="sidebar" class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">
          <p class="centered"><a href="perfil"><img src="../resources/static/img/ui-sam.jpg" class="img-circle" width="80"></a></p>
          <input style="display:none;" value = "${rut}" id = "rut">
          <h5 class="centered" id="nombre"></h5>
          <li>
            <a class="${active_perfil}" href="perfil">
              <i class="fa fa-user"></i>
              <span>Perfil</span>
              </a>
          </li>
          <li>
            <a class="${active_curriculum}" href="curriculum">
              <i class="fa fa-book"></i>
              <span>Curriculum</span>
              </a>
          </li>
          <li>
            <a class="${active_seguimiento}" href="seguimiento">
              <i class="fa fa-dashboard"></i>
              <span>Seguimiento</span>
              </a>
          </li>
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
    
    <script src="../resources/static/js/jquery.loading.js"></script>
    
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