//Creado por Khristian Manolo Junior Garcia Pineda - 201404202
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();


    }

    private static void menu() {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int menu = 0;

        System.out.println("Menu: ");
        System.out.println("Opcion 1: Realizar un programa que reciba un número ingresado por el usuario y determine si es par o impar. ");
        System.out.println("Opcion 2: Realizar un programa que reciba “n” números y realice el producto de los mismos.  ");
        System.out.println("opción 3: Realizar un programa que reciba un número y genere un cuadrado de nxn utilizando el siguiente carácter “#“. ");
        System.out.println("4. Salir");
        System.out.println();
        while (!salir) {

            try {
                System.out.println("Escribe una de las opciones del menu");
                menu = entrada.nextInt();//Guardaremos la opcion del menu que selecciono
                System.out.println();
                if (menu == 1) {
                    System.out.println("Opcion 1: Realizar un programa que reciba un número ingresado por el usuario y determine si es par o impar. ");
                    System.out.println();
                    System.out.println("Ingrese un numero para deternminar si es par o impar");
                    int num1;
                    num1= entrada.nextInt();
                    if (num1 % 2 == 0){
                        System.out.println("El numero ingresado es par");

                    } else if (num1 % 2 != 0){
                        System.out.println("El numero ingresado es impar");
                    }



                } else if (menu == 2) {
                    System.out.println("Opcion 2: Realizar un programa que reciba “n” números y realice el producto de los mismos.  ");
                    System.out.println();
                    System.out.println("Ingrese cuantos numeros desea realizar el producto");
                    int numproducto;
                    int aux=1;
                    int num2;
                    numproducto= entrada.nextInt();
                    for (int i=0; i<numproducto;i++){
                        System.out.println("Ingrese numero para realizar el producto");
                        num2= entrada.nextInt();
                        aux=num2*aux;
                    }
                    System.out.println("El producto de todos los numeros ingresados es:" +aux);


                } else if (menu == 3) {
                    System.out.println("opción 3: Realizar un programa que reciba un número y genere un cuadrado de nxn utilizando el siguiente carácter “#“. ");
                    System.out.println("Ingrese un numero para generar un cuadrado de #");
                    int num3;
                    num3= entrada.nextInt();
                    System.out.println();
//Linea Superior
                    for (int i=0; i<num3;i++){
                        System.out.print("#");
                    }
                    System.out.println();

                    //centro figura
                    for (int i=0; i<num3-2;i++){
                        System.out.print("#");
                        for (int j=0; j<num3-2;j++){
                            System.out.print(" ");
                        }
                        System.out.println("#");
                    }
//Linea Inferior
                    for (int i=0; i<num3;i++){
                        System.out.print("#");
                    }
                    System.out.println();


                } else if (menu == 4) {
                    salir = true;
                    System.out.println("SALIDA!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                entrada.next();
                System.out.println();
            }


        }
    }
    }