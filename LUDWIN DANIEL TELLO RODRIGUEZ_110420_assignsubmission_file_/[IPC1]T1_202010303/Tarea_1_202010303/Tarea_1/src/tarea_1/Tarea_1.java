/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

/**
 *
 * @author Ludwin
 */
public class Tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Opciones op = new Opciones();
        do{
            switch(op.opcion){
                case 1:
                   op.Par_impar();
                    break;
                    
                case 2:
                   op.multiplicacion();
                    break;
                    
                case 3:
                    op.cuadro();
                    break;
                    
                default :
                    System.out.println("Ingrese una opcion valida");
                   
            }
            op.Menu();
        }while(op.opcion != 4 );
    }
    
}
