/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author Bea
 */
public abstract class Barco implements IBarcos {
       private int diasDeOcupacion;
       private float longitud;
       private String matricula;
       private float alquiler;

    public Barco(int diasDeOcupacion, float longitud, String matricula, float alquiler, float precio) {
        this.diasDeOcupacion = diasDeOcupacion;
        this.longitud = longitud;
        this.matricula = matricula;
        this.alquiler = alquiler;
    }      
}
