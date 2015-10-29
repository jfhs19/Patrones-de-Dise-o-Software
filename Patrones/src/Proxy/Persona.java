/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author jfhs1
 */
public abstract class Persona {
    String nombre ;

    public Persona() {
        nombre="sinNombre";
    }
    
    Persona(String cad) {   
        nombre = cad;
    }

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    public abstract void pregunta1();
    public abstract void pregunta2();
    
    
}
