/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEC1;

import java.util.List;
import AEC1.*;
import AEC1.ventas.EnVenta;
import AEC1.ventas.Venta;
import AEC1.ventas.VentaMKP;
import AEC1.ventas.VentaWeb;
import java.util.ArrayList;

/**
 *
 * @author jfhs1
 */
public class Facade {
    
    private static Facade instancia;
    String operario;
    
    public static Facade getIntancia() {
        if(instancia == null){
            instancia = new Facade();
        }
        return instancia;
    }

    private Facade() {
        operario="Automatico";
    }

    public void setOperario(String operario) {
        this.operario = operario;
    }

    public Facade(String operario) {
        this.operario = operario;
    }

    public String getOperario() {
        return operario;
    }
    
    public String getHTML(){
       
        String retornar = "<!DOCTYPE html><html><head><title>" + "</title></head><body>";
        return retornar;
    }
    
    public static void main(String[] args) {
      
        Facade facade = Facade.getIntancia();
        facade.setOperario("JF");
        Venta vendido = new Venta();
        vendido.setPrecio(1);
        vendido.setIdVenta("123");
        List<String> articulos = new ArrayList();
        articulos.add("Articulo 1");
        articulos.add("Articulo 2");
        vendido.setArticulo(articulos);
        
       VentaWeb ventaweb = new VentaWeb(vendido);
       ventaweb.setCoste(2);
       ventaweb.setVendedor(facade.operario);

       System.out.println(ventaweb.getHTML());
    }
   
}
