/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Asuka
 */
public class BurbujaOp {
     
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public BurbujaOp() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
  
    public void ordenarBop(int[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarBOP(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }

    
    public void ordenarBOP(int[] datos){
         
        int cantidad = datos.length;
        int tem, bandera = 1;

        for ( int i = 0 ; i < (cantidad - 1 ) && bandera == 1 ; i ++ ) {
            bandera = 0 ;
            for ( int j = 0 ; j < (cantidad - 1 ); j ++ ) {
                if (datos [j] > datos [j + 1 ]) {
                    bandera = 1 ;
                    tem = datos [j];
                    datos [j] = datos [j + 1 ];
                    datos [j + 1 ] = tem;
                }
            }
        }
    }
}
    
   
