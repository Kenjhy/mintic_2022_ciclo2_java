
package tallermintic02;


import java.util.Scanner;

public class PositivoNegativo {


    public static void main(String[] args){

     Scanner teclado=new Scanner(System.in);
     int a;
     System.out.println("Ingrese un numero: ");
     a=teclado.nextInt();
     if(a>0)
       System.out.println("es positivo");
     else
     System.out.println("es negativo");
     }
}
