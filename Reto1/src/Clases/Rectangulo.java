/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;


public class Rectangulo {
    public static void main(String [] args){
         
        double base, altura, resultado;     
        Scanner obj = new Scanner(System.in);
         
        System.out.print("Ingrese base:\t");
        base = obj.nextDouble();
         
        System.out.print("Ingrese altura:\t");
        altura = obj.nextDouble();
         
        resultado = (base*altura);
         
        System.out.print("El area del Rectangulo es:\t"+resultado);
    }  
}
