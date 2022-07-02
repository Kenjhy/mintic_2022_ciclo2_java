/*
 * 
 */
package tallermintic02;

import java.util.Scanner;

/**
 *
 * @author daniel.vargas
 */
public class PromedioEdades10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] edadesAleatorias = vectores();

        int edad = 0;
        int contador = 0;
        float total = 0;
        float promedio = 0;

        while (contador < 100) {
            edad = edadesAleatorias[contador];
            contador++;
            total = (float) total + edad;
            promedio = total / 100;
        }
        System.out.println("Total: " + total);
        System.out.println("Promedio: " + promedio);
    }
    
    
    public static int[] vectores() {
        int[] A = new int[100];
        for (int pos = 0; pos < 100; pos++) {
            A[pos] = (int) (Math.random() * 83 + 18);

            System.out.println(A[pos]);
        }
        return A;
    }

}