
package aplicacion;

import java.util.Scanner;

public class Aplicacion {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int a,b,c,d,e,f,i=0,operacion=1;
       System.out.println("1. Determinar un numero para o impar. ");
           System.out.println("2. Determinar la multiplicación de numeros. ");
           System.out.println("3. Crear un cuadrado con #. ");
           System.out.println("4. Salir");
           System.out.println("");
       do{
           
           System.out.print("Ingrese una opción: ");      
           a = entrada.nextInt();
           
           switch(a){
               case 1: 
                   System.out.print("Ingrese numero: ");
                   b = entrada.nextInt();
                   
                   if (b%2==0){
                   
                       System.out.println("El numero es par");
                       System.out.println("");
                   }else{
                       System.out.println("El numero es impar");
                       System.out.println("");
                   }
                   
                   break;
               case 2: 
                   System.out.println("¿Cuántos numeros desea multiplicar? ");
                   c = entrada.nextInt();
                   
                  do{
                      System.out.print("Ingrese número: ");
                      d = entrada.nextInt();
                      operacion*=d;
                      i++;
                  
                  
                  }while(i<c);
                   System.out.println("La multiplicación es: "+ operacion);
                   System.out.println("");
                   break;
                   
               case 3: 
                   
                   System.out.println("Ingrese lado del cuadrado");
                   e = entrada.nextInt();
                   
                   for (int j=0;j<e;j++)
                   {
                       for (int k=0;k<e;k++ )
                       {
                           System.out.print("# ");
                           
                       }
                       System.out.println("");
                   }
                   break;   
                   
               default: 
                   System.out.println("Error");
           }
       
       }while(a!=4);
       
    }
    
}
