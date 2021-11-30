package programas;
public class QuickSort {
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
        
        Quicksort(arreglo, 0, arreglo.length -1);//<-- Llamada al metodo al que le enviamos el parametro arreglo
        //Mostramos de nuevo el arreglo con los datos ORDENADOS
        System.out.println("Datos ordenados por Quicksort:");
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
         
    }
    
    
    //Metodo de Ordenamiento QuickSort
    public static void Quicksort(int arreglo[], int izq, int der){
        
            //Se toma como pivote el primer valor
            int pivote = arreglo[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
           
            while(i<j)
            {
               while (arreglo[i] <= pivote && i < j) 
                  i++;

               while (arreglo[j] > pivote) 
                  j--;   

               if (i<j) 
               {                                     
                   aux = arreglo[i];                  
                   arreglo[i]= arreglo[j];
                   arreglo[j]=aux;
               }
            }

             arreglo[izq] = arreglo[j]; 
             arreglo[j] = pivote;

             if (izq < j-1)
                Quicksort(arreglo,izq,j-1);

             if (j+1 < der)
                Quicksort(arreglo,j+1,der);
      }
}
    
    
    

