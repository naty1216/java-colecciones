/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectionmanoalaobra2;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Ed-Naty
 */
public class ColectionmanoAlaObra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Arraylist<Integer>numerosA=new Arraylist();
     //int x=20;
     //numerosA.add(x);
     
     HashSet<Integer>numeroB=new HashSet();
     int y=20;
     numeroB.add(y);
     int j=30;
     numeroB.add(y);
     int t=40;
     numeroB.add(y);
             
     
     HashMap <Integer,String>alumnos=new HashMap();
     int dni=3245654;
     String nombreAlumno="Pepe";
     
        System.out.println("----HashSet---");
        for(Integer numero:numeroB){
            System.out.println(numero);
                    
        
        }
     
      
    }
    
}
