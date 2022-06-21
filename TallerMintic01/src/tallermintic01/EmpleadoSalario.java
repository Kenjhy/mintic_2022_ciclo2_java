/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

import java.util.Scanner;
import java.math.*;
/**
 *
 * @author WINDOWS 10
 */
public class EmpleadoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                       
        int cantidad_horas = 0;
        float valor_hora = 0;
        String nombreEmpleado = "";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nombre: "); nombreEmpleado = scanner.nextLine();
        System.out.print("cantidad horas: "); cantidad_horas = scanner.nextInt();
        System.out.print("valor hora: "); valor_hora = scanner.nextFloat();
        
        float salario = calcular_salario(cantidad_horas, valor_hora);
        salida(cantidad_horas, valor_hora, nombreEmpleado, salario);

    }
    
    public static float calcular_salario(int cantidad_horas, float valor_hora)
    {
        float salario = cantidad_horas * valor_hora;
        return salario;
    }
    
    public static void salida(int cantidad_horas, float valor_hora, String nombreEmpleado, float salario)
    {
        System.out.println("NOMBRES\tHORAS TRABAJADAS VALOR HORA SALARIO INTEGRAL");
        System.out.println(nombreEmpleado +  "\t\t"  + cantidad_horas + "\t\t" + valor_hora + "\t\t" + salario);     
    }
}
