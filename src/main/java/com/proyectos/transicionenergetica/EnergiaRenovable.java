/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.transicionenergetica;

/**
 *
 * @author mauro
 */
public class EnergiaRenovable {
    
    public String tipo;
    public String pais;
    public int año;
    public  double produccion;
    public  double consumo;

    public EnergiaRenovable(String tipo,String pais,int año,double produccion,double consumo) {      
        this.tipo = tipo;
        this.pais = pais;
        this.año = año;
        this.produccion = produccion;
        this.consumo = consumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getProduccion() {
        return produccion;
    }

    public void setProduccion(double produccion) {
        this.produccion = produccion;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
       
    
}
