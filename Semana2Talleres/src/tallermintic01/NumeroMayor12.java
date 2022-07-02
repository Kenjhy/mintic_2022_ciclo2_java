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
public class NumeroMayor12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30;
        int mayor = getMayor(n1,n2,n3);
        System.out.println("El numero mayor es: " + mayor);
       
    }
    
    public static int getMayor(int n1,int n2,int n3)
    {
        int mayor = 0;
        if (n1>n2 && n1>n3)
        {
            mayor = n1;
        }
        else if (n2>n3)
        {
            mayor=n2;
        }
        else mayor = n3;
        
        return mayor;
               
    }
    
}
