package egg.guia5;

import java.util.Random;
import java.util.Scanner;

/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();

        // Crear un vector de enteros de tamaño n
        int[] vector = new int[n];

        // Crear 5 variables enteras para contabilizar la cantidad de números con 1, 2, 3, 4 y 5 dígitos
        int digitos1 = 0, digitos2 = 0, digitos3 = 0, digitos4 = 0, digitos5 = 0;

        // Llenar el vector con valores aleatorios
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100000); // Generar un número aleatorio entre 0 y 99999
        }

        for (int i = 0; i < n; i++) {
            int numeroActual = vector[i];
            int cantidadDigitos = String.valueOf(numeroActual).length();
            switch (cantidadDigitos) {
                case 1:
                    digitos1++;
                    break;
                case 2:
                    digitos2++;
                    break;
                case 3:
                    digitos3++;
                    break;
                case 4:
                    digitos4++;
                    break;
                case 5:
                    digitos5++;
                    break;
                default:
                    break;
            }
        }
        // Mostrar los resultados de la cuenta para cada cantidad de dígitos
        System.out.println("Cantidad de números con 1 dígito: " + digitos1);
        System.out.println("Cantidad de números con 2 dígitos: " + digitos2);
        System.out.println("Cantidad de números con 3 dígitos: " + digitos3);
        System.out.println("Cantidad de números con 4 dígitos: " + digitos4);
        System.out.println("Cantidad de números con 5 dígitos: " + digitos5);
    }

}
