/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeBusqueda;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

/**
 *
 * @author USUARIO
 */
public class Intercambio {
    
    private int[][] intercambio(int row1, int column1,int row2, int column2, int[][] matriz){
        int aux = matriz[row1][column1];
        matriz[row1][column1] = matriz[row2][column2];
        matriz[row2][column2] = aux;
        return matriz;
    }
    
    public int[][] direccion(int row, int column ,int[][] matriz, int direc){
        switch(direc){
            case 1:
                matriz = intercambio(row,column,row-1,column,matriz);
                break;
            case 2:
                matriz = intercambio(row,column,row,column+1,matriz);  
                break;
            case 3:
                matriz = intercambio(row,column,row+1,column,matriz);
                break;
            case 4:
                matriz = intercambio(row,column,row,column-1,matriz);                 
                break;
        }
        return matriz;
    }
    
    
    public int[][] nuevaMatriz(int[][] matriz){
      for(int movimientos = 0 ; movimientos <15;movimientos++){

      }
        return matriz;  
    }
}
