/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author yeyos_000
 */
public class Insert_sort {
    
       
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Insert_sort() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }  

    public void ordenarInSert(int[] datos){
        this.tInicio = System.currentTimeMillis();
        insertS(datos);
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
   
    private void insertS(int[] datos) { //
        int i, j, llave;//3
        for(i = 1; i < datos.length; i++){ // 3n+2+2+3 total 3n+14 entonces su complejidad O(n)
            llave = datos[i]; //2 ---2
            j = i - 1;//2 ---0
            while(j >= 0 && datos[j] > llave){//2+3+2 total 7no entra al while ya que no se cumple la condicion de  
                datos[j + 1] = datos[j];//3                 datos[j]>llave
                j = j - 1;//2
            }
            datos[j + 1] = llave; //3
        }
    }  
    /*private void insertSPeor(int[] datos) {
        int i, j, llave;//3
        for(i = 1; i < datos.length; i++){ //3n+7(2n+7)=6n^2+14n+21n+49 Para el peor caso es O(n^2)
            llave = datos[i]; //2
            j = i - 1;//2
            while(j >= 0 && datos[j] > llave){//2n+5
                datos[j + 1] = datos[j];   //3             
                j = j - 1;//2
            }
            datos[j + 1] = llave; //3
        }*/
     
}

