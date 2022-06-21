/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

import java.util.Scanner;
 
public class Rectangulo {
     
    private static Scanner sc;
 
    public static void main(String[] args){
          
        double perimetro, area;
        double base = NumeroReal("Escribe la base del rectangulo: ");
        double altura = NumeroReal("Escribe la altura del rectangulo: ");
        perimetro = 2 * (base+altura);
        area = base * altura;
  
        System.out.printf("%nEl perímetro del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, perimetro);
        System.out.printf("%nEl área del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, area);
    }
  
    private static double NumeroReal(String s){
        sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextDouble();
    }
}