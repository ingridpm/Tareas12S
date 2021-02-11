package fase2;

import java.util.Scanner;

/**
 *
 * @author Kenneth
 */
public class Fase2 {

    public static void main(String[] args) {
        menu();
        }
    public static void menu(){
        System.out.println("---------- Menú ----------");
        System.out.println("1. Programa par o impar");
        System.out.println("2. Programa Producto de números");
        System.out.println("3. Programa cuadrado de N*N");
        System.out.println("4. Salir");
        System.out.println("--------------------------");
        System.out.println("Indicar una de las opciones, ingresando su número correspondiente.");
        Scanner opcion = new Scanner(System.in);
        int op = opcion.nextInt();
        
        switch(op){
            case 1:{
                 op1();
                break;
            }
            case 2:{
                op2();
                break;
            }
            case 3:{
                op3();
                break;
            }
            case 4:{
                System.out.close();
            }
            default:{
                System.out.println("Error, revise su entrada");
            }
    }
}
    public static void op1(){
        System.out.println("------- ¿Par o impar-------");
        int entrada1;
        do{
        System.out.println("Escriba '00' para ir menú");
        System.out.println("Escriba un número");
        Scanner num = new Scanner(System.in);
        entrada1 = num.nextInt();
         if(entrada1%2==0){
            System.out.println("El número "+entrada1+" es un número par");
        }else{
            System.out.println("El número "+entrada1+" es un número impar");
        }
        
       }while(entrada1 != 00);  
        menu();
       //Aquí intente llamar la clase main como arriba llamé en el switch la opcion 1 (main();) pero no me dejó y no encontré solución. 
    }
    public static void op2(){
        int entrada1;
        do{
        System.out.println("-------Producto de números-------");
        System.out.println("Escriba '00' para ir menú");
        System.out.println("Cuantos números quieres multiplicar");
        int variable = 1;
        int salida=0;
        Scanner num = new Scanner(System.in);
        entrada1 = num.nextInt();
        
        for(int i=0; i<entrada1; i++){
            System.out.println("Escribe un número");
            int entrada2 = num.nextInt();
            salida = variable*entrada2;
            variable = salida;
            }
        System.out.println("El resultado final del producto de los números es:" + salida);
        }while(entrada1!= 00);
    menu();    
    }
    public static void op3(){
        int entrada1;
        do{
        System.out.println("Ingrese el tamaño de base y altura del cuadrado");
         System.out.println("Escriba '00' para ir menú");
        Scanner num = new Scanner(System.in);
        entrada1= num.nextInt();
        for(int i=0; i<entrada1; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0; i<entrada1-2;i++){
            System.out.print("*");
            for(int j=0; j<entrada1-2;j++){
                System.out.print(" ");
        }
            System.out.println("*");
        }for(int i=0; i<entrada1; i++){
            System.out.print("*");
        }
            System.out.println();
        }while (entrada1!=00);
    menu();
    }
    
    }
    
    
    
