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
public class CuadroTablero implements Cloneable {
    public static final int CUADRO1 = 1;
    public static final int CUADRO2 = 2;
    public static final int CUADRO3 = 3;
    public static final int CUADRO4 = 4;
    public static final int CUADRO5 = 5;
    public static final int CUADRO6 = 6;
    public static final int CUADRO7 = 7;
    public static final int CUADRO8 = 8;
    public static final int CUADRO9 = 9;
    public static final int CUADRO10 = 10;
    public static final int CUADRO11 = 11;
    public static final int CUADRO12 = 12;
    public static final int CUADRO13 = 13;
    public static final int CUADRO14 = 14;
    public static final int CUADRO15 = 15;
    public static final int VACIO = 0;
    
    public int[][] data;
    
    public CuadroTablero(){
    	this.data = new int[4][4];
    	this.data[0][0] = CuadroTablero.CUADRO1;
    	this.data[0][1] = CuadroTablero.CUADRO2;
    	this.data[0][2] = CuadroTablero.CUADRO3;
    	this.data[0][3] = CuadroTablero.CUADRO4;
    	this.data[1][0] = CuadroTablero.CUADRO5;
    	this.data[1][1] = CuadroTablero.CUADRO6;
    	this.data[1][2] = CuadroTablero.CUADRO7;
    	this.data[1][3] = CuadroTablero.CUADRO8;
    	this.data[2][0] = CuadroTablero.CUADRO9;
    	this.data[2][1] = CuadroTablero.CUADRO10;
    	this.data[2][2] = CuadroTablero.CUADRO11;
    	this.data[2][3] = CuadroTablero.CUADRO12;
    	this.data[3][0] = CuadroTablero.CUADRO13;
    	this.data[3][1] = CuadroTablero.CUADRO14;
        //MODIFICAR
    	this.data[3][2] = CuadroTablero.VACIO;
    	this.data[3][3] = CuadroTablero.CUADRO15;
    }
   @Override
   public Object clone(){
        CuadroTablero clon = null;
        try{
            clon = (CuadroTablero)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
         return clon;
    }
    public CuadroTablero( int[][] data ){ this.data = data; }
    
    public void reset( int x, int y ){ this.data[x][y]=0; }
    
    public int get(int x, int y){ return data[x][y]; }
    
    public int rows(){ return data.length; }
    public int columns(){ return data[0].length; }
}

