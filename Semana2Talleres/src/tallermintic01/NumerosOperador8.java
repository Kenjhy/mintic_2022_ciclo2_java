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
        Scanner Teclado= new Scanner(System.in);
        System.out.println("Escribre dos numeros: ");
        
        double n1 = Teclado.nextDouble();
        double n2 = Teclado.nextDouble();
        double respueta;
        
        System.out.println("Escribre el operador aritmetico +, -, *, /: ");
        
        char op = Teclado.next().charAt(0);
    
        switch (op) {
            
            case '+': respueta = n1 + n2;
                System.out.println("la suma de los numeros es: " + respueta);
                break;
            case '-': respueta = n1 - n2;
                System.out.println("la resta de los numeros es: " + respueta);
                break;
            case '*': respueta = n1 * n2;
                System.out.println("la multiplicacion de los numeros es: " + respueta);
                break;
            case '/': respueta = n1 / n2;
                System.out.println("la divicion de los numeros es: " + respueta);
                break;
            default: System.out.println("Operador inexistente");;
        }
        
    }
    
}
