/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import Entidad.Empleado;

/**
 *
 * @author marianomello
 */
public class ejercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase Empleado
        Empleado empleado1 = new Empleado();

        // Establecer los valores de los atributos mediante los métodos setter
        empleado1.setNombre("Juan");
        empleado1.setEdad(31);
        empleado1.setSalario(190000);

        // Llamar al método "calcular_aumento" para obtener el aumento salarial correspondiente
        double aumento = empleado1.calcular_aumento();

        // Imprimir el resultado
        System.out.println("El aumento salarial es: " + aumento);
    }
}
