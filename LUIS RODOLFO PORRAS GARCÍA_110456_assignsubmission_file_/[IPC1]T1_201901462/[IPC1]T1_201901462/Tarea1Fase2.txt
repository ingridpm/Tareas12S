package tarea1fase2;

import java.util.InputMismatchException;
import java.util.Scanner;

//><
public class Tarea1Fase2 {

    public static void main(String[] args) {
        MenuP();
    }

    public static void MenuP() {
        Scanner entrada = new Scanner(System.in);
        int select;
        boolean salir = false;

        while (!salir) {
            System.out.println("-----MENU PRINCIPAL-----\n"
                    + "1. Verificar si un número es par o impar\n"
                    + "2. Producto de n numeros\n"
                    + "3. Cuadro de nxn \n"
                    + "4. Salir");
            try {
                select = entrada.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("_____PAR O IMPAR_____");
                        System.out.println("Ingrese un número: ");
                        Problema1();
                    case 2:
                        System.out.println("_____PRODUCTO DE N NUMEROS_____");
                        System.out.println("¿Cuántos números va a ingresar?: ");
                        Problema2();
                        salir = true;
                        break;
                    case 3:
                        System.out.println("_____CUADRO DE N X X_____");
                        System.out.println("Ingrese el tamaño del cuadro: ");
                        Problema3();
                        salir = true;
                        break;
                    case 4:
                        System.out.println("Adios!");
                        System.exit(0);
                    default:
                        System.out.println("Porfavor ingresar SOLO valores entre 1 y 4\n\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Porfavor ingresar solo números\n\n");
                entrada.next();
            }
        }
    }

    public static void Problema1() {
        Scanner prob1 = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                int num1 = prob1.nextInt();
                if (num1 % 2 == 0) {
                    System.out.println(+num1 + " es un número par\n\n");
                    MenuP();
                    break;
                } else {
                    System.out.println(+num1 + " es un número impar\n\n");
                    MenuP();
                    break;
                }
            } catch (Exception e) {
                System.out.println("Porfavor ingresar solo números\n\n");
                prob1.next();
                System.out.println("_____PAR O IMPAR_____");
                System.out.println("Ingrese un número: ");
            }
        }

    }

    public static void Problema2() {
        Scanner prob2 = new Scanner(System.in);
        Scanner prob3 = new Scanner(System.in);
        int total = prob3.nextInt();
        System.out.println("Ingrese los números:");
        int aux = 1;

        for (int i = 0; i < total; i++) {
            int num2 = prob2.nextInt();
            aux = aux * num2;
        }

        System.out.println("La multiplicación es: " + aux + "\n\n");
        MenuP();

    }

    public static void Problema3() {
        Scanner prob3 = new Scanner(System.in);
        int num3 = prob3.nextInt();

        if (num3 != 1) {
            for (int i = 0; i < num3; i++) {
                System.out.print("#");
            }
            System.out.println();

            for (int i = 0; i < num3 - 2; i++) {
                System.out.print("#");
                for (int j = 0; j < num3 - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("#");
            }

            for (int i = 0; i < num3; i++) {
                System.out.print("#");
            }
        }else{
            System.out.println("#");
        }

        System.out.println("\n\n");
        MenuP();

    }
}
