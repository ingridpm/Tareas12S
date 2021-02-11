
package tarea1fase2;

import java.util.Scanner;

public class Tarea1Fase2 {   
    public static void main(String[] args) {
      int opcion;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do {
             System.out.println("Menú Principal");
        System.out.println("Elige una opción");
        System.out.println("1. Determinar si un número es par o impar.");
        System.out.println("2. Multiplicar n números entre sí.");
        System.out.println("3. Generar un cuadrado de nxn.");
        System.out.println("4. Salir.");
        opcion = teclado.nextInt();
        if (opcion == 4) {
            System.out.println("Programa finalizado");
        }
        switch (opcion) {
            case 1: 
                int numero;
                System.out.println("Ingrese un número");
                numero = teclado.nextInt();
                if (numero%2 == 0) {
                    System.out.println("El número ingresado es par.");
                } else {
                    System.out.println("El número ingresado es impar.");
                }
                break;
            case 2: 
                int contador, producto, n, num;
                System.out.println("Ingrese la cantidad de números a multiplicar");
                n = teclado.nextInt();
                contador = 1;
                producto = 1;
                while (contador <= n ) {
                    System.out.println("Ingrese el número " + contador);
                    num  = teclado.nextInt();
                    contador = contador+1;
                    producto = num*producto;
                }
                System.out.println("El producto de los " + n + " números es: " + producto);
                break;
            case 3:
                int dimension, conta, nivelactual;
                System.out.println("Ingrese la dimensión que desea para su cuadrado.");
                dimension = teclado.nextInt();
                String espacio = " ";
                String numeral = "#";
                conta = 1;
                while (conta < dimension) {
                numeral = numeral+"#";
                conta = conta+1;
            }
                conta = 1;
                while (conta < dimension-2) {
                    espacio = espacio+" ";
                    conta = conta+1;
                }
                for (nivelactual = 1;  nivelactual <= dimension; nivelactual++) {
                    
                    if (nivelactual == 1  || nivelactual == dimension) {
                        System.out.println(numeral);
                    }
                    else 
                        System.out.println("#" + espacio + "#");
                } 
                break;
            case 4:
                System.out.println("Has salido del menú. :(");
                salir = true;
                break;
            default:
                System.out.println("Ingresa una opción válida.");
        }
        
             } while (!salir);
    }
}
    
