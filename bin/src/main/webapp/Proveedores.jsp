<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@page import="frontend.Proveedores"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="ISO-8859-1">
        <title>Proveedores</title>
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" 
              rel="stylesheet">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body>
        <div class="container"> 
            <div class="row">    
                <div class="col-md-8">
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">Nit</th>
                                <th scope="col">Ciudad</th>
                                <th scope="col">Dirección</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Teléfono </th>
                            </tr>
                        </thead>
                        <tbody>
                            <% ArrayList<Proveedores> lista = (ArrayList<Proveedores>) request.getAttribute("listaprovedores");
                                for (Proveedores proveedor : lista) {
                            %>
                            <tr>
                                <td><%=proveedor.getNitproveedor()%></td>
                                <td><%=proveedor.getCiudadProveedor()%></td>
                                <td><%=proveedor.getDireccionProveedor()%></td>
                                <td><%=proveedor.getNombreProveedor()%></td>
                                <td><%=proveedor.getTelefonoProveedor()%></td>
                                <td> 
                                    <a class="btn btn-warning" href="Controller?menu=Proveedores&accion=Cargar&id=<%=proveedor.getNitproveedor()%>">Seleccionar</a>
                                    <a class="btn btn-danger" href="Controller?menu=Proveedores&accion=Eliminar&id=<%=proveedor.getNitproveedor()%>">Eliminar</a>
                                </td>

                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </div>
                <!--formulario-->
                <div class="card col-md-4">
                    <div class="card-body">
                        <div id="formulario">                                                  
                            <div id="userform">
                                <div class="tab-pane fade in" id="signup">
                                    <h2 class="text-uppercase text-center">Proveedores</h2>
                                    <form id="signup" method="get" action="Controller">                                          
                                        <div class="form-group">
                                            <label>Nit<span class="req">*</span>
                                            </label> <input type="number" class="form-control" id="nitproveedor" name="txtnitproveedor"required
                                                            data-validation-required-message="Por favor ingrese nit del proveedor."
                                                            autocomplete="off"
                                                            value="${proveedorSeleccionado.getNitproveedor()}">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group">
                                            <label>Ciudad<span class="req">*</span>
                                            </label> <input type="text" class="form-control" id="ciudadProveedor" name="txtciudadproveedor" 
                                                            required
                                                            data-validation-required-message="Por favor ingrese dirección del proveedor."
                                                            autocomplete="off"
                                                            value="${proveedorSeleccionado.getCiudadProveedor()}">
                                            <p class="help-block text-danger"></p>
                                        </div>                                       
                                        <div class="form-group">
                                            <label>Dirección<span class="req">*</span>
                                            </label> <input type="text" class="form-control" id="direccionProveedor"  name="txtdirproveedor" required
                                                            data-validation-required-message="Por favor ingrese dirección del proveedor"
                                                            autocomplete="off"
                                                            value="${proveedorSeleccionado.getDireccionProveedor()}">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group">
                                            <label>Nombre<span class="req">*</span>
                                            </label> <input type="text" class="form-control" id="nombreProveedor"  name="txtnombreproveedor" required
                                                            data-validation-required-message="Por favor ingrese nombre completo del proveedor."
                                                            autocomplete="off"
                                                            value="${proveedorSeleccionado.getNombreProveedor()}">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group">
                                            <label>Teléfono<span class="req">*</span>
                                            </label> <input type="number" class="form-control" id="telefonoProveedor" name="txttelproveedor" 
                                                            required
                                                            data-validation-required-message="Por favor ingrese teléfono del proveedor."
                                                            autocomplete="off"
                                                            value="${proveedorSeleccionado.getTelefonoProveedor()}">
                                            <p class="help-block text-danger"></p>
                                        
                                        </div>                                            
                                        <div class="mrgn-30-top">
                                            <input type="hidden" name="menu" value="Proveedores"><!-- valor de menu Proveedores -->
                                            <button type="reset" class="btn btn-larger btn-block" />Reset</button>
                                            <button type="submit"   name= "accion" value="Agregar" class="btn btn-larger btn-block" />Registrar</button>
                                            <button type="submit"  name= "accion" value="Actualizar" class="btn btn-larger btn-block" />Actualizar</button>   
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /boton flotante crud --> 
                <div class="menu_overlay"></div>
                <div class="cornerMenu"><i class="fa fa-list" aria-hidden="true"></i>

                    <div class="menu menu1"><i class="fa fa-plus" aria-hidden="true" ></i></div>
                    <div class="menu menu2"><i class="fa fa-file" aria-hidden="true"></i></div>
                    <div class="menu menu3"><i class="fa fa-edit" aria-hidden="true"></i></div>
                    <div class="menu menu4"><i class="fa fa-eraser" aria-hidden="true"></i></div>  
                    <!-- /fin boton flotante crud -->                             

                    <!--fin formulario-->






                </div>
            </div>
            <!-- /.container -->
        </div>
        <!-- /.row -->
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