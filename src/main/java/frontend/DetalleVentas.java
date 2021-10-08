package frontend;

import javax.persistence.Column;
import javax.persistence.Id;

public class DetalleVentas {

        private Long codigoDetalleVenta;

	private int cantidadProducto;

	private Long productos_codigo_producto;

	private double valorTotal;

	private double valorVenta;

	private double valoriva;

	private Long ventas_codigo_ventas;      

    public Long getCodigoDetalleVenta() {
        return codigoDetalleVenta;
    }

    public void setCodigoDetalleVenta(Long codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Long getProductos_codigo_producto() {
        return productos_codigo_producto;
    }

    public void setProductos_codigo_producto(Long productos_codigo_producto) {
        this.productos_codigo_producto = productos_codigo_producto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public double getValoriva() {
        return valoriva;
    }

    public void setValoriva(double valoriva) {
        this.valoriva = valoriva;
    }

    public Long getVentas_codigo_ventas() {
        return ventas_codigo_ventas;
    }

    public void setVentas_codigo_ventas(Long ventas_codigo_ventas) {
        this.ventas_codigo_ventas = ventas_codigo_ventas;
    }
	
}