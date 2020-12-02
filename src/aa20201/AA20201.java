/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import Mochiila.Articulo;
import Mochiila.LeerData;
import aa20201.data.Grafica;
import busquedas.BusquedaSecuencial;
import busquedas.GeneradorDatos;
import busquedas.Busquedas;
import ordenamiento.Burbuja;
import Recu.Fibonnaci;
import TSP.AlgoritmoDijkstra;
import TSP.Camino;
import java.util.ArrayList;
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
        
       /* int n = 10000;
        int[] aux;

//        double[] tiempos = new double[n];//burbuja
//        double[] tiempos2 = new double[n];//inser sort
        double[] tiempos3 = new double[n];// merge sort        
//        double[] tiempos4 = new double[n];//burbuja op
        double[] tiempos5 = new double[n];// quicksort
        
//        BurbujaOp b = new BurbujaOp();
//        
//        Burbuja u = new Burbuja();
        
        QuickSort x= new QuickSort();
        
//        Insert_sort in = new Insert_sort();
        
        Merge_sort ms = new Merge_sort();
        
        
//        aux = GeneradorDatos.generarArregloPeor(n);
//                    
//        u.ordenar(aux);
//        
//       System.out.println("Después de QS: " + Arrays.toString(aux));
        
       
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        
//        for (int j = 0; j < n; j++){//burbuja
//            aux = GeneradorDatos.generarArregloPeor(j);
//            u.ordenar(aux);
//            tiempos[j] = (int) u.gettTotal();
//            System.out.println();
//        }  
//        for (int j = 0; j < n; j++){//insertsort
//            aux = GeneradorDatos.generarArregloPeor(j);
//            in.ordenarInSert(aux);
//            tiempos2[j] = (int) in.gettTotal();
//            System.out.println();
//        }  
        for (int j = 0; j < n; j++){//mergesort
            aux = GeneradorDatos.generarArregloPeor(j);
            ms.ordenar_Merge_sort(aux);
            tiempos3[j] = (int) ms.gettTotal();
            System.out.println();
        } 
//        for (int j = 0; j < n; j++){//burbuja op
//            aux = GeneradorDatos.generarArregloPeor(j);
//            b.ordenarBop(aux);
//            tiempos4[j] = (int) b.gettTotal();
//            System.out.println();
//        }  
        for (int j = 0; j < n; j++){//quicksort
            aux = GeneradorDatos.generarArregloPeor(j);
            x.ordenarQS(aux);
            tiempos5[j] = (int) x.gettTotal();
            System.out.println();
        } 
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Peor");
//        g1.agregarSerie("Burbuja",tiempos);
//        g1.agregarSerie("Insert",tiempos2);
        g1.agregarSerie("Merge",tiempos3);
//        g1.agregarSerie("BurbujaOP",tiempos4);
        g1.agregarSerie("Quicksort",tiempos5);
        g1.crearGrafica();
        g1.muestraGrafica();*/
//        MAIN PARA LA COMPARACIÓN DE LOS METODOS DE ORDENAMIENTO
//        int n = 40;
//
//
//        double[] tiempos = new double[n];//recursivo
//        double[] tiempos2 = new double[n];//recursivodinamico
//        double[] tiempos3 = new double[n];//Iterativo
//        double[] tiempos4 = new double[n];//iterativodinammico
//
//
//        Fibonnaci b = new Fibonnaci ();
//        Fibonnaci b2 = new Fibonnaci ();
//        Fibonnaci b3 = new Fibonnaci ();
//        Fibonnaci b4 = new Fibonnaci ();
//
//
//
//        for (int j = 1; j <=n; j++){
//            b.calcularTFiboR(j);//recursivo
//            tiempos[j-1] = (int) b.gettTotal();
//            System.out.println();
//        }  
//        for (int j = 1; j <=n; j++){
//            b2.calcularTFiboRD(j);//recursivo dinamico
//            tiempos2[j-1] = (int) b2.gettTotal();
//            System.out.println();
//        }  
//        for (int j = 1; j <=n; j++){
//            b3.calcularTFiboNR(j);//Iterativo
//            tiempos3[j-1] = (int) b3.gettTotal();
//            System.out.println();
//        }  
//        for (int j = 1; j <=n; j++){
//            b4.calcularTFiboNRD(j);//Iterativo D
//            tiempos4[j-1] = (int) b4.gettTotal();
//            System.out.println();
//        }         
//        System.out.println();
//        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
//        g1.agregarSerie("Recursivo",tiempos);//recursivo
//        g1.agregarSerie("Recursivo D",tiempos2);//recursivoDinamico
//        g1.agregarSerie("Iterativo",tiempos3);//Iterativo
//        g1.agregarSerie("Iterativo D",tiempos4);//Iterativo D
//        g1.crearGrafica();
//        g1.muestraGrafica();
        
//            IMPLEMENTACION DEL TSP
//        AlgoritmoDijkstra aux;
//        for (int x=0 ; x < 5;x++){
//        aux = new AlgoritmoDijkstra(5);
//        Camino c = aux.buscarCamino(x);
//        System.out.println("Ciudad= "+x+" Distancia: "+c.getDistanciaRecorrida());        
//        }   

//        Minima Distancia 
        /**distancias 
        (2.4,5.6,3)   (5,6,3) d1:
        (1,2) (6.7,7.8)  d2:
        **/
        //Patron p1 = new Patron("", "", new double[]{1,2});
        //Patron p2 = new Patron("", "", new double[]{6.7,7.8});
        //System.out.println(p2.calcularDistancia(p1)); 
//        
//        ArrayList<Articulo> instancias = LeerData.tokenizarDataSet();
//        ArrayList<Articulo>  promedios= new ArrayList<>();
//        ArrayList<Articulo>  nombres= new ArrayList<>();



    
    }
}
