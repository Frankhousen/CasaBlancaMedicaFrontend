<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Casablanca M�dica</title>
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
				<a class="navbar-brand smothscroll" href="index.jsp"><b>Casablanca
						M�dica</b></a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#" class="smothscroll">Usuarios</a></li>
					<li><a href="#" class="smothscroll">Clientes</a></li>
					<li><a href="#" class="smothscroll">Proveedores</a></li>
					<li><a href="#" class="smothscroll">Productos</a></li>
					<li><a href="#" class="smothscroll">Ventas</a></li>
					<li><a href="#" class="smothscroll">Reportes</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="index.jsp#contactenos" class="smothscroll">Contactenos</a></li>
					<li><a href="login.jsp" class="smothscroll">Log in</a></li>
				</ul>

			</div>
			<!--/.nav-collapse -->
		</div>
	</div>

	<section id="home" name="home">
		<div id="portada" class="headernav">
			<div class="container">
				<div class="row centered">
					<div class="col-lg-12">
						<br>
						<center>
							<form id="formulariousuario" name="formularioususario" action=""
								method="get">
								<div id="contenedorprincipal">
									<br>
									<br>
									<br>
									<br>
									<br>
									<div class="zonaizquierdo">
											<label for="cedula">C�dula</label>: 
											<input type="text" name="cedula" id="cedula" size="20" maxlength="50" /> 
											<br>
											<label for="nombre Completo">Nombre Completo</label>: 
											<input type="text" name="nombreUsuario" id="nombreUsuario" size="20" maxlength="50"/>
											<br>
											<label for= "Correo Electronico:&nbsp">Correo Electronico:</label> 
											<input type="text" name="email" id="email" size="20" maxlength="50" />
									</div>
         							</div>
         							
         							<div class="zonaderecha">
										<label for="Usuario:&nbsp">Usuario:</label>
										 <input type="text" name="Usuario" id="Usuario" size="20" maxlength="50" />
										 <br>  
										<label for="Contrase�a:&nbsp"> Contrase�a</label> <input type="password" name="clave" id="clave" size="20"
										maxlength="50" /> 
										
									
									<br> <br />
										<input type="submit" id="botonConsultar" name="botonConsultar" value="Consultar" /> &nbsp;&nbsp; 
										<input type="submit" id="botonCrear" name="botonCrear" value="Crear" /> &nbsp;&nbsp;
										<input type="submit" id="botonActualizar" name="botonActualizar" value="Actualizar" /> &nbsp;&nbsp;
										<input type="reset" id="botonBorrar" value="Borrar" />
								</div>
							</form>
						</center>
					</div>
				</div>
			</div>
			<!--/ .container -->
		</div>
		<!--/ #headerwrap -->
	</section>

	<section id="contactenos" name="contacenos">
		<div class="container contactenos1">
			<h2>Contactenos</h2>
			<div class="contactenos1 col-lg-12 ">
				<P>
					<img src="img/icono direcci�n.png" alt="icono direcci�n" />Direcci�n:
				</P>
				<p>Centro - pasaje la moneda local 103- Cartagena / Bolivar</P>
				<P>
					<img src="img/telefono.png" alt="icono telefonos" />Telefonos:
				</P>
				<p>(+57) 5 6600317 - 300 8168775 - 310 7336343</P>
				<P>
					<img src="img/email.png" alt="icono e-mail" width="32px"
						height="32px" />E-mail:
				</P>
				<p>casablancamedica@hotmail.com</P>
				<P>
					<img src="img/instagram.png" alt="icono instagram" width="32px"
						height="32px" />Instagram
				</P>
				<p>@casablancamedica</P>
			</div>
		</div>
	</section>

	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script src="jss/script.js"></script>
</body>
</html>