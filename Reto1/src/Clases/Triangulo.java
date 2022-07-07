    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author cristian.quiza
 */
public class Triangulo {
<<<<<<< HEAD
    
    
    public double jdfnksjdfn(){
     int Radio;     
        System.out.println("Ingresa el tamaño del radio: ");
        Scanner radio = new Scanner(System.in);
        Radio = radio.nextInt();
        double Area = Math.PI * Math.pow(Radio, 2) ; 
        System.out.println("El área del circulo es de " + Area);
        return Area;
=======
    public static void main(String[] args) {
         double base, altura, resultado;     
        Scanner obj = new Scanner(System.in);
         
        System.out.print("Ingrese base:\t");
        base = obj.nextDouble();
         
        System.out.print("Ingrese altura:\t");
        altura = obj.nextDouble();
         
        resultado = ((base*altura)/2);
         
        System.out.print("El area del Triangulo es:\t"+resultado);
>>>>>>> 2048cbc6ae4319c3d5d3281bcd4a3a219a3218f3
    }
}
    
    

