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
public abstract class ListaBusqueda<T> implements ColBusqueda<T> {
    protected class Nodo<T>{
        protected Arco<T> arco;
        protected Nodo<T> sig;
    }

    protected Nodo<T> cab = null;
    protected Nodo<T> col = null;
    
    
    //public void adicionar(Arco<T> a);
    public boolean esvacia(){ return this.cab==null; }
    public Arco<T> obtener(){
        if(this.cab!=null)return this.cab.arco;
        return null;
    }
    public void remover(){
        if(this.cab!=null){
            this.cab = this.cab.sig;
            if(this.cab==null) col = null;
            
        }
    }
}
