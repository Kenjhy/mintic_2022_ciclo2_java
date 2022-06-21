/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

/**
 *
 * @author cristian.quiza
 */
import java.util.Scanner;

public class fechaEdad {
    public static void main(String[] args) {
        
        int anioA = 0;
        int anioN = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese año actual: "); anioA = teclado.nextInt();
        System.out.print("Ingrese año de nacimiento: "); anioN = teclado.nextInt();
        
        int edad  = (anioA - anioN);
        
        System.out.println("Su edad es: "+ edad + " años");
        
        
    }
    
}
