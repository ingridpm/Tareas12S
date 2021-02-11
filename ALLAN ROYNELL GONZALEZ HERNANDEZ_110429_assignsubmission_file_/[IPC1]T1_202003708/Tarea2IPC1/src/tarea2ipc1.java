
import java.util.Scanner;

public class tarea2ipc1 {

    public static void main(String[] args) {

        boolean salir = false;
        while (!salir) {
            try {
                System.out.println("***********************************************************");
                System.out.println("*                    MENÚ DE OPCIONES                     *");
                System.out.println("*                                                         *");
                System.out.println("* 1. Determinar si un número es par                       *");
                System.out.println("* 2. Determinar el producto de cierta cantidad de números *");
                System.out.println("* 3. Hacer un cuadrado de nxn con el caracter '#'         *");
                System.out.println("* 4. Salir del programa                                   *");
                System.out.println("***********************************************************");
                Scanner entrada = new Scanner(System.in);
                int numero;
                System.out.println("Ingrese un número para realizar dicha acción: ");
                numero = entrada.nextInt();
                switch (numero) {
                    case 1:
                        Scanner numero1 = new Scanner(System.in);
                        int numero2;
                        System.out.println("Ingrese el número a evaluar: ");
                        numero2 = numero1.nextInt();
                        int evaluacion;
                        evaluacion = numero2 % 2;
                        if (evaluacion == 0) {
                            System.out.println("El número es par");
                        } else {
                            System.out.println("El número es impar");
                        }
                        break;
                    case 2:
                        Scanner numero4 = new Scanner(System.in);
                        int numero5;
                        System.out.println("Ingrese la cantidad de números a multiplicar: ");
                        numero5 = numero4.nextInt();
                        int r;
                        r = 1;
                        for (int i = 0; i <= numero5; i++) {
                            if (i == numero5) {
                                System.out.println("El resultado es: " + r);
                                break;
                            }
                            Scanner numero6 = new Scanner(System.in);
                            int numero7;
                            System.out.println("Ingrese un número: ");
                            numero7 = numero6.nextInt();
                            r = numero7 * r;

                        }
                        break;
                    case 3:
                        Scanner numero8 = new Scanner(System.in);
                        int numero9;
                        System.out.println("Ingrese un número para formar las dimensiones del cuadrado ");
                        numero9 = numero8.nextInt();
                        for (int i = 0; i < numero9; i++) {
                            System.out.print("#");
                        }
                        System.out.println();

                        for (int i = 0; i < numero9 - 2; i++) {
                            System.out.print("#");
                            for (int j = 0; j < numero9 - 2; j++) {
                                System.out.print(" ");
                            }
                            System.out.println("#");
                        }

                        for (int i = 0; i < numero9; i++) {
                            System.out.print("#");
                        }
                        System.out.println("");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Usted ha ingresado un número fuera del rango, intente de nuevo");
                }
            }catch (Exception e){
                System.out.println("Usted ha ingresado un valor incorrecto, intente de nuevo.!");
            }
        }
    }
}
