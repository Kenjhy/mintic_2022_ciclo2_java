/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Cuadrado {
    //1.Crear la clase
public abstract class Figura {
    //2.Crear los atributos de la clase se deben getear y setear 
    private String nombre;
    private String color_borde;
    private String color_fondo;
    public double base;
    public double altura;
   
    //3.Constructor Crea la plantilla por primera vez

    public Figura(String nombre, String color_borde, String color_fondo, double base, double altura) {
        this.nombre = nombre;
        this.color_borde = color_borde;
        this.color_fondo = color_fondo;
        this.base = base;
        this.altura = altura;
    }
    
    //4.Setear y getear todos los atributos 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor_borde() {
        return color_borde;
    }

    public void setColor_borde(String color_borde) {
        this.color_borde = color_borde;
    }

    public String getColor_fondo() {
        return color_fondo;
    }

    public void setColor_fondo(String color_fondo) {
        this.color_fondo = color_fondo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //5.Metodos propios de la clase 
    
    protected abstract void calcularArea();
    protected abstract void calcularPerimetro();

}
}
