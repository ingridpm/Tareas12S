/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author KRIZTIAN TZUB
 */
public class IntentoFinal {

   
    public static void main(String[] args) {
        
       
        
        System.out.println("Menú:");
        System.out.println("1. Multiplicacion");
        System.out.println("2. Par o Impar");
        System.out.println("3. Cuadrado");
        System.out.println("Seleccioné una Opción");
            Scanner sc = new Scanner(System.in);
            int n;
            
            n = sc.nextInt();
            
        switch(n){
            case 1: 
                System.out.println("Introduzca un numero");
                Scanner ag = new Scanner(System.in);
                int a,b,c;
                
                a = sc.nextInt();
                System.out.println("Introduzca otro numero");
                b = sc.nextInt();
                c = (a*b);
                System.out.println("La Multiplicacion es: "+c);
                
                break;
                
            case 2: System.out.println("Ingrese un numero");
                
                
                Scanner lm = new Scanner(System.in);
                int numero,resto;
                numero = sc.nextInt();
                resto = numero%2;
                if (resto <=0)
                {
                    System.out.println("El numero es Par");
                } else {
                    System.out.println("El numero es Impar");
                }
                break;
                
            case 3: System.out.println("Ingrese el numero de Filas y Columnas");
            
                Scanner km = new Scanner(System.in);
                int lado ;
                lado = sc.nextInt();
                for(int i = 0; i < lado; i++) {
                System.out.print("# ");
                }
                System.out.println();
                for(int i = 0; i < lado-2; i++) {
                System.out.print("# ");
                for(int j = 0; j < lado-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("    #");
                }
                for(int i = 0; i < lado; i++) {
                System.out.print("# ");
         
        }    break;
                default:
                System.out.println("Se a equivocado de numero");
               break;
               }
        
    }
}
                
        
   
    

