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
public class Venta {
     public void aumentarStock (int cant){
       //Simulamos conexion a la bd
        System.out.println("Se ha añadido stock "+ cant);
        
    }
    public int getPrecio() {
        return 20;
    }
    
    public boolean validarVenta(){
        System.out.println("Esta en buen estado, nos interesa en la tienda");
        return true;
    }
}
