/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

public class TAREA1 {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        System.out.println(" ----------------");
        System.out.println("|   Bienvenido   |");
        System.out.println(" ----------------");
        System.out.println("");
        System.out.println("1. Numero Par o Impar");
        System.out.println("2. Multiplicacion de numeros");
        System.out.println("3. Cuadrado de #");
        System.out.println("4. Cerrar");
        System.out.print("Por favor ingresa una opcion: ");
        Scanner dato = new Scanner(System.in);
        int opcion = dato.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("");
                System.out.println("Por favor ingresa el numero a comparar:");
                Scanner dato1 = new Scanner(System.in);
                int numero1;
                numero1 = dato1.nextInt();
                metodoPar(numero1);
                System.out.println("¿Desea regresar?si/no");
                Scanner dato2 = new Scanner(System.in);
                String respuesta = dato2.nextLine();
                String si = "si";
                String no = "no";
                if (respuesta.equalsIgnoreCase(si)) {
                    menu();
                }
                if (respuesta.equalsIgnoreCase(no)) {
                    System.exit(0);
                } else {
                    System.out.println("Opcion Invalida");
                }

                break;
            case 2:

                metodomultiplicacion();
                System.out.println("¿Desea regresar?si/no");
                Scanner dato3 = new Scanner(System.in);
                String respuesta2 = dato3.nextLine();
                String si1 = "si";
                String no1 = "no";
                if (respuesta2.equalsIgnoreCase(si1)) {
                    menu();
                }
                if (respuesta2.equalsIgnoreCase(no1)) {
                    System.exit(0);
                } else {
                    System.out.println("Opcion Invalida");
                }
                break;
            case 3:
                System.out.println("");
                System.out.println("Por favor ingresa el tamaño del cuadrado:");
                Scanner ingreso = new Scanner(System.in);
                int tamano = ingreso.nextInt();
                String[][] cuadrado = new String[tamano][tamano];
                imprimirMatriz(llenarmatriz(cuadrado));
                System.out.println("¿Desea regresar?si/no");
                Scanner dato4 = new Scanner(System.in);
                String respuesta3 = dato4.nextLine();
                String si2 = "si";
                String no2 = "no";
                if (respuesta3.equalsIgnoreCase(si2)) {
                    menu();
                }
                if (respuesta3.equalsIgnoreCase(no2)) {
                    System.exit(0);
                } else {
                    System.out.println("Opcion Invalida");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("La opcion no existe. Intente nuevamente");
                menu();
        }

    }

    public static void metodoPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
    }

    public static void metodomultiplicacion() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Por favor ingresa el numero a multiplicar:");
        int numero1 = dato.nextInt();
        int r = 0;
        System.out.println("Desea ingresar otro numero? si/no ");
        Scanner dato1 = new Scanner(System.in);
        String respuesta = dato1.nextLine();
        String si = "si";
        String no = "no";
        while (respuesta.equalsIgnoreCase(si)) {

            System.out.println("Por favor ingresa el numero a multiplicar:");
            int numero2 = dato.nextInt();
            r = numero1 * numero2;
            numero1 = r;
            System.out.println("Desea ingresar otro numero? si/no ");
            respuesta = dato1.nextLine();
        };
        if (respuesta.equalsIgnoreCase(no)) {
            System.out.println("La respuesta es " + r);
        }

    }

    public static String[][] llenarmatriz(String matrizvacia[][]) {
        for (int i = 0; i < matrizvacia.length; i++) {
            for (int j = 0; j < matrizvacia.length; j++) {

                matrizvacia[i][j] = " ";
                matrizvacia[0][j] = "#";
                matrizvacia[i][0] = "#";
                matrizvacia[matrizvacia.length - 1][j] = "#";
                matrizvacia[i][matrizvacia.length - 1] = "#";

            }

        }
        return matrizvacia;

    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }

    }

}
