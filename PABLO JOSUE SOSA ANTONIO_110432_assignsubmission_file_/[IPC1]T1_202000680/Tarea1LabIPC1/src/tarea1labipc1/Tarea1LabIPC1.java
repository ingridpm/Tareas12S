/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1labipc1;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Tarea1LabIPC1 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);
    static int num;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Validacion();
    }
    
    public static void Validacion(){
        int limitMayor = 4, limitMenor = 1, valUsuario = 2;
        do{
            do{
                if(valUsuario<limitMenor || valUsuario>limitMayor){
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("========>>>INGRESO UN VALOR NO VALIDO, VUELVA A INTENTARLO<<<=======");
                }
                System.out.println("================================MENU===================================");
                System.out.println("-----------------Ingrese la opcion que desea realizar------------------");
                System.out.println("***Ingresa (1) si desea saber si un numero es par o impar");
                System.out.println("***Ingresa (2) si desea realizar un producto de los numeros que ingrese");
                System.out.println("***Ingrese (3) si desea hacer un cuadrado de (#) del tamaño que ingrese");
                System.out.println("***Ingrese (4) si desea salir del programa");
                System.out.print("======>");valUsuario = lector.nextInt();
            }while(valUsuario<limitMenor || valUsuario>limitMayor);
                System.out.println("-----------------------------------------------------------------------");
                switch (valUsuario){
                    case 1:
                        System.out.println("----->SELECCIONO PROGRAMA NUMERO PAR O IMPAR<<<-----");
                        ParImpar();
                        System.out.println("-----------------------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("----->>>SELECCION PROGRAMA PRODUCTO ENESIMO<<<-----");
                        ProductoEnesimo();
                        System.out.println("-----------------------------------------------------------------------");
                        break;
                    case 3:
                        System.out.println("----->>>SELECCIONO PROGRAMA CUADRADO DE (#)<<<-----");
                        CuadradoEnesimo();
                        System.out.println("-----------------------------------------------------------------------");
                        break;
                    case 4:   
                        System.out.println("Programa finalizado");
                        break;
                }
        }while(valUsuario!=4);
        
    }
    
    public static void ParImpar(){
        System.out.println("Ingrese un numero");
        System.out.print("======>");num=lector.nextInt();
        if(num%2==0){
            System.out.println("▼▼▼▼▼▼▼▼▼▼");
            System.out.println("El numero es par");
            System.out.println("▲▲▲▲▲▲▲▲▲▲");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
    public static void ProductoEnesimo(){
        int producto = 1,repUsuario=1;
        do{
            System.out.println("Ingrese un numero");
            System.out.print("======>");num=lector.nextInt();
            producto = producto*num;
            System.out.println("Ingres un numero mayor o igual a (0) si desea ingresar otro numero");
            System.out.println("Ingres un numero menor a (0) si ya no desea ingresar otro valor");
            repUsuario=lector.nextInt();
        }while(repUsuario>=0);
        System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
        System.out.println("su valor del producto es: "+producto);
        System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
    }
    
    public static void CuadradoEnesimo(){
        String numeral="";
        num=2;
        do{
            if(num<2){
                System.out.println("---------EL VALOR MINIMO QUE PUEDE SER EL CUADRADO ES DE 2-----------");
            }
            System.out.println("Ingrese el tamaño que desea que tenga el cuadrado de (#)");
            System.out.print("======>");num=lector.nextInt();
        }while(num<2);
        System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
        for(int i=0;i<num;i++){
            numeral = numeral+"#";
        }
        System.out.println(numeral);
        for(int i=0;i<num-2;i++){
            numeral="#";
            for(int j=0;j<num-2;j++){
                numeral=numeral+" ";
            }
            numeral=numeral+"#";
            System.out.println(numeral);
        }
        numeral="";
        for(int i=0;i<num;i++){
            numeral=numeral+"#";
        }
        System.out.println(numeral);
        System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
    }
    
}
