package com;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ejercio1 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Opicion_1");
                    Opicion_1();
                    break;
                case 2:
                    System.out.println("Opcion_2");
                    Opiocion_2();
                    break;
                case 3:
                    System.out.println("Opcion_3");
                    Opiocion_3();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }

    public static void Opicion_1() {
        Scanner lector = new Scanner(System.in);
        int num = 0;
        System.out.println("Cual es el numero");
        num = lector.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es numero Par");
        } else {
            System.out.println("Es numero Impar");
        }
    }

    public static void Opiocion_2() {

        int datoGuardado = 1;
        while (true) {
            Scanner lector2 = new Scanner(System.in);
            int num = 0;
            System.out.println("Cual es el numero");
            num = lector2.nextInt();

            datoGuardado = datoGuardado * num;

             {System.out.println("Quiere continuar ");
                 System.out.println(" 1. Si");
                 System.out.println(" 2. No");
                 lector2 = new Scanner(System.in);
                 int seleccion = lector2.nextInt();
                 if (seleccion == 2)
                break;
            }
        }
        System.out.print(" La multiplicacion de los numeros es " + datoGuardado + " \n");


    }
    public static void Opiocion_3 () {
        Scanner lector3 = new Scanner(System.in);
        int n = 0;
        System.out.println("Cual es el numero");
        n = lector3.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("# ");
        }
        System.out.println("");

        for (int j = 0; j < n - 2; j++) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print("# ");
                } else if (i == n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("# ");
        }System.out.println("\n");
    }
}







