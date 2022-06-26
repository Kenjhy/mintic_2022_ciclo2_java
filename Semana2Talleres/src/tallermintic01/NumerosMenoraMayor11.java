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
public class NumerosMenoraMayor11 {
    public static void main(String[] args) {
         int [] a  = {7,2,4,8,3,9,1,5,10,6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        int temporal = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
}
