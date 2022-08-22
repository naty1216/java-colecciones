/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion1Servicio;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Coleccion1Servicio {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
   private ArrayList<String>razas=new ArrayList<>();
//ArrayList<String>razas=new ArrayList();

    
    
    public void nuevasRazas(){
        String resp;
        String raz;
        
        do{System.out.println("ingrese raza de perros");
        raz=leer.next();
        razas.add(raz);
            System.out.println("¿desea ingresar mas razas S/N?");
            resp =leer.next();
        }while (resp.equals("S")) ;          
        
        //String razas= nombre+"";
    System.out.println("las razas de perros son ");
    for(int i=0;i<razas.size();i++){
         System.out.println(razas.get(i));
    
    }
    
   
   
    }public void eliminaPerro(){
        Iterator<String>it=razas.iterator();
     while (it.hasNext()){
        String aux=it.next();
        if (aux.equals("caniche")){
            it.remove();
        }
    }
    
      razas.forEach((e)->System.out.println(e));
    
    
    
    
}
