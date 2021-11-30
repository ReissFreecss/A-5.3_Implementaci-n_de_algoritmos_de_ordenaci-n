/*Clase que genera un arreglo en el cual los datos ya se encuentran ordenados
gracias a los metodos de ordenamiento que se hicieron en la clase "DatosDesrodenados"
 */
package datos;

/**
 *
 * @author Noemí Lara Acono
 */
public class DatosOrdenados {
    //Arreglo que guaradara los valores 
    private int [] valores; 

    //Constructor al que le pasamos el arreglo y no genera numeros aleatorios, si no que ya los recibe ordenados
    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }
    
    //Metodo que devuelve cuantos datos hay en el arreglo
    public int getSize(){
        return valores.length; 
    }
    
    //El tosString para imprimir la lista ya ordenada
    @Override
    public String toString(){
        String cad = "Datos ordenados: ";
        for (int x : valores){//<-- Recorre el arreglo y lo concatena en la cadena 
            cad += x + ", ";
        }
        return cad;
    }
    
}