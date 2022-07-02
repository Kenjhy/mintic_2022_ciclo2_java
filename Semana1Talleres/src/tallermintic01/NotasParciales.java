/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

import java.util.Scanner;

/**
 *
 * @author daniel.vargas
 */
public class NotasParciales {

    /**
     * @param args the command line arguments
     */
    
    final static double PORCENTAJE1 = 0.25;
    final static double PORCENTAJE2 = 20.0/100.0; //0.2
    final static double PORCENTAJE3 = 0.3;
    static double parcial1 = 0; //25
    static double parcial2 = 0; //25
    static double final3 = 0; //20
    static double taller1 = 0; //30
    static double taller2 = 0; //30
    static double taller3 = 0; //30parcial2
    static double promedio_parcial1_parcial2 = 0;
    static double promedio_talleres = 0;
    static double nota = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
      
        System.out.println("Nota parcial 1: ");
        parcial1 = scanner.nextDouble();
        System.out.println("Nota parcial 2: ");
        parcial2 = scanner.nextDouble();
        System.out.println("Nota final 3: ");
        final3 = scanner.nextDouble();
        System.out.println("Nota taller 1: ");
        taller1 = scanner.nextDouble();
        System.out.println("Nota taller 2: ");
        taller2 = scanner.nextDouble();
        System.out.println("Nota taller 3: ");
        taller3 = scanner.nextDouble();
        
        promedio_parcial1_parcial2 = (parcial1 + parcial2) /2;
        promedio_talleres = (taller1 + taller2 + taller3) /3;
        nota = promedio_parcial1_parcial2 * PORCENTAJE1 + final3 * PORCENTAJE2 + promedio_talleres * PORCENTAJE3;

        System.out.println("La nota final es: " + nota);
      
    }
    
}
