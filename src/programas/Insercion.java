package programas;
public class Insercion {
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
    
    public static void insertSort(int [] arreglo){
        int [] a = arreglo;
        
	int i, j, aux; 
	int cont=0; 
        int ci = 0;
        
	for ( i = 1; i < a.length; i++){
		j = i;
		aux = a[i];
		while (j >0 && aux < a[j-1]){
                   cont++;
                   a[j] = a[j-1];
                   j--; 
		}
		a[j] = aux; 
	}
        
    }
}
