/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Entidad;

/**
 *
 * @author marianomello
 */
public class Cuenta {

    private int saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero(int cantidad) {
        if (cantidad > saldo) {
            System.out.println("No se puede retirar esa cantidad de dinero, el saldo es insuficiente.");
        } else {
            saldo -= cantidad;
        }
    }

}
