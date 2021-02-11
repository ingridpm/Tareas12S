/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.fase2;

import java.util.Scanner;

/**
 *
 * @author Jairo Gomez
 */
public class Menu {

    private Scanner lector = new Scanner(System.in);
    int opcion;
    int numeroVerificar;
    int tamañoCuadrado;
    
    public Menu() {
        MostrarMenu();
    }
    
    public void MostrarMenu(){
    
        System.out.println("----Bienvenido al menu----");
        System.out.println("----Seleccione una de las opciones----");
        System.out.println("----1. Verificar si un numero es par o impar----");
        System.out.println("----2. Realizar producto de n numeros----");
        System.out.println("----3. Realizar cuadrado de n*n----");
        System.out.println("----4. Salir del menu----");
        
        opcion = lector.nextInt();
        
        switch (opcion) {
            case 1:
                NumeroParImpar();
                break;
            case 2:
                ProductoNumeros();
                break;
            case 3:
                CrearCuadrado();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("La opcion seleccionada no se"
                        + " encuentra disponible");
                MostrarMenu();
        }
    }
    
    public void NumeroParImpar(){
    
        System.out.println("Digite el numero a verificar");
        numeroVerificar = lector.nextInt();
        while (numeroVerificar != 0) {
            if (numeroVerificar % 2 == 0) {
                System.out.println("El numero " + numeroVerificar + " es par");
            } else {
                System.out.println("El numero " + numeroVerificar + " es impar");
            }
            NumeroParImpar();
        }
        MostrarMenu();
    }

    public void ProductoNumeros(){
        
        String numerosMultiplicar[];
        String numeros;
        int multiplicacion = 1;
        System.out.println("Digite los numeros a multiplicar seguidos de una ,");
        numeros = lector.next();
        numerosMultiplicar = numeros.split(",");
        for (int i = 0; i < numerosMultiplicar.length; i++) {
            multiplicacion *= Integer.parseInt(numerosMultiplicar[i]);
        }
        System.out.println("La multiplicacion es " + multiplicacion);
        MostrarMenu();
    }
    
    public void CrearCuadrado(){
    
        System.out.println("Digite el tamaño del cuadrado a mostrar");
        tamañoCuadrado = lector.nextInt();
        if (tamañoCuadrado >= 2 && tamañoCuadrado <= 25) {
            //Linea superior
            for (int i = 0; i < tamañoCuadrado; i++) {
                System.out.print("#");
            }
            System.out.println("");
            //Centro vacio
            for (int i = 0; i < tamañoCuadrado-2; i++) {
                System.out.print("#");
                for (int j = 0; j < tamañoCuadrado-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("#");
            }
            //Linea inferior
            for (int i = 0; i < tamañoCuadrado; i++) {
                System.out.print("#");
            }
            
            System.out.println("");
        }else{
            System.out.println("Cuadrado no permitido");
            CrearCuadrado();
        }
        MostrarMenu();
    }
}
