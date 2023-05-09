/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import Entidad.Puntos;

/**
 *
 * @author marianomello
 */
public class ejercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}
