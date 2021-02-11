
package tarea1fase2;

import java.util.Scanner;

public class Tarea1Fase2 {

    public static void main(String[] args) {
        int entrada, parImpar, multiplicador, acumulado, tamañoCuadrado, nuevoNumero;
        Scanner leer= new Scanner(System.in);
        do{
            System.out.println("Ingrese el número de la opcíón a la cuál desea ingresar:");
            System.out.println("1. Determinar número par o impar");
            System.out.println("2. Producto de n números");
            System.out.println("3. Cuadrado nxn");
            System.out.println("4. Salir");
            System.out.println("--------------------------------------------------------");
            entrada = leer.nextInt();
            System.out.println("--------------------------------------------------------");
            switch (entrada){
                case 1:
                    System.out.println("Ingrese un número");
                    parImpar = leer.nextInt();
                    if (parImpar%2 == 0){
                        System.out.println("El número ingresado es par");
                    }else{
                        System.out.println("El número ingresado es impar");
                    }
                    System.out.println("--------------------------------------------------------");
                    break;
                case 2:
                    acumulado = 1;
                    nuevoNumero = 1;
                    while(nuevoNumero == 1){
                        System.out.println("Ingrese un número");
                        multiplicador = leer.nextInt();
                        acumulado = acumulado*multiplicador;
                        System.out.println("¿Desea ingresar un nuevo número?");
                        System.out.println("ingresa 1 para ingresar nuevo número");
                        System.out.println("ingresa 2 para ingresar obtener el resultado");
                        nuevoNumero = leer.nextInt();
                    }
                    System.out.println("El resultado es: " + acumulado);
                    System.out.println("--------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese un número");
                    tamañoCuadrado = leer.nextInt();
                    for(int i=1;i<=tamañoCuadrado;i++){
                        for (int j=1;j<=tamañoCuadrado;j++){
                            if(i==1 || i == tamañoCuadrado){
                                System.out.print("#");
                            }else{
                                if(j==1 || j== tamañoCuadrado){
                                    System.out.print("#");
                                }else{
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("--------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Fin del programa, adiós");
                    System.out.println("--------------------------------------------------------");
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("--------------------------------------------------------");
            }
        }while (entrada != 4);
    }
    
}
