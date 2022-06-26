import java.util.*;


public class Intercambio {
    
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int I = A;
        System.out.print("Ingrese valor de A: "); A = sc.nextInt();
        System.out.print("Ingrese Valor de B: "); B = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);                                        
        I = A;
        A = B;
        B = I;      
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);                                   
  }
}