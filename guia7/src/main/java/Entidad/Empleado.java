/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Entidad;

/**
 *
 * @author marianomello
 */
public class Empleado {

    private String nombre;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double calcular_aumento() {
        if (this.edad < 30) {
            double porcentajeAumento = 5.0;
            return this.salario * (porcentajeAumento / 100);
        } else if (this.edad >= 30) {
            double porcentajeAumento = 10.0;
            return this.salario * (porcentajeAumento / 100);
        }
        return -1;
    }

}
