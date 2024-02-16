
/**
 *
 * @author Garbine
 */


public class PruebaOperaciones {

    public static void main(String[] args) {
        Suma suma1 = new Suma(10, 2);
        suma1.operar();
        suma1.imprimir();
        Resta resta1 = new Resta(10, 2);
        resta1.operar();
        resta1.imprimir();
        Multiplicacion multiplicacion1 = new Multiplicacion(10, 2);
        multiplicacion1.operar();
        multiplicacion1.imprimir();
        Division division1 = new Division(10, 2);
        division1.operar();
        division1.imprimir();
    }
}