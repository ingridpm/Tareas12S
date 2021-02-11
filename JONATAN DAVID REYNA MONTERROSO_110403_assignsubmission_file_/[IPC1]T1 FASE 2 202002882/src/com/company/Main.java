package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int loop, entrada=0;
        loop = entrada;
        do {
            System.out.println (" ");
        System.out.println (" -----------------------------------------------------------");
        System.out.println ("| Elige un programa:                                        |");
        System.out.println ("|        1. Comprobar si un numero es par o impar           |");
        System.out.println ("|        2. Multiplicar 'n' numeros                         |");
        System.out.println ("|        3. Cuadrado de #                                   |");
        System.out.println ("|        4. Salir                                           |");
        System.out.println (" -----------------------------------------------------------");
        System.out.print ("Elije la opción: ");
        try {


        Scanner opcion = new Scanner(System.in);
        entrada = opcion.nextInt();
        switch (entrada){
            case 1:
                int n1;
                try {
                    Scanner n = new Scanner(System.in);
                    System.out.println("Ingrese un número");
                    n1 = n.nextInt();
                    if (n1 % 2 == 0)
                        System.out.println("El número es par");
                    else
                        System.out.println("El número es impar");
                } catch (Exception e) {
                    System.out.println("Opción no válida");
                }break;
            case 2:
                int n2, num1, i=0, resp=1, n3;
                try {
                    Scanner n = new Scanner(System.in);
                    System.out.println("Ingrese cuántos númeos quiere multiplicar:");
                    n2 = n.nextInt();
                    n3 = n2 - 1;
                    for (i = 0; i <= n3; i++) {
                        System.out.println("Ingrese un número:");
                        num1 = n.nextInt();
                        resp = resp * num1;
                    }
                    System.out.println("El resultado de la multiplicación es:" + resp);
                } catch (Exception e){
                    System.out.println("Opción no válida");
                }break;
            case  3:
                int n4;
                    Scanner dato =new Scanner(System.in);
                try{


                    System.out.print("Ingrese un numero: ");
                    n4 = dato.nextInt();
                if(n4 >= 0) {
                    for(int j = 0; j < n4; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                    for(int j = 0; j < n4-2; j++) {
                        System.out.print("#");
                        for(int k = 0; k < n4-2; k++) {
                            System.out.print(" ");
                        }
                        System.out.println("#");
                    }
                    for(int j = 0; j < n4; j++) {
                        System.out.print("#");
                    }
                }
                }catch (Exception e) {
                    System.out.println("Opción no válida");
                }
                break;
            case 4:
                System.out.println("¡Gracias por usar el programa!");
                System.exit(0);
                break;
            default:
                break;
                            }
        }catch (Exception e){

                System.out.println("Opción no válida");
            }
        }while (loop !=1 ) ;
        }



    }

