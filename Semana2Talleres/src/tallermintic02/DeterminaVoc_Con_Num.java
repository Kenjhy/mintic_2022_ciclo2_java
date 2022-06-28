/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;

import java.util.*;


/**
 *
 * @author User
 */
public class DeterminaVoc_Con_Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char dato;
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingresa un caracter");
        dato=entrada.next().charAt(0);
        entrada.close();
        
        switch (dato){
            case '0':
            case '1':
            case '2':
            case '3':   
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("Es un numero");
                break;
            case 'a':
            case 'e':
            case 'i':
            case 'o':   
            case 'u':
                System.out.println("Es una vocal");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':   
            case 'm':
            case 'n':
            case 'ñ':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("Es una consonante");
                break;
            default:
                System.out.println("Es un signo");
                break; 
        }
    }
    
}
