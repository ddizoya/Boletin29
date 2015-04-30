/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

public class Yate extends Barco {

    private float potencia;
    private int nCamarotes;

    public Yate(float longitud, int diasDeOcupacion, float potencia, int nCamarotes) {
        super(longitud, diasDeOcupacion);
        this.potencia = potencia;
        this.nCamarotes = nCamarotes;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    @Override
    public void modulo() {
        alquiler = super.alquiler() + precio * potencia + precio * nCamarotes;
    }

    @Override
    public void factura() {
        JOptionPane.showMessageDialog(null, "***Factura*** \n "
                + "Alquiler: " + alquiler + "\n"
                + "Matrícula: " + matricula + "\n"
                + "Longitud: " + longitud + "\n"
                + "Número de camarotes: " + nCamarotes + "\n"
                + "Potencia: " + potencia + "\n"
                + "***FIN FACTURA***");

    }

}
