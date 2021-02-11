package com.company;
import java.util.Scanner;


public class Menu {
    static String salir;
    static Scanner dato = new Scanner(System.in);

    public static void menu(){
        int opcionMenu;
        System.out.println("Nombre: Jhonatan Emilio Chamalé Yumán\n" +
                "Carné: 201314166 \nClave: 24");
        do{
            System.out.println("*--------------------------------*");
            System.out.println("|--------------MENU--------------|");
            System.out.println("*--------------------------------*");
            System.out.println("| 1 | PARIDAD                    |");
            System.out.println("| 2 | PRODUCTO DE 1 HASTA n      |");
            System.out.println("| 3 | CUADRADO                   |");
            System.out.println("| 4 | SALIR                      |");
            System.out.println("|--------------------------------|");
            System.out.println("Ingrese el # de la opcion que desea ejecutar");
            try{
                opcionMenu = dato.nextInt();
                while(opcionMenu<=0 || opcionMenu>4){
                    System.out.println("Opcion invalida\nIntente de nuevo");
                    opcionMenu=dato.nextInt();
                }

                switch (opcionMenu){
                    case 1:
                        System.out.println(".::ANALISIS DE PARIDAD::.");
                        Paridad.analizarParidad();
                        retornoMenu();
                        break;
                    case 2:
                        System.out.println(".::PRODUCTO DE 1 HASTA n::.");
                        Producto.obtenerProducto();
                        retornoMenu();
                        break;
                    case 3:
                        System.out.println(".::CUADRADO::.");
                        Cuadrado.dibujar();
                        retornoMenu();
                        break;
                    case 4:
                        retornoMenu();
                        break;

                }
            }catch(Exception e){
                System.out.println("Caracter no valido, Ingrese solo numeros");
                dato.nextLine();
                salir = "n";
            }

        }while ("N".equalsIgnoreCase(salir));

        System.out.println("GRACIAS POR UTILIZAR ESTE PROGRAMA");
    }

    static void retornoMenu(){  //para las opciones 1-5

        System.out.println("Desea salir del programa S/N");
        salir = dato.next();
        if (!salir.equalsIgnoreCase("s")){
            if (!salir.equalsIgnoreCase("n")){
                System.out.println(" Opcion Invalida\n intente nuevamente");
                retornoMenu();
            }
        }
    }

}