/*
  ENTRADAS: nombre, genero, edad, tel�fono, nota1, nota2, nota3
  PROCESOS: promedio <- (nota1+nota2+nota3) / 3
  SALIDAS : promedio  
*/

//[1] importar paquetes
package tallermintic01;

//[2] importar clases de java como math y scanner
import java.util.Scanner;

//[3] crear la clase - molde o plantilla
public class EntradasProcesosSalidas84 {

    //[4] funcion main que es el progrrama principal y el primero en ejecutarse
    public static void main(String[] args) {
        
        //[5] declarar variaable globales con su tipo de dato
        String nombre = "";
        char genero = 'M';
        int edad = 0;
        double telefono = 0.0d;
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        float promedio = 0.0f;
        //CONSTANTES
        
        //[6] ENTRADAS
        Scanner teclado = new Scanner(System.in);
        System.out.print("NOMBRE: "); nombre = teclado.nextLine();
        System.out.print("GENERO [M][F]: "); genero = teclado.next().charAt(0);
        System.out.print("EDAD: ");          edad = teclado.nextInt();
        System.out.print("TELEFONO: ");      telefono = teclado.nextDouble();
        System.out.print("NOTA 1 CON COMA: ");        nota1 = teclado.nextFloat();
        System.out.print("NOTA 2 CON COMA: ");        nota2 = teclado.nextFloat();
        System.out.print("NOTA 3 CON COMA: ");        nota3 = teclado.nextFloat();
        
        //[7] PROCESOS
        promedio = (nota1 + nota2 + nota3) / 3;  
        
        //[8] SALIDAS   \n  \t
        System.out.println("NOMBRE  GENERO  EDAD  TELEFONO NOTA1 NOTA2 NOTA3 PROMEDIO");
        System.out.println("==========================================================");        
        System.out.println(nombre + '\t' +  + '\t' + genero + 
                         '\t' + edad +  + '\t' + telefono + '\t' + nota1 + 
                         '\t' + nota2 + '\t' + nota3 + '\t' + promedio);
        
    }//FIN DE LA FUNCI�N MAIN O PRINCIPAL
    
} //FIN DE LA CLASE EPS
