/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 *
 * @author Ed-Naty
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int aux;
        int arregloA[]=new int[50];
        for (int i=0;i<=49;i++){
        arregloA[i]=(int)(Math.random()*90+5);
        
            System.out.println("arreglo A "+i+"---->"+arregloA[i]);
        
        }
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));
        
        int arregloB[]=Arrays.copyOf(arregloA, 10);
        Arrays.fill(arregloB, 5);
        imprimirArreglo(arregloB);
        
      
        
        
        
                }
    public static void imprimirArreglo(int arreglo[]){
        System.out.println("****ARREGLO****");
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        
        
        }
    
    }
            
            }
        
        
        
    
    

