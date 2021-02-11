
package tarea1;

import java.util.Scanner;

public class Tarea1 {
 
    public static void main(String[] args) {
    Menu();
    }

    private static void Menu() {
     Scanner menu = new Scanner(System.in);
        int m; 
        boolean salir = false;
        System.out.println(" ----Menu----");
        System.out.println();
        System.out.println("1. Problema 1");
        System.out.println("2. Problema 2");
        System.out.println("3. Problema 3");
        System.out.println("4. Salir");
        System.out.println();
        System.out.println("Problema:");
        m = menu.nextInt();
                    
        switch(m){
            case 1:problema1();
            break;
            case 2:problema2();
            break;
            case 3:problema3();
            break;
            case 4:
                salir = true;
            break;
            default:
                System.out.println("!!!ERROR¡¡¡");
            Scanner e = new Scanner(System.in);
            System.out.println("\n0. Volver");
            int ex = e.nextInt();
            switch (ex){
            case 0:Menu();
            break;
        } 
        }
    }

    private static void problema1() {
        
        System.out.println("\n--PROBLEMA 1--");
        int num;
        Scanner u = new Scanner(System.in);
        System.out.println("\nIngrese un número:");
        num = u.nextInt();
        
        if(num%2==0){
            System.out.println("\n El número " + num + " es par");
        }else{
            System.out.println("\n El número " + num + " es impar");
        }
        Scanner e = new Scanner(System.in);
        System.out.println("\n0. Salir");
        int ex = e.nextInt();
        switch (ex){
            case 0:Menu();
            break;
        }        
    }

    private static void problema2() {
        
        System.out.println("\n--PROBLEMA 2--");
        
        int num1, num2, num3, resultado;
        
        Scanner p = new Scanner(System.in);
        System.out.println("\nIngrese el primer número:");
        num1 = p.nextInt();
        
        Scanner s = new Scanner(System.in);
        System.out.println("\nIngrese el segundo número:");
        num2 = s.nextInt();
        
        Scanner t = new Scanner(System.in);
        System.out.println("\nIngrese el tercer número:");
        num3 = t.nextInt();
        
        resultado = num1 + num2 + num3;
        
        System.out.println("\nLa suma de los tres números es: " + resultado);
        
        Scanner e = new Scanner(System.in);
        System.out.println("\n0. Salir");
        int ex = e.nextInt();
        switch (ex){
            case 0:Menu();
            break;
        }        
    }

    private static void problema3() {
        
        System.out.println("\n--PROBLEMA 3--");
        
        int tam, i, j;
        
        Scanner c = new Scanner(System.in);
        System.out.println("\nIngrese el tamaño del cuadrado:");
        tam = c.nextInt();
        
        if( tam >= 0 && tam <= 50){
            
            //linea superior
            for(i = 0; i < tam; i++){
                System.out.print("#");
            }
            System.out.println();
            
            //centro
            for(i = 0; i < tam - 2; i++){
                System.out.print("#");
                for(j = 0; j < tam - 2; j++){
                    System.out.print(" ");
                }
                System.out.println("#");
            }
             //linea inferior
            for(i = 0; i < tam; i++){
                System.out.print("#");
            }
        }
        
        Scanner e = new Scanner(System.in);
        System.out.println("\n\n0. Salir");
        int ex = e.nextInt();
        switch (ex){
            case 0:Menu();
            break;
        }        
    }
    
        
        
    }
    

