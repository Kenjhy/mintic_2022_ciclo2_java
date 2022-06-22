static double suma = 0;
    static double diferencia = 0;
    static double producto = 0;
    static double cociente = 0;
    static double residuo = 0;

    public static void main(String[] args) {
        
        double numero1 = 0;
        double numero2 = 0;
        int operador =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que operacion quiere : "); operador = scanner.nextInt();
        System.out.print("numero1: "); numero1 = scanner.nextInt();
        System.out.print("numero2: "); numero2 = scanner.nextInt();
        
        double suma = calcular(numero1, numero2, operador);
        double diferencia = calcular(numero1, numero2, operador);
        double producto = calcular(numero1, numero2, operador);
        double cociente = calcular(numero1, numero2, operador);
        double residuo = calcular(numero1, numero2, operador);
        
        System.out.println("numero1 " + " " + " numero2 " +" "+ " SUMA = " + suma + " DIFERENCIA = " 
                            + diferencia + " PRODUCTO = " + producto + " COCIENTE = " 
                            + cociente + " RESIDUO = " + residuo);
        
       
    }
    
    public static double Suma(double numero1,double numero2)
    {
       suma = numero1 + numero2;
       return suma;
    }
    
    public static double Diferencia(double numero1,double numero2)
    {
       diferencia = numero1 - numero2;
       return diferencia;
    }
    
    public static double Producto(double numero1,double numero2)
    {
       producto = numero1 * numero2;
       return producto;
    }
    
    public static double Cociente(double numero1,double numero2)
    {
       cociente = numero1 / numero2;
       return cociente;
    }
    
    public static double Residuo(double numero1,double numero2)
    {
       residuo = numero1 % numero2;
       return residuo;
    }
    
    
    
     public static double calcular(double numero1, double numero2, int operador)
     {
        double resultado = 0; 
        if(operador == 1)
        {
            resultado = Suma(numero1,numero2);
        }
        
        if(operador == 2)
        {
            resultado = Diferencia(numero1,numero2);
        }
        
        if(operador == 3)
        {
            resultado = Producto(numero1,numero2);
        }
        
        
        if(operador == 4)
        {
           resultado = Cociente(numero1,numero2);
        }
        
        if(operador == 5)
        {
           resultado = Residuo(numero1,numero2);
        }
        
        return resultado;
     }
}