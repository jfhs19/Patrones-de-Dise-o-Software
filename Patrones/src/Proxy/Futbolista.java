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
public class Futbolista extends Persona {
    
    public Futbolista (String nombre) {
        super(nombre);
    }
    
    public void pregunta1(){
        System.out.println("Responde a la pregunta 1 "+ this.nombre);
    }
    public void pregunta2(){
        System.out.println("Responde a la pregunta 2 "+ this.nombre);
    }


}
