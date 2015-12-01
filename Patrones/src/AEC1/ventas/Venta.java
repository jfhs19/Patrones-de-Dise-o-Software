/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEC1.ventas;

import java.util.List;

/**
 *
 * @author jfhs1
 */
public class Venta implements EnVenta {

    private float precio;
    private String idVenta;
    private List<String> articulo;

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setArticulo(List<String> articulo) {
        this.articulo = articulo;
    }

    @Override
    public String getidVenta() {
        return this.idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public List<String> getArticulo() {
        return articulo;
    }

}
