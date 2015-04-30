/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

public class Deportivo extends Barco {
    private float potencia;

    public Deportivo(int diasDeOcupacion, float longitud, float potencia) {
        super(diasDeOcupacion, longitud);
        this.potencia=potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public void modulo() {
       alquiler = super.alquiler() + (precio * potencia);
    }
    @Override
    public void factura(){
        super.factura();
    }

}
