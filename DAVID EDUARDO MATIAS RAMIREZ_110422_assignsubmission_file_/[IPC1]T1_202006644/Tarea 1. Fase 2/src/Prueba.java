import javax.swing.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        while(!salir) {

            System.out.println("Opcion 1. (Definir si n es par o impar)");
            System.out.println("Opcion 2. (Producto de n numeros)");
            System.out.println("Opcion 3. (Cuadrado nxn)");
            System.out.println("Opcion 4. (Salir)");

            try {

                System.out.println("Selecciona una opcion");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        Scanner teclado = new Scanner(System.in);
                        int n;
                        System.out.println("Esta opcion nos permite determinar si un numero es par o impar por favor ingrese un numero");
                        n= teclado.nextInt();

                        if (n % 2 ==0) {
                            System.out.println(n+" es un numero par");
                        }else {
                            System.out.println(n+" no es un numero par");
                        }
                        break;
                    case 2:
                        System.out.println("Esta opcion nos permite ingresar infinita cantidad de numeros y realiza el producto de lo numeros ingresados");
                        System.out.println("Por favor indique la cantidad de numeros que ingresara:");


                        break;
                    case 3:

                        Scanner tec = new Scanner(System.in);
                        System.out.print("Esta opcion crea un cuadrado con # del tamaño del numero que ingresa el usuario, por favor ingrese el tamaño del cuadrado:");
                        int k = tec.nextInt();
                        if(k >= 0 && k<=k) {
                            for(int i = 0; i < k; i++) {
                                System.out.print("#");
                            }
                            System.out.println();
                            for(int i = 0; i < k-2; i++) {
                                System.out.print("#");
                                for(int j = 0; j < k-2; j++) {
                                    System.out.print(" ");
                                }
                                System.out.println("#");
                            }
                            for(int i = 0; i < k; i++) {
                                System.out.print("#");
                            }

                        }
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Error");
                }

            }catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero");
                sn.next();
            }
        }
        System.out.println("Fin del menu");


    }


    }