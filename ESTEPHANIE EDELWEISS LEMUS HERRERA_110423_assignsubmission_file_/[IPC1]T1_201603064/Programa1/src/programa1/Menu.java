package programa1;

import java.util.Scanner;

public class Menu {

    public Menu() {
        menuPrincipal();
    }

    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;

        try {
            do {
                System.out.println("Ingresa el número correspondiente al programa que deseas iniciar:"
                        + "\n1. Determinar si un número es par o impar"
                        + "\n2. Obtener el producto de los números ingresados"
                        + "\n3. Generar un cuadrado nxn utilizando #"
                        + "\n4. Salir");

                opcionMenu = scanner.nextInt();

                switch (opcionMenu) {
                    case 1:
                        Caso1 caso1 = new Caso1();
                        break;
                    case 2:
                        Caso2 caso2 = new Caso2();
                        break;
                    case 3:
                        Caso3 caso3 = new Caso3();
                        break;
                    case 4:
                        System.out.println("Gracias por participar!");
                        break;
                    default:
                        System.out.println("No seas meco! Ingresa una de las opciones mencionadas.");
                }

            } while (opcionMenu != 4);
        } catch (Exception e) {
            System.out.println("Ya te dije que ingreses un número.");
        }
    }

}
