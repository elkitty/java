package egg.guia5;

import java.util.Random;

/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
public class ejercicioExtra5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int suma = 0;
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100);
            }

        }

        // Muestro la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        // Sumar los elementos de la matriz
        for (int i = 0; i< 5; i ++) {
            for (int j = 0; j < 5; j++) {
            suma += matriz[i][j];
            }
        }

        // Mostrar la suma de los elementos de la matriz
        System.out.println ("La suma de los elementos de la matriz es: " + suma);
        }
}
