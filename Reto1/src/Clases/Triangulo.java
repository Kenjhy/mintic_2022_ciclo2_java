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
    
    
    public double jdfnksjdfn(){
     int Radio;     
        System.out.println("Ingresa el tamaño del radio: ");
        Scanner radio = new Scanner(System.in);
        Radio = radio.nextInt();
        double Area = Math.PI * Math.pow(Radio, 2) ; 
        System.out.println("El área del circulo es de " + Area);
        return Area;
    }
}
