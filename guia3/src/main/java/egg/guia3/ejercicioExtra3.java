package egg.guia3;

import java.util.Scanner;

public class ejercicioExtra3 {

    /*
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = sc.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.print(letra + " es vocal");
        } else {
            System.out.print(letra + " no es vocal");
        }

    }

}
//opcion con switch
//switch (letra.toLowerCase()) {
//    case "a":
//    case "e":
//    case "i":
//    case "o":
//    case "u":
//        System.out.println(letra + " es una vocal");
//        break;
//    default:
//        System.out.println(letra + " no es una vocal");
//        break;
//}

