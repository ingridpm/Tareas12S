package com.Practica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
        int opcion;
    do{
	Scanner op = new Scanner(System.in);
	 opcion = op.nextInt();

	switch (opcion) {

        case 1:
            ParImpar();
            menu();
            break;
        case 2:
            Multi();
            menu();
            break;
        case 3:
            System.out.println("Teclee el tamaño");
            Scanner aux = new Scanner(System.in);
            int aux2 = aux.nextInt();
            Square(aux2);
            menu();
            break;
        case 4:
            System.out.println("Bye Mundo ");
            break;
        default:
            System.out.println("Esa no es una opcion >:v");
            menu();
            break;
    }
    }while (opcion!=4);

    }
    public static void menu(){
        System.out.println("******* EL SELECCIONADOR*******");
        System.out.println();
        System.out.println("1). Par o Impar");
        System.out.println("2). Multiplicacion");
        System.out.println("3). #Cuadrado");
        System.out.println("4). Salir");
    }
    public static void ParImpar(){
        System.out.println("Ingresa tu numero Crack");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y= x%2;
        if(y>0){
            System.out.println(x+" Es un numero  impar");
        }else if(y==0){
            System.out.println(x+" Es un numero  par");
        }
    }
    public static void Multi(){
        System.out.println("Cuantos numeros vas a multiplicar?");
        Scanner x=new Scanner(System.in);
        int aux = x.nextInt();
        double aux2 = 1;
        for(int i=1;i<=aux;i++){
            System.out.println("Ingrese el numero");
            Scanner y = new Scanner(System.in);
            aux2= aux2*y.nextDouble();

        }
        System.out.println("El resultado es ="+aux2);
    }
    public static void Square(int x){
        for(int i=1;i<=x;i++){
            System.out.print("# ");
        }
        System.out.println();
        for(int j=1;j<x-1;j++){
            for(int i=1;i<=x;i++) {
            if (i == 1) {
                System.out.print("# ");
            }
            if (i ==x) {
                System.out.print("#");
            } else if (i < x-1 ) {
                System.out.print("  ");
            }
        }
            System.out.println();
        }
        for(int i=1;i<=x;i++){
            System.out.print("# ");
        }
        System.out.println();
    }
}
