package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String numeroBuscar;
        Scanner entrada = new Scanner(System.in);
        String n[] = {"10", "4", "8", "19", "20"};

        Ecuacion numero = new Ecuacion();
        numero.imprimir(n);

        System.out.println("Numero a buscar :");
        numeroBuscar = entrada.nextLine();

        for (int i = 0; i < n.length; i++) {
            if (numeroBuscar.equalsIgnoreCase(n[i])) {
                System.out.println("Numero existe en la posicion ");
                break;
            }
            else {
                if (i == n.length-1){
                    System.out.println("Numero no existe en la posicion ");
                }

            }
        }
    }
}
