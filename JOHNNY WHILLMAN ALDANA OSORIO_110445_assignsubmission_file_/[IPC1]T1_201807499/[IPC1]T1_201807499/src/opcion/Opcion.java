
package opcion;

import java.util.Scanner;

public class Opcion {
    
    static Scanner entrada = new Scanner(System.in); 
    static int desicion = 0;
    
    
    public static void Menu(){
        
        Scanner input = new Scanner(System.in); 
       
        System.out.println("Elige una opción a realizar: \n 1.Saber si un número es par o impar.\n 2.Multiplicar número. \n 3.Realizar un cuadrado. \n 4.Salir. \n Escribe el número: \n ");
        
        int caso = input.nextInt();
                
            switch(caso){
            
                 case 1: Opcion.ParImpar();
                    break;
                    
                 case 2: Opcion.MultiplicaciónNumeros();
                    break;
                   
                 case 3: Opcion.Cuadrado();
                    break;
                    
                 case 4: System.exit(0);
                    break;
                    
                 default: System.out.print("Error, opción invalida.");
        }
 
    }
    
    
    public static void ParImpar(){
        
        do{
            System.out.println("Ingrese el numero a evaluar: ");
        
            int numero = entrada.nextInt();
        
                if (numero%2 == 0){
            
                System.out.println("El numero " + numero + " es par.");
                
            }
              else{
            
                System.out.println("El numero " + numero + " es impar.");
            }
                
                System.out.println("¿Deseas saber si otro número es par o impar?\n1.SI\n2.NO");
                desicion = entrada.nextInt();
                
        }while(desicion == 1);
        
        Opcion.Menu();
        
        
    }
    
    public static void MultiplicaciónNumeros() {
        
               do{
                     int resultado;

                     System.out.println("Ingresa un número: ");

                     int num1 = entrada.nextInt(); 

                     System.out.println("Ingresa un número: ");

                     int num2 = entrada.nextInt();

                     resultado = num1*num2;

                     System.out.println("¿Deseas ingresar otro número?");
                     System.out.println("Elige una opción: ");
                     System.out.println("1.SI ");
                     System.out.println("2.NO ");

                     desicion = entrada.nextInt();

                     if (desicion == 1){

                         while (desicion == 1){

                             System.out.println("Ingresa un número: ");

                             int num3 = entrada.nextInt();

                             resultado = resultado*num3;

                             num3 = 0;

                              System.out.println("¿Deseas ingresar otro número?");
                              System.out.println("Elige una opción: ");
                              System.out.println("1.SI ");
                              System.out.println("2.NO ");

                             desicion = entrada.nextInt();
                         }
                     }

                     System.out.println("El resultado es: " + resultado);
                     System.out.println("¿Deseas hacer otra multiplicación?\n1.SI\n2.NO");
                     desicion = entrada.nextInt();
        
               }while(desicion == 1);
               
               Opcion.Menu();
        
    }
    
    public static void Cuadrado (){
        
        
        
        int i= 0;
        int j= 0;
        
     
        
        do{
            
            System.out.println("Escribe la dimensión que quieres del cuadrado");
            
                int dimension = entrada.nextInt();
        
        
                if( dimension > 1){
            
                for(i=0;i<dimension;i++){
                
                System.out.print("#");
                }
                System.out.println();
            
                 for(i=0;i<dimension-2;i++){
                    System.out.print("#");
                
                 for(j=0;j<dimension-2;j++){
                    
                    System.out.print(" ");
                }
                    System.out.println("#");
                }
                for(i=0;i<dimension;i++){
                
                System.out.print("#");
                }
                System.out.println();
                System.out.println("¿Deseas hacer otro cuadrado?\n1.SI\n2.NO");
                desicion = entrada.nextInt();
                
        }
        }while(desicion == 1);
        
        Opcion.Menu();
        
  }
}
