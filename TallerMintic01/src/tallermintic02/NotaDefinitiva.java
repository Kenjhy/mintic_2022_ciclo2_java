package tallermintic02;

import tallermintic01.*;
import java.util.Scanner;

public class NotaDefinitiva {

    double parcial1, parcial2, parcial_final;
    double promedio1, promedio2, promedio3, promedio4, promedio5, promedio6;
    double taller1, taller2, taller3, NotaDef;

    Scanner entrada = new Scanner(System.in);

    public void IngreseNotas() {

        System.out.println("Por favor ingrese las notas del estudiante ");
        System.out.println("===========================================");
        System.out.print("Ingrese nota parcial1: ");
        parcial1 = entrada.nextDouble();
        System.out.print("Ingrese nota parcial2: ");
        parcial2 = entrada.nextDouble();
        System.out.print("Ingrese nota parcial_final: ");
        parcial_final = entrada.nextDouble();
        System.out.print("Ingrese nota talle1: ");
        taller1 = entrada.nextDouble();
        System.out.print("Ingrese nota taller2: ");
        taller2 = entrada.nextDouble();
        System.out.print("Ingrese nota taller3: ");
        taller3 = entrada.nextDouble();
    }

    public void CalculoNotas() {
        promedio1 = parcial1 * 0.25;
        promedio2 = parcial2 * 0.25;
        promedio3 = parcial_final * 0.20;
        promedio4 = taller1 * 0.10;
        promedio5 = taller2 * 0.10;
        promedio6 = taller3 * 0.10;
        NotaDef = (promedio1 + promedio2 + promedio3 + promedio4 + promedio5 + promedio6);
    }
   public static void main(String[] args) {
        NotaDefinitiva nt = new NotaDefinitiva();
        nt.IngreseNotas();
        nt.CalculoNotas();
        nt.MostrarResultados();
    }
    public void MostrarResultados() {

       System.out.println("PARCIAL1\tPARCIAL2\tPARCIAL FINAL\tTALLER1\tTALLER2\tTALLER3\t PROMEDIO ");
       System.out.println( parcial1 + "\t\t" + parcial2 + "\t\t" + parcial_final + "\t\t" + taller1 + "\t" + taller2 +
                  "\t" + taller3 + "\t" + NotaDef);
                

    }

 
}
