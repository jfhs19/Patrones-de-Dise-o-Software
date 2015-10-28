/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author jfhs1
 */
public  class Monitor extends PCDecorator{
	
	public Monitor (EnVenta EnVenta){
		super(EnVenta);
	}
	
        @Override
	public String getDescripcion(){
		return getEnVenta().getDescripcion() + " + Monitor";
        }
	public int getPrecio() {
		return getEnVenta().getPrecio() + 450;
	}
}
