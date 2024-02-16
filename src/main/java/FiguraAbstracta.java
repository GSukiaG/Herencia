/**
 *
 * @author Garbine
 */
    public abstract class FiguraAbstracta {
    private String color;

    public FiguraAbstracta(String color)
    {
        this.color = color;
    }

    public abstract double calcularArea();

    public String getColor()
    {
        return color;
    }
}
    



