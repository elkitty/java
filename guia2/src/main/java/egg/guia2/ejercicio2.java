package egg.guia2;

import java.util.Scanner;
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("ingresá tu nombre");
        nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);

    }
}


