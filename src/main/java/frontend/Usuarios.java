package frontend;

public class Usuarios {

	private long cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String password_usuario;
	private String usuario;

	public long getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(Long cedula) {
		this.cedula_usuario = cedula;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword() {
		return password_usuario;
	}

	public void setPassword(String password) {
		this.password_usuario = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}