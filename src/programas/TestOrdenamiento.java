/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import datos.DatosDesordenados;
import datos.DatosOrdenados;
import javax.swing.JOptionPane;

public class TestOrdenamiento {

    public static void main(String[] args) {
        //Declaracion de variables:
        DatosDesordenados m;
        int n, s;
        long t, t1, t2;

        //Pedimos los datos: 
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuántos datos son?"));
        s = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuál es el valor máximo?"));

        //Construimos el arreglo de datos desordenados con los parametros pedidos n, s:
        m = new DatosDesordenados(s, n);

        //Los datos los guardamos en la variable m y lo enviamos al metod que genra los datos aleatorios
        m.generarValores();

        //Imprimimos los datos desordenados:
        System.out.println("" + m);
        System.out.println("");

        System.out.println("Ordenamiento por burbuja:");
        t1 = System.nanoTime();//<-- Star
        DatosOrdenados mob = m.bubbleSort();//<-- Ordenamos
        t2 = System.nanoTime(); //<-- Stop
        t = t2 - t1;
        System.out.println("n=" + n);
        System.out.println(mob);
        System.out.println("tiempo= " + t + "ns");
        System.out.println("");

        System.out.println("Ordenamiento por Insercion:");
        t1 = System.nanoTime();//<-- Star
        DatosOrdenados moi = m.insertSort();//<-- Ordenamos
        t2 = System.nanoTime(); //<-- Stop
        t = t2 - t1;
        System.out.println("n=" + n);
        System.out.println(moi);
        System.out.println("tiempo= " + t + "ns");
        System.out.println("");

        System.out.println("Ordenamiento por mezcla:");
        t1 = System.nanoTime();//<-- Star
        DatosOrdenados mog = m.mergeSort();//<-- Ordenamos
        t2 = System.nanoTime(); //<-- Stop
        t = t2 - t1;
        System.out.println("n=" + n);
        System.out.println(mob);
        System.out.println("tiempo= " + t + "ns");
        System.out.println("");

        System.out.println("Ordenamiento por Quicksort:");
        t1 = System.nanoTime();//<-- Star
        DatosOrdenados moq = m.Quicksort();//<-- Ordenamos
        t2 = System.nanoTime(); //<-- Stop
        t = t2 - t1;
        System.out.println("n=" + n);
        System.out.println(mob);
        System.out.println("tiempo= " + t + "ns");
        System.out.println("");

        System.out.println("Ordenamiento por ShellSort:");
        t1 = System.nanoTime();//<-- Star
        DatosOrdenados mos = m.ShellSort();//<-- Ordenamos
        t2 = System.nanoTime(); //<-- Stop
        t = t2 - t1;
        System.out.println("n=" + n);
        System.out.println(mob);
        System.out.println("tiempo= " + t + "ns");
        System.out.println("");
        
        System.out.println("Ordenamiento por Radix:");
            t1 = System.nanoTime();//<-- Star
            DatosOrdenados mor = m.radixSort();//<-- Ordenamos
            t2 = System.nanoTime(); //<-- Stop
            t= t2 - t1;
            System.out.println("n="+ n);
            System.out.println(mob);
            System.out.println("tiempo= "+t+"ns");

    }
}
    


