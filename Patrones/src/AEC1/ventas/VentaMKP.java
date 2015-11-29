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
public class VentaMKP extends Venta {

    private String MKP;
    private String pais;
    //En VentaMKP se encarga el MKP de la gestión del envio.
    
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setMKP(String MKP) {
        this.MKP = MKP;
    }

    public String getMKP() {
        return MKP;
    }
    



}
