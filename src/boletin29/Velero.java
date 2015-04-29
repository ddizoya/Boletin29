/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

public class Velero extends Barco{
    private int nMastiles;

    public Velero(int nMastiles, int diasDeOcupacion, float longitud, String matricula, float alquiler, float precio) {
        super(diasDeOcupacion, longitud, matricula, alquiler, precio);
        this.nMastiles = nMastiles;
    }

    
}
