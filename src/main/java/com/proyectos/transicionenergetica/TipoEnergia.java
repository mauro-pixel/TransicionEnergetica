
package com.proyectos.transicionenergetica;


public class TipoEnergia  extends EnergiaRenovable{
    
    public String nombreTipoEnergia;

    public TipoEnergia(String tipo,String pais,int año,double produccion,double consumo,String nombreTipoEnergia) {
        super(tipo, pais, año, produccion, consumo);
        this.nombreTipoEnergia = nombreTipoEnergia;
    }
    
    public String getNombreTipoEnergia() {
        return nombreTipoEnergia;
    }

    public void setNombreTipoEnergia(String nombreTipoEnergia) {
        this.nombreTipoEnergia = nombreTipoEnergia;
    }
}
