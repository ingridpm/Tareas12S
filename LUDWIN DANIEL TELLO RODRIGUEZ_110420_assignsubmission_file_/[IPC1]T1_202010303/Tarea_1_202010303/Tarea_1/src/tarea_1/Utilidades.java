package tarea_1;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;
public class Utilidades {
    Scanner sc = new Scanner (System.in);
    String str;
    String num;
    int a = 0;
    public boolean state = false;
    
    public int pedirint(String mensaje) {
        System.out.print(mensaje);
        num = sc.nextLine();
        int b =0;
        for (int n = 0; n <num.length(); n ++) {
            char c = num.charAt(n) ;
            if (Character.isLetter(c)) {
                num="";
            }
            if(Character.isWhitespace(c)){
                num="";
                b++;
            }
        }
        
        if ((num.equals(""))&&(b<=0)) {
            System.out.println("Solo puede ingresar numeros \n");
            state = false;
        }else if ((num.equals(""))&&(b>0)) {
            System.out.println("No se admiten espacios \n");
            state = false;
        }else{
            state = true;
            a = Integer.parseInt(num);
            return a;
        }
        return a;
    }
    
    public void limpiar_pantalla() {
        for(int i =0 ; i<=20; i++)
            System.out.println();
    }
    
    public void esperar(int n) {
        try {
            int time = n*1000;
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void esperarr (double seg){
        long mil = (long)(seg*1000);
        try{
            Thread.sleep(mil);
        }catch (InterruptedException e){
            System.err.print(e.getMessage());
        }
    }
}
