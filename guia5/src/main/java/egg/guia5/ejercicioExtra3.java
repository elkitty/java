package egg.guia5;

import java.util.Random;

/*
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
 * Después haremos otra función o procedimiento que imprima el vector.
 */
public class ejercicioExtra3 {

    public static void main(String[] args) {

        int n = 10;
        int[] miVector = new int[n];

        rellenarVector(miVector, n);
        imprimirVector(miVector, n);
    }    
        
    public static void rellenarVector(int[] arr, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100); // Generar un número aleatorio entre 0 y 9
        }
    }

    public static void imprimirVector(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


