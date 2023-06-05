package org.example.Clases;

public class Producto {
    private Integer id;
    private String nombreProducto;
    private String costoUnitario;
    public final Double IVA=0.19;
    private Proveedor proveedor;


    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String costoUnitario, Proveedor proveedor) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.costoUnitario = costoUnitario;
        this.proveedor = proveedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(String costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Double getIVA() {
        return IVA;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
