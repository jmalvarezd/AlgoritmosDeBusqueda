/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeBusqueda;

/**
 *
 * @author Jmad
 */
public class BFS<T> extends Busqueda<T>{
    public BFS(Sucesor<T> sucesor, Objetivo<T> objetivo){
        super(sucesor, objetivo);
    }
    public ColBusqueda<T> coleccion(){
        //return new ColaBusqueda<T>();
        return new ColaBusqueda<T>();
    }
}
