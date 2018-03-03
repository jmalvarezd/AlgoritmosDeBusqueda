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
public class HeuristicaManhattan extends CuadroHeuristica<CuadroTablero> {

    @Override
    public int obtener(CuadroTablero estado) {
        int heuristica = 0;
        for (int i = 0; i< 15;i++){
            int posicionx = 0;
            int posiciony = 0;
            for(int j = 0;j<=3;j++){
                for(int k = 0; k<=3; k++){
                    if(estado.get(j, k) == i){
                        posicionx = j;
                        posiciony = k;
                        break;
                    }
                }
            }
            heuristica += Math.abs(posicionx - i/4)+ Math.abs(posiciony - i%4);
        }
        return heuristica;
    }
    
}
