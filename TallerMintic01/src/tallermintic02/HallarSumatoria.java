/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;

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
        
        double numero1 = 0;
        double numero2 = 0;
        int operador =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que operacion quiere : "); operador = scanner.nextInt();
        System.out.print("numero1: "); numero1 = scanner.nextInt();
        System.out.print("numero2: "); numero2 = scanner.nextInt();
        
        double suma = calcular(numero1, numero2, 1);
        double diferencia = calcular(numero1, numero2, operador);
        double producto = calcular(numero1, numero2, 3);
        double cociente = calcular(numero1, numero2, 4);
        double residuo = calcular(numero1, numero2, 5);
        
        System.out.println("numero1 " + " " + " numero2 " +" "+ " SUMA = " + suma + " DIFERENCIA = " 
                            + diferencia + " PRODUCTO = " + producto + " COCIENTE = " 
                            + cociente + " RESIDUO = " + residuo);
        
       
    }
    
    public static double Suma(double numero1,double numero2)
    {
       suma = numero1 + numero2;
       return suma;
    }
    
    public static double Diferencia(double numero1,double numero2)
    {
       diferencia = numero1 - numero2;
       return diferencia;
    }
    
    public static double Producto(double numero1,double numero2)
    {
       producto = numero1 * numero2;
       return producto;
    }
    
    public static double Cociente(double numero1,double numero2)
    {
       cociente = numero1 / numero2;
       return cociente;
    }
    
    public static double Residuo(double numero1,double numero2)
    {
       residuo = numero1 % numero2;
       return residuo;
    }
    
    
    
     public static double calcular(double numero1, double numero2, int operador)
     {
        
        if(operador == 1)
        {
            suma = Suma(numero1,numero2);
        }
        
        if(operador == 2)
        {
            diferencia = Diferencia(numero1,numero2);
        }
        
        if(operador == 3)
        {
            producto = Producto(numero1,numero2);
        }
        
        
        if(operador == 4)
        {
           cociente = Cociente(numero1,numero2);
        }
        
        if(operador == 5)
        {
           residuo = Residuo(numero1,numero2);
        }
        
        double resultado = 0; 
        return resultado;
     }
}
