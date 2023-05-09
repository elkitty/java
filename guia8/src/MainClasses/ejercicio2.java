/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClasses;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creamos una cafetera con capacidad máxima de 2000 ml
        Cafetera cafetera = new Cafetera(2000, 0);

        // Creamos un servicio de cafetera        
        CafeteraServicio servicio = new CafeteraServicio();

        // Menú principal        
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café a la cafetera");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad de café para llenar la cafetera: ");
                    int cantidadLlenado = sc.nextInt();
                    if (cantidadLlenado > cafetera.getCapacidadMaxima()) {
                        System.out.println("No se puede llenar la cafetera con más de " + cafetera.getCapacidadMaxima() + " ml.");
                    } else {
                        servicio.llenarCafetera(cafetera);
                        System.out.println("Cafetera llena con " + cafetera.getCantidadActual() + " ml.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese tamaño de la taza: ");
                    int tamanoTaza = sc.nextInt();
                    servicio.servirTaza(cafetera, tamanoTaza);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    System.out.println("Cafetera vaciada.");
                    break;
                case 4:
                    System.out.print("Ingrese cantidad de café a agregar:");
                    int cantidadCafe = sc.nextInt();
                    servicio.agregarCafe(cafetera, cantidadCafe);
                    System.out.println("Café agregado a la cafetera.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        }

        /*        // Creamos una cafetera con capacidad máxima de 1000 ml y cantidad actual de 500 ml
        Cafetera cafetera = new Cafetera(1000, 500);
        System.out.println("Capacidad máxima: " + cafetera.getCapacidadMaxima() + " ml");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");
        
        // Creamos un servicio de cafetera
        CafeteraServicio servicio = new CafeteraServicio();
        
        // Llenamos la cafetera
        servicio.llenarCafetera(cafetera);
        System.out.println("Después de llenar la cafetera:");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");
        
        // Servimos una taza de 200 ml
        servicio.servirTaza(cafetera, 200);
        System.out.println("Después de servir una taza de 200 ml:");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");
        
        // Servimos una taza de 600 ml (no alcanza para llenarla completamente)
        servicio.servirTaza(cafetera, 600);
        System.out.println("Después de servir una taza de 600 ml:");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");
        
        // Vaciamos la cafetera
        servicio.vaciarCafetera(cafetera);
        System.out.println("Después de vaciar la cafetera:");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");
        
        // Agregamos 1200 ml de café (más de lo que cabe en la cafetera)
        servicio.agregarCafe(cafetera, 1200);
        System.out.println("Después de agregar 1200 ml de café:");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");
        
        // Agregamos 400 ml de café (cabe en la cafetera)
        servicio.agregarCafe(cafetera, 400);
        System.out.println("Después de agregar 400 ml de café:");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");*/
    }
}
