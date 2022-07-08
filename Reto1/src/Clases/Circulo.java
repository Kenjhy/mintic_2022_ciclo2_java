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
    
    public double getRadio() {    
        return radio;
    }

    //Setear y getear todos los atributos
    public void setRadio(double radio) {    
        System.out.println("Ingresa el tamaño del radio: ");
        Scanner scanner = new Scanner(System.in);
        this.radio = scanner.nextDouble();
    }

    //Metodos propios de las clases, clic derecho, insertar codigo, geter an seter,
    @Override
    protected void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
}
