package geometria;
/**
 *
 * @author Garbine
 */
// Clase Figura (Clase base)
class Figura {
   public String nombre;

    public Figura() {
        this.nombre = "Figura";
    }
    
    // Métodos comunes a todas las figuras
    public void dibujar() {
        System.out.println("Dibujando "+nombre);
    }

    public double calcularArea() {
        return 0.0;
    }
    public double calcularPerimetro() {
        return 0.0;
    }
}