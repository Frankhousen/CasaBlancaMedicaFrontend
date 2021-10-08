<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@page import="frontend.Productos"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="ISO-8859-1">
        <title>Productos</title>
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
                                <th scope="col">Código</th>
                                <th scope="col">Iva compra</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Precio compra</th>
                                <th scope="col">Precio venta</th>
                                <th scope="col">Nit provedor</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% ArrayList<Productos> lista = (ArrayList<Productos>) request.getAttribute("listaproductos");
                                for (Productos producto : lista) {
                            %>
                            <tr>
                                <td><%=producto.getCodigoProducto()%></td>
                                <td><%=producto.getIvacompra()%></td>
                                <td><%=producto.getNombreProducto()%></td>
                                <td><%=producto.getPrecioCompra()%></td>
                                <td><%=producto.getPrecioVenta()%></td>
                                <td><%=producto.getProveedoresNitproveedor()%></td>
                                <td> 
                                    <a class="btn btn-warning" href="Controller?menu=Productos&accion=Cargar&id=<%=producto.getCodigoProducto()%>">Seleccionar</a>
                                    <a class="btn btn-danger" href="Controller?menu=Productosfree&accion=Eliminar&id=<%=producto.getCodigoProducto()%>">Eliminar</a>
                                </td>

                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </div>
                <!--formulario-->
                <div class="card col-md-8">
                    <div class="card-body">
                        <div id="formulario">                                                  
                            <div id="userform">
                                <div class="tab-pane fade in" id="signup">
                                    <h2 class="text-uppercase text-center">Productos</h2>
                                    <form id="signup" method="get" action="Controller">                                          
                                        <div class="form-group">
                                            <label>Código<span class="req">*</span>
                                            </label> <input type="number" class="form-control" id="codigoProducto" name="txtcodproducto"required
                                                            data-validation-required-message="Por favor ingrese Código del Producto."
                                                            autocomplete="off"
                                                            value="${productoSeleccionado.getCodigoProducto()}">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group">
                                            <label>Iva compra<span class="req">*</span>
                                            </label> <input type="number" class="form-control" id="ivacompra" name="txtivacompra" 
                                                            required
                                                            data-validation-required-message="Por favor ingrese Iva compra del producto."
                                                            autocomplete="off"
                                                            value="${productoSeleccionado.getIvacompra()}">
                                            <p class="help-block text-danger"></p>
                                        </div>  
                                         <div class="form-group">
                                            <label>Nombre<span class="req">*</span>
                                            </label> <input type="text" class="form-control" id="nombreProducto"  name="txtnombreproducto" required
                                                            data-validation-required-message="Por favor ingrese nombre completo del producto."
                                                            autocomplete="off"
                                                            value="${productoSeleccionado.getNombreProducto()}">
                                            <p class="help-block text-danger"></p>
                                        </div>   
                                        <div class="form-group">   
                                            <label>Precio compra<span class="req">*</span>
                                            </label> <input type="number" class="form-control" id="precioCompra"  name="txtprecioCompra" required
                                                            data-validation-required-message="Por favor ingrese precio Compra del producto"
                                                            autocomplete="off"
                                                            value="${productoSeleccionado.getPrecioCompra()}">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group">
                                            <label>Precio venta<span class="req">*</span>
                                            </label> <input type="number" class="form-control" id="precioVenta"  name="txtprecioVenta" required
                                                            data-validation-required-message="Por favor ingrese precio Venta del producto."
                                                            autocomplete="off"
                                                            value="${productoSeleccionado.getPrecioVenta()}">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                        <div class="form-group">
                                            <label>Nit provedor<span class="req">*</span>
                                            </label> <input type="number" class="form-control" id="Nitproveedor" name="txtNitproveedor" 
                                                            required
                                                            data-validation-required-message="Por favor ingrese Nit del proveedor del producto."
                                                            autocomplete="off"
                                                            value="${productoSeleccionado.getProveedoresNitproveedor()}">
                                            <p class="help-block text-danger"></p>
                                        
                                        </div>                                            
                                        <div class="mrgn-30-top">
                                            <input type="hidden" name="menu" value="Productos"><!-- valor de menu Productos -->
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