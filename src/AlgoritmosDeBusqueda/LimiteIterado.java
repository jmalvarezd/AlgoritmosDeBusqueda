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
public class LimiteIterado<T> extends Busqueda<T> {

    int limite = 1;
    Sucesor<T> sucesor;
    Objetivo<T> objetivo;

    public LimiteIterado(Sucesor<T> _sucesor, Objetivo<T> _objetivo) {
        super(_sucesor, _objetivo);
        this.sucesor = _sucesor;
        this.objetivo = _objetivo;
    }

    @Override
    public Arco<T> aplicar(T inicial) {
        Arco<T> respuesta = null;
        while (respuesta == null) {
            DFSLimitado limit = new DFSLimitado(this.sucesor, this.objetivo, this.limite);
            respuesta = limit.aplicar(inicial);
            if (respuesta != null) {
                return respuesta;
            } else {
                this.limite++;
            }
        }
        return null;
    }

    public ColBusqueda<T> coleccion() {
        //return new ColaBusqueda<T>();
        return new PilaBusqueda<T>();
    }

}
