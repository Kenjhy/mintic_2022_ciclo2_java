/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;
import java.util.Scanner;
/**
 *
 * @author cristian.quiza
 */
public class OrdenNombres {
    public static void main(String[] args) {
        String nombres = "";
        String apellidos = "";
        //String datoCompleto = nombres + apellidos;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribir Nombre : "); nombres = teclado.nextLine();
        System.out.print("Escribir Apellido: "); apellidos = teclado.nextLine();
        String datosInvertidos = apellidos + " " + nombres;
        System.out.println(datosInvertidos);      
    }     
    
}
