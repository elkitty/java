package egg.guia5;
/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 * 
 */
public class ejercicioExtra2 {

    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {1, 2, 3, 4, 5};
        boolean sonIguales = true;

        // Comparar los vectores elemento x elemento
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                sonIguales = false;
                break;
            }
        }

        // Imprimir result
        if (sonIguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
}
