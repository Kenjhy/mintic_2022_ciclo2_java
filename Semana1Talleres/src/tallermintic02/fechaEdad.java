/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;
/**
 *
 * @author cristian.quiza
 */
import java.util.Date;
import java.util.Scanner;

public class fechaEdad {
    public static void main(String[] args) {

        int anioN = pideDatos();
        calcularEdad(anioN); 
    }
    
    public static int pideDatos()
    {
       int anioN = 0;
       Scanner teclado = new Scanner(System.in);
       System.out.print("Ingrese año de nacimiento: "); 
       anioN = teclado.nextInt();
       return anioN;
    }
    
    public static void calcularEdad(int ano_nacimiento)
    {
        Date dt=new Date();
        int year=dt.getYear();
        System.out.println("Year for date object is : "+year);
        int current_Year=year+1900;
        System.out.println("Current year is : "+current_Year);
        int edad  = (current_Year - ano_nacimiento);
        System.out.println("Su edad es: "+ edad + " años");
    }
    
}
