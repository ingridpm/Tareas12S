
package tarea_1;

import java.util.Scanner;

/**
 *
 * @author Ludwin
 */
public class Opciones {
    Scanner sc = new Scanner(System.in);
    Utilidades util = new Utilidades();
    public int opcion=0;
    public int n=0;
    
    public void Menu()
    {
        System.out.println("___________________________________________________");
        System.out.println("*                                                 *");
        System.out.println("*            Menú:                                *");
        System.out.println("*        1. Par o impar                           *");
        System.out.println("*        2. Producto de los mismos                *");
        System.out.println("*        3. Cuadrado                              *");
        System.out.println("*        4. Salir                                 *");
        System.out.println("*_________________________________________________*");
        do{
            this.opcion = util.pedirint("Inserte el número de la opción que desea: ");
        }while(util.state == false);
    }
    public void Par_impar(){
    System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("_______________ Par o Impar _______________");
        System.out.println("");
        do {
            
            this.n = util.pedirint("Ingrese un numero: ");
        }while(util.state == false);
            int num = this.n;
        if (n%2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
                    
        }
    }
   
    public void multiplicacion()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("_______________ Multiplicacion de n numeros ____________");
        System.out.println("");
        
        do {
            
            this.n = util.pedirint("Ingrese la cantidad de numeros: ");
        }while(util.state == false);
        int contador, resultado, var;
        resultado = 1;
        for (int i = 0; i <n; i++) {
           
           System.out.print("Ingrese un numero: ");
           var = sc.nextInt();
           resultado = resultado*var;
        }
        System.out.println("El resultado es: "+resultado);
    }
    
    public void cuadro()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("_______________ Cuadro _______________");
        System.out.println("");
        do {
            
            this.n = util.pedirint("Ingrese la cantidad de filas del cuadro: ");
        }while(util.state == false);
        for(int i = 1; i<=n; i++){

            for (int j = 1; j <=n; j++) {
                if (j==1 || j == n || i==1||i==n) {
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    }
    
}
