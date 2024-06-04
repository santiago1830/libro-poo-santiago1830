package com.mycompany.libropoo;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int anoPublicacion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el género del libro:");
        String genero = scanner.nextLine();

       
        Libro libro = new Libro(titulo, autor, anoPublicacion, genero);

       
        libro.marcarLeido();

       
        System.out.println(libro.mostrarInformacion());

       
        System.out.println("¿El libro ya fue leído?: " + (libro.isLeido() ? "Sí" : "No"));

       
        System.out.println("¿El libro es antiguo?: " + (libro.esAntiguo() ? "Sí" : "No"));

        scanner.close();
    }
}

