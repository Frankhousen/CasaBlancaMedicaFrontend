package frontend;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection; //esta libreria es para realizar la conexion
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProductosJSON {

    private static URL url;
    private static String sitio = "http://localhost:5000/";

    //agregar informacion a la tabla Productos
    public static ArrayList<Productos> parsingProductos(String json) throws ParseException {//devulve un arraylist
        JSONParser jsonParser = new JSONParser();
        ArrayList<Productos> lista = new ArrayList<Productos>();
        JSONArray Productos = (JSONArray) jsonParser.parse(json);
        Iterator i = Productos.iterator(); //recorrer la tabla Productos
        while (i.hasNext()) {
            JSONObject innerObj = (JSONObject) i.next();
            Productos producto = new Productos();
            
            producto.setCodigoProducto(Long.parseLong(innerObj.get("codigo_producto").toString())); //convertir de String a Long
            producto.setIvacompra(Double.parseDouble(innerObj.get("iva_compra").toString()));       //convertir de String a Double
            producto.setNombreProducto(innerObj.get("nombre_producto").toString());
            producto.setPrecioCompra(Double.parseDouble(innerObj.get("precio_compra").toString())); //convertir de String a Double
            producto.setPrecioVenta(Double.parseDouble(innerObj.get("precio_venta").toString()));    //convertir de String a Double
            producto.setProveedoresNitproveedor(Long.parseLong(innerObj.get("proveedores_nitproveedor").toString())); //convertir de String a Long
            
            lista.add(producto);
        }
        return lista;
    }

    //listar la informacion Productos
    public static ArrayList<Productos> getJSON() throws IOException, ParseException { //devolver un listado JSON

        url = new URL(sitio + "productos/listar"); //trae el metodo de Productos.API 
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");

        InputStream respuesta = http.getInputStream();
        byte[] inp = respuesta.readAllBytes();
        String json = "";

        for (int i = 0; i < inp.length; i++) {
            json += (char) inp[i];
        }

        ArrayList<Productos> lista = new ArrayList<Productos>();
        lista = parsingProductos(json);
        http.disconnect();
        return lista;
    }

    //guardar la informacion en tabla Productos
    public static int postJSON(Productos producto) throws IOException {

        url = new URL(sitio + "productos/guardar");
        HttpURLConnection http;
        http = (HttpURLConnection) url.openConnection();

        try {
            http.setRequestMethod("POST");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }

        http.setDoOutput(true);
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("Content-Type", "application/json");

        String data = "{" + "\"codigo_producto\":\"" + String.valueOf(producto.getCodigoProducto())
                + "\",\"iva_compra\": \"" + String.valueOf(producto.getIvacompra())
                + "\",\"nombre_producto\": \"" + producto.getNombreProducto()
                + "\",\"precio_compra\":\""  + String.valueOf(producto.getPrecioCompra())
                + "\",\"precio_venta\":\""  + String.valueOf(producto.getPrecioVenta())
                + "\",\"proveedores_nitproveedor\":\""+ String.valueOf(producto.getProveedoresNitproveedor()) + "\"}";
        
        byte[] out = data.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = http.getOutputStream();
        stream.write(out);

        int respuesta = http.getResponseCode();
        http.disconnect();
        return respuesta;
    }
    
    //actualizar la informacion Productos
   
    public static int putJSON(Productos producto, Long codigoProducto) throws IOException {

        url = new URL(sitio + "productos/actualizar");
        HttpURLConnection http;
        http = (HttpURLConnection) url.openConnection();

        try {
            http.setRequestMethod("PUT");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }

        http.setDoOutput(true);
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("Content-Type", "application/json");

        String data = "{" + "\"codigo_producto\":\"" + codigoProducto
                + "\",\"iva_compra\": \"" + String.valueOf(producto.getIvacompra())
                + "\",\"nombre_producto\": \"" + producto.getNombreProducto()
                + "\",\"precio_compra\":\""  + String.valueOf(producto.getPrecioCompra())
                + "\",\"precio_venta\":\""  + String.valueOf(producto.getPrecioVenta())
                + "\",\"proveedores_nitproveedor\":\""+ String.valueOf(producto.getProveedoresNitproveedor()) + "\"}";
        byte[] out = data.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = http.getOutputStream();
        stream.write(out);

        int respuesta = http.getResponseCode();
        http.disconnect();
        return respuesta;
    }

    //borrar la informacion en tabla Productos
    public static int deleteJSON(Long codigoProducto) throws IOException {

        url = new URL(sitio + "productos/eliminar/" + codigoProducto);
        HttpURLConnection http;
        http = (HttpURLConnection) url.openConnection();

        try {
            http.setRequestMethod("DELETE");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }

        http.setDoOutput(true);
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("Content-Type", "application/json");

        int respuesta = http.getResponseCode();
        http.disconnect();
        return respuesta;
    }

}
