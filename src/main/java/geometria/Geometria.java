package geometria;

/**
 * @author Garbine
 * ejemplo, la clase Figura es la clase base que contiene métodos comunes a todas las figuras. 
 * Las clases Cuadrado, Circulo y Rectangulo heredan de la clase Figura y proporcionan 
 * implementaciones específicas para los métodos dibujar y calcularArea. La anotación 
 * @Override se utiliza para indicar que estos métodos están siendo sobreescritos en 
 * las clases derivadas. En la clase principal Main, se crean instancias de las clases 
 * derivadas y se llaman a sus métodos.
 */

// Clase principal Main
public class Geometria {
    public static void main(String[] args) {
        // Crear instancias de las clases derivadas
        Cuadrado cuadrado = new Cuadrado(5);
        Circulo circulo = new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        // Llamar a métodos de las clases derivadas
        cuadrado.dibujar();
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        circulo.dibujar();
        System.out.println("Área del círculo: " + circulo.calcularArea());

        rectangulo.dibujar();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
