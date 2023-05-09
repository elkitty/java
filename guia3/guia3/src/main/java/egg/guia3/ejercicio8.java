package egg.guia3;

import java.util.Scanner;

/*
 *
 * 
 */
public class ejercicio8 {

    /*
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = sc.nextInt();

        // Imprimir la primera fila con "*"
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Imprimir las filas intermedias
        for (int i = 2; i < n; i++) {
            System.out.print("* ");
            for (int j = 2; j < n; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // Imprimir la última fila con "*"
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
