/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEC1;

import java.util.List;
import AEC1.*;
import AEC1.ventas.EnVenta;
import AEC1.ventas.VentaMKP;

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
    
    public String getHTML(List<String> parametros){
       
        return "html";
    }
    
    public static void main(String[] args) {
      
        EnVenta ventaMKP = new VentaMKP();
        System.out.println(ventaMKP.html());
        
        
        
    }
   
}
