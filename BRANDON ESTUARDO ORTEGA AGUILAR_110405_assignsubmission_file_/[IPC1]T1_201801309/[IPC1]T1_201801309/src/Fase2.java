import java.util.Scanner;
public class Fase2 {
    public static void main(String[] args){
        //Declaracion de variables
        Scanner tec = new Scanner(System.in);
        boolean salir=false;
        int num;
        //Opciones del menu
        while(!salir) {
            System.out.println("------------------------------------------");
            System.out.println(">>>Bienvenido al menu<<<");
            System.out.println("1. Par o Impar");
            System.out.println("2. Producto");
            System.out.println("3. Cuadrado nxn");
            System.out.println("4. Salir");
            //Try Catch con las opciones del menu
            try {
                System.out.print("Escribe una opcion: ");
                num = tec.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("------------------------------------------");
                        System.out.println("Bienvenido a la opción Par o impar");
                        System.out.println("Pasos:");
                        System.out.println("1. Ingresar un numero");
                        System.out.println("2. Imprimira el resultado en pantalla");
                        parimpar();
                        break;
                    case 2:
                        System.out.println("------------------------------------------");
                        System.out.println("Bienvenido a la opción Producto de n numeros");
                        System.out.println("Pasos:");
                        System.out.println("1. Ingresar el numero de valores que se introducira (2-5)");
                        System.out.println("2. Ingresar los valores a los numeros asignados");
                        System.out.println("3. Se imprimira el producto");
                        producto();
                        break;
                    case 3:
                        System.out.println("------------------------------------------");
                        System.out.println("Bienvenido a la opción Cuadrado de nxn");
                        System.out.println("Pasos:");
                        System.out.println("1. Ingresar un numero (el cual definira el tamaño del cuadrado)");
                        System.out.println("2. Se imprimira el cuadrado del tamaño especificado");
                        cuadrado();
                        break;
                    case 4:
                        System.out.println("------------------------------------------");
                        salir=true;
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        System.out.println("Debe insertar una opcion de 1-4");
                }
            } catch (Exception e) {
                System.out.println("Debe insertar un numero");
                tec.next();
            }
        }
    }
    //Opcion1: Par o impar
    public static void parimpar() {
        int p;
        Scanner par = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        p = par.nextInt();
        if(p % 2 == 0){
            System.out.println("R// "+p+" es par");
        }else{
            System.out.println("R// "+p+" es impar");
        }
    }
    //Opcion2: Producto de n numeros
    public static void producto(){
        int n,m,o,p,q,r;
        Scanner pro = new Scanner(System.in);
        System.out.print("Ingrese el numero de valores a evaluar: ");
        n = pro.nextInt();
        if(n==2){
            System.out.print("Ingresar el primer valor: ");
            m = pro.nextInt();
            System.out.print("Ingresar el segundo valor: ");
            o = pro.nextInt();
            int x=m*o;
            System.out.println("El producto de "+m+" y "+o+" es: "+x);
        }else if(n==3){
            System.out.print("Ingresar el primer valor: ");
            m = pro.nextInt();
            System.out.print("Ingresar el segundo valor: ");
            o = pro.nextInt();
            System.out.print("Ingresar el tercer valor: ");
            p = pro.nextInt();
            int x=m*o*p;
            System.out.println("El producto de "+m+", "+o+" y "+p+" es: "+x);
        }else if(n==4){
            System.out.print("Ingresar el primer valor: ");
            m = pro.nextInt();
            System.out.print("Ingresar el segundo valor: ");
            o = pro.nextInt();
            System.out.print("Ingresar el tercer valor: ");
            p = pro.nextInt();
            System.out.print("Ingresar el cuarto valor: ");
            q = pro.nextInt();
            int x=m*o*p*q;
            System.out.println("El producto de "+m+", "+o+", "+p+" y "+q+" es: "+x);
        }else if(n==5){
            System.out.print("Ingresar el primer valor: ");
            m = pro.nextInt();
            System.out.print("Ingresar el segundo valor: ");
            o = pro.nextInt();
            System.out.print("Ingresar el tercer valor: ");
            p = pro.nextInt();
            System.out.print("Ingresar la cuarto valor: ");
            q = pro.nextInt();
            System.out.print("Ingresar el quinto valor: ");
            r = pro.nextInt();
            int x=m*o*p*q*r;
            System.out.println("El producto de "+m+", "+o+", "+p+", "+q+" y "+r+" es: "+x);
        }else{
            System.out.println("Ingresar un numero del rango indicado anteriormente");
        }
    }
    //Opcion3: Cuadrado de nxn
    public static void cuadrado(){
        int n;
        Scanner cuad = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        n = cuad.nextInt();
        System.out.println("Cuadrado de "+n+"x"+n);
        //Linea superior
        for(int i=0; i<n;i++){
            System.out.print("#");
        }
        System.out.println();
        //Bordes del rectangulo
        for(int i=0;i<n-2;i++){
            System.out.print("#");
            for(int j=0;j<n-2;j++){
                System.out.print(" ");
            }
            System.out.println("#");
        }
        //Linea inferior
        for(int i=0;i<n;i++){
            System.out.print("#");
        }
        System.out.println();
    }
}
