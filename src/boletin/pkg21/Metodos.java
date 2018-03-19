
package boletin.pkg21;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Metodos {
    
    Palabras[]listaPalabras=new Palabras[4];
    
    //Engade palabras ao Array.
    public void engadir(){
        for(int i=0;i<listaPalabras.length;i++){
            String palabraE=JOptionPane.showInputDialog("Introduzca palabra: ");
            listaPalabras[i]=new Palabras(palabraE);
        }
    }
    
    //Ordea as palabras do Array alfabeticamente.
    public void ordenarPalabras(){
        Arrays.sort(listaPalabras);
    }
    
    //Escribe as palabras ordeadas e numeradas nun ficheiro de texto.
    public void escribirFicheiro(){
        File fich=new File("palabras.txt");
        PrintWriter escribir;
        
        try {
            escribir=new PrintWriter(fich);
            
            //Recorre o Array e escribe as palabras numeradas.
            for(int i=0;i<listaPalabras.length;i++){
                escribir.println((i+1)+".- "+listaPalabras[i]);
            }
            escribir.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
