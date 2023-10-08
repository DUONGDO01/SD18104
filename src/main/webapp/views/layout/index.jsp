<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>///</title>
	<link rel="shortcut icon" type="image/x-icon" href="/img/icon.png">
	<title>Thêm Mới</title>
<link rel="stylesheet"
	href="/css/bootstrap.min.css"/>
	<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="/css/font-awesome.min.css">
     <link rel="stylesheet" href="/css/owl.carousel.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/responsive.css">
    <style type="text/css">
    	#btnCart:hover{
    		background-color: #dc3545;
    	}
    	.dropdown-menu{
    		width: 250px;
    	}
    	
    </style>
</head>
<body>
	<div class="container-fluid">
		<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="menu"/>	
	<div class="row">
		<div class=""><tiles:insertAttribute name="body"/>
		</div>
	</div>
	<tiles:insertAttribute name="footer"/>
	</div>
	<script src="/js/jquery.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="/js/owl.carousel.min.js"></script>
    <script src="/js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="/js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="/js/main.js"></script>
	<script type="text/javascript" src="/js/bxslider.min.js"></script>
	<script type="text/javascript" src="/js/script.slider.js"></script>
</body>
</html>

