
package egg.guia4;

import java.util.Scanner;

    /*
     * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
    matemática y deben devolver sus resultados para imprimirlos en el main.
     */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        
        int opcion = input.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("La división es: " + dividir(num1, num2));
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // devuelve NaN (Not a Number) si se intenta dividir por cero
        } else {
            return num1 / num2;
        }

    }

}
