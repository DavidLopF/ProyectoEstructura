package co.edu.unbosque.controller;

import co.edu.unbosque.model.Grafo;
import co.edu.unbosque.view.View;

import java.util.ArrayList;

public class Controller {

    private Grafo grafo;
    private View view;

    public Controller() {

        grafo = new Grafo();
        view = new View();
        funcionar();
    }

    private void funcionar() {

        System.out.println("...: Bienvenido usuario :...");
        String inicio = view.capturarString("Ingrese ciudad de inicio :");

        String[] zonaSegura = {"bogota", "barranquilla", "valledupar", "arauca", "inirida", "armenia", "pereira", "mitu", "riohacha"};
        ArrayList<Integer> pesos = new ArrayList<>();
        System.out.println("__________________________________________________________________________________");
        for (int j = 0; j < zonaSegura.length; j++) {
            String[] camino = grafo.caminoMinimo(grafo.getPosicion(inicio), grafo.getPosicion(zonaSegura[j])).split(";");
            int aux = 0;
            int aux2 = 0;
            String end = "";
            int peso = 0;

            for (int i = 0; i < camino.length - 1; i++) {
                aux = Integer.parseInt(camino[i]);
                aux2 = Integer.parseInt(camino[i + 1]);
                peso += grafo.getPeso(grafo.getIndex(aux2), grafo.getIndex(aux));
                //System.out.println("el camino de : " + grafo.getIndex(aux2) + " hasta " + grafo.getIndex(aux));
                end += grafo.getIndex(aux) + " - ";

            }
            end += inicio + " Cantidad de zombies: " + peso + "\n";
            System.out.println(end);
            pesos.add(peso);
            peso = 0;

        }
        int index = 0;
        int menor = pesos.get(0);
        for (int i = 0; i < pesos.size() - 1; i++) {
            if (pesos.get(i) < menor) {
                menor = pesos.get(i);
                index = i;
            }
        }
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("\nLa zona segura mas cercana desde " + inicio + " es " + zonaSegura[index] + " y hay " + menor + " zombies en el camino. ");
    }


}
