/*
    SERIE DE FIBONACCI PARA N TERMINOS
    anterior - actual - resultado
 */
package Semana2Talleres;

/**
 *
 * @author cristian.quiza
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        // Todo code application logic hare
        System.out.print("0 - 1 - 1 -");
        int anterior = 1;
        int actual = 1;
        int maximo = 10000;
        setFibonacci(anterior, actual, maximo);
    }// fin main
    
    public static void setFibonacci(int anterior, int actual, int max){
        int resultado = 0; int suma = 0;
        
         while (suma <= max) { //menor o igual a cero
            resultado = anterior + actual;
            suma = suma + resultado;
            System.out.println(resultado + " - " );
            anterior = actual;
            actual = resultado;
        }
        System.out.println("\n sumatoria: " + suma );
    }// fin fibonacci 
}