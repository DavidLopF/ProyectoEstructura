package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Grafo {

    private List<List<Nodo>> listaADY;
    private String[] citys;

    public Grafo() {

        listaADY = new ArrayList<>();
        String[] ciudades = {"leticia", "medellin", "arauca", "barranquilla", "cartagena", "tunja", "manizales", "florencia", "yopal",
                "popayan", "valledupar", "quibdo", "monteria", "bogota", "inirida", "san jose del guaviare", "neiva",
                "riohacha", "santa marta", "villavicencio", "pasto", "cucuta", "mocoa", "armenia", "pereira", "san andres",
                "bucaramanga", "sincelejo", "ibague", "cali", "mitu", "puerto carreño"};

        citys = new String[ciudades.length];
        citys = ciudades;
        for (int i = 0; i < citys.length; i++) {
            agregarVertice();
        }

    }


    public void agregarVertice() {
        listaADY.add(new ArrayList<>());

    }

    public void agregarArco(int inicio, int destino, int peso) {
        listaADY.get(inicio).add(new Nodo(destino, peso));
    }

    public void eliminarVetice(int a) {
        listaADY.remove(a);
        for (int i = 0; i < listaADY.size(); i++) {
            for (int j = 0; j < listaADY.get(i).size(); j++) {
                if (listaADY.get(i).get(j).getVertice() == a) {
                    listaADY.get(i).remove(j);
                }
            }
        }
    }

    public void elimianrArco(int inicio, int destino, int peso) {
        for (int j = 0; j < listaADY.get(inicio).size(); j++) {
            if (listaADY.get(inicio).get(j).getVertice() == destino && listaADY.get(inicio).get(j).getPeso() == peso) {
                listaADY.get(inicio).remove(j);
            }
        }
    }


    public int obtenerVertices() {
        return listaADY.size();
    }

    public void caminoMinimo(int inicial, int destino) {
        String a = "";
        boolean[] visitados = new boolean[obtenerVertices()];
        int[] distancia = new int[obtenerVertices()];
        int[] previo = new int[obtenerVertices()];

        for (int i = 0; i < obtenerVertices(); ++i) {
            distancia[i] = 1 << 30;  //inicializamos todas las distancias con valor infinito
            visitados[i] = false; //inicializamos todos los vértices como no visitados
            previo[i] = -1;      //inicializamos el previo del vertice i con -1
        }

        PriorityQueue<Nodo> colarPrioridad = new PriorityQueue<Nodo>();
        colarPrioridad.add(new Nodo(inicial, 0));

        distancia[inicial] = 0;
        int actual, adyacente, peso;


        while (!colarPrioridad.isEmpty()) {
            actual = colarPrioridad.element().getVertice();
            colarPrioridad.remove();
            if (!visitados[actual]) {
                visitados[actual] = true;

                for (int i = 0; i < listaADY.get(actual).size(); i++) {

                    adyacente = listaADY.get(actual).get(i).getVertice();
                    peso = listaADY.get(actual).get(i).getPeso();

                    if (!visitados[adyacente]) {
                        if (distancia[actual] + peso < distancia[adyacente]) {
                            distancia[adyacente] = distancia[actual] + peso;
                            previo[adyacente] = actual;
                            colarPrioridad.add(new Nodo(adyacente, distancia[adyacente]));

                        }
                    }

                }
            }

        }


        print(destino, previo);

    }

    public void print(int destino, int[] previo) {
        if (previo[destino] != -1)    //si aun poseo un vertice previo
            print(previo[destino], previo);  //recursivamente sigo explorando
        System.out.printf("%d ", destino);        //terminada la recursion imprimo los vertices recorridos
    }


    public String mostarLista() {
        String a = "";
        for (int i = 0; i < listaADY.size(); i++) {
            a += citys[i] + " - " + listaADY.get(i).toString() + "\n";
        }
        return a;
    }

}
