/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import java.util.LinkedList;

/**
 *
 * @author Asuka
 */
public class Camino {
    private int distanciaRecorrida;
    private LinkedList<Integer> camino;
    static int md[][];

    public Camino(LinkedList camino, int dr) {
        this.camino = new LinkedList(camino);
        this.distanciaRecorrida = dr;
    }
    public Camino(){
    this.camino = new LinkedList();
    this.distanciaRecorrida = 0;
    }
    
    public void agregarCiudad(int numCiudad){             
        if (camino.isEmpty()){
         this.camino.add(numCiudad);
        }else{            
           int cUltima = this.getCamino().getLast();
           this.getCamino().add(numCiudad);
           this.distanciaRecorrida += this.md[cUltima][numCiudad];           // reecalcular la distancia total recorrida                
        }                
    }

    /**
     * @return the distanciaRecorrida
     */
    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    /**
     * @return the camino
     */
    public LinkedList<Integer> getCamino() {
        return camino;
    }

    /**
     * @param camino the camino to set
     */
    public void setCamino(LinkedList<Integer> camino) {
        this.camino = camino;
    }
}
