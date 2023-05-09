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
public class ejercicio1 {

    //Crear un programa que dado un número determine si es par o impar.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingresá un número");
        numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");

        } else {
            System.out.println(numero + " es impar");
        }

    }

}
