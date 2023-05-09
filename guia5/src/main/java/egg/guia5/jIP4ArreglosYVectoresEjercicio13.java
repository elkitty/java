/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia5;

import java.util.Scanner;

/**
 *
 * @author marianomello
 */
public class jIP4ArreglosYVectoresEjercicio13 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ingresar la cantidad de compañeros de equipo
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidadDeCompaneros = sc.nextInt();
        
        // Declarar y crear el vector [Equipo] con la dimensión en variable que ingresamos x teclado
        String[] equipo = new String[cantidadDeCompaneros];
        
        // Consumir el salto de línea después de leer la cantidad de compañeros
        sc.nextLine();
        
        // Ingresar los nombres de los comp. al vector
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Ingrese el nombre del compañero #" + (i+1) + ": ");
            equipo[i] = sc.nextLine();
        }
        
        // Imprimir los nombres de los comp. en consola
        for (int i = 0; i < equipo.length; i++) {
            System.out.print(equipo[i]);
        }
        
        //sc.close();
    }
}
    

