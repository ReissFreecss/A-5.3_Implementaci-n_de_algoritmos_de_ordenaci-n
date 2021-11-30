
package programas;

public class ShellSort {
    public static void main(String[] args) {
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
        
        shellSort(arreglo);//<-- Llamada al metodo al que le enviamos el parametro arreglo
        //Mostramos de nuevo el arreglo con los datos ORDENADOS
        System.out.println("Datos ordenados por shellsort:");
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
    }
    
    public static void shellSort(int arreglo[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < arreglo.length; i++)   // se da una pasada
                {
                    if (arreglo[i - salto] > arreglo[i]) {       // y si están desordenados
                        aux = arreglo[i];                  // se reordenan
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
     }
    
}
