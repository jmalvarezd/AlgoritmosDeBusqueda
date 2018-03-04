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

    static int[][] tableroObjetivo = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 0}
    };

    @Override
    public boolean es(CuadroTablero estado) {
        return java.util.Arrays.deepEquals(estado.getAll(), tableroObjetivo);
    }
;

}
