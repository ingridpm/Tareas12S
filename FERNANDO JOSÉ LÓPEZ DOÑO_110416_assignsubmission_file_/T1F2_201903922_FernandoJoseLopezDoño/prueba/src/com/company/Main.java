package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("================Menu================");
        System.out.println("|    1. Número par o impar         |");
        System.out.println("|    2. Multiplica n numeros       |");
        System.out.println("|    3. Matriz nxn                 |");
        System.out.println("|    4. Salir                      |");
        System.out.println("====================================");
        Scanner menu1 = new Scanner(System.in);
        int menu = 0;
        menu = menu1.nextInt();

        if (menu == 1){
            System.out.println("Ingresa el número que quieras verificar");
            int a =0;
            Scanner A = new Scanner(System.in);
            int Num1 = A.nextInt();
            //le pregunta a el metodo si Num1%2 == 0 es true o false
            if (ParOImpar(Num1)){
                System.out.println("El número es par");
            }else{
                System.out.println("El número es impar");
            }

            // Salida
            System.out.println("Quieres regresar al menu?");
            System.out.println("1. si");
            System.out.println("2. no");
            Scanner yesno = new Scanner(System.in);
            int opcion = yesno.nextInt();
            if(opcion == 1) {
                Main.main(null);
            } else if(opcion == 2){
                System.out.println("gracias por usar este programa");
            }else {
                System.out.println("error");
            }
            //System.out.println(Suma(result));


        }else if(menu ==2){
            System.out.println("Ingresa los números que quieras multiplicar");



                Scanner B = new Scanner(System.in);
                int Num1 = B.nextInt();
                int b = Num1;
                int a = 1;
                //ciclo para seguir multiplicando sin cesar
                while(b != 0) {
                    int resultado = a*b;
                    System.out.println(resultado);
                    a = resultado;
                    b = B.nextInt();

                }



            // Salida
            System.out.println("Quieres regresar al menu?");
            System.out.println("1. si");
            System.out.println("2. no");
            Scanner yesno = new Scanner(System.in);
            int opcion = yesno.nextInt();
            if(opcion == 1) {
                Main.main(null);
            } else if(opcion == 2){
                System.out.println("gracias por usar este programa");
            } else {
                System.out.println("Error");
            }



        }else if(menu == 3){
            System.out.println("Matriz nxn ingresa un número");

            Scanner matriz = new Scanner(System.in);
            int n = matriz.nextInt();
            for(int i = 0; i < n; i++) {
                // Imprime la primer y ultima linea de # seguidos
                if(i == 0 || i == n-1){
                    for(int j = 0; j < n; j++){
                        System.out.print("#");
                    }
                     System.out.println();
                }else{
                    for(int j = 0; j < n; j++){
                        //aca se ejecutan las demas lineas que no pertenezcan a la primer y a la ultima tirada del anterior
                        //Imprime las lineas siguientes comenzando un nuevo bucle para la linea con j
                        //para imprimir # cuando j sea 0 y cuando sea n-1
                        //y por ultimo saltar de linea antes de regresar al for
                        if (j == 0 || j == n-1){
                            System.out.print("#");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            // Salida
            System.out.println("Quieres regresar al menu?");
            System.out.println("1. si");
            System.out.println("2. no");
            Scanner yesno = new Scanner(System.in);
            int opcion = yesno.nextInt();
            if(opcion == 1) {
                Main.main(null);
            } else if(opcion == 2){
                System.out.println("gracias por usar este programa");
            } else {
                System.out.println("Error");
            }




        }else if(menu == 4){
            System.out.println("quieres salir?");
            // Salida
            System.out.println("1. si");
            System.out.println("2. no");
            Scanner yesno = new Scanner(System.in);
            int opcion = yesno.nextInt();
            if(opcion == 2) {
                Main.main(null);
            } else if(opcion == 1){
                System.out.println("gracias por usar este programa");
            } else {
                System.out.println("Error");
            }


        }else{
            System.out.println("Error");
        }
    }







    private static boolean ParOImpar(int a){
        int par_impar = a%2;
        boolean par;
       if (par_impar== 0) {
           par = true;
       } else {
           par = false;
       }
        return par;
    }
    /*private static int Multiplica( int b){
        int a = 1;
        int resultado = a*b;
        return resultado;
    }*/
}
