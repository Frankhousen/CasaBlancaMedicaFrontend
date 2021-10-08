package frontend;

import javax.persistence.Column;
import javax.persistence.Id;

public class Ventas {

        private Long codigo_ventas;

	private Long Cliente_Cedula_cliente;

	private double ivaventa;

	private double total_venta;

	private Long Usuario_Cedula_usuario;

	private double valor_venta;

    public Long getCodigoVentas() {
        return codigo_ventas;
    }

    public void setCodigoVentas(Long codigoVentas) {
        this.codigo_ventas = codigoVentas;
    }

    public Long getClientes_Cedula_cliente() {
        return Cliente_Cedula_cliente;
    }

    public void setClientes_Cedula_cliente(Long clientes_Cedula_cliente) {
        this.Cliente_Cedula_cliente = clientes_Cedula_cliente;
    }

    public double getIvaventa() {
        return ivaventa;
    }

    public void setIvaventa(double ivaventa) {
        this.ivaventa = ivaventa;
    }

    public double getTotalVenta() {
        return total_venta;
    }

    public void setTotalVenta(double totalVenta) {
        this.total_venta = totalVenta;
    }

    public Long getUsuarios_Cedula_usuario() {
        return Usuario_Cedula_usuario;
    }

    public void setUsuarios_Cedula_usuario(Long usuarios_Cedula_usuario) {
        this.Usuario_Cedula_usuario = usuarios_Cedula_usuario;
    }

    public double getValorVenta() {
        return valor_venta;
    }

    public void setValorVenta(double valorVenta) {
        this.valor_venta = valorVenta;
    }
	
}