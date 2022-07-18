/*

 */
package figurasgeometricas;

import java.util.Scanner;
import Clases.*;

public class FigurasGeometricas {
    public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {            
            char opcion = '7';
            while (opcion != '4') {
                menu();
		opcion = teclado.nextLine().charAt(0);
		switch(opcion) {
                    case '1':construirRectangulo(); break;
		    case '2':construirTriangulo();break;
		    case '3':construirCirculo();break;
		    case '4':System.out.println("\n\t\tFIN DE PROGRAMA");break;
		    default:System.out.println("Opcion equivocada\n");
		}
	    }
	}//fin main
        
        public static void menu(){
            System.out.println("              *** RETO NRO. 3 ***");
            System.out.println("*** APLICANDO PROGRAMACIÓN ORIENTADA A OBJETOS ***");
            System.out.println("==================================================");
            System.out.println("[1] -- Construir un Rectangulo");
            System.out.println("[2] -- Construir un Triangulo");
            System.out.println("[3] -- Construir un Circulo");
            System.out.println("[4] -- SALIR");
            System.out.print("Opcion: ");
        }

	private static void construirRectangulo() {
		/*System.out.print("\nBase: ");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.print("Altura: ");
		double altura = Double.parseDouble(teclado.nextLine());*/
                
		Rectangulo rectangulo = new Rectangulo(0, 0, "RECTANGULO UNO", 0, 0);
                
                System.out.print("\n\n*** MOSTRANDO DATOS DEL RECTANGULO *** ");
                System.out.print("\n======================================");
                System.out.println("FIGURA: " + rectangulo.getNombre());
                System.out.println("ANCHO : " + rectangulo.getAncho());
                System.out.println("ALTO  : " + rectangulo.getAlto());
		System.out.println("AREA  : " + rectangulo.getArea());
		System.out.println("PERIMETRO: " + rectangulo.getPerimetro());
                System.out.println("TIPO FIGURA: " + rectangulo.getTipoFigura());
		System.out.println("\n");
	} 
        
       	private static void construirTriangulo() {
		System.out.print("\nBase: ");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.print("Altura: ");
		double altura = Double.parseDouble(teclado.nextLine());
		System.out.print("Lado 1: ");
		double lado1 = Double.parseDouble(teclado.nextLine());
		System.out.print("Lado 2: ");
		double lado2 = Double.parseDouble(teclado.nextLine());
		System.out.print("Lado 3: ");
		double lado3 = Double.parseDouble(teclado.nextLine());
		Triangulo tri = new Triangulo(base, altura, lado1, lado2, lado3,"TRIANGULO UNO", 0,0);
		System.out.println("Area calculada: " + tri.getArea());
		System.out.println("Perimetro calculado: " + tri.getPerimetro());
		System.out.println("\n");  //Double.parseDouble(teclado.nextLine())
	}

	private static void construirCirculo() {
		System.out.print("\nRadio: ");
		double radio = Double.parseDouble(teclado.nextLine());
		Circulo circulo = new Circulo(radio,"CIRCULO UNO", 0,0);
		System.out.println("Area calculada: " + circulo.getArea());
		System.out.println("Perimetro calculado: " + circulo.getPerimetro());
		System.out.println("\n");
	}    
}//fin clase
