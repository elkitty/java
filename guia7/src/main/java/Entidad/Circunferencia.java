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
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = sc.nextDouble();
        this.radio = radio;

    }

    public String area() {
        //return Math.PI * Math.pow(radio, 2);
        double area = Math.PI * Math.pow(radio, 2);
        return String.format("%.3f", area);
    }

    public String perimetro() {
        //return 2 * Math.PI * radio;
        double perimetro = 2 * Math.PI * radio;
        return String.format("%.3f", perimetro);
    }

}
