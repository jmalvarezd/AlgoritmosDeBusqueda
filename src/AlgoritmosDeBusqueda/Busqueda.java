/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeBusqueda;

import java.util.Vector;

/**
 *
 * @author Jmad
 */
public abstract class Busqueda<T> {
    protected Sucesor<T> sucesor;
    protected Objetivo<T> objetivo;
    
    public Busqueda(Sucesor<T> sucesor, Objetivo<T> objetivo){
        this.sucesor = sucesor;
        this.objetivo = objetivo;
    }
    
    protected abstract ColBusqueda<T> coleccion();
    public Arco<T> aplicar(T inicial){
        ColBusqueda<T> c = coleccion();
        c.adicionar(new Arco<T>(inicial, null, 0,0));
        Arco<T> actual = c.obtener();
        while(!c.esvacia() && !objetivo.es(actual.getE())){
            c.remover();
            Vector<EstAcc<T>> h = sucesor.obtener(actual.getE());
            for(EstAcc<T> e:h){
                c.adicionar(new Arco<T>(e.getEstado(), actual.getE(), e.getAccion(), actual.getAccionAcumulada()+1));
            }
            actual = c.obtener();
        }
        // return actual // (?)
        if(!c.esvacia()) return c.obtener();
        return null;
    }
}
