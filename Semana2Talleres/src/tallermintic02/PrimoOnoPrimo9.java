/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;

/**
 *
 * @author ASUS
 */
public class PrimoOnoPrimo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean x = isPrime(7);
        System.out.println(x);
        //Revisa si un numero entero es primo o no.
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("No es primo");
                return false;
            }
        }
        System.out.println("Es primo");
        return true;
    }

}
