package com.company;

import java.util.Scanner;

public class Producto {
    static void obtenerProducto(){

        Scanner datoIngresado = new Scanner(System.in);
        int numero;
        boolean procesoCompletado = false;

        System.out.println("2.-Producto de 1 a n\n" +
                "ingrese un numero cualquiera y\n" +
                "retornara su factorial");

        do {

            try {
                System.out.println("Ingrese el Numero que desee");
                numero = datoIngresado.nextInt();
                int resultado = 1;
                for (int i=1;i<=numero;i++){
                    resultado *= i;
                }

                System.out.println("El producto desde 1 hasta " + numero + " es:\n"+resultado);

                procesoCompletado = true;

            } catch (Exception e) {
                System.out.println("Asegurese de ingresar solo números\n" +
                        "intente de nuevo");
                datoIngresado.next();
            }
        } while (procesoCompletado == false);
    }
}