/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClasses;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;

/**
 *
 * @author marianomello
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();

        servicio.crearCuenta();

        servicio.ingresar(1000, cuenta);
        servicio.retirar(500, cuenta);
        servicio.extraccionRapida(cuenta);
        servicio.consultarSaldo(cuenta);
        servicio.consultarDatos(cuenta);
    }
}


