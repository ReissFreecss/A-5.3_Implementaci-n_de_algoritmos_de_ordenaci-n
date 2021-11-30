
package programas;

import static programas.Insercion.insertSort;
public class Radix {
    public static void main(String[] args) {
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
        
        insertSort(arreglo);//<-- Llamada al metodo al que le enviamos el parametro arreglo
        //Mostramos de nuevo el arreglo con los datos ORDENADOS
        System.out.println("Datos ordenados por burbuja:");
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
    
        
    }

public static void radixSort(int [] arreglo){
      int n = arreglo.length;
      if(arreglo.length == 0)
      return;
      int[][] np = new int[arreglo.length][2];
      int[] q = new int[0x100];
      int i,j,k,l,f = 0;
      for(k=0;k<4;k++) {
         for(i=0;i<(np.length-1);i++)
         np[i][1] = i+1;
         np[i][1] = -1;
         for(i=0;i<q.length;i++)
         q[i] = -1;
         for(f=i=0;i<arreglo.length;i++) {
            j = ((0xFF<<(k<<3))&arreglo[i])>>(k<<3);
            if(q[j] == -1)
            l = q[j] = f;
         else {
            l = q[j];
            while(np[l][1] != -1)
            l = np[l][1];
            np[l][1] = f;
            l = np[l][1];
         }
         f = np[f][1];
         np[l][0] = arreglo[i];
         np[l][1] = -1;
      }
      for(l=q[i=j=0];i<0x100;i++)
      for(l=q[i];l!=-1;l=np[l][1])
      arreglo[j++] = np[l][0];
   }

     

   }
 }
