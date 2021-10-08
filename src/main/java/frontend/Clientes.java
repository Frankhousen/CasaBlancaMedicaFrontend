package frontend;


public class Clientes {

	private Long cedula_cliente;
	
	private String dir_cliente;

	private String email_cliente;

	private String nombre_cliente;

	private String telefono_cliente;

    public Long getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(Long Cedula_cliente) {
        this.cedula_cliente = Cedula_cliente;
    }

    public String getDirCliente() {
        return dir_cliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dir_cliente = dirCliente;
    }

    public String getEmailCliente() {
        return email_cliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.email_cliente = emailCliente;
    }

    public String getNombreCliente() {
        return nombre_cliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombre_cliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefono_cliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefono_cliente = telefonoCliente;
    }
	
}