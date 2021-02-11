/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author anthony
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
int respuesta;
       
       do{
        System.out.println("      ...:::: MENU PRINCIPAL ::::...   ");
        System.out.println("1.) EVALUAR SI SU NÚMERO ES PAR O IMPAR");
        System.out.println("2.) PRODUCTO DE NUMEROS CONSECUTIVOS");
        System.out.println("3.) GENERAR CUADRADO DE NxN");
        System.out.println("4.) SALIR");
        
        
        respuesta=entrada.nextInt();
        
        switch(respuesta){
            case 1:
                Espar ();
                break;
            case 2:
                Producto ();
                break;
            case 3:
                Cuadrado ();
                break;
            case 4:
                System.out.println("********  VUELVA PRONTO :) ********");
                break;
            default:
                System.out.println("******** POR FAVOR INGRESE UNA OPCION VALIDA ********");
                 System.out.println();
        System.out.println();
        System.out.println();
                break;
        }
       }while(respuesta !=4);
    }
    
    public static void Espar () {
        int n;
        System.out.println("    *** ES PAR O IMPAR ***  ");
        System.out.println("INTRODUZCA EL NUMERO A EVALUAR:");
        Scanner dato1 = new Scanner(System.in);
        n = dato1.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " ES PAR.\n\n");
        } else {
            System.out.println(n + " ES IMPAR.\n\n");
        }
         System.out.println();
        System.out.println();
        System.out.println();
    
}
    public static void Producto () {
        int acumulacionmulti = 1;
        Scanner Teclado = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ingresa un numero, cuando quieras terminar escribe 99999: ");
            n = Teclado.nextInt();
             
                if (n > 0 && n != 99999) {
                    System.out.println("El numero ingresado " + n);
                    acumulacionmulti *= n;
                } else {
                    if (n < 0 && n != 99999) {
                        System.out.println("El numero ingresado " + n);
                        acumulacionmulti *= n;

                    }
                }
            
        } while (n != 99999);
        
        System.out.println("La acumulacion multiplicada de los numeros introducidos es:  " + acumulacionmulti);
        
         System.out.println();
        System.out.println();
        System.out.println();
 
}
    public static void Cuadrado () {
    
        Scanner numero =new Scanner(System.in);
        
        System.out.println("POR FAVOR INGRESE EL TAMAÑO DE CUADRADO:");
        int n = numero.nextInt();
        
        if (n >= 0 && n <= 500){
            //parte superior
            for(int i = 0; i < n; i++){
                System.out.print("#");     
            }
            System.out.println();
            
            //centro
            for(int i = 0; i < n-2; i++){
                System.out.print("#"); 
                for(int j=0; j< n-2 ;j++){
                    System.out.print(" "); 
                }
                
                System.out.println("#");
            }
           
            //parte inferior
        for(int i = 0; i < n; i++){
                System.out.print("#");     
            }
        }else{
            System.out.println("No te pases de números :v algo mas pequeño xD");
        } 
            
        System.out.println();
        System.out.println();
        System.out.println();
}  
}
