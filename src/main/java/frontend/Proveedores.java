package frontend;

import javax.persistence.Column;
import javax.persistence.Id;

public class Proveedores {

	private Long nitproveedor;
        private String ciudad_proveedor;

	private String direccion_proveedor;

	private String nombre_proveedor;

	private String telefono_proveedor;

    public Long getNitproveedor() {
        return nitproveedor;
    }

    public void setNitproveedor(Long nitproveedor) {
        this.nitproveedor = nitproveedor;
    }

    public String getCiudadProveedor() {
        return ciudad_proveedor;
    }

    public void setCiudadProveedor(String ciudadProveedor) {
        this.ciudad_proveedor = ciudadProveedor;
    }

    public String getDireccionProveedor() {
        return direccion_proveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccion_proveedor = direccionProveedor;
    }

    public String getNombreProveedor() {
        return nombre_proveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombre_proveedor = nombreProveedor;
    }

    public String getTelefonoProveedor() {
        return telefono_proveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefono_proveedor = telefonoProveedor;
    }

	
	
}