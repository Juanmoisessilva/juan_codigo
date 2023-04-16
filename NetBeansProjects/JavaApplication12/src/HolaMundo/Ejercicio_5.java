// Escribir un programa que lea un número entero 
// por teclado y muestre por pantalla el doble, el triple 
// y la raíz cuadrada de ese número.


package HolaMundo;

import java.util.Scanner;


public class Ejercicio_5 {
    
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        int numerodoble = numero * 2;
        int numerotriple = numero * 3;
        double raizcuadrada = (int) Math.sqrt(numero);
        System.out.println("su doble es :" + (numerodoble));
        System.out.println("su triple es :" + (numerotriple));
        System.out.println("la raiz cuadrada es :" + (raizcuadrada));
    }

}
