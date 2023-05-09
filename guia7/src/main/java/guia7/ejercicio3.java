package guia7;

import Entidad.Operacion;

/**
 *
 * @author marianomello
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion(); // solicita al usuario los números para realizar la operación
        System.out.println("La suma es: " + op.sumar());
        System.out.println("La resta es: " + op.restar());
        System.out.println("El producto es: " + op.multiplicar());
        System.out.println("El cociente es: " + op.dividir());
    }

}
