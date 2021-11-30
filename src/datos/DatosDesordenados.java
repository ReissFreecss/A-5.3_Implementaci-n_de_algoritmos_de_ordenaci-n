/*Clase que contien los algoritmos de ordenamiento*/
package datos;

import static programas.QuickSort.Quicksort;

/**
 *
 * @author Noemí Lara Acono
 */
public class DatosDesordenados {
    // Atributos
    private int[] valores;//<-- Arreglo donde se van a guardar los datos desordenados
    private int limiteSuperior;//<-- Rango de los datos hasta que valor se van a generar
    private int size;//<-- Tamaño o n numeros de datos  

    //Metodo constructor que inicializa los atributos de la clase:
    public DatosDesordenados(int limite, int size) {
        this.valores = new int[size];
        this.limiteSuperior = limite;
        this.size = size;
    }
    
    //Agregamos un valor > dicho valor se guarda en size
    public void agregarDato(int valor){
        valores[size]= valor;
        size++;
    }
    
    //Obtener dato que este en la posicion que pasamos como aprametro
    public int getDato(int posicion){
        return valores[posicion];
    }
    
    //Metodo para generar los valores de forma aleatoria  
    public void generarValores(){
        for (int i=0; i < valores.length; i++){//<-- generara valores en el areglo desde la celda 0 hata la ultima celda
            double aleatorio = Math.random() * limiteSuperior;//<-- "limite superiro" es hasta que rango generare numeros aleatorios
            valores[i] = (int) aleatorio + 1;//<-- Aqui se guardan los datos en el arreglo que seran los datos desorndenados
        }
    }
    
    //Geters nesesarios de la clase
    public int getSize(){
        return size;}
    
    public int getCapacidad(){
        return valores.length;}
    
    public int getLimiteSuperior(){
        return limiteSuperior;}
    
    
    public int[] getValores(){
        return valores;} 
    
    //Este metodo nos da un una copia del arreglo desordenado:
    public int[] getCopiaValores(){
        int [] copia = new int[size];
        System.arraycopy(valores, 0, copia, 0, size);
        return copia;}
    
    
   
     public DatosOrdenados algoritmoSort(){
        
        // obtener una copia de los datos desordenados
        int [] arreglo = this.getCopiaValores();
        
        // agregar algoritmo de ordenación
        
        // enviamos los datos ordenados a la clase DatosOrdenados colocamos los datos que estan en el arreglo en la clase datos ordenados
        return new DatosOrdenados(arreglo);
    }
     
     public DatosOrdenados ShellSort(){
        
        // obtener una copia de los datos desordenados
        int [] arreglo = this.getCopiaValores();
        
        // agregar algoritmo de ordenación
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
     
        // enviamos los datos ordenados a la clase DatosOrdenados colocamos los datos que estan en el arreglo en la clase datos ordenados
        return new DatosOrdenados(arreglo);
    }
     
     
      public DatosOrdenados Quicksort(){
        // obtener una copia de los datos desordenados
        int [] arreglo = this.getCopiaValores();
        int izq = 0;
        int der = 0;
        int cont = 0;
        int ci = 0;
        
        // agregar algoritmo de ordenación
            int pivote = arreglo[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
        
            int j = der; 
            int aux;
           
            while(i<j){
               while (arreglo[i] <= pivote && i < j) 
                  i++;

               while (arreglo[j] > pivote) 
                  j--;   

               if (i<j){
                   aux = arreglo[i];                  
                   arreglo[i]= arreglo[j];
                   arreglo[j]=aux;
               }
            }

             arreglo[izq] = arreglo[j]; 
             arreglo[j] = pivote;

             
        // enviamos los datos ordenados a la clase DatosOrdenados colocamos los datos que estan en el arreglo en la clase datos ordenados
        return new DatosOrdenados(arreglo);
    }
    
    public DatosOrdenados bubbleSort(){
        //Obtener una copia de los datos desordenados
        int [] arreglo = this.getCopiaValores();
        
        int n = arreglo.length;
        int cont = 0;
        int ci = 0;
        
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-i-1; j++){
                cont++;
                if (arreglo[j] > arreglo[j+1]){
                    // intercambiar: swap
                    ci++;
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temporal;
                }
            }
        }
        System.out.println("BS-comparaciones = " + cont);
        System.out.println("BS-intercambios = " + ci);
        return new DatosOrdenados(arreglo);
    }
    
       
    
    public DatosOrdenados insertSort(){
         // obtener una copia de los datos desordenados
        int [] a = this.getCopiaValores();
        
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
        System.out.println("IS-comparaciones = " + cont);
	// devolver los datos ordenados
        return new DatosOrdenados(a);
    }
    
    public DatosOrdenados mergeSort(){
    int [] x = this.getCopiaValores();
	// Aquí va la llamada al método mergesort( arreglo, l, r)
	this.mergesort( x, 0, x.length - 1);
        System.out.println("MS-comparaciones = " + cm);
	
        return new DatosOrdenados(x);
    } // fin del método ordenacionMerge
    
   private void mergesort (int v[], int l, int r) {
		 int m = (r+l)/2; 
		 if (r > l) { 
                     cm++;
			 mergesort (v, l, m);
			 mergesort (v, m+1, r); 
			 merge (v, l, m, r); 
		 }
	}
    static int cm=0;
   private void merge (int v[], int l, int m, int r)
	{
	//Encuentra el tamaño de los sub-vectores para unirlos.
	  int n1 = m - l + 1;
	  int n2 = r - m;

	  //Vectores temporales.
	  int arrIzq[] = new int [n1];
	  int arrDer[] = new int [n2];

	  //Copia los datos a los arreglos temporales.
	  for (int i=0; i < n1; i++) {
              cm++;
		arrIzq[i] = v[l+i];
	  }
	  for (int j=0; j < n2; j++) {
              cm++;
		arrDer[j] = v[m + j + 1];
	  }
	  // Combinación (mezcla) de los dos arreglos:
	  int i = 0, j = 0;
	  int k = l;
	  while (i < n1 && j < n2) {//Ordenamiento.
                cm++;
		if (arrIzq[i] <= arrDer[j]) {
			v[k] = arrIzq[i];
			i++;
		} else {
			v[k] = arrDer[j];
			j++;
		}
		k++;
	  }//Fin del while. 

	  /* Si quedan elementos por ordenar */
	  //Copiar los elementos restantes de arrIzq[].
	  while (i < n1) {
              cm++;
	    v[k] = arrIzq[i];
	    i++;
	    k++;
	  }
	  //Copiar los elementos restantes de arrDer[].
	  while (j < n2) {
              cm++;
	    v[k] = arrDer[j];
	    j++;
	    k++;
	  }
	}
    
    @Override
    public String toString(){
        String cad = "Datos DESORDENADOS: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
    
    
}
