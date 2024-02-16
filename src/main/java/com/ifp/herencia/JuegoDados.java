package com.ifp.herencia;

/**
 *
 * @author Garbi
 */


import java.util.Scanner;

public class JuegoDados implements Juego, Saludo {
    private int dado1, dado2;
    private String jugador1;
    private String jugador2;
    private Scanner teclado;

    public JuegoDados() {
        teclado = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.print("Ingrese el nombre del primer jugador:");
        jugador1 = teclado.nextLine();
        System.out.print("Ingrese el nombre del segundo jugador:");
        jugador2 = teclado.nextLine();
    }

    public void jugar() {
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        System.out.println(jugador1 + " le ha salido el valor " + dado1);
        System.out.println(jugador2 + " le ha salido el valor " + dado2);
    }

    public void finalizar() {
        if (dado1 > dado2)
            System.out.println( jugador1 + " ha ganado con un valor de " + dado1);
        else if (dado2 > dado1)
            System.out.println( jugador2 + " ha ganado con un valor de " + dado2);
        else
            System.out.println("Empataron los dos jugadores con el valor " + dado1);
    }

    @Override
    public void mensaje() {
        System.out.println("Bienvenido al juego de dados");
    }

}