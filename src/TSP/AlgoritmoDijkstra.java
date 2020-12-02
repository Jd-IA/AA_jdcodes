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
public class AlgoritmoDijkstra {

    private LinkedList<Integer> ciudadesDisponibles;
    private int numCiudades;

    public AlgoritmoDijkstra(int numCiudades) {
        this.numCiudades = numCiudades;
        this.ciudadesDisponibles = new LinkedList<>();
        for(int x= 0 ; x < numCiudades;x++ )                                                // creamos la ciudades disponibles 
            this.ciudadesDisponibles.add(x);
            Camino.md = Mapa.generarMatrixDeDistancias(numCiudades);                    /// contruimos la Matrix (distancias)       
    }
    
    public Camino buscarCamino (int ciudadInicial){        
        Camino caminoSolucion = new Camino();
        caminoSolucion.agregarCiudad(ciudadInicial);
        this.ciudadesDisponibles.remove(ciudadInicial);
        while (!this.ciudadesDisponibles.isEmpty()){                                             // generar un proceso iterativo         // donde estaremos agregando ciudades         // al caminoSolucion 
        int ciudadUltima =  caminoSolucion.getCamino().getLast();                           //definir un proceso iterativo donde agreguemos  // ciudades con el argumento de distancia minima 
        int distMenor = Camino.md[ciudadUltima][this.ciudadesDisponibles.getFirst()]; 
        int iM = 0;
        for (int x = 1; x < this.ciudadesDisponibles.size();x++){
            
           if (Camino.md[this.ciudadesDisponibles.get(x)][ciudadUltima]<distMenor){             // buscar un menor
           distMenor = Camino.md[this.ciudadesDisponibles.get(x)][ciudadUltima];
           
           iM = x;// guardar el indice 
           }         
         }     
        caminoSolucion.agregarCiudad(this.ciudadesDisponibles.get(iM));                         // agregmos al camino la ciudad con distancia menor 
        this.ciudadesDisponibles.remove(iM);                                                 // eliminamos de las ciudades disponibles         
        }
        caminoSolucion.agregarCiudad(ciudadInicial);                                        // agregar la distancia entre la primera y la ultima                
        return caminoSolucion;    
    }
}
