package programa1;

import java.util.Scanner;

public class Caso3 {

    public Caso3() {
        caso3();
    }

    public void caso3() {
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Bienvenido. Ingresa el número de tu agrado.");
            numero = scanner.nextInt();

            for (int i = 0; i <= numero - 1; i++) {
                System.out.print("#");
            }
            System.out.println("");

            for (int j = 0; j < numero - 2; j++) {
                for (int i = 0; i < numero; i++) {
                    if (i == 0 || i == numero - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

            if (numero == 1) {

            } else {
                for (int i = 0; i <= numero - 1; i++) {
                    System.out.print("#");
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("¡Ingresa un número!");
        }
    }
}
