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
public class EstAcc<T> {
    protected T estado;
    protected int accion;
    public EstAcc(T estado, int accion){
        this.estado = estado;
        this.accion = accion;
    }
    public T getEstado(){ return this.estado; }
    public int getAccion(){ return this.accion; }
}
