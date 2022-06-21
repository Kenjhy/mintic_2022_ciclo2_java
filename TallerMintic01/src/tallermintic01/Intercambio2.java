/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Intercambio2 {

   
    public static void main(String[] args) {
      int A = 0;
      int B = 0;
      Scanner sc = new Scanner(System.in);
System.out.print("Ingrese valor de A: "); A = sc.nextInt();
        System.out.print("Ingrese Valor de B: "); B = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);   
A = A + B;
B = A - B;
A = A - B;
 System.out.println("Valores intercambiados: A = " + A + "   B = " + B);  
    }
    
}
