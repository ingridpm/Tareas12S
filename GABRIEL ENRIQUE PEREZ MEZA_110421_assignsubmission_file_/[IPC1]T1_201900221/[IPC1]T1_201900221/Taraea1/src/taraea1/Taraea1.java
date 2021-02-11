
package taraea1;

import java.util.Scanner;

public class Taraea1 {

    
    public static void main(String[] args) {
        tarea();
    }
    public static void tarea(){
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("****************************************************************************************************************************");
        System.out.println("BIENVENIDO");
        System.out.println("1. Programa que recibe un número y determinea si es par o impar.");
        System.out.println("2. programa que recibe “n” números y realiza el producto de los mismos");
        System.out.println("3. Programa que recibe un número y genera un cuadrado de nxn utilizando el siguiente carácter “#”. ");
        System.out.println("4. Salir");
        System.out.println("");
        System.out.println("Ingrese una opción:");
        n = entrada.nextInt();
           switch(n){
               case 1:
                   programa1();
                   tarea();
                    break;
               case 2:
                   programa2();
                   tarea();
                   break;
               case 3:
                   programa3();
                    tarea();
                   break;
               default: 
                   if(n>0 && n<5){
                       System.out.println("usted salió del programa");
           }else{
           System.out.println("Ingrese una opción válida");
           tarea();
        }  
}
}
     public static void programa1(){
         Scanner entrada = new Scanner(System.in);
         int x;
         System.out.println("--------------------------------------------------------");
         System.out.println("BIENVENIDO AL PROGRAMA 1");
         System.out.println("Ingerese un número para verificar si es par o impar");
         x=entrada.nextInt();
         if(x%2==0){
             System.out.println("El número "+x+" es par");
         }else{
             System.out.println("El número "+x+" es impar");
         }
         
    }
      public static void programa2(){
        Scanner entrada = new Scanner(System.in);
         int a = 0;
         int b = 1;
         int c = 0;
         int x;
         System.out.println("--------------------------------------------------------");
         System.out.println("BIENVENIDO AL PROGRAMA 2");
         System.out.println("¿Cuántos números desea multiplicar?");
         x=entrada.nextInt();
         do{
             System.out.println("Ingerese una cantidad");
             a=entrada.nextInt();
             c=c+1;
             b=b*a;
         }while(x!=c);
          System.out.println("El resultado de la multiplicación de tus "+x+" números es: "+ b);
      }
       public static void programa3(){
         Scanner entrada = new Scanner(System.in);
         int x;
         System.out.println("--------------------------------------------------------");
         System.out.println("BIENVENIDO AL PROGRAMA 3");
         System.out.println("Ingerese el nivel de la figura");
         x=entrada.nextInt();
         if(x>=0){
             for(int i=0;i<x;i++){
                 System.out.print("#");
             }
             System.out.println(" ");
             
         for(int i=0;i<x-2;i++){
         System.out.print("#");
         for(int j=0;j<x-2;j++){
             System.out.print(" ");
         }
             System.out.println("#");
    }
         
         for(int i=0;i<x;i++){
                 System.out.print("#");
             }
             System.out.println(" ");
}else{
             System.out.println("Ingrese número mayores a 0");
         }
}
}

