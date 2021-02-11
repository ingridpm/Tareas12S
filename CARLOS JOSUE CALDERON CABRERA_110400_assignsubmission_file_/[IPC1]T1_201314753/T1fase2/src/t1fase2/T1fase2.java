package t1fase2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Josué
 */
public class T1fase2 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int ele;
        int salida;
        Scanner sele = new Scanner(System.in);
        try {
            do {
                salida = 0;
                System.out.println("Bienvenido");
                System.out.println("1. Identificador de Pares e Impares");
                System.out.println("2. Multiplicador de numeros ingresados");
                System.out.println("3. cuadros");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opcion: ");
                ele = sele.nextInt();
                switch (ele) {
                    case 1:
                        opc1();
                        break;
                    case 2:
                        opc2();
                        break;
                    case 3:
                        opc3();
                        break;
                    case 4:
                        System.out.println("Adios, hasta luego");
                        break;
                    default:
                        System.out.println("Favor de ingresar opcion del 1-4");
                        break;
                }
            } while (ele != 4);
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un opcion numerica");
            T1fase2.menu();
        }
    }

    public static void opc1() {
        int num;
        int ele;
        Scanner ip = new Scanner(System.in);
        Scanner sel2 = new Scanner(System.in);
        try {
            do {
                System.out.println("Ingrese un numero: ");
                num = ip.nextInt();
                System.out.println(num);
                if (num % 2 == 0) {
                    System.out.println("el numero es par");
                } else if (num == 0) {
                    System.out.println("el numero es 0");
                } else if (0 > num && num % 2 == 0) {
                    System.out.println("el numero es negativo y par");
                } else if (num < 0 && num % 2 != 0) {
                    System.out.println("el numero es negativo e impar");
                } else {
                    System.out.println("el numero es impar");
                }
                System.out.println("Desea continuar 1. si/2. no: ");
                ele = sel2.nextInt();
                if (ele > 2 || ele < 0) {
                    System.out.println("error de respuesta");

                }
            } while (ele == 1);
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un valor numerico");
            T1fase2.opc1();
        }
    }

    public static void opc2() {
        int num = 1;
        int ele;
        int ele2;
        Scanner dat = new Scanner(System.in);
        Scanner ing = new Scanner(System.in);
        Scanner ot = new Scanner(System.in);
        try {
            do {
                System.out.println("Ingrese la cantidad de numeros a operar: ");
                ele = ing.nextInt();
                do {
                    System.out.println("Ingrese numero: ");
                    num = num * dat.nextInt();
                    ele = ele - 1;
                } while (ele != 0);
                System.out.println("la multiplicacion es:" + num);
                System.out.println("Desea realizar otra operación 1. si/2.no: ");
                ele2 = ot.nextInt();
            } while (ele2 == 1);
        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar datos de caracter numerico");
            T1fase2.opc2();
        }
    }

    public static void opc3() {
        int num;
        int cant;
        Scanner ing = new Scanner(System.in);
        try {
            do {
                System.out.println("Ingrese el tamaño del cuadrado: ");
                cant = ing.nextInt();
                String[][] mat = new String[cant][cant];
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat.length; j++) {
                        if (i == 0 || j == 0) {
                            mat[i][j] = "#";
                        } else if (i == (cant - 1) || j == (cant - 1)) {
                            mat[i][j] = "#";
                        } else {
                            mat[i][j] = " ";
                        }
                        System.out.print(mat[i][j]);
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("desea ingresar otro cuadrado: 1.si/2.no: ");
                num = ing.nextInt();
            } while (num == 1);
        } catch (InputMismatchException e) {
            System.out.println("Solo opcion de caracter numerico");
            T1fase2.opc3();
        }
    }
}
