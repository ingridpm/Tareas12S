package com.src.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Determinar si un numero es par o impar");
        System.out.println("2. Multiplicacion entre 'n' cantidad de numeros");
        System.out.println("3. Cuadrado formado de '#' de 'nxn'");
        System.out.println("4. Salir");
        System.out.println("5. Otro");

        try {
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    try {
                        System.out.println("Ingrese un numero para conocer si es par o impar");

                        int var = scanner.nextInt();
                        if (var%2==0)
                            System.out.println("El número es par");
                        else
                            System.out.println("El número es impar");
                    } catch (Exception e) {
                        System.out.println("solo puede ingresar numeros");
                    }

                break;
                case 2:
                    try {
                        System.out.println("Ingrese el numero de datos que desea multiplicar");

                        int n = scanner.nextInt();
                        int multplicacion = 1;
                        int[] numeros = new int[n];
                        Scanner ent = new Scanner(System.in);
                        for (int i = 0; i < n; i++) {
                            System.out.println("Ingrese un numero");
                            numeros[i] = ent.nextInt();
                            multplicacion *= numeros[i];
                        }
                        System.out .println("El resultado es");
                        System.out.println(multplicacion);

                    } catch (Exception e) {
                        System.out.println("solo puede ingresar numeros");
                    }
                break;
                case 3:
                    try{
                        System.out.println("Ingrese el tamano del cuadrado deseado");
                        int n = scanner.nextInt();


                        if(n!=0){
                            for(int i = 0; i<n; i++){
                                for(int j = 0; j<n; j++){
                                    if(i==0 || i==n-1){
                                        System.out.print("#");

                                    }else if (i > 0 && i < n-1){
                                        if(j == 0 || j == n-1){
                                            System.out.print("#");
                                        }else{
                                            System.out.print(" ");
                                        }

                                    }

                                }System.out.print("\n");

                            }

                        }else {
                            System.out.print("No hay cuadrados de 0x0");
                        }

                    } catch (Exception e){
                        System.out.println("Solo puede ingresar numeros");
                    }
                break;
                case 4:
                    System.out.print("\nUsted ha escogido salir del programa");
                break;
                default:
                    System.out.println("\nLo siento, la opcion elegida no es correcta.");

            }



        } catch (Exception e) {
            System.out.println("Solo puede ingresar numeros");

        }

    }
}
