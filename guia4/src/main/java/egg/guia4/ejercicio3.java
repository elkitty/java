package egg.guia4;

import static egg.guia4.ejercicio1.dividir;
import static egg.guia4.ejercicio1.multiplicar;
import static egg.guia4.ejercicio1.restar;
import static egg.guia4.ejercicio1.sumar;
import java.util.Scanner;

/*
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros a convertir ");
        double euros = input.nextDouble();

        System.out.println("A qué moneda desea convertir sus Euros?");
        System.out.println("1 - Dólares");
        System.out.println("2 - Yenes");
        System.out.println("3 - Libras");

        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(euros + " Euros equivalen a " + convDolares(euros) + " Dólares");
                break;
            case 2:
                System.out.println(euros + " Euros equivalen a " + convYenes(euros) + " Yenes");
                break;
            case 3:
                System.out.println(euros + " Euros equivalen a " + convLibras(euros) + " Libras");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static double convDolares(double euros) {
        return euros * 1.28611;
    }

    public static double convYenes(double euros) {
        return euros * 129.852;
    }

    public static double convLibras(double euros) {
        return euros * 0.86;
    }

}
