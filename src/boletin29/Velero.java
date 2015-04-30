/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

public class Velero extends Barco {

    private int nMastiles;

    public Velero(int diasDeOcupacion, float longitud, int nMastiles) {
        super(longitud, diasDeOcupacion);
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    
    @Override
    public void modulo() {
        alquiler = super.alquiler() + precio * nMastiles;
    }

    @Override
    public void factura(){
        super.factura();
    }
  
}
