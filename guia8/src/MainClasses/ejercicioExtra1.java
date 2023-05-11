/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClasses;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author marianomello
 */
public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices raices = new Raices(3, -40, -100);
        RaicesServicio servicio = new RaicesServicio();
        servicio.calcular(raices);
    }

}
