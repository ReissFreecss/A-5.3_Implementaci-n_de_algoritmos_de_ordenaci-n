/*Pruebas con el metodo burbuja.
 */
package programas;
/**
 *
 * @author Noemí
 */
public class Burbuja {//Este es el algoritmo de burbuja en una clase 
    
    public static void main(String []  args){
        //Numeros de datos a ordenar:
        int n=10; 
        int [] arreglo = new int[n];
        
        //Ciclo que genera los datos aleatorios:
        for (int i=0; i<n; i++){
            arreglo[i] = (int)(Math.random() * 100) + 1;
        }
        
        //Clclo for que muestra el contenido del arreglo desordenado:
        System.out.println("Datos desordenados:");
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println(" ");// <-- Simple salto de linea
        
        bubbleSort(arreglo);//<-- Llamada al metodo al que le enviamos el parametro arreglo
        //Mostramos de nuevo el arreglo con los datos ORDENADOS
        System.out.println("Datos ordenados por burbuja:");
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
    }
    
    //Este es el metodo de ordenacion bubbleSort:
    public static void bubbleSort(int [] arreglo){
        int n = arreglo.length;
        //Cliclos anidados:
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-i-1; j++){
                
                //Comparaciones:
                if (arreglo[j] > arreglo[j+1]){
                    // Permutacioens: swap
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temporal;
                }
            }
        }
        
    }
}
