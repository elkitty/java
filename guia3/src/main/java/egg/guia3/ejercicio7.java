package egg.guia3;

import java.util.Scanner;

public class ejercicio7 {

    /*
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo
    lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un
    máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca
    el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
    Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int secuenciasValidas = 0;
        int secuenciasInvalidas = 0;

        do {
            System.out.println("Ingresa una cadena de caracteres");
            cadena = leer.nextLine();

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                secuenciasValidas++;
            } else if (!cadena.equals("&&&&&")) {
                secuenciasInvalidas++;
            }
        } while (!cadena.equals("&&&&&"));

        System.out.println("Cantidad de secuencias válidas: " + secuenciasValidas);
        System.out.println("Cantidad de secuencias inválidas: " + secuenciasInvalidas);

    }
}
