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
public final class VentaWeb extends VentaExtras{

    private float coste;
    private String web;

    public String getWeb() {
        return web;
    }
    
    
    public VentaWeb(EnVenta EnVenta) {
        super(EnVenta);
    }


    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }


    public VentaWeb(String descripcion,EnVenta EnVenta) {
        super(EnVenta);

    }

    @Override
    public float getPrecio() {
        return getEnVenta().getPrecio() + coste; 
    }

    public VentaWeb() {
        super(null);
    }

    @Override
    protected String getBodyHTML() {
        //Clase que genera el body del html
        String body = null;
        String articuloTemp;
        //Se muestra en lista separados por saltos de linea
        body = "Id Venta "+getidVenta()+"\n";
        //Recorremos la lista de los articulos
        List<String> articulos = getArticulo();
        body = body+"ARTICULOS\n";
        for(String articulo : articulos){
            articuloTemp = "\t"+articulo+"\n";
            body = body+articuloTemp;
        }
        //Añadimos el precio final
        body = body+"PRECIO FINAL: "+getPrecio()+"\n";
        return body;
    }

    @Override
    public String getidVenta() {
       return this.getWeb()+"-"+getEnVenta().getidVenta();
    }

    @Override
    public List getArticulo() {
       List articulos = getEnVenta().getArticulo();
       return articulos;
    }


}
