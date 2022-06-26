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
public class HallarSumatoria {
    
    
    static double suma = 0;
    static double diferencia = 0;
    static double producto = 0;
    static double cociente = 0;
    static double residuo = 0;

    public static void main(String[] args) {
        
        double N1 = 0;
        double N2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N1: "); N1 = scanner.nextInt();
        System.out.print("N2: "); N2 = scanner.nextInt();
        
        suma = Suma(N1,N2);
        diferencia = Diferencia(N1,N2);
        producto = Producto(N1,N2);
        cociente = Cociente(N1,N2);
        residuo = Residuo(N1,N2);
        
        System.out.println("N1 " + " " + " N2 " +" "+ " SUMA = " + suma + " DIFERENCIA = " 
                            + diferencia + " PRODUCTO = " + producto + " COCIENTE = " 
                            + cociente + " RESIDUO = " + residuo);
    }
    
    public static double Suma(double N1,double N2)
    {
       suma = N1 + N2;
       return suma;
    }
    
    public static double Diferencia(double N1,double N2)
    {
       diferencia = N1 - N2;
       return diferencia;
    }
    
    public static double Producto(double N1,double N2)
    {
       producto = N1 * N2;
       return producto;
    }
    
    public static double Cociente(double N1,double N2)
    {
       cociente = N1 / N2;
       return cociente;
    }
    
    public static double Residuo(double N1,double N2)
    {
       residuo = N1 % N2;
       return residuo;
    }
}
