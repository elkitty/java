/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia3;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class ejercicio2 {

    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un 
    mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
    Nota: investigar la función equals() en Java.*/
 /*public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá una palabra");
        String palabra = leer.nextLine();
        
        if (palabra.equals("eureka")) {
            System.out.println("Correcto");

        } else {
            System.out.println("No adivinaste");

        }
    }*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;

        do {
            System.out.println("Ingresa una palabra:");
            palabra = leer.nextLine();
        } while (!palabra.equals("eureka"));

        System.out.println("¡Adivinaste la palabra correcta!");
    }
}
