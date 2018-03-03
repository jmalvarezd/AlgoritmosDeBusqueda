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
    
    Intercambio cambio = new Intercambio();
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
                    //System.out.println("ENCONTRADO");
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
            aux.data=cambio.direccion(0, 0, aux.data,2);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data=cambio.direccion(0, 0, aux.data,3);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        } else if (row == 0 && column == 3) {
            aux.data=cambio.direccion(0, 3, aux.data,4);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data=cambio.direccion(0, 3, aux.data,3);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        } else if (row == 3 && column == 0) {
            aux.data=cambio.direccion(3, 0, aux.data,2);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data=cambio.direccion(3, 0, aux.data,1);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        } else if (row == 3 && column == 3) {
            aux.data=cambio.direccion(3, 3, aux.data,4);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
            aux.data=cambio.direccion(3, 3, aux.data,1);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            return (sucesores);
        }
        //IF 0 IN EDGES
        else if (row == 0 || column == 0 || row == 3 || column == 3) {
            if (row == 0) {
                aux.data=cambio.direccion(row, column, aux.data,3);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));

                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,2);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,4);              
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                return (sucesores);
            } else if (row == 3) {             
                aux.data=cambio.direccion(row, column, aux.data,2);              
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,1);             
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,4);               
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                return (sucesores);
            } else if (column == 0) {
                aux.data=cambio.direccion(row, column, aux.data,1);              
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,2);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,3);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                return (sucesores);
            } else if (column == 3) {
                aux.data=cambio.direccion(row, column, aux.data,1);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,4);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,3);
                sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
                
                return (sucesores);
            }
        // IF 0 IN CENTER
        } else {
                aux.data=cambio.direccion(row, column, aux.data,1);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,2);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,3);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            
            aux = (CuadroTablero) UnoptimizedDeepCopy.copy(estado);
                aux.data=cambio.direccion(row, column, aux.data,4);
            sucesores.addElement(new EstAcc<CuadroTablero>(aux, 1));
            return (sucesores);

        };
        return(sucesores);
    }

}
