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
public final class Seguro extends VentaExtras{

    private String descripcion;
    
    public Seguro() {
        super.setPrecio(0);
        super.setExtra(0);
        setDescripcion("Este pedido incluye un seguro extra");
    }
    public Seguro(float p, float e){
        super.setPrecio(p);
        super.setExtra(e);
        setDescripcion("Este pedido incluye un seguro extra");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
