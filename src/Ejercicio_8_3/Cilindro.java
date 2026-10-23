package Ejercicio_8_3;

public class Cilindro extends FiguraGeometrica {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2.0) * altura;
    }

    @Override
    public double calcularSuperficie() {
        return (2.0 * Math.PI * radio * altura) + (2.0 * Math.PI * Math.pow(radio, 2.0));
    }
}
