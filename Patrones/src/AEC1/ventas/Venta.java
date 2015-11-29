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
public abstract class Venta implements EnVenta {

    private float precio;
    private int idUser;
    private String fecha;

    public String getFecha() {
        return this.fecha;
    }

    public int getIdUser() {
        return this.idUser;
    }

    @Override
    public  float getPrecio() {
        return this.precio;
    }
    

}
    
    

    
           
