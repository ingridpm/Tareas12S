/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class IPC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int primera, numero1, tercera;
        int resultado =1;
        
        while(opcion != 4){
            System.out.println("1. Primera Opcion");
            System.out.println("2. Segunda Opcion");
            System.out.println("3. Tercera Opcion");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            
            if(opcion == 1){
                System.out.println("Ingrese el numero");
                primera = sc.nextInt();
                
                if (primera%2 != 0 ) {
                    System.out.println("El numero "+primera+" es impar");
                }else{
                    System.out.println("El numero "+primera+" es par");
                }
                
            }else if(opcion == 2){
                
                while(true){
                    System.out.println("Ingrese el numero que desee");
                    numero1 = sc.nextInt();
                    resultado = resultado * numero1;
                    System.out.println("El resultado es " + resultado);
                    int elegir;
                    System.out.println("Desea Ingresar otro numero?");
                    System.out.println("1. Si ");
                    System.out.println("2. No");
                    elegir = sc.nextInt();
                    if(elegir == 1){
                        
                    }else{
                        break; 
                    }
                }
                
            }else if(opcion == 3){
                System.out.println("Ingrese el tamanio del cuadrado.");
                tercera = sc.nextInt();
                for(int i = 0; i < tercera; i++) {
                System.out.print("#");
                }
                System.out.println();
           
                
                for(int i = 0; i < tercera-2; i++) {
                    System.out.print("#");
                        for(int j = 0; j < tercera-2; j++) {
                            System.out.print(" ");
                    }
                    System.out.println("#");
                }
           
                
                 for(int i = 0; i < tercera; i++) {
                System.out.print("#");
                }
                System.out.println("");
            }
            
      
            
                

