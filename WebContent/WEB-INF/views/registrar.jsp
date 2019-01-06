<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

	<link href="../resources/static/css/login.css" rel="stylesheet">
	<link href="../resources/static/css/inicio.css" rel="stylesheet">
	<link href="../resources/static/css/inicio/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="../resources/static/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="../resources/static/css/magnific-popup.css" rel="stylesheet">
	<link rel="stylesheet" href="../resources/static/css/intlTelInput.css">
    <!-- Custom styles for this template -->
    <link href="../resources/static/css/creative.min.css" rel="stylesheet">
	<title>Better Job</title>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	
	

</head>
<body>
<!-- Navigation -->

    <nav class="navbar navbar-expand-lg navbar-light satic-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="inicio">Inicio</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#about">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#services">Services</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#portfolio">Portfolio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    
	<div class="container">
        <div class="card card-container">           
            
            <form class="login-form" action="javascript: saveCuenta()">
                <span id="reauth-email" class="reauth-email"></span>
                <div class="form-group">
                	<input type="text" id="inputRut" class="form-control" oninput="checkRut(this)"  placeholder="RUT" name="username" required autofocus>
                </div>
                <div class="form-group">
                	<input type="password" id="inputPassword" class="form-control" placeholder="Contraseña" name="password" required>
                </div>
				<div class="form-group">
                	<input type="password" id="inputPassword2" class="form-control" placeholder="Confirmar contraseña" name="password2" required>
                </div>
                <div class="form-group">
                	<input type="text" id="inputEmail" class="form-control" placeholder="Email" name="username" required autofocus>
                </div>
                <div class="form-group">
                	<input type="text" id="inputEmail2" class="form-control" placeholder="Confirmar email" name="username" required>
                </div>
<!--                 <div class="form-group"> -->
<!--                 	<input type="tel" id="inputTelefono" class="form-control" name="telefono" required autofocus> -->
<!--                 </div> -->   
                <div class="form-actions">
                	<button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Registrar</button>
                </div>
                
            </form><!-- /form -->
        </div><!-- /card-container -->
    </div><!-- /container -->
    
    <script src="../resources/static/js/intlTelInput.min.js"></script>
    <script src="../resources/static/js/utils.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="../resources/static/js/include.js" type="text/javascript"></script>
    <script src="../resources/static/js/registrar.js" type="text/javascript"></script>
    <!-- Bootstrap core JavaScript -->
    <script src="../resources/static/js/jquery.min.js"></script>
    <script src="../resources/static/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="../resources/static/js/jquery.easing.min.js"></script>
    <script src="../resources/static/js/scrollreveal.min.js"></script>
    <script src="../resources/static/js/jquery.magnific-popup.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="../resources/static/js/creative.min.js"></script>

</body>
</html>