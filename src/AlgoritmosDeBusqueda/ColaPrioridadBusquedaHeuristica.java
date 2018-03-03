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
public class ColaPrioridadBusquedaHeuristica<T> extends ListaBusqueda<T> {
    Heuristica heuristica;
    public ColaPrioridadBusquedaHeuristica(Heuristica _heuristica){
        this.heuristica = _heuristica;
    }
    @Override
    public void adicionar(Arco<T> a) {
        tamano++;
        Nodo<T> aux = new Nodo<T>();
        aux.arco = a;
        if(esvacia()){
            this.cab = this.col = aux;
        }
        else{
            Nodo<T> cima = this.cab;
            while(cima.sig != null && (cima.arco.accion+heuristica.obtener(cima.arco.e) < a.accion+heuristica.obtener(a.e))){
                cima = cima.sig;
            }
            aux.sig = cima.sig;
            cima.sig = aux;
        }
    }
    
}
