package com.company;

import java.util.Scanner;

public class Main {
    static Scanner escaner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int opcion = 0;
        while (opcion < 1 || opcion > 4) {
            try {
                System.out.println("Escoga una opcion");
                System.out.println("1. Definir Par o Impar\n" +
                        "2. Producto números\n" +
                        "3. NxN de #\n" +
                        "4. Salir");
                opcion = escaner.nextInt();

            } catch (Exception e) {
                System.out.println("Número inválido");
                System.out.println(e);
                System.out.println("Verifique si selecciona un numero entre las opciones.\n");
                escaner.next();
                menu();
            }

            switch (opcion) {
                case 1:
                    definirParoImpar();
                    menu();
                    break;
                case 2:
                    prouctoNumeros();
                    menu();
                    break;
                case 3:
                    nxn();
                    menu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, Ingrese opcion válida\n");

            }

        }
    }

    private static void definirParoImpar() {
        int n = 0;
        try {
            System.out.println("\nIngrese un número entero");
            n = escaner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Esto no es un número válido");
            escaner.next();
            definirParoImpar();
        }
        if (n % 2 == 0) {
            System.out.println(n + " es par\n");
        } else {
            System.out.println(n + " es impar\n");
        }
    }

    private static void prouctoNumeros() {
        double multi = 1, numReal = 0;
        int contador = 0, desicion = 0;
        boolean agregarNumero = true, validacion = true, validacion2=true;

        while (agregarNumero) {
            contador++;

            //validar numero ingresado por el teclado
            while (validacion) {
                try {
                    System.out.println("\nIngrese un número real");
                    numReal = escaner.nextDouble();
                    validacion = false;

                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("Número no válido\n");
                    escaner.next();
                    validacion = true;
                }
            }
            System.out.println("Lleva: "+contador+" numeros");
            multi = multi * numReal;

            //agregar otro numero
            while (validacion2) {
                try {
                    System.out.println("Desea agregar otro número?\n"
                            + "1. Sí\n" +
                            "2. No");
                    desicion = escaner.nextInt();

                    if(desicion<1||desicion>2){
                        validacion2= true;
                    }else{
                        validacion2= false;
                    }

                }catch (Exception e){
                    System.out.println(e);
                    System.out.println("Opcion no válida");
                    escaner.next();
                    validacion2=true;
                }
            }

            switch (desicion) {
                case 1:
                    // agregarNumero = true;
                    agregarNumero = true;
                    validacion = true;
                    validacion2= true;
                    break;
                case 2:
                    agregarNumero = false;
                    break;
                default:
                    System.out.println("Ingrese opcion válida\n");
            }

        }
        System.out.println("La multiplicacion es: " + multi + " con " + contador + " numeros\n");
    }

    private static void nxn() {
        int numero=-1, espacios=0;

        while (numero<0) {
            try {
                System.out.println("Ingrese un numero entero positivo");
                numero = escaner.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Numero no válido\n");
                escaner.next();
            }
        }
        espacios= numero-2;

        for(int i=1; i<= numero; i++){

            if(i==1 || i==numero){
                for(int j=1; j<=numero; j++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            if(i>1 && i<numero){

                System.out.print("#");
                for(int j=1; j<=espacios; j++){
                    System.out.print(" ");
                }
                System.out.print("#");

                System.out.println("");
            }
        }
    }
}
