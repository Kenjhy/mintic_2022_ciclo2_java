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
public class Rectangulo extends Figura{
    
    double alto;
    double ancho;

    public Rectangulo(double alto, double ancho, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n*** INGRESANDO DATOS DEL RECTANGULO *** ");
        System.out.println("\nNombre Rectangulo: ");
        this.nombre = teclado.nextLine();
        System.out.println("Introduzca el ancho: ");
        this.ancho = teclado.nextDouble();
        System.out.println("Introduzca el alto: ");
        this.alto = teclado.nextDouble();
        
        calcularArea();
        calcularPerimetro();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        System.out.println("Introduzca el alto: ");
        Scanner scanner= new Scanner(System.in);
        this.alto = scanner.nextDouble();
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        System.out.println("Introduzca el ancho: ");
        Scanner scanner= new Scanner(System.in);
        this.ancho = scanner.nextDouble();
    }
    

    @Override
    protected void calcularArea() {
        area = alto * ancho;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = (2*alto) + (2*ancho);
    }
    
}
