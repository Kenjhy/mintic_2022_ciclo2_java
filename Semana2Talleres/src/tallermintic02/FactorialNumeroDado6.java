/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;

import java.util.Scanner;

/**
 *
 * @author cristian.quiza
 */
public class FactorialNumeroDado6 {
    // Función recursivo para calcular el factorial de un número
     // Función recursivo para calcular el factorial de un número
   public static void main(String[] args){
     Scanner Teclado = new Scanner(System.in);
     
     //Se pide dato
     System.out.println("Ingrese numero");
     int num = Teclado.nextInt();
     
     //Mostramos resultado 
    System.out.println("el factorial de: " + num + "es: " + factorial(num)); 
     }
    public static int factorial(int n){
    int factorial=1;
    for( int i=1 ; i<=n ; i++)
    {
        factorial *= i;
    }
         return factorial;
    } 
    
}