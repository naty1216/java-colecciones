/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion1;

import coleccion1Servicio.Coleccion1Servicio;
import java.util.ArrayList;
import java.util.Scanner;

/**Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList
 *
 * @author Ed-Naty
 */
public class Coleccion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner leer=new Scanner (System.in);
        Coleccion1Servicio cs=new Coleccion1Servicio();
        
        ArrayList<String>razas=new ArrayList();
        
       cs.nuevasRazas();
       
       cs.eliminaPerro();
        }
        
    }
    

