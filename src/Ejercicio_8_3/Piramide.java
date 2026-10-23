package Ejercicio_8_3;

public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    @Override
    public double calcularVolumen() {
        return (Math.pow(base, 2.0) * altura) / 3.0;
    }

    @Override
    public double calcularSuperficie() {
        return Math.pow(base, 2.0) + (2.0 * base * apotema);
    }
}
