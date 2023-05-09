package Entidad;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor para el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el valor para el segundo número: ");
        int numero2 = sc.nextInt();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar() {
        return this.numero1 + this.numero2;
    }

    public int restar() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Opración prohibida, no es posible multiplicar x 0");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }

    public int dividir() {
        if (this.numero2 == 0) {
            System.out.println("Opración prohibida, no es posible dividir x 0");
            return 0;

        } else {
            return this.numero1 / this.numero2;
        }
    }

}
