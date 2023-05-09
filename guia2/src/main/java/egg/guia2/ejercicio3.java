package egg.guia2;

import java.util.Scanner;


public class ejercicio3 {

    //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("ingresá una frase");
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
