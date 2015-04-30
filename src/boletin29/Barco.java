/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.Random;
import javax.swing.JOptionPane;


public abstract class Barco implements IBarco {
       private Random rd = new Random();
       static int stock = 130;
       public int diasDeOcupacion;
       public float longitud;
       public String matricula = "PO"+rd.nextInt(10000)+"ES"+rd.nextInt(30);
       public float alquiler = (float) 130.60;
       public float precio = (float)20.45;

    public Barco(float longitud, int diasDeOcupacion){
        this.longitud = (float)longitud;
        this.diasDeOcupacion= diasDeOcupacion;
        
        }
    
    public float alquiler (){
        alquiler = longitud * 10;
        return alquiler;
    }
    
      public void factura() {
        JOptionPane.showMessageDialog(null, "***Factura*** \n "
                + "Alquiler: " + alquiler + "\n"
                + "Matrícula: " + matricula + "\n"
                + "Longitud: " + longitud + "\n"
                + "***FIN FACTURA***");
                
    }

}
