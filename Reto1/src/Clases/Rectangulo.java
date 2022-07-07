/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

<<<<<<< HEAD
/**
 *
 * @author cristian.quiza
 */
public class Rectangulo extends Figura{
    
    public double alto;
    public double ancho;

    public Rectangulo(double alto, double ancho, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("nombre rec");
        this.nombre = teclado.nextLine();
        System.out.println("alto");
        this.alto = teclado.nextDouble();
        System.out.println("ancho");
        this.ancho = teclado.nextDouble();
        
        calcularArea();
        calcularPerimetro();
    }
    

    @Override
    protected void calcularArea() {
        area = alto * ancho;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = (2*alto) + (2*ancho);
    }
    
=======

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
>>>>>>> 2048cbc6ae4319c3d5d3281bcd4a3a219a3218f3
}
