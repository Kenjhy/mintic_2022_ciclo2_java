/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class DeducirOrdenNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingrese el primer numero:");
        a = lector.nextInt();
        System.out.println("Ingrese el segundo numero:");
        b = lector.nextInt();
        System.out.println("Ingrese el tercer numero:");
        c = lector.nextInt();
        
        if (a<b && a<c && b<c){
            System.out.println("Los numeros estan en orden creciente.");
        }
        else{
            System.out.println("Los numeros no estan en orden creciente.");
        }
    }

}
