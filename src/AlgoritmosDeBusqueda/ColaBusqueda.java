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
public class ColaBusqueda<T> extends ListaBusqueda<T> {
    
    
    public void adicionar(Arco<T> a){
        tamano++;
        Nodo<T> aux = new Nodo<T>();
        aux.arco = a;
        if(esvacia()){
            this.cab = this.col = aux;
        }else{
            this.col.sig = aux;
            this.col = aux;
        }
       
    }
}
