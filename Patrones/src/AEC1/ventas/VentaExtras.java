/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEC1.ventas;

/**
 *
 * @author jfhs1
 */
public abstract class VentaExtras implements EnVenta {
    //Indica el procentaje Extra que se le aumenta al precio
    private float extra;
    //Indica el precio que tiene.
    private float precio;

    public void setExtra(float extra) {
        this.extra = extra;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float getExtra() {
        return this.extra;
    }

    @Override
    public float getPrecio() {
       return this.precio;
    }
    
}
