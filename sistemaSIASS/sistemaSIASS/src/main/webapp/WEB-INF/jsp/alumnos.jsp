<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Alumnos</title>
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>Alumnos</h1>
					<p>Alumnos en la base de datos</p>
				</div>
			</div>
		</section>
		<section class="container">
			<div class="row">
				<div class="col-sm-6 col-md-3" style="paddingbottom:15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>${alumno.nombre}</h3>
							<p>${alumno.apellido1}</p>
							<p>${alumno.carrera} </p>
							<p>${alumno.matricula}</p>
						</div>
					</div>
				</div>
			</div>
		</section>
	</body>
</html>