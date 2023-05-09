/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import Entidad.Cuenta;

/**
 *
 * @author marianomello
 */
public class ejercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(1000, "Juan Pérez");
        miCuenta.retirar_dinero(500);
        System.out.println("El saldo actual de la cuenta es: " + miCuenta.getSaldo());
    }

}
