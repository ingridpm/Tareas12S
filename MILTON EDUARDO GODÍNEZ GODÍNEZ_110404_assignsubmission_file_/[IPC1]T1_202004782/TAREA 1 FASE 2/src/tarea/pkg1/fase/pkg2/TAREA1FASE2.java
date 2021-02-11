/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1.fase.pkg2;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class TAREA1FASE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada = new Scanner(System.in);
        
        int respuesta;
                
        boolean salir = false;
        while(!salir) {
        System.out.println("MENU DE OPERACIONES: ");
        System.out.println("1. Verificar si n es un número par o impar: ");
        System.out.println("2. Realizar el producto de n números: ");
        System.out.println("3. Elaborar un cuadrado de nxn: ");
        System.out.println("4. Salir del Programa");
        
        respuesta = entrada.nextInt();
        
           
        
        switch (respuesta) {
            
            
            case 1: 
            Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.println("Indique un número: ");
        numero = input.nextInt();

        if ((numero % 2) == 0){
            System.out.println(numero + " es par");
        }else{
            System.out.println(numero + " es impar");
            
        }
        System.out.println("\n");
              break;
                case 2: Scanner leer = new Scanner (System.in);
        
        int n, total, d, copia;
        total = 1;
        System.out.println("INGRESE UN NUMERO: ");
        n = leer.nextInt();
        copia = n;
        while (n>0){
            d = n %10;
            total = total * d;
            n = n / 10; 
            
        }
                System.out.println("LA MULTIPLICACION DE LOS DIGITOS DEL NUMERO "+copia+" es "+total);
                System.out.println("\n");
                break;
                
                case 3: Scanner lectura = new Scanner(System.in);
        
        System.out.println("INGRESE TAMANO DEL CUADRADO: ");
        int m = lectura.nextInt();
        
        for (int i = 0; i < m; i++){
            System.out.print("#");
        }
        System.out.println();
        
        for (int i = 0; i < m-2; i++) {
            System.out.print("#");
            for (int j = 0; j < m-2; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
        
        for (int i = 0; i < m; i++) { 
            System.out.print("#");
        }
                    break; 
                case 4: 
                salir = true;   
                    System.out.println("USTED A FINALIZADO EL PROGRAMA");
                    System.out.println("\n");
                break;
                    
                default:
                    System.out.println("ERROR. LAS OPCIONES SON ENTRE 1 Y 3");
                    System.out.println("\n");
                                         
            }
        }
    }  
}


                
        
        
    


