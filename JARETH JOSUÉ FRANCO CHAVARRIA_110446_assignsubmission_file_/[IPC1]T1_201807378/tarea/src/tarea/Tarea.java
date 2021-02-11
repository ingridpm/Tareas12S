/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.Scanner;
/**
 *
 * @author Hathman
 */
public class Tarea {
    public static void main (String[] args){
        boolean salir = false;
        while(!salir){
        System.out.println("*****MENU*****");
        System.out.println("1.un programa que dice si tu numero es par o impar");
        System.out.println("2. un programa hace el producto de n numeros");
        System.out.println("3. un programa que hace cuadrados de n lados");
        System.out.println("4. salir");
        System.out.println("5.error");
        Scanner leer = new Scanner (System.in);
        int y= leer.nextInt();
        Tarea entrada = new Tarea();
        switch (y){
                                
                case 1:

                    entrada.tarea_1();
                    break;
                case 2:
                    entrada.tarea_2();
                    break;
                case 3:
                    entrada.tarea_3();
                    break;
                case 4:
                  
                    salir = true;
                    
                    break;
                case 5:
                    System.out.println("lo siento no puedes reportar errores");
                    break;
                    default:
                        System.out.println("error intente de nuevo");
                      
                    
        }
                
        }
    }

    /**
     * @param args the command line arguments
     */
    public  void tarea_1 () {
        System.out.println("ingrese un numero:");
        Scanner leer = new Scanner(System.in);
    int num = leer.nextInt();
        int total = num%2;
            switch(total){
                case 0:
                System.out.println("es par");
                break;
        default:
        System.out.println("es impar");
            }
     
       
       
            
            
        }
       public void tarea_2() {
Scanner read = new Scanner(System.in);
System.out.println("cuantos numeros va a muliplicar");
        int n = read.nextInt();
        int result=1;
        for(int i=0;i<n;i++){
            System.out.println("ingrese un numero");
            int mult = read.nextInt();
            int numero=mult;
            
            result= numero*result;
        
        } System.out.println("su resultado es"+result);
       }
 public void tarea_3 () {
     System.out.println("ingrese un numero ");
     Scanner read = new Scanner(System.in);
     int q = read.nextInt();
     String  columnas;
     String filas;   
     String ic = "#";
            //linea de arriba
            for(int i = 0;i<q;i++){
                System.out.print("#");
            }
                System.out.println();
             //centro
             for(int i = 0;i<q-2;i++){
                 System.out.print("#");
                 for(int j = 0; j<q-2;j++){
                     System.out.print(" ");
                 }
                 System.out.println("#");
             }
                //linea de abajo
             for(int i = 0;i<q;i++){
                System.out.print("#");              
 }
}
}