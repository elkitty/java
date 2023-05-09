/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Servicio;

import Entidad.Cafetera;

/**
 *
 * @author marianomello
 */
public class CafeteraServicio {

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            System.out.println("Sirviendo taza de " + tamanoTaza + " ml");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
        } else {
            System.out.println("No alcanza para llenar la taza de " + tamanoTaza + " ml");
            System.out.println("Se sirvió una taza de " + cafetera.getCantidadActual() + " ml");
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        int cantidadActual = cafetera.getCantidadActual();
        int capacidadMaxima = cafetera.getCapacidadMaxima();

        if (cantidadActual + cantidadCafe > capacidadMaxima) {
            System.out.println("No cabe tanto café, se agregó " + (capacidadMaxima - cantidadActual) + " ml");
            cafetera.setCantidadActual(capacidadMaxima);
        } else {
            cafetera.setCantidadActual(cantidadActual + cantidadCafe);
            System.out.println("Se agregaron " + cantidadCafe + " ml de café");
        }
    }
}
