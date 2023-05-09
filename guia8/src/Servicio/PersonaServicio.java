/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        String nombre = sc.next();


        System.out.print("Ingresa edad: ");
        int edad = sc.nextInt();

        // Comprobar que el sexo sea válido
        System.out.print("Ingrese sexo de la persona (H, M, O): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo ingresado incorrecto, por favor ingrese sexo válido (H, M, O): ");
            sexo = sc.next().charAt(0);
        }

        System.out.print("Ingresa peso: ");
        double peso = sc.nextDouble();


        System.out.print("Ingresa altura: ");
        double altura = sc.nextDouble();

        
        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad() < 21) {
            return false;
        }
        return true;
    }

    public int calcularIMC(Persona persona) {
        double resultIMC = persona.getPeso() / persona.getAltura();
        if (resultIMC < 20) {
            return -1;
        } else if (resultIMC >= 20 && resultIMC <= 25) {
            return 0;
        } else {
            return 1;

        }
    }

}
