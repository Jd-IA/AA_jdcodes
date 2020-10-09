/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import busquedas.GeneradorDatos;
import busquedas.Busquedas;

/**
 *
 * @author JD
 */
public class AA20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] aux = GeneradorDatos.generarArregloInt(8, 10, 10);
        int aux2 = Busquedas.busquedaLineal(aux, 8);
        for(int i: aux){
            System.out.println(i);
        }
        System.out.println("La posicion es: "+aux2);
    }
    
}
