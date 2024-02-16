
package com.ifp.herencia;

/**
 *
 * @author Garbine
 */
public class Jugar {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        JuegoDados juego1 = new JuegoDados();
        juego1.mensaje();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }
    
}
