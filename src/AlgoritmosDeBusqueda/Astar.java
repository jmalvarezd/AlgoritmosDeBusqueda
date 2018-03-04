/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeBusqueda;

/**
 *
 * @author Usuario
 */
public class Astar<T> extends Busqueda<T> {

    protected Heuristica heuristica;

    public Astar(Sucesor<T> sucesor, Objetivo<T> objetivo, Heuristica heuristica) {
        super(sucesor, objetivo);
        this.heuristica = heuristica;
    }

    public ColBusqueda coleccion() {
        return new ColaPrioridadBusquedaHeuristica<T>(heuristica);
    }

}
