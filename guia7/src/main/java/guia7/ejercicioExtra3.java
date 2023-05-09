/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import Entidad.Juego;

/**
 *
 * @author marianomello
 */
public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego(); //creamos un objeto de tipo Juego
        juego.iniciar_juego(); //llamamos al método iniciar_juego()

        int intentos = juego.getNumIntentos(); //obtenemos el número de intentos del juego
        if (intentos <= 5) {
            System.out.println("El jugador 2 adivinó el número en " + intentos + " intentos. ¡Felicitaciones!");
            juego.setVictoriasJugador2(juego.getVictoriasJugador2() + 1); //registramos la victoria del jugador 2
        } else {
            System.out.println("El jugador 2 se quedó sin intentos. ¡Lo siento!");
            juego.setVictoriasJugador1(juego.getVictoriasJugador1() + 1); //registramos la victoria del jugador 1
        }
    }
}
