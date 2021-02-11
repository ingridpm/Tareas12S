package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kevin Dario Jimenez Solis"+ "\n 201807231"+"\nTarea 1 Fase 2");
        System.out.println("\n -----------MENU----------"+"\n 1. Par o Impar"+"\n 2. Producto"+"\n 3. Dibujar Cuadrado");
        System.out.println("Elija la opcion que desea Ejecutar");
        int op = scanner.nextInt();
        switch (op){
            case 1:
                System.out.println("----------PAR O IMPAR----------");
                System.out.println("\nIngrese el numero que desea comprobar");
                int n = scanner.nextInt();
                if (n%2==0){
                    System.out.println("\nEl numero "+n+" es Par");
                }
                else {
                    System.out.println("\nEl numero "+n+" es Impar");
                }
                break;
            case 2:
                System.out.println("----------PRODUCTO----------");
                int num,product=1,num2=1;
                do {
                    System.out.println("Inserte un numero ");
                    num= scanner.nextInt();
                    product=num*product;
                    System.out.println("Desea ingresar otro numero?"+"\nSi-->(1)"+"\nNo-->(2)");
                    num2= scanner.nextInt();
                }while (num2==1);
                System.out.println("\nEl resultado es ");
                System.out.println(product);
                break;
            case 3:
                System.out.println("\n-----DIBUJAR UN CUADRADO-----");
                int f=0,c=0,l;
                System.out.println("Ingrese el lado del cuadrado");
                l= scanner.nextInt();
                do{
                    do{
                        if (f==0||f==l-1){
                            System.out.print(" # ");
                            c++;
                        }
                        else{
                            if(c==0||c==l-1){
                                System.out.print(" # ");
                                c++;
                            }
                            else{
                                System.out.print("   ");
                                c++;
                            }
                        }
                    }while(c<l);
                    System.out.println();
                    f++;
                    c=0;
                }while (f<l);
                break;
            default:
                System.out.println("Ingrese una opcion valida.");

        }

    }
}
