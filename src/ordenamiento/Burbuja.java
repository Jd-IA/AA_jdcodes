/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author working
 */
public class Burbuja {
     
   
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Burbuja() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
  
    public void ordenar(int[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarDatos(datos);
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

    private void ordenarDatos(int[] datos) {
       // implementar de manera correcta el ordenamiento por burbuja
         int i, j, aux;
         for(i=0;i<datos.length-1;i++)
              for(j=0;j<datos.length-i-1;j++)
                   if(datos[j+1]<datos[j]){
                      aux=datos[j+1];
                      datos[j+1]=datos[j];
                      datos[j]=aux;
                   }
    }    
}
