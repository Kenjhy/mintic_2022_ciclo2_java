
package tallermintic01;

import java.util.Scanner;

public class TipoDeTriangulos {

    public static void main (String[] arg){
        
        Scanner teclado = new Scanner(System.in);
        int contadorequilatero = 0;
        int contadorescaleno = 0;
        int contadorisosceles = 0;
        
        char opcion = 'z';
        while(Character.toLowerCase(opcion) != 'n')
        {
        System.out.print("Ingrese el valor del lado 1: "); int lado1 = teclado.nextInt();
        System.out.print("Ingrese el valor del lado 2: "); int lado2 = teclado.nextInt();
        System.out.print("Ingrese el valor del lado 3: "); int lado3 = teclado.nextInt();
           
        int tipo= getTipoDeTriangulos(lado1, lado2, lado3);   
        if(tipo==1){
             contadorequilatero = contadorequilatero + 1; 
        }
         if(tipo==2){   
           contadorescaleno = contadorescaleno + 1;
           }  
         if(tipo==3){ 
         contadorisosceles = contadorisosceles + 1;
         }
        System.out.println(" ");
        System.out.print("Desea Continuar [s]si [n]no: ");  opcion = teclado.next().charAt(0);
        
      getTipoDeTriangulos(lado1, lado2, lado3);         
    }
     System.out.println("-----------");
           System.out.println(" TIPOS DE TRIANGULOS -- CANTIDAD");
           System.out.println("-----------");
             System.out.println("\n Equilatero hay: " +contadorequilatero);         
           System.out.println("\n Escaleno hay: " +contadorescaleno);
           System.out.println("\n Isosceles hay: " +contadorisosceles); 
    }
     
    public static int getTipoDeTriangulos(int l1, int l2, int l3){
        
       int tipo=0;
        
            if(l1 == l2 && l2 == l3 && l1 == l3){
            tipo=1;   
                           }
            else if(l1 != l2 && l2 != l3 && l1 != l3){
            tipo=2;    
                                }
            else {
            tipo=3;    
                                       }
          return tipo;
    }
    
}