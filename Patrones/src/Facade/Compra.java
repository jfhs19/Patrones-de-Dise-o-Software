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
class Compra {
    
    public void reducirStock (int cant){
       //Simulamos conexion a la bd
        System.out.println("Se han vendido "+ cant);
        
    }
    public int getPrecio() {
        return 20;
    }
}
