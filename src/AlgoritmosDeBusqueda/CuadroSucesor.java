/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeBusqueda;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class CuadroSucesor extends CuadroSucesorAbstracta<CuadroTablero> {

    @Override
    public Vector<EstAcc<CuadroTablero>> obtener(CuadroTablero estado) {
        Vector<EstAcc<CuadroTablero>> sucesores = new Vector<EstAcc<CuadroTablero>>();

        CuadroTablero aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
        int row = 0;
        int column = 0;
        boolean encontrado = false;
        for (int n = 0; n <= 3; n++) {
            for (int m = 0; m <= 3; m++) {
                if (estado.get(n, m) == 0) {
                    System.out.println("ENCONTRADO");
                    row = n;
                    column = m;
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        
        // IF 0 IN CORNERS
        if ((row == 0 && column == 0)) {
            aux.data[0][0] = estado.data[0][1];
            aux.data[0][1] = estado.data[0][0];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data[0][0] = estado.data[1][0];
            aux.data[1][0] = estado.data[0][0];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        } else if (row == 0 && column == 3) {
            aux.data[0][3] = estado.data[0][2];
            aux.data[0][2] = estado.data[0][3];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data[0][3] = estado.data[1][3];
            aux.data[1][3] = estado.data[0][3];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        } else if (row == 3 && column == 0) {
            aux.data[3][0] = estado.data[3][1];
            aux.data[3][1] = estado.data[3][0];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data[3][0] = estado.data[2][0];
            aux.data[2][0] = estado.data[3][0];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        } else if (row == 3 && column == 3) {
            aux.data[3][3] = estado.data[3][2];
            aux.data[3][2] = estado.data[3][3];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data[3][3] = estado.data[2][3];
            aux.data[2][3] = estado.data[3][3];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        }
        //IF 0 IN EDGES
        else if (row == 0 || column == 0 || row == 3 || column == 3) {
            if (row == 0) {
                aux.data[row][column] = estado.data[row + 1][column];
                aux.data[row + 1][column] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));

                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column] = estado.data[row][column + 1];
                aux.data[row][column + 1] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column - 1] = estado.data[row][column];
                aux.data[row][column] = estado.data[row][column - 1];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                return (sucesores);
            } else if (row == 3) {
                aux.data[row][column] = estado.get(row, column + 1);
                aux.data[row][column + 1] = estado.get(row, column);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column] = estado.get(row - 1, column);
                aux.data[row - 1][column] = estado.get(row, column);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column - 1] = estado.get(row, column);
                aux.data[row][column] = estado.get(row, column - 1);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                return (sucesores);
            } else if (column == 0) {
                aux.data[row][column] = estado.data[row - 1][column];
                aux.data[row - 1][column] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column] = estado.data[row][column + 1];
                aux.data[row][column + 1] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column] = estado.data[row + 1][column];
                aux.data[row + 1][column] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                return (sucesores);
            } else if (column == 3) {
                aux.data[row][column] = estado.data[row - 1][column];
                aux.data[row - 1][column] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column] = estado.data[row][column - 1];
                aux.data[row][column - 1] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data[row][column] = estado.data[row + 1][column];
                aux.data[row + 1][column] = estado.data[row][column];
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                return (sucesores);
            }
        // IF 0 IN CENTER
        } else {
            aux.data[row][column] = estado.data[row - 1][column];
            aux.data[row - 1][column] = estado.data[row][column];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data[row][column] = estado.data[row][column - 1];
            aux.data[row][column - 1] = estado.data[row][column];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data[row][column] = estado.data[row + 1][column];
            aux.data[row + 1][column] = estado.data[row][column];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data[row][column] = estado.data[row][column + 1];
            aux.data[row][column + 1] = estado.data[row][column];
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            return (sucesores);

        };
        return(sucesores);
    }

}
