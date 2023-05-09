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
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {

    }

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ISBN: ");
        this.isbn = sc.nextLine();
        System.out.println("Ingrese el título: ");
        this.titulo = sc.nextLine();
        System.out.println("Ingrese el autor: ");
        this.autor = sc.nextLine();
        System.out.println("Ingrese el número de páginas: ");
        this.numPaginas = sc.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);

    }

}
