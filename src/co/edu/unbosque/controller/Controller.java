package co.edu.unbosque.controller;

import co.edu.unbosque.model.Grafo;
import co.edu.unbosque.view.View;

public class Controller {

    private Grafo grafo;
    private View view;

    public Controller() {

        grafo = new Grafo();
        view = new View();
        funcionar();
    }

    private void funcionar() {

        String[] camino = grafo.caminoMinimo(grafo.getPosicion("bogota"), grafo.getPosicion("sincelejo")).split(";");
        int aux = 0;
        String end = "";
        for (int i = 0; i < camino.length; i++) {
            aux = Integer.parseInt(camino[i]);
            end += grafo.getIndex(aux) + " - ";
        }

        System.out.println(end);
        System.out.println("el peso es : " + grafo.getPeso("bogota" , "yopal"));

    }


}
