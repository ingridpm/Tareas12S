/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipct1;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class IPCT1 {

    public static Scanner Read = new Scanner(System.in);
    public static int option;
    public static void main(String[] args) {
        System.out.println("-------------Menu-------------");
        System.out.println("1-.Evaluación de números Pares");
        System.out.println("2-.Producto de números");
        System.out.println("3-.Dibujar Cuadrado");
        System.out.println("4-.Salir");
        System.out.println("Seleccione alguna opción:");
        
        try{
            option = Read.nextInt();
        }catch(Exception e)        
        {
            Read.next();
        }
            
        switch(option){
            case 1:
                Number();
                main(null);
                break;
            case 2:
                Product();
                main(null);
                break;
            case 3:
                Square();
                main(null);
                break;
            case 4:
                System.out.println("Aplicación Finalizada");
                System.exit(0);
                break;
            default:
                System.out.println("No existe una opción relacionada con lo que acaba de digitar, intente nuevamente");
                main(null);
            }
        }
    
    public static void Number(){
        
        int num;
        int val;
        System.out.println("Digite un número cualquiera:");
        num = Read.nextInt();
        val = num%2;
        if(val == 0){  
                System.out.println("El número es par");              
            }else{
                System.out.println("El número no es par");
            }
        }
   
    public static void Product(){
        int mult = 1;
        int num;
        int cant;
            System.out.println("Ingrese la cantidad de números a multiplicar:");
            cant = Read.nextInt();
                for (int i = 0; i < cant; i++) {
                    System.out.println("Escriba algún numero:");
                    num = Read.nextInt();
                    mult = mult*num;
                }
            System.out.println("El producto de los" + cant + "números es:" + mult);
        }
    
    public static void Square(){
        int SSize;
        System.out.println("Indique la dimensión del cuadrado a dibujar:");
        SSize = Read.nextInt();
            for (int i = 1; i <= SSize; i++) {
                for (int j = 1; j <= SSize; j++) {
                    if (i == 1 || j == 1 || i == SSize || j ==SSize) {
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }


