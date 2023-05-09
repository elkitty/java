package egg.guia2;

import java.util.Scanner;

/* Escribir un programa que pida dos números enteros por teclado y 
 * calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma 
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1;
        System.out.println("ingresá el primer número");
        numero1 = leer.nextInt();
        Scanner leer1 = new Scanner(System.in);
        int numero2;
        System.out.println("ingresá el segundo número");
        numero2 = leer1.nextInt();
        //System.out.println(numero1 + numero2);
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos números es: " + suma);

    }
}
