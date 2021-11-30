package programas;

import java.util.ArrayList;
 
public class radix {
 
    public static void main(String[] args) {
  int n=1000;
        int [] arreglo = new int[n];
        for (int i=0; i<n; i++){
            arreglo[i] = (int)(Math.random() * 2000) + 1;
        }
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
       radixSort(arreglo);
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
    }
    
    public static void radixSort(int[] arr) {
        int digit = getMaxDigit (arr); // obtiene el número máximo de dígitos
        for (int i = 0; i < digit; i++) {
                         bucketSort (arr, i); // ordena bucketSort por dígitos veces
        }
    }
 
    public static int getMaxDigit(int[] arr) {
                 int digit = 1; // el valor predeterminado es solo un dígito
                 int base = 1000; // Cada dígito adicional en decimal significa que su valor es 10 veces mayor
        for (int i : arr) {
            while (i > base) {
                digit++;
                base *= 1000;
            }
        }
        return digit;
    }
 
    public static void bucketSort(int[] arr, int digit) {
        int base = (int) Math.pow(1000, digit);
        // init buckets
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
                 for (int i = 0; i <1000; i ++) {// Solo hay diez números del 0 al 9, así que prepara diez cubos
            buckets.add(new ArrayList<Integer>());
        }
        // sort
        for (int i : arr) {
            int index = i / base % 1000;
            buckets.get(index).add(i);
        }
        // output: copy back to arr
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int i : bucket) {
                arr[index++] = i;
            }
        }
    }
 
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
