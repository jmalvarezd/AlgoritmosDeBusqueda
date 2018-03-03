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
public class HeuristicaRabon extends CuadroHeuristica<CuadroTablero> {

    @Override
    public int obtener(CuadroTablero estado) {
        int heuristica = 0;
        if (estado.get(0, 0) != CuadroTablero.CUADRO1) heuristica++;
        if (estado.get(0, 1) != CuadroTablero.CUADRO2) heuristica++;
        if (estado.get(0, 2) != CuadroTablero.CUADRO3) heuristica++;
        if (estado.get(0, 3) != CuadroTablero.CUADRO4) heuristica++;
        if (estado.get(1, 0) != CuadroTablero.CUADRO5) heuristica++;
        if (estado.get(1, 1) != CuadroTablero.CUADRO6) heuristica++;
        if (estado.get(1, 2) != CuadroTablero.CUADRO7) heuristica++;
        if (estado.get(1, 3) != CuadroTablero.CUADRO8) heuristica++;
        if (estado.get(2, 0) != CuadroTablero.CUADRO9) heuristica++;
        if (estado.get(2, 1) != CuadroTablero.CUADRO10) heuristica++;
        if (estado.get(2, 2) != CuadroTablero.CUADRO11) heuristica++;
        if (estado.get(2, 3) != CuadroTablero.CUADRO12) heuristica++;
        if (estado.get(3, 0) != CuadroTablero.CUADRO13) heuristica++;
        if (estado.get(3, 1) != CuadroTablero.CUADRO14) heuristica++;
        if (estado.get(3, 2) != CuadroTablero.CUADRO15) heuristica++;

        return heuristica;
    }
    
    
}
