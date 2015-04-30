/*
 * 
 */
package boletin29;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice;
        Modelo mod = new Modelo();
        do {
            indice = menu();
            switch (indice) {
                case 0:
                    int banderilla = JOptionPane.showOptionDialog(null, "¿De qué tipo?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yate", "Deportivo", "Velero"}, null);
                    if (banderilla == 0) {
                        float potencia = Float.parseFloat(JOptionPane.showInputDialog("Introduce la potencia deseada."));
                        int nCamarotes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de camarotes deseados."));
                        int nDias = Integer.parseInt(JOptionPane.showInputDialog("Introduce los días de ocupación"));
                        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud deseada"));

                        Barco obj = new Yate(longitud, nDias, potencia, nCamarotes);
                        mod.listado.put(Barco.stock, obj);
                        JOptionPane.showMessageDialog(null, "Guarde el CÓDIGO para poder saber su factura:" + Barco.stock);
                        Barco.stock--;
                        break;

                    } else if (banderilla == 1) {
                        float potencia = Float.parseFloat(JOptionPane.showInputDialog("Introduce la potencia deseada."));
                        int nDias = Integer.parseInt(JOptionPane.showInputDialog("Introduce los días de ocupación"));
                        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud deseada"));

                        Barco obj = new Deportivo(longitud, nDias, potencia);
                        mod.listado.put(Barco.stock, obj);
                        JOptionPane.showMessageDialog(null, "Guarde el CÓDIGO para poder saber su factura:" + Barco.stock);
                        Barco.stock--;
                        break;
                    } else {
                        int nMastiles = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de mástiles que desee que tenga."));
                        int nDias = Integer.parseInt(JOptionPane.showInputDialog("Introduce los días de ocupación"));
                        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud deseada"));

                        Barco obj = new Velero(longitud, nDias, nMastiles);
                        mod.listado.put(Barco.stock, obj);
                        JOptionPane.showMessageDialog(null, "Guarde el CÓDIGO para poder saber su factura:" + Barco.stock);
                        Barco.stock--;
                        break;
                    }
                case 1:
                    //Imprimir factura.

            }
        } while (indice != 2);
   }

    public static int menu() {
        int indice = JOptionPane.showOptionDialog(null, "Indique lo que quiera hacer.", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Alquilar barco", "Mostrar factura", "Salir"}, null);
        return indice;
    }
}
