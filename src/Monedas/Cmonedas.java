/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

import java.util.ArrayList;

/**
 *
 * @author Asuka
 */
public class Cmonedas {
        static ArrayList<int[]> respuesta= new ArrayList<>();
    public static int darCambio(int k, int[] arrM){
        for(int i=0; i<arrM.length;i++){
            int[] aux= new int[k+1];
            for(int j=0;j<=k;j++){
                if(j==0){aux[j]=0;continue;}
                if(i==0){aux[j]=10000000;continue;}
                int nMoneNoTom = respuesta.get(i-1)[j];
                if(arrM[i]<=j){
                    int nMonetom=1+aux[j-arrM[i]];
                    aux[j]= (nMonetom < nMoneNoTom? nMonetom: nMoneNoTom);
                }else{
                    aux[j]= nMoneNoTom;
                }
            }
            respuesta.add(aux);
        }
        int res=respuesta.get(arrM.length-1)[k];
        respuesta=new ArrayList<>();
        return res;
    }
    
    public static int cambioR(int coins[],int m, int n){ //coins=monedas  m=tamaño del arreglo n=cantidad del cambio
        
        if(n==0){
            return 1;
        }
        if((m<=0 && n!=0) ||(n<0)){
            return 0;
        }
        return cambioR(coins,m-1,n)+cambioR(coins,m,n-coins[m-1]);             
    }
    
}
