

 //Escribir un programa que pida tu nombre
 //lo guarde en una variable y lo muestre por pantalla.


package HolaMundo;

import java.util.Scanner;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
     
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingresa tu nombre");
     String nombre = leer.next();
     System.out.println(nombre);
  }
   
}
