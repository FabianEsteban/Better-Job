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

    <!-- Custom styles for this template -->
    <link href="../resources/static/css/creative.min.css" rel="stylesheet">
	<title>Insert title here</title>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<title>Insert title here</title>
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
            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
            <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
            <p id="profile-name" class="profile-name-card"></p>
            
            <div style="color: red; font-size: 12px; padding-bottom: 10px;">${error}</div>
            
            <form class="login-form" method="post">
<!--                 <span id="reauth-email" class="reauth-email"></span> -->
                <div class="form-group">
                	<input type="text" id="inputRut" class="form-control" oninput="checkRut(this)"  placeholder="RUT" name="username" required autofocus>
                </div>
                <div class="form-group">
                	<input type="password" id="inputPassword" class="form-control" placeholder="Contraseña" name="password" required>
                </div>
				<div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Recordar
                    </label>
                </div>
                <div class="form-actions">
                	<button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Ingresar</button>
                </div>
                
            </form><!-- /form -->
            <a href="#" class="forgot-password">
                ¿Olvidó su contraseña?
            </a>
        </div><!-- /card-container -->
    </div><!-- /container -->
    <script src="../resources/static/js/login.js" type="text/javascript"></script>
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