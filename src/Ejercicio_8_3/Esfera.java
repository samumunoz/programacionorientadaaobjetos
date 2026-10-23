package Ejercicio_8_3;

public class Esfera extends FiguraGeometrica {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3.0);
    }

    @Override
    public double calcularSuperficie() {
        return 4.0 * Math.PI * Math.pow(radio, 2.0);
    }
}
