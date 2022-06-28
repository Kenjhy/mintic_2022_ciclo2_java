/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

import java.util.Scanner;

/**
 *
 * @author cristian.quiza
 */
public class NumerosOperador8 {
    public static void main(String[] args) {
        //scanea lo que el dato del usuario
        Scanner Teclado= new Scanner(System.in);
        System.out.println("Escriba dos numeros: ");
        
        double n1 = Teclado.nextDouble();
        double n2 = Teclado.nextDouble();
        double respuesta;
        
        System.out.println("Escriba el operador aritmetico +, -, *, /: ");
        
        char op = Teclado.next().charAt(0);
            
        switch (op) {
            
            case '+': respuesta = n1 + n2;
                System.out.println("la suma de los numeros es: " + respuesta);
                break;
            case '-': respuesta = n1 - n2;
                System.out.println("la resta de los numeros es: " + respuesta);
                break;
            case '*': respuesta = n1 * n2;
                System.out.println("la multiplicacion de los numeros es: " + respuesta);
                break;
            case '/': respuesta = n1 / n2;
                System.out.println("la division de los numeros es: " + respuesta);
                if (n2 == 0) {
                    System.out.println("OVERFLOV");
                }
                break;
            
            default: System.out.println("NO reconoce el operador");
        }
        
    }
    
}
