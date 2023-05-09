/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author marianomello
 */
public class Rectangulo_extra {

    private double lado1;
    private double lado2;

    public Rectangulo_extra(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcular_area() {
        double area = this.lado1 * this.lado2;
        return area;
    }

}
