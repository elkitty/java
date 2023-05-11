/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author marianomello
 */
public class RaicesServicio {

    // Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Raices raices) {
        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
    }

    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            double x1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            double x2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            System.out.println("Las dos posibles soluciones son: " + x1 + " y " + x2);
        } else {
            System.out.println("No hay soluciones reales");
        }
    }

    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            double x = -raices.getB() / (2 * raices.getA());
            System.out.println("La única solución es: " + x);
        } else {
            System.out.println("No hay solución única");
        }
    }

    // Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No hay soluciones reales");
        }
    }

}
