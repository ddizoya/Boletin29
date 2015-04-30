/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;


public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Modelo mod = new Modelo();
      switch(menu()){
            case 0:
                int banderilla = JOptionPane.showOptionDialog(null, "¿De qué tipo?", null, JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yate","Deportivo","Velero"},null);
                if (banderilla == 1){
                    float potencia = Float.parseFloat(JOptionPane.showInputDialog("Introduce la potencia deseada."));
                    int nCamarotes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de camarotes deseados."));
                    int nDias = Integer.parseInt(JOptionPane.showInputDialog("Introduce los días de ocupación"));
                    int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud deseada"));
                    Barco obj = new Yate(longitud, nDias, potencia, nCamarotes);
                
                    
                }
        }
         
    }
    
    public static int menu(){
        int indice = JOptionPane.showOptionDialog(null, "¿De qué tipo?", null, JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Alquilar barco","Mostrar factura","Salir"},null);
        return indice;
    }
}
