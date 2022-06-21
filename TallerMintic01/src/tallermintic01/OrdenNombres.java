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
        String datoCompleto = nombres + apellidos;
        String datosInvertidos = apellidos + nombres;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Orden Por nombres y apellidos" + datoCompleto);
        System.out.print("Orden Por apellidos y nombres " + datosInvertidos);
        System.out.print("Nombres:"); nombres = teclado.nextLine();
        System.out.print("Apellidos:"); apellidos = teclado.nextLine();
    }
        
    
}
