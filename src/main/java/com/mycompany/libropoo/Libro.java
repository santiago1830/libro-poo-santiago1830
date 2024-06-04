package com.mycompany.libropoo;

public class Libro {
   
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero; 
    private boolean leido;


    public Libro(String titulo, String autor, int anoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero; 
        this.leido = false; 
    }

    
    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion + ", Género: " + genero;
    }

    public void marcarLeido() {
        this.leido = true;
    }

    public boolean esAntiguo() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - anoPublicacion > 50;
    }

   
    public boolean isLeido() {
        return leido;
    }
}
