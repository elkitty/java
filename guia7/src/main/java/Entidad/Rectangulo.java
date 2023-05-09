/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor para la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el valor para la altura del rectángulo: ");
        int altura = sc.nextInt();
        this.base = base;
        this.altura = altura;

    }

    public int calcularSupRectangulo() {
        return this.base * this.altura;
    }

    public int calcularPerimetroRectangulo() {
        return (this.base + this.altura) * 2;

    }

    public void dibujarRectangulo() {
        // Imprimir la primera fila con "*"
        for (int i = 1; i <= this.base; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Imprimir las filas intermedias
        for (int i = 2; i < this.altura; i++) {
            System.out.print("* ");
            for (int j = 2; j < this.base; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // Imprimir la última fila con "*"
        for (int i = 1; i <= this.base; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
