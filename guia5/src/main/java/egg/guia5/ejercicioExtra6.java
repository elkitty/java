package egg.guia5;

import java.util.Random;
import java.util.Scanner;

public class ejercicioExtra6 {

    /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
    construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
    en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
    rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
     * 
     */
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear un arreglo para almacenar las palabras
        String[] palabras = new String[5];

        // Leer las palabras del usuario y verificar que tengan entre 3 y 5 caracteres
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + " (de 3 a 5 caracteres): ");
            palabras[i] = sc.nextLine();

            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese otra vez: ");
                palabras[i] = sc.nextLine();
            }
        }

        // Crear la matriz de caracteres
        char[][] matriz = new char[20][20];

        // Seleccionar una fila aleatoria
        Random rand = new Random();
        int fila = rand.nextInt(20);

        // Uso for each para colocar las palabras en la fila seleccionada
        int posicion = 0;
        for (String palabra : palabras) {
            for (int j = 0; j < palabra.length(); j++) {
                try {
                    matriz[fila][posicion + j] = palabra.charAt(j);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("La palabra no cabe en la fila seleccionada. Generando nueva fila...");
                    fila = rand.nextInt(20);
                    posicion = 0;
                    j = -1; // resetear el contador del for interno
                }
            }
            posicion += palabra.length() + 6;
        }

        // Rellenar los espacios no utilizados con números aleatorios
        for (char[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                if (matriz1[j] == 0) {
                    // si el espacio está vacío
                    int numero = rand.nextInt(10); // generar un número aleatorio entre 0 y 9
                    matriz1[j] = (char) (numero + '0'); // convertir el número en un caracter y asignarlo a la matriz
                }
            }
        }

        // Imprimir la sopa de letras
        for (char[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
}


