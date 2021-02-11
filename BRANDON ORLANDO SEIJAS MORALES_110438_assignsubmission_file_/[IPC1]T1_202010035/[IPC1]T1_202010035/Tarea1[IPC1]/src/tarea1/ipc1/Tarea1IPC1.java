
package tarea1.ipc1;

/**
 *
 * @author Brandon Seijas- 202010035
 */
import java.util.Scanner;
public class Tarea1IPC1 {

    
    public static void main(String[] args) {
                Scanner x = new Scanner(System.in);
                System.out.println("**********************************************");
                System.out.println("        BIENVENIDO A MI PRIMER PROGRAMA  XD   ");
                System.out.println("**********************************************");

                int opc1 = 0;
            do{
                 try {   
                    System.out.println("");
                    System.out.println("------------------------------");
                    System.out.println("         MENU PRINCIPAL       ");
                    System.out.println("------------------------------");
                    System.out.println("");
                    System.out.println("1. Verificación de número par o impar");
                    System.out.println("2. Producto de n cantidad de numeros ingresados");
                    System.out.println("3. Cuadrado de nxn");
                    System.out.println("4. Salir");
                    System.out.print("Elige una opción: ");opc1=x.nextInt();
                    System.out.println("4. Salir");
                    switch(opc1){

                         case 1:
                                problema1();
                            
                            break;
                        case 2:
                                problema2();

                            break;
                        case 3:

                                problema3();
                            break;
                        case 4:
                                System.out.println(" Gracias por utilizar mi programa :) ");
                             break;

                        default: 
                                  System.out.println("La opcion escogida no es valida");
                            break; 


                    }
                                           
                } catch(Exception e){
            
                System.out.println("Opción no valida");
                x.nextLine();
                }      


            } while(opc1 !=4);
            
                
    }
    
 /**  
  PROBLEMA 1
  
  */ 
           public static void problema1(){
           
            Scanner x = new Scanner(System.in);

            try{
          
            int numero , operacion=0 ;
             System.out.println("Ingrese un número entero Positivo");
             numero = x.nextInt();
            
                 if(numero>0){
                     operacion = numero % 2; 
                     if(operacion == 0){
                         System.out.println("El número " + numero + " es par");
                         System.out.println("");
                         
                     }else{
                         System.out.println("El número " + numero + " es impar");
                     }
                 }else{
                     
                    System.out.println("El número no debe ser negativo, intente de nuevo");
                    System.out.println("");
                 } 
             }catch(Exception e){
                
              System.out.println("Dato ingresado no valido");
              System.out.println("");
            }            
          
            }  
           
 /**
  * PROBLEMA 2
  */      
           
           public static void problema2(){
            try{
               Scanner x = new Scanner(System.in); 
                 int b,c;b=1;
                 int n;n=0;
                 int op;op=0;
                 int i;
                 System.out.println("Ingresa un cantidad de números a ingresar: ");n = x.nextInt();
                 System.out.println("");
                 for(c=1; c<=n;c++){
                 System.out.println("Ingresa un numero");
                  i = x.nextInt();
                  System.out.println("");
                  b=b*i;}
                 System.out.println("la multiplicación de los numeros ingresados es: "+b);
                  System.out.println("");
            }catch(Exception e){
                 System.out.println("");
              System.out.println("Dato ingresado no valido");
               System.out.println("");
            }   
          }
           
 /**
  * PROBLEMA 3
  */ 
           public static void problema3(){
            
            try{   
                    Scanner x = new Scanner(System.in);
                    int n;
                     System.out.print("Por favor ingrese el tamaño del cuadrado: ");
                     n = x.nextInt();
              
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("#");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("#");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("#");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("#");
            } System.out.print("");   
            }catch(Exception e){
                        System.out.println("Dato ingresado no valido");
            }               
               
           }
               
}
