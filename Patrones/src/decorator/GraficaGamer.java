/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author jfhs1
 */
public class GraficaGamer extends PCDecorator {

    public GraficaGamer(EnVenta EnVenta) {
        super(EnVenta);
    }

    @Override
    public String getDescripcion() {
        return getEnVenta().getDescripcion() + " + Grafica Gamer";
    }

    @Override
    public int getPrecio() {
        return getEnVenta().getPrecio() + 450;
    }
}
