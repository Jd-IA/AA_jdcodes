/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

import java.util.ArrayList;

/**
 *
 * @author Asuka
 */
public class MochilaDinamica {
  
    private ArrayList<Articulo> articulos;
    private ArrayList<Articulo> artSolucion;
    private int[][] mBeneficios;
    private int _W;
    private int maxBenefit;

    public MochilaDinamica(ArrayList<Articulo> articulos, int _W) { //Constructor de la clase con el tamaño _W y los articulos
        this.articulos = articulos;
        this._W = _W;
        generadorMatriz();

    }
 public void imprimirArticulos() {
        System.out.println("Articulo   Valor    Peso  ");
        for (int i = 0; i < articulos.size(); i++) {

            System.out.println("    " + i + "      " + articulos.get(i).getPeso() + "      " + articulos.get(i).getValor());

        }
    }
    private void generadorMatriz() {

        this.mBeneficios = new int[this.articulos.size() + 1][this._W + 1]; // construimos la matriz de beneficios 

        for (int i = 0; i <= this.articulos.size(); i++) // agregar en la primer columna puros ceros
        {
            this.mBeneficios[i][0] = 0;
        }

        for (int x = 0; x <= this._W; x++) // agregar en la primer fila puros ceros
        {
            this.mBeneficios[0][x] = 0;
        }

    }

    public void buscarSolucion() {

        for (int i = 1; i <= this.articulos.size(); i++) {
            for (int w = 0; w <= this._W; w++) {

                if (this.articulos.get(i - 1).getPeso() <= w) {  //Validar que el articulos tenga espacio en la mochila

                    if ((this.articulos.get(i - 1).getValor() + this.mBeneficios[i - 1][w - this.articulos.get(i - 1).getPeso()]) > this.mBeneficios[i - 1][w]) ////Sumamos el valor del articulo y el beneficio maximo anterior y compararlo a ver si es mayor al anterior
                            {
                        this.mBeneficios[i][w] = (int) this.articulos.get(i - 1).getValor() + this.mBeneficios[i - 1][w - this.articulos.get(i - 1).getPeso()]; //remplazamos el nuevo mejor beneficio

                    } 
                    else {

                        this.mBeneficios[i][w] = this.mBeneficios[i - 1][w]; //mantenemos el anterior mejor beneficio
                    }
                } 
                else {
                    this.mBeneficios[i][w] = this.mBeneficios[i - 1][w];  //mantenemos el anterior mejor beneficio
                }

            }
        }

        this.maxBenefit = (int) this.mBeneficios[articulos.size()][_W]; //regresamos el beneficio maximo
        this.artSolucion = new ArrayList<>();

        int i = this.articulos.size();
        int j = this._W;
        int pesoT = 0;
        //Imprimimos la matriz resuelta
        System.out.println("Matriz de Beneficios");
        for (int k = 1; k < i + 1; k++) {
            for (int l = 1; l < j + 1; l++) {
                System.out.print(this.mBeneficios[k][l] + ",");
            }
            System.out.println();
        }
            System.out.println("Solucion:");
           
       while (i > 0 && j > 0){       //calculamos los articulos utilizados para el mejor beneficio
           double val = this.mBeneficios[i][j];
          
          if( val != this.mBeneficios[i-1][j]){
              pesoT += this.articulos.get(i-1).getPeso();
              this.artSolucion.add(this.articulos.get(i-1));                                                            
              int aux =this.articulos.get(i-1).getValor();   // imprimir el articulo
              System.out.println(aux);
              i--;
              j = j - this.articulos.get(i).getPeso();
          }           
          else {
            i--;
          }
                   
       }       
           
       //System.out.println("Peso total: "+pesoT+" de "+this._W);
        System.out.println("Beneficio total: "+this.mBeneficios[this.articulos.size()][this._W]);
    }

   

    public static void main(String[] args) {
        ArrayList<Articulo> instancias = LeerDatos.tokenizarDataSet();
        
        ArrayList<Articulo> articulos = Articulo.generador(instancias); //Generador de Articulos generador(numero de articulos,rango para Valor, rango para peso 

       
        MochilaDinamica m = new MochilaDinamica(articulos, 15); //Mochila(articulos,tamaño _W).
        m.imprimirArticulos();
        m.buscarSolucion();
        
    }

}