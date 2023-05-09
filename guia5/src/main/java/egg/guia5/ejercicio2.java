package egg.guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class ejercicio2 {

    /*
     * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario
     un número a buscar en el vector. El programa mostrará dónde se encuentra el numero
     y si se encuentra repetido
     * 
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

        int[] vector = new int[n];

        // Llenar el vector con valores aleatorios
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(10);
            //System.out.println(vector[i]);
        }

        System.out.print("Ingrese el número a buscar en el vector: ");
        int num = input.nextInt();

        int count = 0;
        boolean encontrado = false;

        // Buscar el número en el vector
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                if (encontrado == false) {
                    System.out.println("El número " + num + " se encuentra en la posición " + i);
                    encontrado = true;
                }
                count++;
            }
        }

        if (encontrado == false) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        } else {
            if (count > 1) {
                System.out.println("El número " + num + " se encuentra repetido " + count + " veces.");
            }
        }

//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//
//        System.out.print("Ingrese el tamaño del vector: ");
//        int num = sc.nextInt();
//
//        int[] vector = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            vector[i] = rand.nextInt();
//            System.out.print("[" + vector[i] + "]");
//        }
//
//        System.out.print("\nIngrese el número a buscar: ");
//        int num2 = sc.nextInt();
//        int count = 0;
//
//        for (int i = 0; i < num; i++) {
//            if (vector[i] == num2) {
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            System.out.println("El número " + num2 + " no se encuentra en el vector.");
//        } else {
//            System.out.println("El número " + num2 + " se encuentra " + count + " veces en el vector.");
//        }
    }
}
