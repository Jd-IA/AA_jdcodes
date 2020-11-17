/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import aa20201.data.Grafica;
import busquedas.BusquedaSecuencial;
import busquedas.GeneradorDatos;
import busquedas.Busquedas;
import ordenamiento.Burbuja;
import Recu.Fibonnaci;
import java.util.Arrays;
import ordenamiento.BurbujaOp;
import ordenamiento.Insert_sort;
import ordenamiento.Merge_sort;
import ordenamiento.QuickSort;

//import java.awt.BasicStroke;
//import java.awt.Color;
//import javax.swing.JFrame;
//
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.chart.plot.XYPlot;
//import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
//import org.jfree.data.xy.XYSeries;
//import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author JD
 */
public class AA20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        int limite = 10000;
//        int[] aux;
//        double[] tiemposb1 = new double[limite];
//        double[] tiemposb2 = new double[limite];
//        double[] tiemposb3 = new double[limite];
//        
//        BusquedaSecuencial b1 = new BusquedaSecuencial();
//
//        
////        mejor caso
//        for (int j = 0; j < limite; j++){
//            aux = GeneradorDatos.generarArregloIntMejorCaso(6, j+1, 1000);
//            int pos = b1.buscar(aux, 6);
//            tiemposb1[j] = (int) b1.gettTotal();
//            //System.out.println("j= "+j+" :"+tiempos[j]);
//        }  
//        //medio caso
//        for (int j = 0; j < limite; j++){
//            aux = GeneradorDatos.generarArregloIntMedioCaso(6, j+1, 1000);
//            int pos = b1.buscar(aux, 6);
//            tiemposb2[j] = (int) b1.gettTotal();
//            //System.out.println("j= "+j+" :"+tiempos[j]);
//        }          
////        peor caso
//        for (int j = 0; j < limite; j++){
//            aux = GeneradorDatos.generarArregloIntPeorCaso(6, j+1, 1000);
//            int pos = b1.buscar(aux, 6);
//            tiemposb3[j] = (int) b1.gettTotal();
//            //System.out.println("j= "+j+" :"+tiempos[j]);
//        }  
//        
//        System.out.println();        
//        
//        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
//        g1.agregarSerie("mejor",tiemposb1);
//        g1.agregarSerie("medio",tiemposb2);
//        g1.agregarSerie("peor",tiemposb3);
//        g1.crearGrafica();
//        g1.muestraGrafica();
//        
                
        //System.out.println("T: "+b1.gettTotal()+"");
        
        /* Guardar los tiempos      insetshort        
        int n = 500;
        int[] aux;

        double[] tiempos = new double[n];
        double[] tiempos2 = new double[n];

        Burbuja b = new Burbuja();
        
//       aux = GeneradorDatos.generarArregloPeor(n,1000);
        //b.ordenar(aux);
       
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j,1000);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
            System.out.println();
        }  
         for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloMejor(j,1000);
            b.ordenar(aux);
            tiempos2[j] = (int) b.gettTotal();
            System.out.println();
        }  
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("t1",tiempos);
        g1.agregarSerie("t2",tiempos2);
        g1.crearGrafica();
        g1.muestraGrafica();*/
        
        
        
        /*     //Guardar los tiempos             
        int n = 50;


        double[] tiempos = new double[n];
        double[] tiempos2 = new double[n];

        Fibonnaci b = new Fibonnaci ();
        
//       aux = GeneradorDatos.generarArregloPeor(n,1000);
        //b.ordenar(aux);
       
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){

            b.ordenarFiboNR(n);
            tiempos[j] = (int) b.gettTotal();
            System.out.println();
        }  
         for (int j = 0; j < n; j++){
            b.ordenarFiboR(n);
            tiempos2[j] = (int). b.gettTotal();
            System.out.println();
        }  
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("t1",tiempos);//no recursivo
        g1.agregarSerie("t2",tiempos2);//recursivo
        g1.crearGrafica();
        g1.muestraGrafica();
     */
        
        int n = 15;
        int[] aux;

        double[] tiempos = new double[n];//burbuja
        double[] tiempos2 = new double[n];//inser sort
        double[] tiempos3 = new double[n];// merge sort
        
        BurbujaOp b = new BurbujaOp();
        
        Burbuja u = new Burbuja();
        
        QuickSort x= new QuickSort();
        
        Insert_sort in = new Insert_sort();
        
        Merge_sort ms = new Merge_sort();
        
                    aux = GeneradorDatos.generarArregloMedio(n);
                    

        
        


//        x.quicksort(aux,0,aux.length - 1);
        
         System.out.println("Después de QS: " + Arrays.toString(aux));
        
       
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
//        for (int j = 0; j < n; j++){
//            aux = GeneradorDatos.generarArregloPeor(j);
//            b.ordenarBop(aux);
//            tiempos[j] = (int) b.gettTotal();
//            System.out.println();
//        }  
//        for (int j = 0; j < n; j++){
//            aux = GeneradorDatos.generarArregloPeor(j);
//            in.ordenarInSert(aux);
//            tiempos2[j] = (int) in.gettTotal();
//            System.out.println();
//        }  
//        for (int j = 0; j < n; j++){
//            aux = GeneradorDatos.generarArregloPeor(j);
//            ms.ordenar_Merge_sort(aux);
//            tiempos3[j] = (int) ms.gettTotal();
//            System.out.println();
//        } 
//        System.out.println();
//        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
//        g1.agregarSerie("burbuja",tiempos);
//        g1.agregarSerie("Insert",tiempos2);
//        g1.agregarSerie("Merge",tiempos3);
//        g1.crearGrafica();
//        g1.muestraGrafica();
        

    }
    
}
