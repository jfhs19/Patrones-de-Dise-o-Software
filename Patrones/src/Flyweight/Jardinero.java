/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author jfhs1
 */
public class Jardinero {
    
    public static void main(String[] args) {
        Jardinero c = new Jardinero();
        c.poda();
    }

    private void poda() {
     int alturaFinal = 230;
     int alturas[] = {260, 250,360};
     ArbolConcreto arbol = new ArbolConcreto(); 
     
     for(int i=0; i< alturas.length;i++){
         //Le damos el atributo extrinseco de la altura
         arbol.setAltura(alturas[i]);
         arbol.podar(alturaFinal);
     }
     
        
    }
}

