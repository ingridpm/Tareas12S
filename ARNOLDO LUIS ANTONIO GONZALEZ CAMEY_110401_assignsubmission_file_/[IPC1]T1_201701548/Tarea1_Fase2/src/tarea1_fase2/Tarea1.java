package tarea1_fase2;
import java.util.Scanner;
/**
 *
 * @author Arnoldo González
 */
public class Tarea1 {

    public Tarea1() {
    }

    public void Menú() {

        int opcion;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("\nCLAVE: 13");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("==============================================");
            System.out.println("^    [[[[[[[[[[[[[[Problemas]]]]]]]]]]]]]]   ^");
            System.out.println("^     Elija una de las siguiente opciones:   ^");
            System.out.println("^  1) Problema 1                             ^");
            System.out.println("^  2) Problema 2                             ^");
            System.out.println("^  3) Problema 3                             ^");
            System.out.println("^  4) Salir                                  ^");
            System.out.println("==============================================");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.print("Escriba aquí: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    Problema1();
                    break;
                case 2:
                    Problema2();
                    break;
                case 3:
                    Problema3();
                    break;
                case 4:
                    System.out.println("*Saliendo del programa*");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n<<<<<<<Opción inválida>>>>>>>");
            }
        } while (opcion != 4);
    }

    public void Problema1() {

        int numero = 0;
        System.out.println("\n--------Problema 1--------");
        System.out.print("Digite un numero: ");
        Scanner lector = new Scanner(System.in);
        numero = lector.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
    }

    public void Problema2() {

        int cantidadNumeros = 0, contador = 0, numero = 0, resultado = 1;
        System.out.println("\n--------Problema 2--------");
        System.out.print("Escriba el número de digitos que multiplicara: ");
        Scanner lector = new Scanner(System.in);
        cantidadNumeros = lector.nextInt();
        while (cantidadNumeros > contador) {
            System.out.print("Digite un número: ");
            Scanner lectorNum = new Scanner(System.in);
            numero = lectorNum.nextInt();
            resultado *= numero;
            contador++;
        }
        System.out.println("El resultado de la múltiplicación es: " + resultado);
    }

    public void Problema3() {

        int filaActual = 1, columnaActual = 1, primerCaracter = 1, Altura;
        System.out.println("\n--------Problema 3--------");
        System.out.print("Indique las dimensiones del cuadrado: ");
        Scanner lector = new Scanner(System.in);
        Altura = lector.nextInt();
        if (Altura > 0) {
            for (filaActual = 1; filaActual <= Altura; filaActual++) {
                for (columnaActual = 1; columnaActual <= Altura; columnaActual++) {
                    if (columnaActual == primerCaracter) {
                        System.out.print("#");
                    } else {
                        if (columnaActual == Altura) {
                            System.out.println("#");
                        } else {
                            if (filaActual == Altura) {
                                System.out.print("#");
                            } else {
                                if (filaActual == primerCaracter) {
                                    System.out.print("#");

                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Opción invalida");
        }
    }
}