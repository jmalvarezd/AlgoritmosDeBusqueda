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
public interface Sucesor<T> {
    Vector<EstAcc<T>> obtener(T estado);   
}
