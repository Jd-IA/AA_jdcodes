/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recu;

/**
 *
 * @author yeyos_000
 */
public class Fibonnaci {
    private int enteros;
    
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public  Fibonnaci(){
        this.enteros=0;
        
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
        
    }
    public  Fibonnaci(int n){
    this.enteros=n;
        
    }
    
    public void ordenarFiboNR(int datos){
        this.tInicio = System.currentTimeMillis();
        fibonacciNR(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    public void ordenarFiboR(int datos){
        this.tInicio = System.currentTimeMillis();
        fibonacciR(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    //no recursivo
    private int fibonacciNR(int n){
        int prev=0, next=1, result=0;
            for (int i = 1; i < n; i++) {
                result=prev+next;
                prev=next;
                next=result;
            }
        return result;
    }
    private int fibonacciR(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
    else
      return fibonacciR(n - 1) + fibonacciR(n - 2);        
    }

    public int getEnteros() {
        return enteros;
    }

    public void setEnteros(int enteros) {
        this.enteros = enteros;
    }

    public long gettInicio() {
        return tInicio;
    }

    public void settInicio(long tInicio) {
        this.tInicio = tInicio;
    }

    public long gettFinal() {
        return tFinal;
    }

    public void settFinal(long tFinal) {
        this.tFinal = tFinal;
    }

    public long gettTotal() {
        return tTotal;
    }

    public void settTotal(long tTotal) {
        this.tTotal = tTotal;
    }
    
}
