/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;

import java.util.Scanner;

/**
 *
 * @author daniel.vargas
 */
public class EcuacionSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a ,b, c, d, e, f, g, h, j, l, m, n;
		double k;
		double i;
		Scanner S = new Scanner(System.in);
		System.out.print("Escribe la primera incógnita(a): ");
		a = S.nextInt();
		System.out.print("Escribe la segunda incógnita(b): ");
		b = S.nextInt();
		System.out.print("Escribe la primera incógnita(c): ");
		c = S.nextInt();
 
		d = -b;
		e = b * b;
		f = -4 * a * c;
		g = 2 * a;
		h = e - f;
		i = Math.sqrt(h);
		j = (int) ((d + i) / g);
		k = (d - i) / g;
 
		if(j > k){
			System.out.println ("El resultado mayor es: "+j+" El número menor es: "+k);
 
		}
		else if(j < k){
			System.out.println ("El resultado mayor es: "+k+" El número menor es: "+j);
 
		}
    }
    
}
