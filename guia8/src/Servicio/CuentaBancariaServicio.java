/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:

Método para crear cuenta pidiéndole los datos al usuario.

Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.

Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.

Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.

Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class CuentaBancariaServicio {

    Scanner sc = new Scanner(System.in);

    public void crearCuenta() {

        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = sc.nextInt();
        cuenta.setNumeroCuenta(numeroCuenta);

        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = sc.nextLong();
        cuenta.setDniCliente(dniCliente);

        System.out.println("Ingrese el saldo actual:");
        double saldoActual = sc.nextDouble();
        cuenta.setSaldoActual(saldoActual);
    }

    public void ingresar(double cantidad, CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += cantidad;
        cuenta.setSaldoActual(saldoActual);
    }

    public void retirar(double cantidad, CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();

        if (saldoActual >= cantidad) {
            saldoActual -= cantidad;
        } else {
            cantidad = saldoActual;
            saldoActual = 0;
        }
        cuenta.setSaldoActual(saldoActual);
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double limiteExtraccion = saldoActual * 0.2;

        System.out.print("Ingrese la cantidad a retirar (limite: " + limiteExtraccion + "): ");
        double cantidad = sc.nextDouble();

        if (cantidad <= limiteExtraccion) {
            saldoActual -= cantidad;
            cuenta.setSaldoActual(saldoActual);
        } else {
            System.out.println("No puede retirar más del 20% de su saldo actual.");
        }
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("El saldo actual de la cuenta es: " + saldoActual);
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        int numeroCuenta = cuenta.getNumeroCuenta();
        long dniCliente = cuenta.getDniCliente();
        double saldoActual = cuenta.getSaldoActual();

        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }

}
