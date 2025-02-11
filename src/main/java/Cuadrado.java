/**
 *
 * @author Garbine
 */

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String color, double lado)
    {
        super(color);
        this.lado = lado;
    }

//    @Override
    public double calcularArea()
    {
        return lado * lado;
    }
}
 class Triangulo extends FiguraAbstracta {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura)
    {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea()
    {
        return (base * altura) / 2;
    }
}