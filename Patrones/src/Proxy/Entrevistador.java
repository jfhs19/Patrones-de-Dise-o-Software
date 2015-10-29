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
public class Entrevistador {
    Persona entrevistado;
    
    public Entrevistador (Persona persona){
        entrevistado = persona;
    }
    public void ejecutar () {
        entrevistado.pregunta1();
        entrevistado.pregunta2();
        entrevistado.pregunta1();       
    }

}
