/**
 *
 * @author Garbine
 */
public abstract class Operacion {

    protected int valor1, valor2, resultado;

    public Operacion(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

        public Operacion() {
        this.valor1 = 5;
        this.valor2 = 3;
    }
    public abstract void operar();

    public void imprimir() {
        System.out.println(resultado);
    }
}
