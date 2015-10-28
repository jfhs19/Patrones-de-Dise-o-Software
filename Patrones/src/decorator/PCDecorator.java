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
public abstract class PCDecorator implements EnVenta{
	private EnVenta EnVenta;
	
	public PCDecorator (EnVenta EnVenta){
		setEnVenta(EnVenta);
	}
	
	public EnVenta getEnVenta() {
		return EnVenta;
	}
	
	private void setEnVenta(EnVenta EnVenta) {
		this.EnVenta= EnVenta;
	}
}
	