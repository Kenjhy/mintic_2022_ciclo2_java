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
public class EquipoBaloncesto9 {
    public static void main(String[] args) {

        Scanner Teclado=new Scanner(System.in);
        
        System.out.print("por favor Ingresar la Altura: ");
        Double est = Teclado.nextDouble();
        System.out.print("Por favor ingresar el peso: ");
        int peso = Teclado.nextInt();
        
       
        if((est >= 1.80) && (peso <= 100)){
            System.out.print("El aspirante Es Apto ");
            
        }else                      
            System.out.print("El aspirante No es Apto ");
    }
}

