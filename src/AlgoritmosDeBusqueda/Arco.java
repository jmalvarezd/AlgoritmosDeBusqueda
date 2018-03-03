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
public class Arco<T> {
    protected T e;
    protected T p;
    protected int accion;
    protected int accionAcumulada;
    
    public Arco(T e, T p, int accion){
        this.e = e;
        this.p = p;
        this.accion = accion;
    }
    public Arco(T e, T p, int accion,int accionAcumulada){
        this.e = e;
        this.p = p;
        this.accion = accion;
        this.accionAcumulada = accionAcumulada;
    }
    public T getE(){ return this.e; }
    public T getP(){ return this.p; }
    public int getAccion(){ return this.accion; }
    public int getAccionAcumulada(){ return this.accionAcumulada; }
}
