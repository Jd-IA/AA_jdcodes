/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochiila;

import java.util.ArrayList;

/**
 *
 * @author Asuka
 */
public class Articulo {
    private String valorobt;
    private int[] pesoobt;//medidas
    
    public int valor;
    public int peso;
    
    public double[] pesobt;

    public Articulo(int n) {
        this.valorobt = "";
        this.pesoobt = new int[n];
    }
    public Articulo(String valor) {
        this.valorobt = valor;

    }
    public Articulo() {

    }

    public Articulo(String valor, int[] peso) {
        this.valorobt = valor;
        this.pesoobt = peso;
    } 
    
    public Articulo(int valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    } 
    public Articulo(int valor, double[] peso) {
        this.valor = valor;
        this.pesobt = peso;
    } 

    public String getValorobt() {
        return valorobt;
    }

    public void setValorobt(String valorobt) {
        this.valorobt = valorobt;
    }

    public int[] getPesoobt() {
        return pesoobt;
    }

    public void setPesoobt(int[] pesoobt) {
        this.pesoobt = pesoobt;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double[] getPesobt() {
        return pesobt;
    }

    public void setPesobt(double[] pesobt) {
        this.pesobt = pesobt;
    }
       
    public static ArrayList<Articulo> generador(ArrayList<Articulo> ins ){ //Generador de articulos

        ArrayList<Articulo> articulos = new ArrayList<>();                  //ArrayList de articulos
        
        
        
        for(int i =0; i<ins.size(); i++){
            
            //Genera n articulos con valores y pesos randoms
            // Random randPeso = new Random();
             //Random randValor = new Random();
             int temp1=ins.get(i).getValor();
             int temp2=ins.get(i).getPeso(); 
             
             //setPesoobt(int pesoobt);
             
             Articulo ar= new Articulo(temp1,temp2);
//             Articulo ar=ins.get(i);
             articulos.add(ar);
        }
        return articulos; //retornamos articulos
    }
    
}
