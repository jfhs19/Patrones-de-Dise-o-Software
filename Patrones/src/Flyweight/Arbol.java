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
public interface Arbol {
    //ESTOS SONS LOS ATRIBUTOS CONCRETOS
    String tipo = "Perenne";
    String color ="Verde";
    public void podar(int alturaFinal);
}
