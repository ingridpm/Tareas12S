
package tarea_parte_2;

import java.util.Scanner; 
public class Tarea_Parte_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int total=0;
      
        
        System.out.println("Opcion 1: numero par o impar");
        System.out.println("Opcion 2: multiplicacion");
        System.out.println("Opcion 3: cuadrado ");
        System.out.println("Opcion 4: salir ");
        System.out.println("Ingrese su opcion");
        int opcion= sc.nextInt();
        
              
        switch(opcion){
            case 1:
           System.out.println("Ingrese un numero");
           int num= sc.nextInt();
           
           if (num%2==0){
               System.out.println("El numero es par");
           }
           else {
               System.out.println("el numero es impar");
           }
           break;
        
            case 2:
                
                System.out.println("ingrese la cantidad de numeros a multiplicar");
                int cnum= sc.nextInt();
                
                for (int i=1;  i<=cnum ;i++){
                System.out.println("ingrese un numero");
                int numero= sc.nextInt();
                total = numero*i;
                   
            }
            System.out.println("el total es: " + total);
        
            
            case 3:
                System.out.println("ingrese un numero");
                int cuadro= sc.nextInt();
                if (cuadro>=1){
                    System.out.println("#");
                }else{
                for (int a=0; a<cuadro;a++){
                
                if(a==0 || a==cuadro ) {
                    for( int b=0; b<cuadro;b++){
                        System.out.print("#");
                        
                    }
                    System.out.println("");
                }else{
                    for(int b = 0;b<cuadro;b++){
                        if(b==0 ||b==cuadro - 1){
                            System.out.print("#");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                    
                    
                }
                
                }
                }
            case 4:
           System.out.println("fin programa");
            break;
            
           default: System.out.println("error");
               break; 
                            
        }




    }
    
}
