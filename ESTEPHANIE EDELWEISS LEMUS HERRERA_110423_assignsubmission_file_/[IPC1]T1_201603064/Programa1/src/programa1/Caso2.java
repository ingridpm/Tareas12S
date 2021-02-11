package programa1;

import java.util.Scanner;

public class Caso2 {

    public Caso2() {
        caso2();
    }

    public void caso2() {
        int resultado = 1;
        int numero = 1;
        int contador = 0;
        int seguir = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido!");
        try {
            do {
                System.out.println("Ingresa el número que quieres multiplicar.");

                numero = scanner.nextInt();

                resultado = resultado * numero;
                contador++;

                if (contador == 1) {
                    System.out.println("Ahora hay que ingresar el siguiente número a multiplicar.");
                } else {

                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    System.out.println("¿Deseas multiplicar el resultado por otro número?"
                            + "\n1. Sí"
                            + "\n2. No");

                    seguir = scanner.nextInt();

                    if (seguir == 1) {

                    } else if (seguir == 2) {
                        System.out.println("Eso es todo, gracias!");
                    } else {
                        System.out.println("¡Ingresa una de las opciones!");

                    }
                }
            } while (seguir == 1);
        } catch (Exception e) {
            System.out.println("Ingresa una opción correcta!");
        }
    }
}
