package egg.guia3;

import java.util.Scanner;

/*
 * Una obra social tiene tres clases de socios:
-Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
-Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
-Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
-Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.
 */
public class ejercicioExtra5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String socioCat;
        int importe;

        System.out.println("Este programa calcula el monto que debes abonar según tu categoría de socio y el importe de la compra.");
        System.out.println("Por favor, ingresa tu categoría de socio (A, B o C): ");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        socioCat = input.nextLine().toUpperCase();

        System.out.println("Ingrese el monto: ");
        importe = input.nextInt();
        input.nextLine();

        switch (socioCat) {
            case "A":
                System.out.println("Deberás abonar " + (importe - (importe * 50 / 100)));
                break;
            case "B":
                System.out.println("Deberás abonar " + (importe - (importe * 35 / 100)));
                break;
            case "C":
                System.out.println("Deberás abonar " + importe + " ya que tu plan no incluye descuentos");
                break;

        }

    }

}
