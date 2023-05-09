package egg.guia5;

import java.util.Scanner;

/*
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9.

 *
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];  // Declarar la matriz 3x3
        // Recorrer la matriz y asignar los valores introducidos por teclado
        /*        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        int valor = 0;
        while (valor < 1 || valor > 9) {
        System.out.printf("Ingrese el valor para la posición (%d,%d): ", i + 1, j + 1);
        valor = sc.nextInt();
        // Utiliza un bucle while para leer los valores de la matriz y comprobar que están entre 1 y 9.
        // Si algún valor es incorrecto, muestra un mensaje de error y pide al usuario que lo introduzca de nuevo.
        if (valor < 1 || valor > 9) {
        System.out.println("El valor debe estar entre 1 y 9. Intente nuevamente.");
        }
        }
        matriz[i][j] = valor;
        }
        }*/
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = 0;
                do {
                    System.out.printf("Ingrese el valor para la posición (%d,%d): ", i + 1, j + 1);
                    valor = sc.nextInt();
                    if (valor < 1 || valor > 9) {
                        System.out.println("El valor debe estar entre 1 y 9. Intente nuevamente.");
                    }
                } while (valor < 1 || valor > 9);
                matriz[i][j] = valor;
            }
        }
        // Verificar si es un cuadrado mágico
        int sumaFila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        int sumaFila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        int sumaFila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        int sumaColumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        int sumaColumna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        int sumaColumna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        boolean esMagico = (sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3
                && sumaFila3 == sumaColumna1 && sumaColumna1 == sumaColumna2
                && sumaColumna2 == sumaColumna3 && sumaColumna3 == sumaDiagonal1
                && sumaDiagonal1 == sumaDiagonal2);

        // Imprimir la matriz
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar el resultado
        if (esMagico) {
            System.out.println("¡Felicidades! El cuadrado es mágico.");
        } else {
            System.out.println("Lo siento, el cuadrado no es mágico.");
        }
    }
}
