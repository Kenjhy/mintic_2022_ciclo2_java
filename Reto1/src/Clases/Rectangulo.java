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

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
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
