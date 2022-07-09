/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

public class Cuadrado extends Figura {
    
    double alto;
    double ancho;

    public Cuadrado(double alto, double ancho, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las medidas del cuadrado");
        System.out.println("Nombre");
        this.nombre = teclado.nextLine();
        System.out.println("Introduzca el ancho: ");
        this.ancho = teclado.nextDouble();
        System.out.println("Introduzca el alto: ");
        this.alto = teclado.nextDouble();
        
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
       area = ancho*alto;
    }

    @Override
    protected void calcularPerimetro() {
       perimetro = ancho*ancho;
    }

}

