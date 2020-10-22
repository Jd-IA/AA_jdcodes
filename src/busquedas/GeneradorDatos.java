/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

import java.util.Random;

/**
 *
 * @author JD
 */
public class GeneradorDatos {
   //
    // "aleatorio"
    public static int[] generarArregloInt(int x, int dim, int bound){
        int[] arreglo = new int[dim];
        Random ran = new Random();
       
        for(int y=0; y < dim; y++){
            arreglo[y] =ran.nextInt(bound);
        }
        int pos = ran.nextInt(dim);
        arreglo[pos] = x;
       return arreglo;
    }
            // mejor caso 
    public static int[] generarArregloIntMejorCaso(int x, int dim, int bound){
        int[] arreglo = new int[dim];
              
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x, bound);
            arreglo[y] = j;
        }
        arreglo[0] = x;
       return arreglo;
    }
            // medio caso
    public static int[] generarArregloIntMedioCaso(int x, int dim, int bound){
        int[] arreglo = new int[dim];
              
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x, bound);
            arreglo[y] = j;
        }
        arreglo[(arreglo.length)/2] = x;
        
       return arreglo;
    }
    
        // peor de los casos / unico elemento
    public static int[] generarArregloIntPeorCaso(int x, int dim, int bound){
        int[] arreglo = new int[dim];
              
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x, bound);
            arreglo[y] = j;
        }
        arreglo[arreglo.length-1] = x;
       return arreglo;
    }
   
    // genera numeros aleatorio en base a un valor x que no queremos que genere
    public static int generarNumeroAleatorioControlado (int x, int bound){
        Random ran = new Random();
        int aux = ran.nextInt(bound);
        while(aux==x){
         aux = ran.nextInt(bound);
        }
        return aux;
    }
    public static int[] generarArregloInt(int n, int bound){
        int[] arreglo = new int[n];
        Random ran = new Random();
     
        for(int y=0; y < n; y++){
            arreglo[y] = ran.nextInt(bound);
        }
        
       return arreglo;
    }
    public static int[] generarArregloMejor(int n, int bound){// 3n+7 "O"=n
        int[] arreglo = new int[n];//2
        int totalnum=1;//2
        for(int y=0; y < n; y++){//3(n)+3
            arreglo[y] =totalnum;//2
            totalnum++;//1
        }

       return arreglo;
    }
//    public static int[] generarArregloMedio(int n, int bound){
//        int[] arreglo = new int[n];
//        Random ran = new Random();
//     
//        for(int y=0; y < n; y++){
//            arreglo[y] = ran.nextInt(bound);
//        }
//        
//       return arreglo;
//    }
    public static int[] generarArregloPeor(int n, int bound){//3n+8 "O"=n
        int[] arreglo = new int[n];
        int totalnum=n-1;//19
//        Random ran = new Random();
     
        for(int y=0; y <n; y++){
            
            arreglo[y] = totalnum;//19
            totalnum--;//|8
        }
  
       return arreglo;
    }
}
