package frontend;

import javax.persistence.Column;
import javax.persistence.Id;

public class Productos {
        private Long codigo_producto;
	private double iva_compra;
	private String nombre_producto;
	private double precio_compra;
	private double precio_venta;
        private Long proveedores_nitproveedor;
        
    public Long getCodigoProducto() {
        return codigo_producto;
    }

    public void setCodigoProducto(Long codigoProducto) {
        this.codigo_producto = codigoProducto;
    }

    public double getIvacompra() {
        return iva_compra;
    }

    public void setIvacompra(double ivacompra) {
        this.iva_compra = ivacompra;
    }

    public String getNombreProducto() {
        return nombre_producto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombre_producto = nombreProducto;
    }

    public double getPrecioCompra() {
        return precio_compra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precio_compra = precioCompra;
    }

    public double getPrecioVenta() {
        return precio_venta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precio_venta = precioVenta;
    }

    public Long getProveedoresNitproveedor() {
        return proveedores_nitproveedor;
    }

    public void setProveedoresNitproveedor(Long proveedoresNitproveedor) {
        this.proveedores_nitproveedor = proveedoresNitproveedor;
    }
	
	
}