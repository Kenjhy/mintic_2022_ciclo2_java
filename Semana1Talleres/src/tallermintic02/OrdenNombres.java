/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;
import java.util.Scanner;
/**
 *
 * @author cristian.quiza
 */
public class OrdenNombres {
    
    public static void main(String[] args) {
        String nombres = "";
        String apellidos = "";
        String datosInvertidos = "";
        Scanner teclado = new Scanner(System.in);
        //String datoCompleto = nombres + apellidos;
        System.out.print("Escribir Nombre : ");
        nombres = teclado.nextLine();
        System.out.print("Escribir Apellido: ");
        apellidos = teclado.nextLine();
        
        datosInvertidos = leerCadena(nombres, apellidos);
        System.out.println(datosInvertidos);      
    }     
    
    
    public static String leerCadena(String nombres, String apellidos)
    {
        String datosInvertidos = "";
        datosInvertidos = apellidos + " " + nombres;
        
        return datosInvertidos;
    }
    
}
