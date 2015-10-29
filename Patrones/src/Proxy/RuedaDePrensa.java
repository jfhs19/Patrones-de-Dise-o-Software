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
public class RuedaDePrensa {
    public static void main(String[] args) {
        //Se entrevista al representante (Proxy), que responde por el futbolista
        Persona representante1 = new Representante ("Representante de Bale");
        Entrevistador entrevistador1 = new Entrevistador (representante1);
        entrevistador1.ejecutar();
        
        //Se entrevista directamente al futbolista
        Persona jug1 = new Futbolista ("Cristano Ronaldo");
        Entrevistador entrevistador2 = new Entrevistador(jug1);
        entrevistador2.ejecutar();
    }
}
