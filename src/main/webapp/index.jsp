<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@page import="frontend.Usuarios"%>
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
        <div class="container-fluid">
            <!-- Fixed navbar -->
            <div id="navigation" class="navbar navbar-default  navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target=".navbar-collapse">
                            <span class="icon-bar"></span> <span class="icon-bar"></span> <span
                                class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand smothscroll" href="Controller?menu=Principal"><b>Casablanca
                                Médica</b></a>
                    </div>
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="Controller?menu=Usuarios&accion=Listar" target="myFrame" class="smothscroll">Usuarios</a></li>
                            <li><a href="Controller?menu=Clientes&accion=Listar" target="myFrame" class="smothscroll">Clientes</a></li>
                            <li><a href="Controller?menu=Proveedores&accion=Listar" target="myFrame" class="smothscroll">Proveedores</a></li>
                            <li><a href="Controller?menu=Productos&accion=Listar" target="myFrame" class="smothscroll">Productos</a></li>
                            <li><a href="Controller?menu=Ventas" target="myFrame" class="smothscroll">Ventas</a></li>
                            <li><a href="#" target="myFrame" class="smothscroll">Reportes</a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="index.jsp#contactenos" class="smothscroll">Contactenos</a></li>
                            <li> <div class="dropdown">
                                    <button class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                                        ${usuario.getNombre_usuario()}
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                                        <a class="dropdown-item" href="#"><img src="img/login.png" width="40" alt="40"></a>
                                        <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                                        <a class="dropdown-item" href="#">${usuario.getEmail_usuario()}</a>
                                        <div class="dropdown-divider"></div>
                                        <form class="dropdown-item" method="POST" action="#">
                                            <button class="btn btn-danger center-block" type="submit" name="accion" value="Salir">Cerrar Sesion</button>
                                        </form>

                                    </div>
                                </div>
                            </li>        
                        </ul>
                    </div>             
                </div>
            </div>           
            <!--fin .nav-collapse -->

            <div class="m-4" style="height: 550px;">
                <iframe id="myFrame" name="myFrame"></iframe>
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
        </div> 
        <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" 
                integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" 
        crossorigin="anonymous"></script> 

        <script src="js/script.js"></script>


    </body>
</html>