/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Asuka
 */
public class Tokenizer_pesos_valor {
       public static ArrayList<int []> tokenizar(int limite, int tam) throws FileNotFoundException, IOException{
        String cadena;
        String archivo="E:\\5tosemestre\\Análisis de Algoritmos\\Archivos\\csv\\"+limite+"_"+limite+"-"+tam+".csv";
        ArrayList<int []> peso_valor=new ArrayList<>();
        int [] peso= new int [tam];
        int [] valor= new int [tam];
        int i=0;
        int j=0;
        FileReader f= new FileReader(archivo);
        BufferedReader b= new BufferedReader(f);
        while((cadena=b.readLine())!=null){
            StringTokenizer st= new StringTokenizer(cadena, ",");
            peso[i]=Integer.parseInt(st.nextToken());
            valor[j]=Integer.parseInt(st.nextToken());
            i++;
            j++;
        }
        peso_valor.add(peso);
        peso_valor.add(valor);
        return peso_valor;
    }
    
}
