
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class PruebaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        	
		String colorTriangulo;
        double baseTriangulo;
        double alturaTriangulo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el color del triángulo: ");
        colorTriangulo = teclado.nextLine();

        System.out.print("Introduzca la base del triángulo: ");
        baseTriangulo = teclado.nextDouble();

        System.out.print("Introduzca la altura del triángulo: ");
        alturaTriangulo = teclado.nextDouble();

        Triangulo triangulo1 = new Triangulo(colorTriangulo, baseTriangulo, alturaTriangulo);

        System.out.printf("El área del triángulo %s es: %f", triangulo1.getColor(), triangulo1.calcularArea());
    }
}