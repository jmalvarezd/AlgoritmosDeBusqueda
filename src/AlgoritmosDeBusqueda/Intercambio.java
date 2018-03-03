/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeBusqueda;

import java.util.Random;

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
        //System.out.println("row swich: "+row+" column switch "+column+" DIRECCION :"+direc);
        switch(direc){
            case 1:
               // System.out.println("ARRIBA");
                matriz = intercambio(row,column,row-1,column,matriz);
                break;
            case 2:
                //System.out.println("DERECHA");
                matriz = intercambio(row,column,row,column+1,matriz);  
                break;
            case 3:
                //System.out.println("ABAJO");
                matriz = intercambio(row,column,row+1,column,matriz);
                break;
            case 4:
                //System.out.println("IZQUIERDA");
                matriz = intercambio(row,column,row,column-1,matriz);                 
                break;
        }
        return matriz;
    }
    
    
    public int[][] desordenarMatriz(int[][] matriz){
        Random random = new Random();
        int row = 3;
        int column = 3;
        int randomInteger;
        Intercambio cambio = new Intercambio();
        for(int movimientos = 0 ; movimientos <15;movimientos++){          
            if ((row == 0 && column == 0)) {
                randomInteger = random.nextInt(2)+2;
                switch(randomInteger){
                    case 2:
                        matriz=cambio.direccion(0, 0, matriz,2);
                        break;
                    case 3:
                        matriz=cambio.direccion(0, 0, matriz,3);
                        break;
                }

            } else if (row == 0 && column == 3) {
                randomInteger = random.nextInt(2)+3;
                switch (randomInteger){
                    case 3:
                        matriz=cambio.direccion(0, 3, matriz,3);
                        break;
                    case 4:
                        matriz=cambio.direccion(0, 3, matriz,4);
                        break;
                }

            } else if (row == 3 && column == 0) {
                randomInteger = random.nextInt(2)+1;
                switch (randomInteger){
                    case 1:
                        matriz=cambio.direccion(3, 0, matriz,1);
                        break;
                    case 2:
                        matriz=cambio.direccion(3, 0, matriz,2);
                        break;
                }

            } else if (row == 3 && column == 3) {
                randomInteger = random.nextInt(2)+1;
                if(randomInteger==2)randomInteger=4;
                switch (randomInteger){
                    case 1:
                        matriz=cambio.direccion(3, 3, matriz,1);
                        break;
                    case 4:                       
                        matriz=cambio.direccion(3, 3, matriz,4);
                        break;
                }

            }
            //IF 0 IN EDGES
            else if (row == 0 || column == 0 || row == 3 || column == 3) {
                if (row == 0) {
                    randomInteger = random.nextInt(3)+2;
                    switch (randomInteger){
                        case 2:
                            matriz=cambio.direccion(row, column, matriz,2);
                            break;
                        case 3:
                            matriz=cambio.direccion(row, column, matriz,3);
                            break;
                        case 4:
                            matriz=cambio.direccion(row, column, matriz,4);              
                            break;
                    }

                } else if (row == 3) {
                    randomInteger = random.nextInt(3)+1;
                    if(randomInteger==3)randomInteger=4;
                    switch (randomInteger){
                        case 1:
                            matriz=cambio.direccion(row, column, matriz,1);
                            break;
                        case 2:                       
                            matriz=cambio.direccion(row, column, matriz,2);
                            break;
                        case 4:
                            matriz=cambio.direccion(row, column, matriz,4);               
                            break;
                    }

                } else if (column == 0) {
                    randomInteger = random.nextInt(3)+1;
                    switch (randomInteger){
                        case 1:
                            matriz=cambio.direccion(row, column, matriz,1);              
                            break;
                        case 2:
                            matriz=cambio.direccion(row, column, matriz,2);
                            break;
                        case 3:
                            matriz=cambio.direccion(row, column, matriz,3);
                            break;
                    }

                } else if (column == 3) {
                    randomInteger = random.nextInt(3)+2;
                    if(randomInteger==2)randomInteger=1;
                    switch (randomInteger){
                        case 1:
                            matriz=cambio.direccion(row, column, matriz,1);
                            break;
                        case 3:
                            matriz=cambio.direccion(row, column, matriz,3);
                            break;
                        case 4:
                            matriz=cambio.direccion(row, column, matriz,4);
                            break;
                    }
                }
            // IF 0 IN CENTER
            } else {                
                randomInteger = random.nextInt(4)+1;
                switch (randomInteger){
                    case 1:
                        matriz=cambio.direccion(row, column, matriz,1);
                        break;
                    case 2:
                        matriz=cambio.direccion(row, column, matriz,2);
                        break;
                    case 3:
                        matriz=cambio.direccion(row, column, matriz,3);
                       break;
                    case 4:
                        matriz=cambio.direccion(row, column, matriz,4);
                        break;
                }
            };
        }
    return matriz;         
    }
}


