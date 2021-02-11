package tarea1;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Tarea1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opciones;

        while (!salir) {

            System.out.println("1. Numero par o Impar :1");
            System.out.println("2. Producto de numeros:2");
            System.out.println("3. Cuadrado de nxn    :3");
            System.out.println("4. salir del menu     :4");

            try {
                System.out.println("Elije una opcion:");

                opciones = scanner.nextInt();

                switch (opciones) {
                    case 1:
                        int numero;
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Ingrese un numero:");
                        numero = scan.nextInt();
                        if (numero % 2 == 0) {
                            System.out.println("El numero es par.");
                        } else {
                            System.out.println("El numero es impar.");
                        }
                        break;
                    case 2:
                                                int acumulacionmulti = 1;
                        Scanner sc = new Scanner(System.in);
                        int n;
                        do {
                            System.out.println("Ingresa un numero, para finaliza escribe 0.");
                            n = sc.nextInt();
                            if (n > 0 && n != 0) {
                                acumulacionmulti *= n;
                            }
                        } while (n != 0);
                        System.out.println("El resultado de la multiplicacion es:" + acumulacionmulti);

                        break;
                    case 3:
                        Scanner cuadrado = new Scanner(System.in);
                        System.out.print("Ingrese el tamaño del cuadrado");
                        int tamanio = cuadrado.nextInt();

                        if (tamanio >= 0 && tamanio <= 100) {
                            for (int i = 0; i < tamanio; i++) {
                                System.out.print("#");
                            }
                            System.out.println();

                            for (int i = 0; i < tamanio - 2; i++) {
                                System.out.print("#");
                                for (int j = 0; j < tamanio - 2; j++) {
                                    System.out.print(" ");
                                }
                                System.out.println("#");
                            }

                            for (int i = 0; i < tamanio; i++) {
                                System.out.print("#");
                            }
                        }
                        System.out.println();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo puedes escojer una de las 4 opciones");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo debes ingresar numeros.");
                scanner.next();
            }

        }

    }

}
