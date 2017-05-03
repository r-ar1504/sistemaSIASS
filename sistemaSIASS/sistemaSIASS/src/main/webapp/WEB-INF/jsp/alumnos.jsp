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
                    <h1>Products</h1>
                    <p>All the available alumnos in our store</p>
                 </div>
              </div>
           </section>
           <section class="container">
              <div class="row">
              <c:forEach items="${alumnos}" var="alumno">
                    <div class="col-sm-6 col-md-3">
                       <div class="thumbnail">
                          <div class="caption">
                             <h3>${alumno.matricula}</h3>
                             <p>${alumno.apellido1}</p>
                             <p>$${alumno.apellido2}</p>
                          </div>
                       </div>
                    </div>
                 </c:forEach>
              </div>
           </section>
        </body>
        </html>
</html>