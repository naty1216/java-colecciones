/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion4Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
     * • Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 *
 * @author Ed-Naty
 */
public class Coleccion4Servicio {
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    ArrayList<films>pelicula=new ArrayList();  
    Pelicula p1=new Pelicula();
    
    public void crearPelicula(){
        System.out.println("Ingrese el titulo de la pelicula ");
        String pelicula =leer.next();
        System.out.println("Ingrese el nombre del director ");
        String director=leer.next();
        System.out.println("Ingrese durecion de la pelicula ");
        float duracionPeli=leer.nextFloat();
        return new Pelicula(pelicula,director,duracionPeli);
    
    }
    
    
      
        
   

    
}
