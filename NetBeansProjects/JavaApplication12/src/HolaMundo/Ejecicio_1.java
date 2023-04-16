// Ejercicio  Numero 1 //
// Escribir un programa que pida dos números en teros por teclado y calcule la suma de los dos.// 
//El programa deberá después mostrar el resultado de la suma.//

package HolaMundo;

import java.util.Scanner;


public class Ejecicio_1 {

 public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese el valor de dos numeros");
      int num1;
      int num2;
      num1 = leer.nextInt();
      num2 = leer.nextInt();
      
      int suma = num1 + num2;
      System.out.println("El resultado de la suma es: " + suma);

    
    }
 
}
    
   
