/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import Entidad.Circunferencia;

/**
 *
 * @author marianomello
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5);
        System.out.println("El radio de la circunferencia es: " + c1.getRadio());
        c1.setRadio(10); // cambia el radio a 10
        System.out.println("El nuevo radio de la circunferencia es: " + c1.getRadio());

        c1.crearCircunferencia(); // pide al usuario el radio de la circunferencia
        System.out.println("El radio de la circunferencia es: " + c1.getRadio());

        System.out.println("El área de la circunferencia es: " + c1.area());
        System.out.println("El perímetro de la circunferencia es: " + c1.perimetro());
    }
}

