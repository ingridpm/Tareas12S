
/**
 *
 * @author Rocio L.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Fase2 {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
        //variables
        boolean salir = false;
        int opcion; // variable que guardara la opcion del user

        while (!salir) {// para empezar el menu

            System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
            System.out.println("Selecciona una de las siguientes opciones ");

            System.out.println("1. Determine si un Numero es par o impar");
            System.out.println("2. Producto de N Numeros");
            System.out.println("3. Cuadrado de n x n utilizando el carácter “#”.");
            System.out.println("4. Salir");
            System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");

            try {

                opcion = op.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");

                        System.out.println("Ingresa un numero, para saber si es Par o Impar");

                        try {
                            int N = op.nextInt();

                            if (N % 2 == 0) {
                                System.out.println("El Numero " + N + " Es un numero Par\n");

                            } else {
                                System.out.println("El Numero " + N + " Es impar");
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Por favor ingresa un número");
                            op.next();
                        }

                        break;
                    case 2:

                        System.out.println("Has seleccionado la opcion 2");

                        System.out.println("Ingresa primer numero");

                        int N = op.nextInt();

                        int respuesta = N;

                        boolean sal = false;
                        int SB;
                        while (!sal) {// para empezar el ciclo de preguntas

                            System.out.println("¿Desea Ingresar otro numero?");
                            System.out.println("Escriba 1 para indicar: SI o 2 para indicar: NO");

                            try {
                                int SN = op.nextInt();
                                switch (SN) {
                                    case 1:
                                        System.out.println("Ingrese El Siguiente Numero");
                                        int N2 = op.nextInt();
                                        respuesta = respuesta * N2;
                                        System.out.println("El producto de Los numeros es:\n" + respuesta);
//
                                        break;
                                    case 2:
                                        System.out.println("El Numero es " + respuesta);
                                        sal = true;
                                        break;

                                    default:

                                        System.out.println("Solo números entre 1 y 2");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                op.next();
                            }

                        }

                        break;

                    case 3:
                        System.out.println("Has seleccionado la opcion 3\n");

                        System.out.println("Ingrese el tamanio del cuadrado: ");
                        int n = op.nextInt();
                        if (n >= 0 && n <= 50) {
                            //linea superior
                            for (int i = 0; i < n; i++) {
                                System.out.print("#");

                            }
                            System.out.println();

                            //centrito en blanco
                            for (int i = 0; i < n - 2; i++) {
                                System.out.print("#");
                                for (int j = 0; j < n - 2; j++) {
                                    System.out.print(" ");

                                }
                                System.out.println("#");
                            }

                            for (int i = 0; i < n; i++) {
                                System.out.print("#");

                            }

                        } else {
                            System.out.println("ingrese dato numerico");
                        }

                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("¡¡¡Debes insertar un número!!!");
                op.next();
            }

        }
    }

}
