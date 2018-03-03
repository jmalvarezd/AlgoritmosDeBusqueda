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
//        BFS buscadorAmplitud = new BFS(sucesorCuadro,objetivoCuadro);
//        DFS buscadorProfundidad = new DFS(sucesorCuadro,objetivoCuadro);
//        DFSLimitado buscadorProfundidadLimitada = new DFSLimitado(sucesorCuadro,objetivoCuadro);
//        LimiteIterado buscadorProfundidadIterada = new LimiteIterado(sucesorCuadro,objetivoCuadro);
//        CostoUniforme buscadorCostoUniforme = new CostoUniforme(sucesorCuadro, objetivoCuadro);
        Astar buscadorAstar = new Astar(sucesorCuadro, objetivoCuadro, new HeuristicaRabon());
        CuadroTablero cuadroInicial = new CuadroTablero();
//        Arco<CuadroTablero> encontrado = buscadorAmplitud.aplicar(cuadroInicial);
//        Arco<CuadroTablero> encontrado = buscadorProfundidad.aplicar(cuadroInicial);
//        Arco<CuadroTablero> encontrado = buscadorProfundidadLimitada.aplicar(cuadroInicial);     
//        Arco<CuadroTablero> encontrado = buscadorProfundidadIterada.aplicar(cuadroInicial);
//        Arco<CuadroTablero> encontrado = buscadorCostoUniforme.aplicar(cuadroInicial);
        Arco<CuadroTablero> encontrado = buscadorAstar.aplicar(cuadroInicial);
        CuadroTablero tableroEncontrado = encontrado.e;
        System.out.println("tablero encontrado:");
        tableroEncontrado.printTablero();
        System.out.println("En " + encontrado.getAccionAcumulada()+ " pasos");
    }
}
