/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeBusqueda;

import java.util.Vector;

/**
 *
 * @author USUARIO
 */
public class DFSLimitado<T> extends Busqueda<T>{
    
    protected int limite;
    
    public DFSLimitado(Sucesor<T> sucesor, Objetivo<T> objetivo, int _limite){
        super(sucesor, objetivo);
        this.limite = _limite;
    }
    @Override
    public Arco<T> aplicar(T inicial){
        int profundidad = 0;  
        ColBusqueda<T> c = coleccion();
        c.adicionar(new Arco<T>(inicial, null, -1,0));
        Arco<T> actual = c.obtener();
        while(!c.esvacia() && !objetivo.es(actual.getE()) && profundidad <= limite){
            c.remover();
            Vector<EstAcc<T>> h = sucesor.obtener(actual.getE());
            for(EstAcc<T> e:h){
                c.adicionar(new Arco<T>(e.getEstado(), actual.getE(), e.getAccion(), actual.accionAcumulada+1));
            }
            actual = c.obtener();
            profundidad = actual.accionAcumulada;
            if(profundidad>=limite){
                break;
            }
        }
        // return actual // (?)
        if(!c.esvacia()){
            return c.obtener();
        }else{
            System.out.println("No encontrado");
        }
        return null;
    }
    
    public ColBusqueda<T> coleccion(){
        //return new ColaBusqueda<T>();
        return new PilaBusqueda<T>();
    }

}
