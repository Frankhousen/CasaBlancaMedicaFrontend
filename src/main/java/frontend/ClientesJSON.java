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

public class ClientesJSON {

    private static URL url;
    private static String sitio = "http://localhost:5000/";

    //agregar informacion a la tabla clientes
    public static ArrayList<Clientes> parsingClientes(String json) throws ParseException {//devulve un arraylist
        JSONParser jsonParser = new JSONParser();
        ArrayList<Clientes> lista = new ArrayList<Clientes>();
        JSONArray clientes = (JSONArray) jsonParser.parse(json);
        Iterator i = clientes.iterator(); //recorrer la tabla cliente
        while (i.hasNext()) {
            JSONObject innerObj = (JSONObject) i.next();
            Clientes cliente = new Clientes();
            
            cliente.setCedula_cliente(Long.parseLong(innerObj.get("cedula_cliente").toString())); //convertir de String a Long
            cliente.setDirCliente(innerObj.get("dir_cliente").toString());
            cliente.setEmailCliente(innerObj.get("email_cliente").toString());
            cliente.setNombreCliente(innerObj.get("nombre_cliente").toString());
            cliente.setTelefonoCliente(innerObj.get("telefono_cliente").toString());
            lista.add(cliente);
        }
        return lista;
    }

    //listar la informacion clientes
    public static ArrayList<Clientes> getJSON() throws IOException, ParseException { //devolver un listado JSON

        url = new URL(sitio + "clientes/listar"); //trae el metodo de Clientes.API 
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");

        InputStream respuesta = http.getInputStream();
        byte[] inp = respuesta.readAllBytes();
        String json = "";

        for (int i = 0; i < inp.length; i++) {
            json += (char) inp[i];
        }

        ArrayList<Clientes> lista = new ArrayList<Clientes>();
        lista = parsingClientes(json);
        http.disconnect();
        return lista;
    }

    //guardar la informacion en tabla clientes
    public static int postJSON(Clientes cliente) throws IOException {

        url = new URL(sitio + "clientes/guardar");
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

        String data = "{" + "\"cedula_cliente\":\"" + String.valueOf(cliente.getCedula_cliente())
                + "\",\"dir_cliente\": \"" + cliente.getDirCliente() + "\",\"email_cliente\": \""
                + cliente.getEmailCliente() + "\",\"nombre_cliente\":\"" + cliente.getNombreCliente() + "\",\"telefono_cliente\":\""
                + cliente.getTelefonoCliente() + "\"}";
        byte[] out = data.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = http.getOutputStream();
        stream.write(out);

        int respuesta = http.getResponseCode();
        http.disconnect();
        return respuesta;
    }
    
    //actualizar la informacion clientes
   
    public static int putJSON(Clientes cliente, Long Cedula_cliente) throws IOException {

        url = new URL(sitio + "clientes/actualizar");
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

        String data = "{"
                + "\"cedula_cliente\":\"" + Cedula_cliente
                + "\",\"dir_cliente\": \"" + cliente.getDirCliente()
                + "\",\"email_cliente\": \"" + cliente.getEmailCliente()
                + "\",\"nombre_cliente\":\"" + cliente.getNombreCliente()
                + "\",\"telefono_cliente\":\"" + cliente.getTelefonoCliente()
                + "\"}";
        byte[] out = data.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = http.getOutputStream();
        stream.write(out);

        int respuesta = http.getResponseCode();
        http.disconnect();
        return respuesta;
    }

    //borrar la informacion en tabla clientes
    public static int deleteJSON(Long Cedula_cliente) throws IOException {

        url = new URL(sitio + "clientes/eliminar/" + Cedula_cliente);
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
