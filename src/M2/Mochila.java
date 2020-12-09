/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M2;

import java.util.ArrayList;

/**
 *
 * @author Asuka
 */
public class Mochila {

    private static int iteraciones=0;

    public static ArrayList<Integer> llenarMochila(int pesoM, int[] pesos, int[] valores) {
        int[][] values = new int[pesos.length+1][pesoM+1];
        iteraciones++;
        for(int i=1; i<pesos.length+1;i++){
            iteraciones++;
            for(int j=1;j<=pesoM; j++){
                iteraciones++;
                if(i==1){
                    if(j>=pesos[i-1]){
                        values[i][j]= valores[i-1];
                    }
                }else if(j<pesos[i-1]){
                    values[i][j]=values[i-1][j];
                }else{
                    values[i][j]= Math.max(values[i-1][j],valores[i-1]+values[i-1][j-pesos[i-1]]);
                }
            }
        }
        ArrayList<Integer> objetos= new ArrayList<>();
        for(int i=pesos.length;i>=1;i--){
            iteraciones++;
            if(values[i][pesoM]!= values[i-1][pesoM] && values[i][pesoM]== (values[i-1][pesoM-pesos[i-1]]+valores[i-1])){
                objetos.add(i);
                pesoM-=pesos[i-1];
            }
        }
        return objetos;
    }

    /**
     * @return the interaciones
     */
    public static int getIteraciones() {
        return iteraciones;
    }    
}
