package egg.guia5;

/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
public class ejercicio5 {

    public static void main(String[] args) {
        int[][] matriz = {{0, 1, -2}, {-1, 0, -3}, {2, 3, 0}};
        boolean esAntisimetrica = true;
        // Comprobar si la matriz es antisimétrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            //for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }
        // Mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }

    }

}

/*        int[][] matriz = {{1, 2, 3}, {-4, 5, -6}, {7, -8, 9}};
int cantidadNegativos = sonPositivos(matriz);
if (cantidadNegativos > 0) {
System.out.println("Números negativos:");
for (int i = 0; i < matriz.length; i++) {
for (int j = 0; j < matriz[i].length; j++) {
if (matriz[i][j] < 0) {
System.out.println(matriz[i][j]);
}
}
}
}
}

public static int sonPositivos(int[][] matriz) {
boolean hayNegativos = false;
int cantidadNegativos = 0;
for (int i = 0; i < matriz.length; i++) {
for (int j = 0; j < matriz[i].length; j++) {
if (matriz[i][j] < 0) {
hayNegativos = true;
cantidadNegativos++;
}
}
}
if (hayNegativos) {
System.out.println("Hay números negativos en la matriz.");
System.out.println("Cantidad de números negativos: " + cantidadNegativos);
}
return cantidadNegativos;
}*/
