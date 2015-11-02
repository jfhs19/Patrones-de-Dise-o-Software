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
public class ArbolConcreto  implements Arbol{

    //ATRIBUTOS EXTRINSECOS
    int altura;

    public ArbolConcreto() {
        super();
    }
    
    public void podar(int alturaFinal) {
       //Se poda hasta quedar a la altura deseada
        System.out.println("Se ha podado:"+ (altura - alturaFinal) +" centimetros. Antes medía: " + altura);
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
