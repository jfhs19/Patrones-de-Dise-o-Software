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

public class Representante extends Persona {

    private Futbolista representado;
    int e=0;
    
   public Representante (String nombre) {
       super(nombre);
       representado = null;
       
   }
   private Futbolista obtReal () {
       e++;
       if(representado == null){
           e++;
           representado = new Futbolista ("Bale");
           return representado;
       }
           
       return representado;
   }
    @Override
   public void pregunta1 () {

       obtReal().pregunta1();
   }
   
    @Override
   public void pregunta2() {

       obtReal().pregunta2();
   }
}

