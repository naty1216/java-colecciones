/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioColeccion3;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ed-Naty
 */
public class Coleccion3Servicio {
  //  public Alumno crearAlumno(){}
   private Scanner leer =new Scanner(System.in);
   private ArrayList<lista>alumnos=new ArrayList();
    Alumno a1=new Alumno();
    String alumno;
    int nota1,nota2,nota3;
    String resp;

    public Coleccion3Servicio(String alumno, int nota1, int nota2, int nota3) {
        this.alumno = alumno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    

   
    
  public void ingreseAlumnos(){
      do{System.out.println("ingrese nombre del alumno");
      String nombre =leer.nextLine();
          System.out.println("ingrese primer nota");
          int nota1=leer.nextInt();
          System.out.println("ingrese segunda nota");
          int nota2=leer.nextInt();
          System.out.println("ingrese tercer nota");
          int nota3=leer.nextInt();
          
          //String alumnos=nombre+""+nota1+""+nota2+""+nota3+"";
                  
          alumnos.add(new lista (nombre+nota1+nota2+nota3));
         
      System.out.println("¿desea ingresar mas alumnos S/N?");
            resp =leer.next();
      
      }while (resp.equals("S")) ;  
      
      System.out.println(" nombre de los alumnos con sus respectivas notas ");
    for(int i=0;i<alumnos.size();i++){
         System.out.println(alumnos.get(i));
      
}  
    
}
}