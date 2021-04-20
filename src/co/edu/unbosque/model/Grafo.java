package co.edu.unbosque.model;

import java.util.*;

public class Grafo {

    private List<List<Nodo>> listaADY;
    private String[] citys;
    private String aux;

    public Grafo() {
        aux = "";
        listaADY = new ArrayList<>();
        String[] ciudades = {"leticia", "medellin", "arauca", "barranquilla", "cartagena", "tunja", "manizales", "florencia", "yopal",
                "popayan", "valledupar", "quibdo", "monteria", "bogota", "inirida", "guaviare", "neiva",
                "riohacha", "santa marta", "villavicencio", "pasto", "cucuta", "mocoa", "armenia", "pereira", "san andres",
                "bucaramanga", "sincelejo", "ibague", "cali", "mitu", "puerto carreño"};

        citys = new String[ciudades.length];
        citys = ciudades;
        for (int i = 0; i < citys.length; i++) {
            agregarVertice();
        }

        conectarArcos();

    }

    private void conectarArcos() {
        //leticia
        listaADY.get(0).add(new Nodo(getPosicion("yopal"), 6));
        listaADY.get(0).add(new Nodo(getPosicion("popayan"), 4));

        //medellin
        listaADY.get(1).add(new Nodo(getPosicion("leticia"), 15));

        //arauca
        listaADY.get(2).add(new Nodo(getPosicion("florencia"), 20));
        listaADY.get(2).add(new Nodo(getPosicion("tunja"), 9));

        //barranquilla
        listaADY.get(3).add(new Nodo(getPosicion("valledupar"), 5));

        //cartagena
        listaADY.get(4).add(new Nodo(getPosicion("arauca"), 9));

        //tunja
        listaADY.get(5).add(new Nodo(getPosicion("neiva"), 8));

        //manizales
        listaADY.get(6).add(new Nodo(getPosicion("mocoa"), 10));
        listaADY.get(6).add(new Nodo(getPosicion("cucuta"), 7));
        listaADY.get(6).add(new Nodo(getPosicion("florencia"), 2));

        //florencia
        listaADY.get(7).add(new Nodo(getPosicion("leticia"), 4));
        listaADY.get(7).add(new Nodo(getPosicion("inirida"), 2));

        //yopal
        listaADY.get(8).add(new Nodo(getPosicion("medellin"), 1));
        listaADY.get(8).add(new Nodo(getPosicion("arauca"), 10));

        //popayan
        listaADY.get(9).add(new Nodo(getPosicion("bogota"), 3));
        listaADY.get(9).add(new Nodo(getPosicion("barranquilla"), 6));
        listaADY.get(9).add(new Nodo(getPosicion("medellin"), 10));

        //valledupar
        listaADY.get(10).add(new Nodo(getPosicion("tunja"), 17));
        listaADY.get(10).add(new Nodo(getPosicion("ibague"), 30));

        //quibdo
        listaADY.get(11).add(new Nodo(getPosicion("pereira"), 2));

        //monteria
        listaADY.get(12).add(new Nodo(getPosicion("cali"), 12));

        //bogota
        listaADY.get(13).add(new Nodo(getPosicion("medellin"), 6));
        listaADY.get(13).add(new Nodo(getPosicion("yopal"), 9));
        listaADY.get(13).add(new Nodo(getPosicion("cartagena"), 17));

        //inirida
        listaADY.get(14).add(new Nodo(getPosicion("pasto"), 13));
        listaADY.get(14).add(new Nodo(getPosicion("santa marta"), 11));

        //guaviare
        listaADY.get(15).add(new Nodo(getPosicion("puerto carreño"), 6));

        //neiva
        listaADY.get(16).add(new Nodo(getPosicion("ibague"), 7));
        listaADY.get(16).add(new Nodo(getPosicion("valledupar"), 9));

        //riohacha
        listaADY.get(17).add(new Nodo(getPosicion("san andres"), 10));
        listaADY.get(17).add(new Nodo(getPosicion("sincelejo"), 12));

        //santa marta
        listaADY.get(18).add(new Nodo(getPosicion("pasto"), 2));
        listaADY.get(18).add(new Nodo(getPosicion("sincelejo"), 5));

        //villao
        listaADY.get(19).add(new Nodo(getPosicion("monteria"), 7));
        listaADY.get(19).add(new Nodo(getPosicion("manizales"), 4));

        //pasto
        listaADY.get(20).add(new Nodo(getPosicion("san andres"), 4));
        listaADY.get(20).add(new Nodo(getPosicion("manizales"), 12));

        //cucuta
        listaADY.get(21).add(new Nodo(getPosicion("villavicencio"), 12));

        //mocoa
        listaADY.get(22).add(new Nodo(getPosicion("cartagena"), 5));

        //armenia
        listaADY.get(23).add(new Nodo(getPosicion("bucaramanga"), 9));
        listaADY.get(23).add(new Nodo(getPosicion("cucuta"), 3));
        listaADY.get(23).add(new Nodo(getPosicion("pasto"), 11));

        //pereira
        listaADY.get(24).add(new Nodo(getPosicion("villavicencio"), 6));

        //san anddres
        listaADY.get(25).add(new Nodo(getPosicion("armenia"), 19));

        //bucaramanga
        listaADY.get(26).add(new Nodo(getPosicion("cali"), 8));
        listaADY.get(26).add(new Nodo(getPosicion("mitu"), 13));

        //sincelejo
        listaADY.get(27).add(new Nodo(getPosicion("riohacha"), 3));
        listaADY.get(27).add(new Nodo(getPosicion("guaviare"), 2));
        listaADY.get(27).add(new Nodo(getPosicion("san andres"), 13));

        //ibague
        listaADY.get(28).add(new Nodo(getPosicion("inirida"), 2));

        //cali
        listaADY.get(29).add(new Nodo(getPosicion("pereia"), 20));
        listaADY.get(29).add(new Nodo(getPosicion("quibdo"), 13));

        //mitu
        listaADY.get(30).add(new Nodo(getPosicion("qubido"), 21));
        listaADY.get(30).add(new Nodo(getPosicion("cali"), 12));

        //puerto carreño
        listaADY.get(31).add(new Nodo(getPosicion("armenia"), 21));

    }

