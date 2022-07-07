/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import Clases.Circulo;
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
       
    }

    private static void contruirTriangulo() {

    }

    private static void contruirCirculo() {
        System.out.println("\nRadio: ");
        double radio = Double.parseDouble(teclado.nextLine());
        Circulo circulo = new Circulo(radio, "CIRCULO UNO ", 0,0);
        System.out.println("Area Calculada" + circulo.getArea());
        System.out.println("Parametro Calculada" + circulo.getArea());
    }
}
