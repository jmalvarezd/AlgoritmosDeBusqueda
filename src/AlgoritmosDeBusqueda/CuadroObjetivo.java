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
public class CuadroObjetivo extends CuadroObjetivoAbstracta<CuadroTablero> {

    @Override
    public boolean es(CuadroTablero estado) {
      return  estado.get(0,0) == CuadroTablero.CUADRO1 &&
    	estado.get(0,1) == CuadroTablero.CUADRO2 &&
    	estado.get(0,2) == CuadroTablero.CUADRO3 &&
    	estado.get(0,3) == CuadroTablero.CUADRO4 &&
    	estado.get(1,0) == CuadroTablero.CUADRO5 &&
    	estado.get(1,1) == CuadroTablero.CUADRO6 &&
    	estado.get(1,2) == CuadroTablero.CUADRO7 &&
    	estado.get(1,3) == CuadroTablero.CUADRO8 &&
    	estado.get(2,0) == CuadroTablero.CUADRO9 &&
    	estado.get(2,1) == CuadroTablero.CUADRO10 &&
    	estado.get(2,2) == CuadroTablero.CUADRO11 &&
    	estado.get(2,3) == CuadroTablero.CUADRO12 &&
    	estado.get(3,0) == CuadroTablero.CUADRO13 &&
    	estado.get(3,1) == CuadroTablero.CUADRO14 &&
    	estado.get(3,2) == CuadroTablero.CUADRO15 &&
    	estado.get(3,3) == CuadroTablero.VACIO;
    };
    
}
