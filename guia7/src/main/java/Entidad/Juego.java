/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos
y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número
o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class Juego {
    
    

    private int numElegido;
    private int numGuess;
    private int numIntentos;
    private int victoriasJugador1;
    private int victoriasJugador2;
    

    public Juego() {
    }

    public Juego(int numElegido, int numGuess, int numIntentos, int victoriasJugador1, int victoriasJugador2) {
        this.numElegido = numElegido;
        this.numGuess = numGuess;
        this.numIntentos = numIntentos;
        this.victoriasJugador1 = victoriasJugador1;
        this.victoriasJugador2 = victoriasJugador2;
    }

    public int getNumElegido() {
        return numElegido;
    }

    public int getNumGuess() {
        return numGuess;
    }
        
    public int getNumIntentos() {
        return numIntentos;
    }

    public int getVictoriasJugador1() {
        return victoriasJugador1;
    }

    public int getVictoriasJugador2() {
        return victoriasJugador2;
    }

    public void setNumElegido(int numElegido) {
        this.numElegido = numElegido;
    }

    public void setNumGuess(int numGuess) {
        this.numGuess = numGuess;
    }
    
    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public void setVictoriasJugador1(int victoriasJugador1) {
        this.victoriasJugador1 = victoriasJugador1;
    }

    public void setVictoriasJugador2(int victoriasJugador2) {
        this.victoriasJugador2 = victoriasJugador2;
    }

    public int iniciar_juego() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1: Ingresá el numero que querés que adivine el jugador 2 ");
        this.numElegido = sc.nextInt();
        this.numIntentos = 0;
        do {
            System.out.print("Jugador 2: Adiviná el número (recordá que solo tenés 5 intentos) ");
            this.numGuess = sc.nextInt();
            numIntentos++;
            if (this.numGuess == this.numElegido) {
                System.out.print("Felicitaciones " + this.numGuess + " es el número correcto. ");
                return this.numIntentos;
            } else if (this.numGuess > this.numElegido) {
                System.out.println("El número es más bajo.");
            } else {
                System.out.println("El número es más alto.");
            }
        } while (this.numIntentos < 5); // El jugador 2 tiene un máximo de 5 intentos
        System.out.println("Se te acabaron los intentos, el número era " + this.numElegido + ".");
        return this.numIntentos;
    }

}
