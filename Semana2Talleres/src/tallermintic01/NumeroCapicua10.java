/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NumeroCapicua10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, inv, aux, digito;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String numeroString = scanner.nextLine();
        num = Integer.parseInt(numeroString);
        inv = 0;
        aux = num;
        while (aux > 0) {
            digito = aux % 10;
            inv = inv * 10 + digito;
            aux = aux / 10;
        }
        if (num == inv) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }

    }

}
