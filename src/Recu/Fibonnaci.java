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
    
    public void calcularTFiboNR(int datos){
        this.tInicio = System.currentTimeMillis();
        fibonacciNR(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    public void calcularTFiboNRD(int datos){
        this.tInicio = System.currentTimeMillis();
        fibonacciNRD(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    public void calcularTFiboR(int datos){
        this.tInicio = System.currentTimeMillis();
        fibonacciR(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    public void calcularTFiboRD(int datos){
        this.tInicio = System.currentTimeMillis();
        fibonacciRD(datos);
        this.tFinal = System.currentTimeMillis(); 
        this.tTotal = this.tFinal - this.tInicio;
    }
    //no recursivo
    private int fibonacciNR(int n){//iterativo
        int prev=0, next=1, result=0;
            for (int i = 1; i < n; i++) {
                result=prev+next;
                prev=next;
                next=result;
            }
        return result;
    }
    private int fibonacciNRD(int n){//iterativo dinamico
        int [] arreglo=new int [45];
        arreglo[0]=1;
        arreglo[1]=1;
        for(int i=2;i<n+1;i++){
             arreglo[i]=arreglo[i-1] + arreglo[i-2];
        }
        return arreglo[n-1];
    }
    private int fibonacciR(int n)  {//recursivo
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacciR(n - 1) + fibonacciR(n - 2);        
    }
    private int fibonacciRD(int n){//recursivo dinamico
        int [] conocido=new int [45];
        if(conocido[n]!=0){
            return conocido[n];
        }
        int t=n;
        if(n<0){
            return 0;
        }
        if(n>1){
            t=fibonacciRD(n-1)+fibonacciRD(n-2);
        }
        return conocido[n]=t;
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
