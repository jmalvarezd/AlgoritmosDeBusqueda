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
      return  estado.data[0][0] == CuadroTablero.CUADRO1 &&
    	estado.data[0][1] == CuadroTablero.CUADRO2 &&
    	estado.data[0][2] == CuadroTablero.CUADRO3 &&
    	estado.data[0][3] == CuadroTablero.CUADRO4 &&
    	estado.data[1][0] == CuadroTablero.CUADRO5 &&
    	estado.data[1][1] == CuadroTablero.CUADRO6 &&
    	estado.data[1][2] == CuadroTablero.CUADRO7 &&
    	estado.data[1][3] == CuadroTablero.CUADRO8 &&
    	estado.data[2][0] == CuadroTablero.CUADRO9 &&
    	estado.data[2][1] == CuadroTablero.CUADRO10 &&
    	estado.data[2][2] == CuadroTablero.CUADRO11 &&
    	estado.data[2][3] == CuadroTablero.CUADRO12 &&
    	estado.data[3][0] == CuadroTablero.CUADRO13 &&
    	estado.data[3][1] == CuadroTablero.CUADRO14 &&
    	estado.data[3][2] == CuadroTablero.CUADRO15 &&
    	estado.data[3][3] == CuadroTablero.VACIO;
    };
    
}
