/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Garbine
 */
public class Suma extends Operacion {

    public Suma(int valor1, int valor2) {
        super(valor1, valor2);
    }

    @Override
    public void operar() {
        resultado = valor1 + valor2;
    }

    @Override
    public void imprimir() {
        System.out.print("La suma de " + valor1 + " y " + valor2 + " es ");
        super.imprimir();
    }

}
 class Resta extends Operacion {

    public Resta(int valor1, int valor2) {
        super(valor1, valor2);
    }

    @Override
    public void operar() {
        resultado = valor1 - valor2;
    }

    @Override
    public void imprimir() {
        System.out.print("La resta de " + valor1 + " y " + valor2 + " es ");
        super.imprimir();
    }

}




 class Multiplicacion extends Operacion {

    public Multiplicacion(int valor1, int valor2) {
        super(valor1, valor2);
    }

    public void operar() {
        resultado = valor1 * valor2;
    }

    public void imprimir() {
        System.out.print("El producto de " + valor1 + " y " + valor2 + " es ");
        super.imprimir();
    }

}




 class Division extends Operacion {

    public Division(int valor1, int valor2) {
        super(valor1, valor2);
    }

    public void operar() {
        resultado = valor1 / valor2;
    }

    public void imprimir() {
        System.out.print("La división de " + valor1 + " y " + valor2 + " es ");
        super.imprimir();
    }

}






