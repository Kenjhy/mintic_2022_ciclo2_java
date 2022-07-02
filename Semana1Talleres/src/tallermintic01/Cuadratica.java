/*
ANALISIS:
ENTRADAS: a, b, c
PROCESOS: raiz_positiva <- (-b + raiz(b^2 - 4*a*c)) / (2*a)
          raiz_negativa <- (-b - raiz(b^2 - 4*a*c)) / (2*a)
SALIDAS : raiz_positiva, raiz_negativa
*/
package tallermintic01;

import java.util.Scanner;
import java.lang.Math.*;

public class Cuadratica {
    
    public static void main(String[] args) {
        //declaramos e inciamos variables con su tipo respectivo
        int a = 0; int b = 0; int c = 0;
        double raiz_positiva = 0.0d;
        double raiz_negativa = 0.0d;
        
        //ENTRADAS
        Scanner teclado = new Scanner(System.in);
        System.out.print("VALOR DE A: "); a = teclado.nextInt();
        System.out.print("VALOR DE B: "); b = teclado.nextInt();
        System.out.print("VALOR DE C: "); c = teclado.nextInt();
        //PROCESO                     
        raiz_positiva = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        raiz_negativa = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        
        //[8] SALIDAS   \n  \t
        System.out.println("A  B  C  X1  X2");
        System.out.println("================");        
        System.out.println(a + "\t" + b + "\t" + c + "\t" + 
                raiz_positiva + "\t" + raiz_negativa);       
    }    
}
