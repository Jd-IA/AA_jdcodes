/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

/**
 *
 * @author JD
 */
public class Busquedas {
    
    public static int busquedaLinealJD (int[] datos, int x){
    boolean flag=false;
    int i=0;
    while((flag==false) && (i<datos.length)){
        if(datos[i]==x){
            flag=true;
        }
        i++;
    }
    if(flag==false){
        return -1;
    }else if(flag==true){
        return i-1;
    }    
        return 0;
    }
        
    public static int busquedaLineal (int[] datos, int x){
        for (int j = 0; j < datos.length; j++){
            if(datos[j]== x) return j;
        }
        return -1;
    }
    
}
