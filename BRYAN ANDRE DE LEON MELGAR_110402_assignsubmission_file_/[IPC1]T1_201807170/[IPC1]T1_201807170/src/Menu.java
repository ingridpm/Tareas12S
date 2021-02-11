import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        int opcion=0;
        Scanner entrada=new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println(" 1. Numero par o impar");
            System.out.println(" 2. Multiplos de un numero");
            System.out.println(" 3. Cuadro nxn");
            System.out.println(" 4. Salir");

            System.out.print("\nPor favor ingrese la opcion que desea ejecutar: ");
            opcion=entrada.nextInt();

            if (opcion==1){
                System.out.println("\n**********************************");
                System.out.print("Por favor ingrese un numero: ");
                int num=entrada.nextInt();

                if (num%2==0){
                    System.out.println("El numero es par!");
                    System.out.println("**********************************");
                    System.out.println();

                }
                else {
                    System.out.println("El numero es impar!");
                    System.out.println("**********************************");
                    System.out.println();
                }
            }
            else if (opcion==2){
                System.out.println("\n**********************************");
                System.out.print("Por favor ingrese un numero: ");
                int num=entrada.nextInt();
                String continuar="s";
                int resultado=1;

                while (continuar.equalsIgnoreCase("s")){
                    resultado=resultado*num;

                    System.out.print("-Desea ingresar otro numero: ");
                    continuar=entrada.next();
                    if (continuar.equalsIgnoreCase("s")){
                        System.out.print("-Ingreses el numero que desee: ");
                        num=entrada.nextInt();
                    }
                }

                System.out.println("\nEl resultado es: " + resultado);
                System.out.println("**********************************\n");
            }
            else if (opcion==3){
                System.out.println("\n**********************************");
                System.out.print("Ingrese un numero: ");
                int num= entrada.nextInt();
                System.out.println();
                int contador=1;

                while (contador<=num){
                    if (contador==1 || contador==num){
                        for (int i=1; i<=num; i++){
                            System.out.print("#");
                        }
                    }
                    else {
                        for (int i=1; i<=num; i++){
                            if (i==1 || i==num){
                                System.out.print("#");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();
                    contador++;
                }
                System.out.println("\n**********************************");
            }
            else if (opcion==4){
                System.out.println("\n**********************************");
                System.out.println("Se ha finalizado la ejecucion!");
                System.out.println("**********************************");
                break;
            }

        }while (opcion>0 && opcion<5);

        if (opcion==5){
            System.out.println("\n**********************************");
            System.out.println("Error, el numero ingresado no  es valido!");
            System.out.println("**********************************");
        }

    }
}
