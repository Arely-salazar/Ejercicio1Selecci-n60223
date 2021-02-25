/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1selección60223;
import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Ejercicio1Selección60223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    
     
     Scanner miConsola = new Scanner(System.in);
     System.out.println("ingresa tres número:");
     System.out.println("número 1: ");
     int a = miConsola.nextInt();
     System.out.println("número 2: ");
     int b = miConsola.nextInt();
     System.out.println("número 3: ");
     int c = miConsola.nextInt();
     
     if(a >= b && a >= c ) {
         System.out.println("El número "+ a + " es el mayor");
     }else if (b >= a && b >= c ) {
         System.out.println("El número "+ b + " es el mayor");
         
     }else {
         System.out.println("El número "+ c + " es el mayor");
         
         
     }
     
             
    }
    
}
