package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        boolean salida = false;
        while (!salida) {
            int menu;
            System.out.println(" ");
            System.out.println("1. Programa 1: Determinar si un numero es par o impar");
            System.out.println("2. Programa 2: multiplicacion de (n) numeros");
            System.out.println("3. Programa 3: Cuadro de #");
            System.out.println("4. Salir del programa");
            try {
                System.out.println("Escribe una de las opciones");
                menu = scanner1.nextInt();
                switch (menu) {

                    //INICIO PROGRAMA 1
                    case 1:
                        int cantidad1, cantidad2;
                        System.out.println("Escribe un numero");
                        cantidad1 = scanner2.nextInt();
                        cantidad2 = cantidad1 % 2;
                        if (cantidad2 < 1)
                            System.out.println("Es un numero par");
                        else
                            System.out.println("Es un numero Impar");
                        continue;
                    //FIN PROGRAMA 1

                    //INICIO PROGRAMA 2
                    case 2:
                        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
                        int valor1= scanner3.nextInt();
                        int valor2 = 0;
                        int valor4 = 1;
                        while (valor2 < valor1){
                            System.out .println("Ingrese un numero");
                            int valor3= scanner4.nextInt();
                            valor4= valor4 * valor3;
                            valor2++;
                        }
                        System.out.println("El producto de los numeros es:");
                        System.out.println(valor4);
                        continue;
                    //FIN PROGRAMA 2

                    //INICIO PROGRAMA 3
                    case 3:
                        System.out.println("ingrese el tamaño del cuadrado");
                        boolean salidaprograma3 = false;
                        while(!salidaprograma3){
                            int n = scanner5.nextInt();
                            if(n>=0) {

                                //LINEA SUPERIOR
                                int a = 0;
                                while (a < n - 1) {
                                    System.out.print("#");
                                    a++;
                                }
                                System.out.println("#");
                                //FIN LINEA SUPERIOR

                                //INICIO CENTRO DE LA FIGURA
                                int e = 0;
                                while (e < n - 2) {
                                    System.out.print("#");
                                    int f = 0;
                                    while (f < n - 2) {
                                        System.out.print(" ");
                                        f++;
                                    }
                                    System.out.println("#");
                                    e++;
                                }
                                //FIN CENTRO DE LA FIGURA

                                //INICIO LINEA INFERIOR
                                int d = 0;
                                while (d < n-1) {
                                    System.out.print("#");
                                    d++;
                                }
                                System.out.println("#");
                                //FIN LINEA INFERIOR
                                salidaprograma3=true;
                            }else
                                System.out.println("el numero debe ser mayor o igual a 0");
                        }
                        continue;
                    //FIN PROGRAMA 3
                    case 4:
                        salida=true;
                        break;


                    default:
                        System.out.println("Debes escribir un numero del 1 al 4");
                }

                }catch (Exception e) {
                System.out.println("Debes insertar un numero");
                scanner1.next();


            }
        }
    }
}
