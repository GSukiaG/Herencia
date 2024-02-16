package geometria;

// Clase Circulo (Herencia de Figura)
class Circulo extends Figura {

    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
        this.nombre = "círculo";
    }

    // Métodos específicos para Circulo
//    @Override
//    public void dibujar() {
//        System.out.println("Dibujando "+nombre);
//    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
