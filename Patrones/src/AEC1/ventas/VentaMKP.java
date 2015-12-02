/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEC1.ventas;

import java.util.List;

/**
 *
 * @author jfhs1
 */
public class VentaMKP extends VentaExtras {

    float porcentaje;
    String MKP;

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public VentaMKP(float porcentaje, AEC1.ventas.EnVenta EnVenta) {
        super(EnVenta);
        this.porcentaje = porcentaje;
    }

    public VentaMKP(EnVenta EnVenta) {
        super(EnVenta);
    }

    @Override
    public float getPrecio() {
        float total = getEnVenta().getPrecio();
        float descontado = (total * porcentaje) / 100;
        return total - descontado;
    }

    @Override
    protected String getBodyHTML() {
        String body = null;
        String articuloTemp = null;

        //Obtenemos el nombre del MKP
        String mkp = this.getMKP();
        body = "\nSitio Web: " + mkp + "\n";
        //Los articulos
        List<String> articulos = this.getArticulo();
        body = body + "ARTICULOS\n";
        for (String articulo : articulos) {
            articuloTemp = "\t" + articulo + "\n";
            body = body + articuloTemp;
        }
        //OBTENEMOS EL ID DE LA VENTA
        body =body + "Id Venta " + getidVenta() + "\n";
        //EL PERCIO FINAL
        body = body + "PRECIO FINAL: " + getPrecio() + "\n";

        body = body + "\n\nMuchas gracias por confiar en nosotros en su MarketPlace favorito\n";
        return body;
    }

    public void setMKP(String MKP) {
        this.MKP = MKP;
    }

    private String getMKP() {
        return this.MKP;
    }

    @Override
    public String getidVenta() {
        return this.getMKP() + "-" + getEnVenta().getidVenta();
    }

    @Override
    public List getArticulo() {
        List articulos = getEnVenta().getArticulo();
        return articulos;
    }

}
