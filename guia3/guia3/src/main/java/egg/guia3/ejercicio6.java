
package egg.guia3;

import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje
de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario 
selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        String opcion;
        boolean salir = false;
        
        do {
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");
            opcion = leer.nextLine();
        
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el primer número:");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    numero2 = leer.nextInt();
                    leer.nextLine();
                    System.out.println("El resultado de la suma es: " + (numero1 + numero2));
                    break;
                case "2":
                    System.out.println("Ingrese el primer número:");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    numero2 = leer.nextInt();
                    leer.nextLine();
                    System.out.println("El resultado de la resta es: " + (numero1 - numero2));
                    break;
                case "3":
                    System.out.println("Ingrese el primer número:");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    numero2 = leer.nextInt();
                    leer.nextLine();
                    System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
                    break;
                case "4":
                    System.out.println("Ingrese el primer número:");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    numero2 = leer.nextInt();
                    leer.nextLine();
                    if (numero2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("El resultado de la división es: " + (numero1 / numero2));
                    }
                    break;
                case "5":
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirmacion = leer.nextLine();
                    leer.nextLine();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (!salir);
    }
}
