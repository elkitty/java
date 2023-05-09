package guia7;

import Entidad.Rectangulo;

/**
 *
 * @author marianomello
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();

        int superficie = rectangulo.calcularSupRectangulo();
        System.out.println("La superficie del rectángulo es: " + superficie);

        int perimetro = rectangulo.calcularPerimetroRectangulo();
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        System.out.println("El dibujo del rectángulo es: ");
        rectangulo.dibujarRectangulo();
    }
}
