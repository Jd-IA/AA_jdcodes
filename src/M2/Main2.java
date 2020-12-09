/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Asuka
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        int tam=50;
        int lim=50;
        
        ArrayList<int[]>datos=Tokenizer_pesos_valor.tokenizar(lim,tam);
        
        ArrayList <Integer> respuesta=Mochila.llenarMochila(15, datos.get(0), datos.get(1));
        
        System.out.println("Objetos en la mochila: ");
            for(int i=0;i<respuesta.size();i++){
                System.out.println(respuesta.get(i)+"");
            }
        }
    
}
