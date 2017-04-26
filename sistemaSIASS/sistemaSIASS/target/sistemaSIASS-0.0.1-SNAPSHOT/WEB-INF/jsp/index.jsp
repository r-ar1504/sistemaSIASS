<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>SIASS - Tec de Monterrey</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
	<link rel="icon" href="">
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/actions.js"></script>
</head>
<body>
	<header>
		<img id="logoTec" src="<%=request.getContextPath()%>/resources/img/logoTec.png">
		<div id="personalInfo">
			<div id="personalText">
				<p>Benjamin Arredondo Sagui</p>
				<p>A01233107</p>
				<p>ITIC  |  8vo</p>
			</div>
			<div id="personalImg">
				<img src="<%=request.getContextPath()%>/resources/img/benji.jpg">
			</div>
		</div>
	</header>

	<div id="verticalHideBtn" onclick="moveLeftPanel()"><p><b><<</b></p></div>

	<section id="leftPanel" class="unhidden">
		<div id="horasSS" class="leftPanelSec">
			<h3>Horas Servicio Ciudadano</h3>
			<h1>370</h1>
		</div>
		<div id="horasSP" class="leftPanelSec">
			<h3>Horas Servicio Profesional</h3>
			<h1>125</h1>
			
		</div>
		<div id="statusRec" class="leftPanelSec">
			<h3>Status REC</h3>
			<h1>Pendiente</h1>
		</div>
	</section>

	<section id="content">
		<section id="opcionesTaller">
			<div class="titleBar"><p><b>Talleres de Inducción</b></p></div>
		</section>
		<section id="opcionesCiudadano">
			<div class="titleBar"><p><b>Opciones de Servicio Ciudadano</b></p></div>
		</section>
		<section id="opcionesProfesional">
			<div class="titleBar"><p><b>Opciones de servicio Profesional</b></p>	</div>
		</section>
	</section>

</body>
</html>










