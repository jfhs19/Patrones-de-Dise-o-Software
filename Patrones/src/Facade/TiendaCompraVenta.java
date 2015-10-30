/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author jfhs1
 */
public class TiendaCompraVenta {

    public TiendaCompraVenta() {
    }
    
    
    public Compra realizarCompra(int cantidad) {
        Compra compra = new Compra();
        compra.reducirStock(cantidad);
        compra.getPrecio();
        return compra;
    }
    
    public int realizarVenta( int cantidad){
        Venta venta = new Venta();
        boolean valida = venta.validarVenta();
        if(valida)
            venta.aumentarStock(cantidad);
        return cantidad * venta.getPrecio();
               
        
    }
    
}
