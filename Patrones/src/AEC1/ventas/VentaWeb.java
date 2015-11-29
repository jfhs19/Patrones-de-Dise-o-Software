/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEC1.ventas;

/**
 *
 * @author jfhs1
 */
public class VentaWeb extends Venta  {
   
    //En VentaWeb se almacena la agencia encargada del envio.
    private String web;
    private String agencia;

    public String getAgencia() {
        return agencia;
    }

    @Override
    public String getFecha() {
        return super.getFecha(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIdUser() {
        return super.getIdUser(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPrecio() {
        return super.getPrecio(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getWeb() {
        return web;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setWeb(String web) {
        this.web = web;
    }

}
