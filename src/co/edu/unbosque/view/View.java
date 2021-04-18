package co.edu.unbosque.view;

import java.util.Scanner;

public class View {

    private Scanner entrada;

    public View() {
        entrada = new Scanner(System.in);
    }

    public String capturarString(String a) {
        System.out.println(a);
        String b =  entrada.next();
        return b;
     }

}
