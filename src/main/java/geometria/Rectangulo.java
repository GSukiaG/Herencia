package geometria;

// Clase Rectangulo (Herencia de Figura)
class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos específicos para Rectangulo
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo.");
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}