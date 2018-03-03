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
public class Main {
    public static void main(String[] args) {
        CuadroSucesor sucesorCuadro = new CuadroSucesor();
        CuadroObjetivo objetivoCuadro = new CuadroObjetivo();
        BFS buscadorProfundidad = new BFS(sucesorCuadro,objetivoCuadro);
        CuadroTablero cuadroInicial = new CuadroTablero();
        Arco<CuadroTablero> encontrado = buscadorProfundidad.aplicar(cuadroInicial);
        CuadroTablero tableroEncontrado = encontrado.e;
        System.out.println("tablero encontrado:");
        tableroEncontrado.printTablero();
        System.out.println("En " + encontrado.getAccionAcumulada()+ " pasos");
    }
}
