
package boletin.pkg21;

/**
 *
 * @author David
 */
public class Palabras implements Comparable{
    private String palabra;

    public Palabras() {
    }

    public Palabras(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return palabra;
    }
    
    //Ordea alfabeticamente as palabras:
    @Override
    public int compareTo(Object o){
        Palabras p=(Palabras)o;
        if(palabra.compareToIgnoreCase(p.getPalabra())>0){
            return 1;
        }else if(palabra.compareToIgnoreCase(p.getPalabra())==0){
            return 0;
        }else
            return -1;
    }
    
    
}