    public int getPosicion(String ciudad) {
        int cont = 0;
        for (int i = 0; i < citys.length; i++) {
            if (ciudad.equals(citys[i])) {
                cont = i;
            }
        }
        return cont;
    }

    public String getIndex(int a) {
        return citys[a];
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

    public int getPeso(String inicio, String destino) {
        int a = getPosicion(inicio);
        int b = getarco(listaADY.get(a) , destino);

        return listaADY.get(a).get(b).getPeso();
    }

    public void elimianrArco(int inicio, int destino, int peso) {
        for (int j = 0; j < listaADY.get(inicio).size(); j++) {
            if (listaADY.get(inicio).get(j).getVertice() == destino && listaADY.get(inicio).get(j).getPeso() == peso) {
                listaADY.get(inicio).remove(j);
            }
        }
    }

    public int getarco(List<Nodo> temp, String ciudad) {
        int cont = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getVertice() == getPosicion(ciudad)) {
                cont = i;
            }
        }
        return cont;
    }

    public int obtenerVertices() {
        return listaADY.size();
    }

    public String caminoMinimo(int inicial, int destino) {
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
        int actual, adyacente, peso, cont = 0;


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


        ArrayList camino = new ArrayList();
        print(destino, previo, camino);
        camino.add(inicial);

        for (int i = 0; i < camino.size(); i++) {
            a += camino.get(i) + ";";
        }

        a = a.substring(0, a.length() - 1);

        return a;

    }

    public int caminoEntreAyB(int inicio, int desitno) {
        int[] visitado = new int[obtenerVertices()];
        Queue<Integer> cola = new LinkedList<Integer>();
        int cont = 0;
        int actual = 0;
        int next = 0;
        cola.add(inicio);  // se inserta el nodo con el que se comienza
        visitado[inicio] = 0; // se marca como visitado para no pasar por el


        while (!cola.isEmpty()) {
            actual = cola.poll(); // se toma el elemento que sigue en la cola.
            System.out.println(actual);
            for (int i = 0; i < listaADY.get(actual).size(); i++) { // se recorre lista de adyasencia
                next = listaADY.get(actual).get(i).getVertice();
                if (next == desitno) { // se evalua la condicion
                    cont++;
                }

                if (visitado[next] <= 0) {  // se evalua si el siguiente nodo ya esta visitdado
                    visitado[next] = visitado[actual] + 1; // si no esta visitado se suma uno para indicar que ya fue visitado una vez
                    cola.add(next); // se agrega a la cola
                }
            }

        }
        return cont;
    }

    public ArrayList print(int destino, int[] previo, ArrayList a) {
        if (previo[destino] != -1) {//si aun poseo un vertice previo
            a.add(destino);
            print(previo[destino], previo, a); //recursivamente sigo explorando
        }
        return a;
    }

    public String mostarLista() {
        String a = "";
        for (int i = 0; i < listaADY.size(); i++) {
            a += citys[i] + " - " + listaADY.get(i).toString() + "\n";
        }
        return a;
    }

}
