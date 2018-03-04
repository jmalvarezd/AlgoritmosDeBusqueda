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
public class ColaPrioridadBusqueda<T> extends ListaBusqueda<T> {

    public void adicionar(Arco<T> a) {
        tamano++;
        Nodo<T> aux = new Nodo<T>();
        aux.arco = a;
        if (esvacia()) {
            this.cab = this.col = aux;
        } else {
            Nodo<T> cima = this.cab;
            while (cima.sig != null && cima.arco.accion <= a.accion) {
                cima = cima.sig;
            }
            aux.sig = cima.sig;
            cima.sig = aux;
        }
    }

}
