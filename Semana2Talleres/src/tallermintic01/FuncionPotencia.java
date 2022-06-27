
package tallermintic01;

public class FuncionPotencia {

    public static void main(String[] args) {
        int base = 5;
        int exponente = 3;
        int resultado = getFuncionPotencia(base, exponente);
        System.out.println(base + "^" + exponente + "=" + resultado);
    }

    public static int getFuncionPotencia(int base, int exponente) {
        int resultado = 1;
        if (base > 0 && exponente == 0) {
            return resultado;
        } else if (base == 0 && exponente >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= exponente; i++) {
                resultado = resultado * base;
            }
            return resultado;

        }
    }
}

