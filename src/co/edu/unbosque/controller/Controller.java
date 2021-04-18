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


        System.out.println(grafo.mostarLista());

    }
}
