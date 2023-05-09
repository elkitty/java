package egg.guia3;

import java.util.Scanner;

/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
public class ejercicioExtra4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número entre 1 y 10 (0 para salir): ");
            numero = input.nextInt();
            if (numero == 0) {
                continuar = false;
            } else if (numero < 1 || numero > 10) {
                System.out.println("El número ingresado no está en el rango permitido.");
            } else {
                switch (numero) {
                    case 1:
                        System.out.println("El equivalente de " + numero + " en número romano es I");
                        break;
                    case 2:
                        System.out.println("El equivalente de " + numero + " en número romano es II");
                        break;
                    case 3:
                        System.out.println("El equivalente de " + numero + " en número romano es III");
                        break;
                    case 4:
                        System.out.println("El equivalente de " + numero + " en número romano es IV");
                        break;
                    case 5:
                        System.out.println("El equivalente de " + numero + " en número romano es V");
                        break;
                    case 6:
                        System.out.println("El equivalente de " + numero + " en número romano es VI");
                        break;
                    case 7:
                        System.out.println("El equivalente de " + numero + " en número romano es VII");
                        break;
                    case 8:
                        System.out.println("El equivalente de " + numero + " en número romano es VIII");
                        break;
                    case 9:
                        System.out.println("El equivalente de " + numero + " en número romano es IX");
                        break;
                    case 10:
                        System.out.println("El equivalente de " + numero + " en número romano es X");
                        break;
                }
            }

            if (continuar) {
                System.out.print("¿Desea seguir convirtiendo números? (s/n): ");
                String respuesta = input.next();
                if (respuesta.equalsIgnoreCase("n")) {
                    continuar = false;
                }
            }
        }

        System.out.println("Fin del programa.");
    }
//        Scanner input = new Scanner(System.in);
//        int numero;
//
//        System.out.print("Ingrese un número entre 1 y 10: ");
//        numero = input.nextInt();
//
//        switch (numero) {
//            case 1:
//                System.out.println("El equivalente de " + numero + " en número romano es I");
//                break;
//            case 2:
//                System.out.println("El equivalente de " + numero + " en número romano es II");
//                break;
//            case 3:
//                System.out.println("El equivalente de " + numero + " en número romano es III");
//                break;
//            case 4:
//                System.out.println("El equivalente de " + numero + " en número romano es IV");
//                break;
//            case 5:
//                System.out.println("El equivalente de " + numero + " en número romano es V");
//                break;
//            case 6:
//                System.out.println("El equivalente de " + numero + " en número romano es VI");
//                break;
//            case 7:
//                System.out.println("El equivalente de " + numero + " en número romano es VII");
//                break;
//            case 8:
//                System.out.println("El equivalente de " + numero + " en número romano es VIII");
//                break;
//            case 9:
//                System.out.println("El equivalente de " + numero + " en número romano es IX");
//                break;
//            case 10:
//                System.out.println("El equivalente de " + numero + " en número romano es X");
//                break;
//            default:
//                System.out.println("El número ingresado no está en el rango permitido.");
//                break;
//        }
}
