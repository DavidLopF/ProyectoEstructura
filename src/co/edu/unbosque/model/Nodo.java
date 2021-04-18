package co.edu.unbosque.model;

public class Nodo implements Comparable<Nodo> {
    private int vertice;
    private int peso;


    public Nodo(int elemento, int peso) {
        this.vertice = elemento;
        this.peso = peso;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "vertice: " + vertice + "      , peso :" + peso;
    }


    @Override
    public int compareTo(Nodo o) {
        if (peso > o.peso) return 1;
        if (peso == o.peso)
            return 0;    //es necesario definir un comparador para el correcto funcionamiento del PriorityQueue
        return -1;
    }
}