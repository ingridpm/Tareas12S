package com.company;

import java.util.Scanner;

public class Cuadrado {
    static void dibujar(){

        Scanner datoIngresado = new Scanner(System.in);
        int tamaño;
        boolean procesoCompletado;

        System.out.println("3.-Dibuja un cuadrado de tamaño n");

        do {

            try {
                System.out.println("Ingrese el Numero que desee");
                tamaño = datoIngresado.nextInt();

                for (int i=0;i<tamaño;i++){
                    System.out.print("#");
                }
                System.out.println();

                for (int i=0;i<tamaño-2;i++){ // for para la altura del cuadrado
                    for (int j=0;j<tamaño;j++){ // for para el ancho del cuadrado
                        if (j==0 || j == tamaño-1) {
                            System.out.print("#");
                        }else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }

                for (int i=0;i<tamaño;i++){
                    System.out.print("#");
                }

                procesoCompletado = true;

            } catch (Exception e) {
                System.out.println("Asegurese de ingresar solo números\n" +
                        "intente de nuevo");
                datoIngresado.next();
                procesoCompletado = false;
            }
        } while (procesoCompletado == false);
    }
}