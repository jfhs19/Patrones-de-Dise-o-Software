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
public class Descuento extends VentaExtras{

    
    public Descuento() {
        super.setPrecio(0);
        super.setExtra(0);
    }
    public Descuento(float p, float e){
        super.setPrecio(p);
        super.setExtra(e);
    }
    
    @Override
    public float getExtra() {
        return super.getExtra(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPrecio() {
        return super.getPrecio(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setExtra(float extra) {
        super.setExtra(extra); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecio(float precio) {
        super.setPrecio(precio); //To change body of generated methods, choose Tools | Templates.
    }
    
}
