package tarea_2;

import java.util.Scanner;

public class TAREA_2 {


    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        while(!salir){
            System.out.println("1. Opción 1 - NUMERO PAR O IMPAR");
            System.out.println("2. Opcion 2 - PRODUCTO DE N NUMEROS");
            System.out.println("3. Opción 3 - TAMAÑO DE UN CUADRADO #");
            System.out.println("4. Opción 4 - SALIR");
            
            System.out.println("Introduzca su opción: ");
            opcion = n.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un número: ");
                        int numero = n.nextInt();
                        
                        if (numero%2 == 0) {
                            System.out.println("El numero es Par");
                        } else {
                            System.out.println("El numero es Impar");
                        }
                    break;
                    
                case 2:
                        Scanner obtener = new Scanner(System.in);
                        int cantidadNumeros,total,i,nuevoNumero;
 
                        System.out.println("Ingrese la cantidad de numeros a multiplicar: ");
                        cantidadNumeros = obtener.nextInt();
 
                        total = 1;
 
                        for(i = 1; i <= cantidadNumeros; i++)
                        {
                            System.out.println("Ingrese el numero (" + i + ") : ");
                            nuevoNumero = obtener.nextInt();
 
                            total = total * nuevoNumero;
                         }
 
                            System.out.println("El producto total de los numeros es : " + total);
                    break;
                
                case 3:
                    Scanner teclado = new Scanner(System.in);
       
                        System.out.print("Ingrese el tamaño del cuadrado: ");
                        int e = teclado.nextInt();
       
                        if(e >= 0 ) {
                            for(int k = 0; k < e; k++) {
                                System.out.print("#");
                            }
                            System.out.println();
           
           
                            for(int k = 0; k < e-2; k++) {
                                System.out.print("#");
                                for(int j = 0; j < e-2; j++) {
                                    System.out.print(" ");
                                }
                                System.out.println("#");
                            }

                            for(int k = 0; k < e; k++) {
                                System.out.print("#");
                            }
                        }         
                    break;
                   
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("     ERROR      ");
                    
                
         }
        
        }
    }
}

