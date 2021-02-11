package programa1;

import java.util.Scanner;

public class Caso1 {

    public Caso1() {
        caso1();
    }

public void caso1() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("¡Bienvenido al programa para saber si un número es par o impar! ¿Qué número te causa duda?");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Basado en mis cálculos, el número es par."
                        + "\nAhora, al menú principal");
            } else if (numero % 2 != 0) {
                System.out.println("El nùmero es impar."
                        + "\n¡Al menú principal!");
            }

        } catch (Exception e) {
            System.out.println("Amiguito, necesitas ingresar un número.");
        }
    }
}
