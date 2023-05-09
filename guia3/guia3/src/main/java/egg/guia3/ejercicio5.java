package egg.guia3;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class ejercicio5 {

    /* Escriba un programa en el cual se ingrese un valor límite positivo,
    y a continuación solicite números al usuario hasta que la suma
    de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroMaximo;
        int sumatoria = 0;
        int numero;

        System.out.println("Ingresa el numero máximo");
        numeroMaximo = leer.nextInt();

        do {

            System.out.println("Ingresa números");
            numero = leer.nextInt();
            sumatoria += numero;

//            if (numero > numeroMaximo) {
//                System.out.println("El número ingresado es demasiado grande.");
//                continue;
//            }

        } while (sumatoria <= numeroMaximo);

        System.out.println("La sumatoria es: " + sumatoria);
    }
}
