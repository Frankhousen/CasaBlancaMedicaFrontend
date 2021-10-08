<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
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
				<a class="navbar-brand smothscroll" href="portada.jsp"><b>Casablanca Médica</b></a>						
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="login.jsp#contactenos" class="smothscroll">Contactenos</a></li>
					<li><a href="login.jsp" class="smothscroll">Log in</a></li>
				</ul>
			</div>			
		</div>
	</div>
	<div id="form">
		<div class="container">
			<div
				class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3 col-md-8 col-md-offset-2">
				<div id="userform">

					<div class="tab-content">

						<div class="tab-pane fade active in" id="login">
							<h2 class="text-uppercase text-center">Iniciar Sesión</h2>
							<form id="login" method="get" action="./UsuariosServlet">
								<div class="form-group">
									<label> Usuario<span class="req">*</span>
									</label> <input type="text" class="form-control" id="email" name="txtusuario" required
										data-validation-required-message="Por favor ingrese su usuario."
										autocomplete="off">
									<p class="help-block text-danger"></p>
								</div>
								<div class="form-group">
									<label> Contraseña<span class="req">*</span>
									</label> <input type="password" class="form-control" id="password" name="txtpassword"
										required
										data-validation-required-message="Por favor ingrese su contraseña."
										autocomplete="off">
									<p class="help-block text-danger"></p>
								</div>

								<div class="col-auto my-1">
									<div class="form-check">
										<input class="form-check-input" type="checkbox"
											id="autoSizingCheck2"> <label
											class="form-check-label" for="autoSizingCheck2">
											Recuerdame </label>
									</div>
								</div>


								<div class="mrgn-30-top">
									<button type="submit" name= "accion" value="Ingresar" class="btn btn-larger btn-block" />
									Log in
									</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>		
	</div>
        <section id="contactenos" name="contacenos">
                <div class="container contactenos1">
                    <h2>Contactenos</h2>
                    <div class="contactenos1 col-lg-12 ">
                        <P>
                            <img src="img/icono dirección.png" alt="icono dirección" />Dirección:
                        </P>
                        <p>Centro - pasaje la moneda local 103- Cartagena / Bolivar</P>
                        <P>
                            <img src="img/telefono.png" alt="icono telefonos" />Telefonos:
                        </P>
                        <p>(+57) (605) 6600317 - 300 8168775 - 310 7336343</P>
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
	<script src="js/script.js"></script>
</html>