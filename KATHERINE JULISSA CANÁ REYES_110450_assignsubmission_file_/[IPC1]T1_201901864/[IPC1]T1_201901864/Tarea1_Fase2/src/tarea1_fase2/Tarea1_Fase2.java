
package tarea1_fase2;

import java.util.Scanner;


public class Tarea1_Fase2 {
   
    static Scanner entrada=new Scanner(System.in);
    static int  elegir;
        
   
    public static void main(String[] args) {
 
        proceso();
        
    }
    public static void proceso(){
 
        System.out.println("BIENVENIDOS");
        System.out.println("");
        System.out.println("Elija una opccion");
        System.out.println("1-Es par o impar.");
        System.out.println("2-Prodcuto de los numeros");
        System.out.println("3-Cuadrado de carácter #");
        System.out.println("4-Salir");
        System.out.println("Porfavor escoja");
        System.out.println("");
        elegir=entrada.nextInt();
        
        if (elegir<0 || elegir>4){
            System.out.println("Elija una opcion valida");
            System.out.println("");
            proceso();
            
        }else{
            switch(elegir){
                case 1:
                     int a;
                     System.out.println("Ingrese un numero");
                     a=entrada.nextInt();
                       if( a%2==0){
                           System.out.println("Es un numero par");           
                       }else{
                           System.out.println("Es un numero impar");
                       }
                     System.out.println("");
                     proceso();
                     break;
                     
                     
                case 2:
                     int n;
                     int contador=0;
                     int acumulados=1;
                     int ingresados;
                     System.out.println("Ingrese el total de numeros a calcular");
                     n=entrada.nextInt();
                     do{
                         contador=contador+1;
                     
                    System.out.println("Ingrese una cantidad");
                    ingresados=entrada.nextInt();
                    acumulados=ingresados*acumulados;

                     }while(n!=contador);
                     System.out.println("El resultado de la multiplicacion es de " + acumulados );
                     System.out.println("");
                     proceso();
                     break;
                     
                            
                case 3:
                    int m=0;
                    System.out.println("Ingrese un numero");
                    m=entrada.nextInt();
                  
                    for(int i=0; i < m; i++){
                        if (i==1 || i==m){
                            for (int j=0; j<m; j++){
                                System.out.print("#");
                            }
                            System.out.println(" ");
                        }else{
                            for(int k=0; k < m; k++ ){
                                System.out.print("#");
                                for (int s=0; s < m; s++){
                                    System.out.print("");
                                }
                            }
                            System.out.println(" ");
                        }
  
                    }
 
                    System.out.println(" ");
                    proceso();
                     break;
                default:
            }

        
        
      
    }
    
}
}
