package egg.guia4;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n; // número de personas
        String nombre;
        int edad;
        boolean seguirMostrando = true;

        System.out.print("Ingrese el número de personas: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrese los datos de la persona " + (i + 1));
            System.out.print("Nombre: ");
            nombre = input.next();
            System.out.print("Edad: ");
            edad = input.nextInt();

            mostrarPersona(nombre, edad);

            System.out.print("\n¿Quiere seguir mostrando personas? (Sí/No): ");
            String respuesta = input.next();
            if (respuesta.equalsIgnoreCase("no")) {
                seguirMostrando = false;
                break;
            }
        }

        if (!seguirMostrando) {
            System.out.println("\nFin del programa.");
        }
    }

    public static void mostrarPersona(String nombre, int edad) {
        // verificar si es mayor o menor de edad
        String mensaje = (edad >= 18) ? "mayor de edad" : "menor de edad";

        System.out.println("Nombre: " + nombre + " / Edad: " + edad + " / Es " + mensaje);
    }

}
