
package laboratorio.seccion.b;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MENU_FASE2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);  

    boolean Fin = false;
    int opcion,numero;
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺"+" "+"BIENVENIDO AL MENU DE LA FASE 2"+" "+"☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println(" ");
        
       while(!Fin){
            System.out.println("1. PAR O IMPAR");
            System.out.println("2. MULTPLICAR CONSECUTIVAMENTE EL NUMERO INGRESADO");
            System.out.println("3. CUADRADO DE ASTERISCOS");
            System.out.println("4. SALIR");
        try{
            System.out.println("\t\t ♦♦ INGRESE UNA OPCION ♦♦    \n");
            opcion = leer.nextInt();         
         switch (opcion){
             
            case 1:
                 
                System.out.println("Ingrese el número que desea calcular si es par o impar");
                numero = leer.nextInt();           
                PAR_IMPAR(numero);
                System.out.println(" ");
                System.out.println(" ");
                ;break;
            case 2:
                System.out.println("Ingrese la cantidad de numeros que desea multiplicar");
                numero = leer.nextInt();           
                Multiplicar(numero);
                System.out.println(" ");
                System.out.println(" ");
                ;break;
            case 3:
                System.out.println("Ingrese la cantidad de filas");
                numero = leer.nextInt();           
                asteriscos(numero);
                System.out.println(" ");
                System.out.println(" ");
                ;break;
            case 4:
                 Fin = true;break;
            default:
                System.out.println("\t ▲▼▲ DEBE INGRESAR UNA OPCION ▲▼▲ \n");
                System.out.println("------------------------------------------");
        }  
        }catch(InputMismatchException  e){
            System.out.println("\t ▲▼▲ DEBES INGRESAR UN NUMERO ▲▼▲ \n");
            System.out.println("------------------------------------------");
            leer.next();
        }
    }    
    }
         
public static void PAR_IMPAR(int a){
    int num = a;
       if (num%2==0){
           System.out.println("NUMERO PAR");
       }else{
                   System.out.println("NUMERO IMPAR");
                   }
       }
        
public static void Multiplicar(int a){
   Scanner leer = new Scanner(System.in);     
    int contador,resultado,Totalnum,num;
    Totalnum = a;
    contador = 1;
    resultado =1;
    while(contador<=Totalnum){
        System.out.println("El numero "+contador+" ha ingresar es:");
        num = leer.nextInt();
            resultado = resultado*num;
            contador++;
}
    System.out.println("\n\t\t LA MULTIPLICACION DE LOS NUMEROS INGRESADOS ES:"+" "+resultado);
    }
    
public static void asteriscos(int a){
    int fila_final,fila_actual,columna,posicion;
fila_final = a;
posicion = 1;
for(fila_actual = 1;fila_actual<=fila_final;fila_actual++){
    for(columna=1;columna<=fila_final;columna++){
        if (columna == posicion){
            System.out.print("#");
        }else if(columna==fila_final){
            System.out.println("#");
        }else if((columna < fila_final)&&(fila_actual>1)&&(fila_actual<fila_final)){
            System.out.print(" ");
        }else if((columna<fila_final)&&(fila_actual==1)||(fila_actual==fila_final)){
            System.out.print("#");
        }
    }
}
}
}
