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
public class Cliente {
    TiendaCompraVenta tienda;
    public static void main(String[] args) {
        ir();
    }
    private static void ir() {
        System.out.println("Voy a la tienda a comprar 2 unidades");
        TiendaCompraVenta tienda = new TiendaCompraVenta();
        tienda.realizarCompra(2);
        
        tienda.realizarVenta(5);
    }
}
