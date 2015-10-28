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
public class PCGamaAlta extends PC{
        @Override
	public String getDescripcion() {
		return "PC gama alta";
	}
	public int getPrecio() {
		return 900;
	}
}
