/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class Puntos {

    private double x1, y1, x2, y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese el valor de y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ingrese el valor de x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Ingrese el valor de y2: ");
        double y2 = sc.nextDouble();

    }

    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

}
