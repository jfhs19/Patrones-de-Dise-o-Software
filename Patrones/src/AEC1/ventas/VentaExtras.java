/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEC1.ventas;

import java.util.Date;

/**
 *
 * @author jfhs1
 */
public abstract class VentaExtras implements EnVenta {
	private EnVenta EnVenta;
        private String vendedor;
	
	public VentaExtras (EnVenta EnVenta){
		setEnVenta(EnVenta);
	}

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getVendedor() {
        return vendedor;
    }
	
	public EnVenta getEnVenta() {
		return EnVenta;
	}
	
	private void setEnVenta(EnVenta EnVenta) {
		this.EnVenta = (EnVenta) EnVenta;
	}
        
        public final String getHTML(){
            String cabecera = getCabeceraHTML();
            String body = getBodyHTML();
            String footer = getFooterHTML();
            return cabecera + body + footer;
        }
        
        protected abstract String getBodyHTML();
        
        private String getCabeceraHTML() {
            String retornar = "<!DOCTYPE html><html><head><title>FACTURA</title></head><body><\nLe atiende: "+vendedor+"\n";
            return retornar;
            
        }
        
        private String getFooterHTML(){
            //Ponemos el footer del HTML. Es generíco para todas las ventas
           Date date = new Date();
           String fecha = date.toString();
           String append = "Realizado el día: "+fecha;
           append = append +"\nGRACIAS POR SU COMPRA</body></html>";
            return append;
        }
            
       
        
                
        
        
}
