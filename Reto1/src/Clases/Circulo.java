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
    //1. Crear las clase
public class Circulo extends Figura{
    
    //2.Crear los atributos de la clase
    private double radio;
    //Crear constructor, control espacio

    public Circulo(double radio, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
                
    }
    
    //Setear y getear todos los atributos
    
    //Metodos propios de las clases, clic derecho, insertar codigo, geter an seter,
    protected double jdfnksjdfn() {
        int Radio;
        System.out.println("Ingresa el tamaño del radio: ");
        Scanner radio = new Scanner(System.in);
        Radio = radio.nextInt();
        double Area = Math.PI * Math.pow(Radio, 2) ;
        System.out.println("El área del circulo es de " + Area);
        return Area;
    }

    @Override
    protected void calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
