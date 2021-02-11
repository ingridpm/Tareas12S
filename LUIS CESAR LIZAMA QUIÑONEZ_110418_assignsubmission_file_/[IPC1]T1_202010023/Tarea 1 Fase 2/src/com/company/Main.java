package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            boolean exit = false;
            while (!exit) {
                System.out.println("Elija una de las siguientes opciones:");
                System.out.println("1. Determinar si un número es par o impar.");
                System.out.println("2. Determinar el producto de 'n' números.");
                System.out.println("3. Dibujar un cuadrado de nxn con el carácter '#'.");
                System.out.println("4. Cerrar el programa.");
                Scanner scanner1 = new Scanner(System.in);
                int option = scanner1.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.println("Ingrese un número:");
                        Scanner scanner2 = new Scanner(System.in);
                        try {
                            int number = scanner2.nextInt();
                            if (number % 2 == 0) {
                                System.out.println("El número ingresado es par.");
                            } else {
                                System.out.println("El número ingresado es impar.");
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese solamente un número por favor.");
                        }//Finaliza código del programa 1.
                    }
                    case 2 -> {
                        System.out.println("¿Qué cantidad de números desea multiplicar?:");
                        Scanner scanner3 = new Scanner(System.in);
                        try {
                            int aux = 1, n = scanner3.nextInt();
                            for (int i = 0; i <= n; i++) {
                                if (i == n) {
                                    System.out.println(aux);
                                    continue;
                                }
                                System.out.println("Ingrese los números que desea multiplicar:");
                                Scanner scanner4 = new Scanner(System.in);
                                int x;
                                x = scanner4.nextInt();
                                aux = aux * x;
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese solamente números por favor.");
                        }//Finaliza código del programa 2.
                    }
                    case 3 -> {
                        System.out.println("Ingrese la medida de los lados del cuadrado:");
                        Scanner scanner4 = new Scanner(System.in);
                        try {
                            int l = scanner4.nextInt() - 1;
                            for (int i = 0; i <= l; i++) {
                                for (int j = 0; j <= l; j++) {
                                    if (i == 0 || j == 0 || i == l || j == l) {
                                        System.out.print("#");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.println();
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese solamente un número por favor.");
                        }
                    }//Finaliza código del programa 3.
                    case 4 -> exit = true;
                    default -> System.out.println("Escoja una de las opciones propuestas por favor.");
                }
            }
        } catch (Exception e) {
            System.out.println ("Escoja una de las opciones propuestas por favor.");

        }
    }
}