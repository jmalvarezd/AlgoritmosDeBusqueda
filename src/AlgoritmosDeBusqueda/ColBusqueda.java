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
public interface ColBusqueda<T> {
    public void adicionar(Arco<T> a);
    public boolean esvacia();
    public Arco<T> obtener();
    public void remover();
}
