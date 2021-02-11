package com.company;
import java.util.Scanner;

public class Paridad {
    static void analizarParidad(){

        Scanner datoIngresado = new Scanner(System.in);
        int numero;
        boolean procesoCompletado = false;

        System.out.println("1.-Analisis de Paridad\n" +
                "verifica si el numero ingresado es par o impar");

        do {

            try {
                System.out.println("Ingrese el Numero que desea Analizar");
                numero = datoIngresado.nextInt();

                if (numero % 2 == 0) {
                    System.out.println(numero + " es par");
                } else {
                    System.out.println(numero + " es impar");
                }
                procesoCompletado = true;

            } catch (Exception e) {
                System.out.println("Asegurese de ingresar solo números\n" +
                        "intente de nuevo");
                datoIngresado.next();
            }
        } while (procesoCompletado == false);
    }
}
