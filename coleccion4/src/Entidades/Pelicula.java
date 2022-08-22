/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ed-Naty
 */
public class Pelicula {
    private String pelicula;
    private String director;
    private float duracionPeli;

    public Pelicula() {
    }
    

    public Pelicula(String pelicula, String director, float duracionPeli) {
        this.pelicula = pelicula;
        this.director = director;
        this.duracionPeli = duracionPeli;
    }

  
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracionPeli() {
        return duracionPeli;
    }

    public void setDuracionPeli(float duracionPeli) {
        this.duracionPeli = duracionPeli;
    }
    
    
    
}
