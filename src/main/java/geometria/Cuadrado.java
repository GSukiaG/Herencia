package geometria;


// Clase Cuadrado (Herencia de Figura)
class Cuadrado extends Figura {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
        nombre ="cuadrado";
    }


    @Override
    public double calcularArea() {
        return lado * lado;
    }
    @Override
    public double calcularPerimetro() {
        return 4 *lado;
    }
}