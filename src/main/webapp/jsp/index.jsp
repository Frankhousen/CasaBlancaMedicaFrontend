<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Casablanca Médica</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>
	<!-- Fixed navbar -->
	<div id="navigation" class="navbar navbar-default  navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand smothscroll" href="Index.jsp"><b>Casablanca
						Médica</b></a>

				<!--/.nav-collapse -->

			</div>
		</div>

		<section id="home" name="home">
			<div id="portada" class="headernav">
				<div class="container">
					<div class="row centered">
						<div class="col-lg-12">
							<br> <br>
							<h1>
								<center>
									<b>BIENVENIDO A CASA BLANCA MÉDICA</b>
								</center>
							</h1>
							<br>
							<h4>
								<center>
									<b>ROPA - CALZADO Y MATERIAL MÉDICO QUIRÚRGICO</b>
								</center>
							</h4>
							<h5>
								<center>Más de 20 años dedicados a la confección de
									vestuario hospitalario y comercialización de equipos médicos.</center>


								<form class="form-sign" method="get" action="./DemoServlet">
									<center>
										<div class="form-group text-center">
											<br> <br>
											<h3>Login</h3>
											<img src="./img/Login.png" width="40" alt="40"> <label>Bienvenidos
												al Sistema</label>

										</div>
									</center>
									<div class="form-group text-center">

										<label>Usuario:</label> <label><input type="text"
											name="txtusuario" class="form-control"></label> <br> <label>Password:</label>
										<label><input type="password" name="txtpassword"
											class="form-control"></label><br> <input type="submit"
											name="accion" value="Ingresar" class="btn btn-primary">
									</div>
								</form>
						</div>
					</div>
				</div>

				</h5>

			</div>
	</div>
	</div>
</body>
</html>