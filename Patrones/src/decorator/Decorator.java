/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import decorator.EnVenta;
import decorator.GraficaGamer;
import decorator.Monitor;
import decorator.PCGamaAlta;
import decorator.PCGamaBaja;

/**
 *
 * @author jfhs1
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                EnVenta pc = new PCGamaBaja();
		pc = new Monitor(pc);

		System.out.println(pc.getDescripcion());
                System.out.println("Su precio es:" + pc.getPrecio());

		EnVenta pc2 = new PCGamaAlta();
		pc2 = new GraficaGamer(pc2);
		pc2 = new Monitor(pc2);


		System.out.println(pc2.getDescripcion());
                System.out.println("Su precio es:" + pc2.getPrecio());

    }
    
}
