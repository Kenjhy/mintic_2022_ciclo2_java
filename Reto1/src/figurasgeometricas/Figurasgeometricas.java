/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import Clases.Circulo;
import Clases.Rectangulo;
import Clases.Triangulo;
import java.util.Scanner;

/**
 *
 * @author cristian.quiza
 */
public class Figurasgeometricas {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String option = "";
        while (!option.equals("4")) {
            System.out.println("                 *** RETO NRO. 3 ***");
            System.out.println("*** APLICANDO PROGRAMACION ORIENTADA A OBJETOS ***");
            System.out.println("==================================================");
            System.out.println("[1] -- Construir un Rectangulo");
            System.out.println("[2] -- Construir un Triangulo");
            System.out.println("[3] -- Construir un Circulo");
            System.out.println("[4] -- Construir un SALIR");
            System.out.println("Opcion:");
            option = teclado.nextLine();
            switch (option) {
                case "1":
                    contruirRectangulo();
                    break;
                case "2":
                    contruirTriangulo();
                    break;
                case "3":
                    contruirCirculo();
                    break;
                case "4":
                    System.out.println("nt FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println(" \n");
            }
        }
    }

    private static void contruirRectangulo() {
       Rectangulo rectangulo = new Rectangulo(0,0,"RECTANGULO UNO", 0,0);
        System.out.println("\n\n*** MOSTRANDO DATOS DEL RECTANGULO *** ");
        System.out.println("\n======================================");
        System.out.println("FIGURA: " + rectangulo.getNombre());
        System.out.println("ANCHO: " + rectangulo.getAncho());
        System.out.println("ALTO: " + rectangulo.getAlto());
        System.out.println("AREA: " + rectangulo.getArea());
        System.out.println("PERIMETRO: " + rectangulo.getPerimetro());
        System.out.println("\n" );
    }

    private static void contruirTriangulo() {
        System.out.print("\nBase: ");
        double base = Double.parseDouble(teclado.nextLine());
        System.out.print("\nAltura: ");
        double altura = Double.parseDouble(teclado.nextLine());
        System.out.print("\nLado 1 : ");
        double lado1 = Double.parseDouble(teclado.nextLine());
        System.out.print("\nLado 2: ");
        double lado2 = Double.parseDouble(teclado.nextLine());
        Triangulo triangulo = new Triangulo(base,altura,lado1, lado2,"TRIANGULO",0,0);
        System.out.println("Area calculada: " + triangulo.getArea());
        System.out.println("Perimetro calculado: " + triangulo.getPerimetro());
        System.out.println("\n");
    }

    private static void contruirCirculo() {
        System.out.println("\nRadio: ");
        double radio = Double.parseDouble(teclado.nextLine());
        Circulo circulo = new Circulo(radio, "CIRCULO UNO ", 0,0);
        //circulo.setRadio(radio);
        System.out.println("Area Calculada: " + circulo.getArea());
        System.out.println("Parametro Calculada: " + circulo.getPerimetro());
        System.out.println("\n");
    }
}