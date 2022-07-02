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
public class NumeroMes7 {
    
    public static void main(String[] args) {
        //Para pedir los datos
        Scanner Teclado = new Scanner(System.in);
        
        //Solicitamos al cliente el dato
        System.out.println("Ingrese un numero");
        int letra = Teclado.nextInt();
        
        //Almacenamos los datos que vamos a imprimir
        String meses = getMeses((char) letra);
        //imprimimos en consola 
        System.out.println(letra + " " + meses);        
    }
    
    private static String getMeses(char letra ) {
        //Realiza el ciclo switch
        String meses = "EL MES  NO EXISTE";
        switch (letra) {
            case 1: meses = "Es el mes de Enero";                 
                break;
            case 2: meses = "Es el mes de Febrero";                 
                break;
            case 3: meses = "Es el mes de Marzo";                 
                break;
            case 4: meses = "Es el mes de Abril";                 
                break;
            case 5: meses = "Es el mes de Mayo";                 
                break;
            case 6: meses = "Es el mes de Junio";                 
                break;
            case 7: meses = "Es el mes de Junlio";                 
                break;
            case 8: meses = "Es el mes de Agosto";                 
                break;
            case 9: meses = "Es el mes de Septiembre";                 
                break;    
            case 10: meses = "Es el mes de Octubre";                 
                break;
            case 11: meses = "Es el mes de Nombiembre";                 
                break;
            case 12: meses = "Es el mes de Dicembre";                 
                break;
            default : break;
        }
        //Retorna el valor
        return meses;
    }
}