package frontend;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private PrintWriter write;

    public Controller() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        switch (menu) {
            case "Principal":
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
                //Menu usuarios--------------------------------------------------------
            case "Usuarios":
                //Menu usuarios-listar-----------------------------------------------
                if (accion.equals("Listar")) {
                    try {
                        ArrayList<Usuarios> listausuarios = TestJSON.getJSON();
                        request.setAttribute("listausuarios", listausuarios);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
              //Menu usuarios-agregar-----------------------------------------------
                } else if (accion.equals("Agregar")) {
                    Usuarios usuario = new Usuarios();
                    usuario.setCedula_usuario(Long.parseLong(request.getParameter("txtcedula")));
                    usuario.setNombre_usuario(request.getParameter("txtnombre"));
                    usuario.setEmail_usuario(request.getParameter("txtemail"));
                    usuario.setUsuario(request.getParameter("txtusuario"));
                    usuario.setPassword(request.getParameter("txtpassword"));

                    int respuesta = 0;
                    try {
                        respuesta = TestJSON.postJSON(usuario);
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Usuarios&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
             //Menu usuarios-actualizar----------------------------------------------       
                } else if (accion.equals("Actualizar")) {
                    Usuarios usuario = new Usuarios();
                    usuario.setCedula_usuario(Long.parseLong(request.getParameter("txtcedula")));
                    usuario.setNombre_usuario(request.getParameter("txtnombre"));
                    usuario.setEmail_usuario(request.getParameter("txtemail"));
                    usuario.setUsuario(request.getParameter("txtusuario"));
                    usuario.setPassword(request.getParameter("txtpassword"));

                    int respuesta = 0;
                    try {
                        respuesta = TestJSON.putJSON(usuario, usuario.getCedula_usuario());
                        PrintWriter write = response.getWriter();

                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Usuarios&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu usuarios-cargar----------------------------------------------        
                } else if (accion.equals("Cargar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    try {
                        ArrayList<Usuarios> lista1 = TestJSON.getJSON();
                        System.out.println("Parametro: " + id);
                        for (Usuarios usuarios : lista1) {
                            if (usuarios.getCedula_usuario()==id) {
                                System.out.println("entro al if: " + id);
                                request.setAttribute("usuarioSeleccionado", usuarios);
                                request.getRequestDispatcher("Controller?menu=Usuarios&accion=Listar").forward(request, response);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu usuarios-eliminar----------------------------------------------         
                } else if (accion.equals("Eliminar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    int respuesta = 0;
                    try {
                        respuesta = TestJSON.deleteJSON(id);
                        PrintWriter write = response.getWriter();
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Usuarios&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                request.getRequestDispatcher("/Usuarios.jsp").forward(request, response);
                break;
                
            //Menu clientes-------------------------------------------------------    
            case "Clientes":
                if (accion.equals("Listar")) {
                    try {
                        ArrayList<Clientes> listaclientes = ClientesJSON.getJSON();
                        request.setAttribute("listaclientes", listaclientes);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu clientes--agregar--------------------------------------------------         
                } else if (accion.equals("Agregar")) {
                    Clientes cliente = new Clientes();
                    cliente.setCedula_cliente(Long.parseLong(request.getParameter("txtcedulacliente")));
                    cliente.setDirCliente(request.getParameter("txtdircliente"));
                    cliente.setEmailCliente(request.getParameter("txtemailcliente"));
                    cliente.setNombreCliente(request.getParameter("txtnombrecliente"));
                    cliente.setTelefonoCliente(request.getParameter("txttelcliente"));

                    int respuesta = 0;
                    try {
                        respuesta = ClientesJSON.postJSON(cliente);
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Clientes&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu clientes--actualizar--------------------------------------------------         
                } else if (accion.equals("Actualizar")) {
                    Clientes cliente = new Clientes();
                    cliente.setCedula_cliente(Long.parseLong(request.getParameter("txtcedulacliente")));
                    cliente.setDirCliente(request.getParameter("txtdircliente"));
                    cliente.setEmailCliente(request.getParameter("txtemailcliente"));
                    cliente.setNombreCliente(request.getParameter("txtnombrecliente"));
                    cliente.setTelefonoCliente(request.getParameter("txttelcliente"));
  
                    int respuesta = 0;
                    try {
                        respuesta = ClientesJSON.putJSON(cliente, cliente.getCedula_cliente());
                        PrintWriter write = response.getWriter();

                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Clientes&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu clientes--cargar--------------------------------------------------        
                } else if (accion.equals("Cargar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    try {
                        ArrayList<Clientes> listaclientes = ClientesJSON.getJSON();
                        System.out.println("Parametro: " + id);
                        
                        for (Clientes cliente : listaclientes) {
                                
                            if (cliente.getCedula_cliente().equals(id)){
                                request.setAttribute("clienteSeleccionado", cliente);
                                request.getRequestDispatcher("Controller?menu=Clientes&accion=Listar").forward(request, response);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu clientes--eliminar--------------------------------------------------        
                } else if (accion.equals("Eliminar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    int respuesta = 0;
                    try {
                        respuesta = ClientesJSON.deleteJSON(id);
                        PrintWriter write = response.getWriter();
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Clientes&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                request.getRequestDispatcher("/Clientes.jsp").forward(request, response);
                break;
            //Menu Proveedores-------------------------------------------------------  
            case "Proveedores":
                if (accion.equals("Listar")) {
                    try {
                        ArrayList<Proveedores> listaprovedores = ProveedoresJSON.getJSON();
                        request.setAttribute("listaprovedores", listaprovedores);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Proveedores--agregar--------------------------------------------------         
                } else if (accion.equals("Agregar")) {
                    Proveedores proveedor = new Proveedores();
                    proveedor.setNitproveedor(Long.parseLong(request.getParameter("txtnitproveedor")));
                    proveedor.setCiudadProveedor(request.getParameter("txtciudadproveedor"));
                    proveedor.setDireccionProveedor(request.getParameter("txtdirproveedor"));
                    proveedor.setNombreProveedor(request.getParameter("txtnombreproveedor"));
                    proveedor.setTelefonoProveedor(request.getParameter("txttelproveedor"));

                    int respuesta = 0;
                    try {
                        respuesta = ProveedoresJSON.postJSON(proveedor);
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Proveedores&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Proveedores--actualizar--------------------------------------------------         
                } else if (accion.equals("Actualizar")) {
                    Proveedores proveedor = new Proveedores();
                    proveedor.setNitproveedor(Long.parseLong(request.getParameter("txtnitproveedor")));
                    proveedor.setCiudadProveedor(request.getParameter("txtciudadproveedor"));
                    proveedor.setDireccionProveedor(request.getParameter("txtdirproveedor"));
                    proveedor.setNombreProveedor(request.getParameter("txtnombreproveedor"));
                    proveedor.setTelefonoProveedor(request.getParameter("txttelproveedor"));

                    int respuesta = 0;
                    try {
                        respuesta = ProveedoresJSON.putJSON(proveedor, proveedor.getNitproveedor());
                        PrintWriter write = response.getWriter();

                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Proveedores&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Proveedores--cargar--------------------------------------------------        
                } else if (accion.equals("Cargar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    try {
                        ArrayList<Proveedores> listaproveedores = ProveedoresJSON.getJSON();
                        System.out.println("Parametro: " + id);
                        
                        for (Proveedores proveedor : listaproveedores) {
                                
                            if (proveedor.getNitproveedor().equals(id)){
                                request.setAttribute("proveedorSeleccionado", proveedor);
                                request.getRequestDispatcher("Controller?menu=Proveedores&accion=Listar").forward(request, response);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Proveedores--eliminar--------------------------------------------------        
                } else if (accion.equals("Eliminar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    int respuesta = 0;
                    try {
                        respuesta = ProveedoresJSON.deleteJSON(id);
                        PrintWriter write = response.getWriter();
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Proveedores&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }  
                
                request.getRequestDispatcher("/Proveedores.jsp").forward(request, response);
                break;
           //Menu Productos------------------------------------------------------- 
            case "Productos":
                            
                if (accion.equals("Listar")) {
                    try {
                        ArrayList<Productos> listaproductos = ProductosJSON.getJSON();
                        request.setAttribute("listaproductos", listaproductos);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Productos--agregar--------------------------------------------------         
                } else if (accion.equals("Agregar")) {
                    Productos producto = new Productos();
                    producto.setCodigoProducto(Long.parseLong(request.getParameter("txtcodproducto")));
                    producto.setIvacompra(Double.parseDouble(request.getParameter("txtivacompra")));
                    producto.setNombreProducto(request.getParameter("txtnombreproducto"));
                    producto.setPrecioCompra(Double.parseDouble(request.getParameter("txtprecioCompra")));
                    producto.setPrecioVenta(Double.parseDouble(request.getParameter("txtprecioVenta")));
                    producto.setProveedoresNitproveedor(Long.parseLong(request.getParameter("txtNitproveedor")));

                    int respuesta = 0;
                    try {
                        respuesta = ProductosJSON.postJSON(producto);
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Productos&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Productos--actualizar--------------------------------------------------         
                } else if (accion.equals("Actualizar")) {
                    Productos producto = new Productos();
                    producto.setCodigoProducto(Long.parseLong(request.getParameter("txtcodproducto")));
                    producto.setIvacompra(Double.parseDouble(request.getParameter("txtivacompra")));
                    producto.setNombreProducto(request.getParameter("txtnombreproducto"));
                    producto.setPrecioCompra(Double.parseDouble(request.getParameter("txtprecioCompra")));
                    producto.setPrecioVenta(Double.parseDouble(request.getParameter("txtprecioVenta")));
                    producto.setProveedoresNitproveedor(Long.parseLong(request.getParameter("txtNitproveedor")));

                    int respuesta = 0;
                    try {
                        respuesta = ProductosJSON.putJSON(producto, producto.getCodigoProducto());
                        PrintWriter write = response.getWriter();

                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Productos&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Productos--cargar--------------------------------------------------        
                } else if (accion.equals("Cargar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    try {
                        ArrayList<Productos> listaproductos = ProductosJSON.getJSON();
                        System.out.println("Parametro: " + id);
                        
                        for (Productos producto : listaproductos) {
                                
                            if (producto.getCodigoProducto().equals(id)){
                                request.setAttribute("productoSeleccionado", producto);
                                request.getRequestDispatcher("Controller?menu=Productos&accion=Listar").forward(request, response);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            //Menu Productos--eliminar--------------------------------------------------        
                } else if (accion.equals("Eliminar")) {
                    Long id = Long.parseLong(request.getParameter("id"));
                    int respuesta = 0;
                    try {
                        respuesta = ProductosJSON.deleteJSON(id);
                        PrintWriter write = response.getWriter();
                        if (respuesta == 200) {
                            request.getRequestDispatcher("Controller?menu=Productos&accion=Listar").forward(request, response);
                        } else {
                            write.println("Error: " + respuesta);
                        }
                        write.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }  
                
                request.getRequestDispatcher("/Productos.jsp").forward(request, response);
                break;
            case "Ventas":
                request.getRequestDispatcher("/Ventas.jsp").forward(request, response);
                break;

        }
    }
}
