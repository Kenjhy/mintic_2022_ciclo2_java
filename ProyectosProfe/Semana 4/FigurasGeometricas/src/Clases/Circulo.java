package Clases;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    } 

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    } 

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }      
    
    @Override
    public String getTipoFigura() {
        return "FIGURA CIRCULO";
    }
    
}
