package egg.guia5;

import java.util.Random;

public class ejercicio4 {

    /*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    public static void main(String[] args) {

        // Creamos la matriz original de 4x4 y la rellenamos con valores aleatorios
        int[][] matriz = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        // Creamos la matriz transpuesta de 4x4
        int[][] transpuesta = new int[4][4];

        // Recorremos la matriz original y asignamos los elementos a la matriz transpuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostramos la matriz transpuesta resultante en la consola
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        System.out.println("Matriz transpuesta:");
        mostrarMatriz(transpuesta);
    }

    // Método auxiliar para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
