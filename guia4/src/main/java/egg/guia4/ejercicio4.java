package egg.guia4;

import java.util.Scanner;

public class ejercicio4 {

    /*
     * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
    por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo,
    sino false. Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
    Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
    El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = input.nextInt();

        if (esPrimo(n)) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

}
