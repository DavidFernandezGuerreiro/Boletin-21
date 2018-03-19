
package boletin.pkg21;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx=new Metodos();
        obx.engadir();
        obx.ordenarPalabras();
        obx.escribirFicheiro();
    }
    
}
