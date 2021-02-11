package T1.t1;
import java.util.Scanner;

/**
 *
 * @author Adam Navas
 */
public class t1 {
    public static int multiplicacion;
    public static void main(String[] args) {
        Menu_Principal();
    }
    public static void Limpieza(){
        for (int i=0;i<50;i++){
            System.out.println("");
        }
   }
    public static void Menu_Principal(){
       Limpieza();
       System.out.println("xxxxxxx      x        xxxxx    xxxxxx       x    ");
       System.out.println("   x        x x       x   x    x           x x   ");
       System.out.println("   x       x   x      xxxx     xxxxxx     x   x  ");
       System.out.println("   x      xxxxxxx     x   x    x         xxxxxxx ");
       System.out.println("   x     x       x    x    x   xxxxxx   x       x");
       System.out.println();
       System.out.println();
       System.out.println("     1) Par o Impar");
       System.out.println();
       System.out.println("     2) Producto");
       System.out.println();
       System.out.println("     3) Cuadrado");
       System.out.println();
       System.out.println("     4) Salir");
       System.out.println("Ingrese el numero para ver cada menu:");
       Scanner entrada = new Scanner(System.in);
       int menu;
       menu = entrada.nextInt();
       switch(menu){
           case 1:
               Opcion1();
               break;
           case 2:
               Opcion2();
               break;
           case 3:
               Opcion3();
               break;
           case 4:
               System.exit(0);
               break;
           default:
               Menu_Principal();
               break;
       }
    }
    public static void Opcion1(){
        Limpieza();
        System.out.println("Ingrese un numero");
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();
        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        System.out.println();
        System.out.println("Ingrese cualquier valor o letra para volver al "
             + "menu principal");
        Scanner entrada2 = new Scanner(System.in);
        String texto;
        texto = entrada2.nextLine();
            switch(texto){
                default:
                    Menu_Principal();
                     break;
                }
    }
    public static void Opcion2(){
        Limpieza();
        multiplicacion = 0;
        System.out.println("ingrese un numero a multiplicar");
        Scanner entrada = new Scanner(System.in);
        int numero;
        multiplicacion = entrada.nextInt();
        do{
            System.out.println("Ingrese otro numero a multiplicar, ingrese 0 para terminar");
            Scanner entrada2 = new Scanner(System.in);
            numero = entrada2.nextInt();
            if(numero != 0){
            multiplicacion = multiplicacion * numero;
            }
        }while(numero != 0);
        System.out.println();
        System.out.println("El resultado es de: "+ multiplicacion);
        System.out.println();
        System.out.println("Ingrese cualquier valor o letra para volver al "
             + "menu principal");
        Scanner entrada3 = new Scanner(System.in);
        String texto;
        texto = entrada3.nextLine();
            switch(texto){
                default:
                    Menu_Principal();
                     break;
                }
    }
    public static void Opcion3(){
        Limpieza();
        System.out.println("Ingrese un numero para hacer un cuadro n X n");
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();
        for (int x = 1; x <= numero; x++ ){
            for (int y = 1; y <= numero; y++ ){
                if(y == 1 || y == numero || x == 1 || x == numero ){
                    System.out.print(" # ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Ingrese cualquier valor o letra para volver al "
             + "menu principal");
        Scanner entrada2 = new Scanner(System.in);
        String texto;
        texto = entrada2.nextLine();
            switch(texto){
                default:
                    Menu_Principal();
                     break;
                }
    }
        
}
